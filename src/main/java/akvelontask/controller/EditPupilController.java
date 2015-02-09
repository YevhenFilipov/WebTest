package akvelontask.controller;

import akvelontask.entity.Pupil;
import akvelontask.service.PupilService;
import akvelontask.service.impl.PupilServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class EditPupilController extends AbstractController {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ADD_PUPIL_PAGE", 2);
        final int id = Integer.parseInt(req.getParameter("id"));
        final PupilService pupilService = new PupilServiceImpl();
        final Pupil pupil = pupilService.getPupil(id);
        req.setAttribute("pupil", pupil);

        goToJSP("addModifyPupil.jsp", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final Pupil pupil = new Pupil();
        pupil.setId(Integer.parseInt(req.getParameter("id")));
        pupil.setFirstName(req.getParameter("first_name"));
        pupil.setLastName(req.getParameter("last_name"));
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.UK);
        final java.util.Date formattedDate;
        try {
            formattedDate = formatter.parse(req.getParameter("birthday"));
            Date date = new Date(formattedDate.getTime());
            pupil.setBirthday(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        pupil.setClassPhase(Integer.parseInt(req.getParameter("class_phase")));
        pupil.setClassGroup(req.getParameter("class_group").charAt(0));

        final PupilService pupilService = new PupilServiceImpl();
        pupilService.updatePupil(pupil);
        redirectRequest("/pupillist.html", req, resp);
    }
}

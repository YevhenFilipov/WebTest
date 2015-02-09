package akvelontask.controller;

import akvelontask.entity.Pupil;
import akvelontask.service.PupilService;
import akvelontask.service.impl.PupilServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class AddPupilController extends AbstractController {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ADD_PUPIL_PAGE", 1);
        goToJSP("addModifyPupil.jsp", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final Pupil pupil = new Pupil();
        pupil.setFirstName(req.getParameter("first_name"));
        pupil.setLastName(req.getParameter("last_name"));
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.UK);
        final java.util.Date formattedDate;
        try {
            formattedDate = formatter.parse(req.getParameter("birthday"));
            java.sql.Date date = new java.sql.Date(formattedDate.getTime());
            pupil.setBirthday(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        pupil.setClassPhase(Integer.parseInt(req.getParameter("class_phase")));
        pupil.setClassGroup(req.getParameter("class_group").charAt(0));

        final PupilService pupilService = new PupilServiceImpl();
        pupilService.addPupil(pupil);
        redirectRequest("/pupillist.html", req, resp);
    }
}

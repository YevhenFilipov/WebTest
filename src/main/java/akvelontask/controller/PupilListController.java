package akvelontask.controller;

import akvelontask.entity.Pupil;
import akvelontask.service.PupilService;
import akvelontask.service.impl.PupilServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class PupilListController extends AbstractController {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final PupilService pupilService = new PupilServiceImpl();
        final List<Pupil> pupils = pupilService.getPupils();
        req.setAttribute("pupils", pupils);
        goToJSP("pupilsList.jsp", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String ids = req.getParameter("ids");
        final StringTokenizer stringTokenizer = new StringTokenizer(ids, "|");
        final PupilService pupilService = new PupilServiceImpl();
        while (stringTokenizer.hasMoreTokens()) {
            final int idCurrPupil = Integer.parseInt(stringTokenizer.nextToken());
            pupilService.deletePupil(idCurrPupil);
        }
        this.doGet(req, resp);
    }
}

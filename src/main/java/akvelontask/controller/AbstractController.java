package akvelontask.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractController extends HttpServlet {
    private String contextName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        contextName = config.getServletContext().getContextPath();
        super.init(config);
    }

    protected final void goToJSP(String page, HttpServletRequest request,
                                 HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("currentPage", "/WEB-INF/views/" + page);
        request.getRequestDispatcher("/WEB-INF/views/page-template.jsp")
                .forward(request, response);
    }

    protected final void redirectRequest(String path, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(contextName + path);
    }
}

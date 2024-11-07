package ru.akhramenko;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;


public class HelpServiceServlet extends HttpServlet {

    private HelpServiceController helpServiceController;

    public HelpServiceServlet() {}

    public HelpServiceServlet(HelpServiceController helpServiceController) {
        this.helpServiceController = helpServiceController;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.helpServiceController = new HelpServiceController();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.getWriter().append(helpServiceController.getPhrasesStorage());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.getWriter().append(helpServiceController.addPhrasesStorage(request.getParameter("phrase")));
    }

}

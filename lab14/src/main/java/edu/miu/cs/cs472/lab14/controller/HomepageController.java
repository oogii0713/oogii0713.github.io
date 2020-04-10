package edu.miu.cs.cs472.lab14.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HomepageController", urlPatterns = { "", "/index", "/home"})
public class HomepageController extends HttpServlet {
    private String jspName = "/WEB-INF/views/index.jsp";
    private String statusHome = "active";
    public HomepageController() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("statusHome", statusHome);
        request.getRequestDispatcher(jspName).forward(request, response);
    }
}

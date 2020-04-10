package edu.mum.cs.cs472.lab13.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContactFormController", urlPatterns = {"/contact-form"}, description = "ContactFormController")
public class ContactFormController extends HttpServlet {
    private int hitCount;
    private String jspName = "/WEB-INF/views/contact-form.jsp";

    public ContactFormController() {
        super();
    }

    private synchronized int incrHitCount() {
        return this.hitCount++;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        incrHitCount();
        request.setAttribute("hitCount", hitCount);
        request.getRequestDispatcher("/WEB-INF/views/contact-form.jsp").forward(request, response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}

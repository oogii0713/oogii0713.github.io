package edu.mum.cs.cs472.lab13.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "ThankYouController", urlPatterns = {"/thankyou"})
public class ThankYouController extends HttpServlet {
    private int hitCount;
    private String jspName = "/WEB-INF/views/thankyou.jsp";

    public ThankYouController() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    private synchronized int incrHitCount() {
        return this.hitCount++;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        incrHitCount();
        request.setAttribute("hitCount", hitCount);
        request.setAttribute("now", LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy")));

        request.getRequestDispatcher(jspName).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

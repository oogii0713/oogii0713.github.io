package edu.mum.cs.cs472.lab13.controller;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProcessContactFormController", urlPatterns = {"/process-contact-form"})
public class ProcessContactFormController extends HttpServlet {

    public ProcessContactFormController() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("contact-form");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> missingFieldsMsg = new ArrayList<String>();
        String customerName = request.getParameter("customerName");
        String gender = request.getParameter("radioGender");
        String category = request.getParameter("ddlCategory");
        String message = request.getParameter("message");

        if (StringUtils.isBlank(customerName)) {
            missingFieldsMsg.add("Name is missing.");
        }
        if (StringUtils.isBlank(gender)) {
            missingFieldsMsg.add("Gender is missing.");
        }
        if (StringUtils.isEmpty(category)) {
            missingFieldsMsg.add("Category is missing.");
        }
        if (StringUtils.isBlank(message)) {
            missingFieldsMsg.add("Message is missing.");
        }
        if (missingFieldsMsg.size() > 0) {
            request.setAttribute("errMsgs", missingFieldsMsg);
            // forward back to sender
            request.getRequestDispatcher("/contact-form").forward(request, response);
        } else {
            String redirectUrl = "thankyou?customerName=" + customerName + "&radioGender=" + gender + "&ddlCategory=" + category + "&message=" + message;
            response.sendRedirect(redirectUrl);
        }
    }
}

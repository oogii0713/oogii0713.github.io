package edu.miu.cs.cs472.controller;

import edu.miu.cs.cs472.model.CourseRegister;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CourseRegistrationController", urlPatterns = {"/registerCourse"})
public class CourseRegistrationController extends HttpServlet {


    @Override
    public void init(ServletConfig config) {
        List<CourseRegister> courseRegisterList = new ArrayList<>();
        ServletContext context = config.getServletContext();
        context.setAttribute("courseRegisterList", courseRegisterList);
    }

    public CourseRegistrationController() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("studentId");
        String fullName = request.getParameter("fullName");
        String degree = request.getParameter("degree");
        String nextCourse = request.getParameter("nextCourse");

        List<CourseRegister> courseRegisterList = (List<CourseRegister>) request.getServletContext().getAttribute("courseRegisterList");

        CourseRegister student = new CourseRegister(studentId, fullName, degree, nextCourse);
        courseRegisterList.add(student);
        System.out.println("New registration data: " + student.toString());
        System.out.println("List of all registration data; " + courseRegisterList);
        request.getServletContext().setAttribute("courseRegisterList", courseRegisterList);

        PrintWriter out = response.getWriter();
        out.print("Registration Completed");
        out.flush();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

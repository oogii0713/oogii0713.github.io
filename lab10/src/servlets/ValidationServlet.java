package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "servlets.ValidationServlet", urlPatterns = {"/process-contact"}, description = "servlets.ValidationServlet")
public class ValidationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String category = request.getParameter("category");
        String message = request.getParameter("message");

        if(name == null || name.trim().isEmpty())
            msg += "Name is missing<br/>";

        if(gender == null || gender.trim().isEmpty())
            msg += "Gender is missing<br/>";

        if(category == null || category.trim().isEmpty())
            msg += "Category is missing<br/>";

        if(message == null || message.trim().isEmpty())
            msg += "Message is missing<br/>";

        if(!msg.isEmpty()) {
            request.setAttribute("msg", msg);
            RequestDispatcher view = request.getRequestDispatcher("contact");
            view.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/thankyou?name=" + name + "&gender=" + gender + "&category=" + category + "&message=" + message);
        }
    }
}

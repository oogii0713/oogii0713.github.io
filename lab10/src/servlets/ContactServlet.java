package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlets.ContactServlet", urlPatterns = {"/contact"}, description = "servlets.ContactServlet")
public class ContactServlet extends HttpServlet {
    int pageCounter;


    public void init() {
        pageCounter = 0;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String category = request.getParameter("category");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        pageCounter++;

        request.setAttribute("pageCounter", pageCounter);
        writer.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <script defer src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n" +
                "    <script defer src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
                "    <script defer src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n" +
                "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n" +
                "    <title>CS472-WAP-Lesson10</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <header>\n" +
                "        <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n" +
                "            <a class=\"navbar-brand\" href=\"#\">CS472-WAP ::: Lab10</a>\n" +
                "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "              <span class=\"navbar-toggler-icon\"></span>\n" +
                "            </button>\n" +
                "            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "              <ul class=\"navbar-nav mr-auto\">\n" +
                "                <li class=\"nav-item\">\n" +
                "                  <a class=\"nav-link\" href=\"/lab10/homepage\">Home <span class=\"sr-only\">(current)</span></a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                  <a class=\"nav-link\" href=\"#\">About</a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                  <a class=\"nav-link active\" href=\"#\">Contact Us</a>\n" +
                "                </li>\n" +
                "              </ul>\n" +
                "              <form class=\"form-inline my-2 my-lg-0\">\n" +
                "                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n" +
                "                <button class=\"btn btn-dark my-2 my-sm-0\" type=\"submit\">Search</button>\n" +
                "              </form>\n" +
                "            </div>\n" +
                "          </nav>\n" +
                "    </header>\n" +
                "    <main>\n" +
                "      <div class=\"container\">\n" +
                "        <p class=\"h1\">Customer Contact Form</p>\n" +
                "       <div class=\"container\">\n" +
                "       <div style=\"color:red;\">" +
                (request.getAttribute("msg") != null ? request.getAttribute("msg").toString() : "") +
                "</div>" +
                "        <form id=\"contactForm\" method=\"POST\" action=\"/lab10/process-contact\">\n" +
                "          <div class=\"row justify-content-md-center\">\n" +
                "            <div class=\"col-12\"> \n" +
                "              <div class=\"form-group\">\n" +
                "                <label>*Name</label>\n" +
                "                <input type=\"text\" name=\"name\" id=\"name\" class=\"form-control\" placeholder=\"e.g. John Smith\" pattern=\"^[a-zA-Z]+(([\\'\\,\\.\\-][a-zA-Z])?[a-zA-Z]*)*$\">\n" +
                "                <small class=\"form-text text-muted\">Enter your full name</small>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"col-12\">\n" +
                "              <label>*Gender?</label><br>\n" +
                "              <label class=\"mr-3\"><input type=\"radio\" name=\"gender\" id=\"male\" value=\" Male\"> Male</label>\n" +
                "              <label class=\"mr-3\"><input type=\"radio\" name=\"gender\" id=\"female\" value=\" Female\"> Female</label>  \n" +
                "            </div>\n" +
                "            <div class=\"col-12\">\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label>*Category</label>\n" +
                "                    <select class=\"form-control\" name=\"category\" id=\"category\">\n" +
                "                      <option value=\"\">Select...</option>\n" +
                "                      <option value=\"Feedback\" ${param.category == 'a' ? 'selected' : ''}>Feedback</option>\n" +
                "                      <option value=\"Inquiry\" ${param.category == 'a' ? 'selected' : ''>Inquiry</option>\n" +
                "                      <option value=\"Complaint\" ${param.category == 'a' ? 'selected' : ''>Complaint</option>\n" +
                "                    </select>\n" +
                "                    <small class=\"form-text text-muted\">Select you State of residence</small>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"col-12\"> \n" +
                "              <div class=\"form-group\">\n" +
                "                <label>*Message</label>\n" +
                "                <textarea class=\"form-control\" name=\"message\" id=\"message\" rows=\"3\"></textarea>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"col-12\"> \n" +
                "              <button id=\"btn\" type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">Sumbit</button>\n" +
                "            </div>\n" +
                "            \n" +
                "          </div>\n" +
                "      </form>\n" +
                "    </div>\n" +
                "    <div class=\"container\">\n" +
                "      <br>\n" +
                "      <span>Hit Count for this page: "+pageCounter+"</span>\n" +
                "      <span style=\"float: right;\">Total Hit Count for entire WebApp:--</span>\n" +
                "    </div>\n" +
                "    </main>\n" +
                "    <footer style=\"position: fixed; bottom: 0; width: 100%; height: 50px; background-color: #f5f5f5; line-height: 50px;\">\n" +
                "        <div>\n" +
                "            <span style=\"margin-left: 1em;\">Otgonbayar M ::: CS472-WAP</span>\n" +
                "            <span style=\"float: right;margin-right: 1em;\">&copy; April 2020</span>\n" +
                "        </div>\n" +
                "    </footer>\n" +
                "</body>\n" +
                "</html>");

    }
}

package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "servlets.ThankYouServlet", urlPatterns = {"/thankyou"})
public class ThankYouServlet extends HttpServlet {
    int pageCounter;

    public void init() {
        pageCounter = 0;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pageCounter++;

        String name = "";
        String gender = "";
        String category = "";
        String message = "";

        if(request.getParameter("name")!= null) name = request.getParameter("name");
        if(request.getParameter("gender")!=null) gender = request.getParameter("gender");
        if(request.getParameter("category")!= null) category = request.getParameter("category");
        if(request.getParameter("message")!=null) message = request.getParameter("message");

        String pattern = "EEEEE, dd MMMMM yyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String curDate = simpleDateFormat.format(new Date());

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>\n" +
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
                "        <!-- TODO Add nav here -->\n" +
                "        <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n" +
                "            <a class=\"navbar-brand\" href=\"#\">CS472-WAP ::: Lab10</a>\n" +
                "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "              <span class=\"navbar-toggler-icon\"></span>\n" +
                "            </button>\n" +
                "          \n" +
                "            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "              <ul class=\"navbar-nav mr-auto\">\n" +
                "                <li class=\"nav-item\">\n" +
                "                  <a class=\"nav-link\" href=\"homepage\">Home <span class=\"sr-only\">(current)</span></a>\n" +
                "                </li>\n" +
                "            </div>\n" +
                "          </nav>\n" +
                "    </header>\n" +
                "    <main>\n" +
                "        <div class=\"container\">\n" +
                "          <p class=\"text-right p-2\">"+curDate+"</p>\n" +
                "          <div class=\"card\">\n" +
                "            <div class=\"card-header\">\n" +
                "              Thank you! Your message has been received as follows:\n" +
                "            </div>\n" +
                "            <div class=\"card-body\">\n" +
                "                <p class=\"lead\">Name: "+name+"</p>\n" +
                "                <p><small class=\"text-muted\">Gender: "+gender+"</small></p>\n" +
                "                <p><small class=\"text-muted\">Category: "+category+" </small></p>\n" +
                "                <p><small>Message: "+message+"</small></p><br>\n" +
                "                <p>Please feel free to <a href=\"contact\">Contact us</a> again.</p>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "       <div class=\"container\">\n" +
                "           <br>\n" +
                "           <span>Hit Count for this page: "+pageCounter+"</span>\n" +
                "           <span style=\"float: right;\">Total Hit Count for entire WebApp:--</span>\n" +
                "       </div>\n" +
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

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomepageServlet", urlPatterns = {"/homepage"})
public class HomepageServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>\n" +
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
                "                <li class=\"nav-item active\">\n" +
                "                  <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                  <a class=\"nav-link\" href=\"#\">About</a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                  <a class=\"nav-link\" href=\"/lab10/contact\">Contact Us</a>\n" +
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
                "        <div class=\"container\">\n" +
                "            <div class=\"jumbotron\">\n" +
                "                <h1 class=\"display-4\">Hello, world of HttpServelt 4.0!</h1>\n" +
                "                <p class=\"lead\">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>\n" +
                "                <hr class=\"my-4\">\n" +
                "                <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>\n" +
                "                <a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">Learn more</a>\n" +
                "              </div>\n" +
                "        </div>\n" +
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

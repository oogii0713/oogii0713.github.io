package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "filters.MyFilter", urlPatterns = {"/*"})
//@WebFilter("/*")
public class MyFilter implements Filter {
    private int count;
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        count++;
        System.out.println("Total Hit Count for the entire WebApp: " + count);
        chain.doFilter(request, response);

    }

    public void init(FilterConfig config) throws ServletException {
        count = 0;
    }

}

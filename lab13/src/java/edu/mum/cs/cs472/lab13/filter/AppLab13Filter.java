package edu.mum.cs.cs472.lab13.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "AppLab13Filter", dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD}, urlPatterns ={"/","/*"})
public class AppLab13Filter implements Filter {

    public AppLab13Filter() {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("AppInfo-Log: Called doFilter via " + ((HttpServletRequest)request).getRequestURI());
        Integer totalHitCount = (Integer) request.getServletContext().getAttribute("totalHitCount");
        request.getServletContext().setAttribute("totalHitCount", ++totalHitCount);
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("AppInfo-Log: Initializing " + config.getFilterName());
        int totalHitCount = 0;
        config.getServletContext().setAttribute("totalHitCount", totalHitCount);
    }

}

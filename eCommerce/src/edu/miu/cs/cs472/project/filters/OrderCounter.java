/*
 * OrderCounter.java - Filter for the Order counter: increment orderId for each POST request of Checkout(/checkout) action
 * @author Namuun S
 * @version 1.0
 */
package edu.miu.cs.cs472.project.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/checkout")
public class OrderCounter implements Filter {

    private int lastOrderId;
    
    public void destroy() {
		
	}
    
    private synchronized int incrementCount() {
		return lastOrderId+=1;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;        
        if(httpRequest.getMethod().equalsIgnoreCase("GET")){
        	System.out.println("Last OrderID for the entire WebApp: " + lastOrderId);
    		request.setAttribute("lastOrderId", incrementCount());    		
        }
		
        chain.doFilter(request, response);
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		lastOrderId = 0;
	}
	
	public int getLastOrderId() {
		return this.lastOrderId;
	}

}

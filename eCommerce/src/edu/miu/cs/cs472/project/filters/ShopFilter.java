/*
 * ShopFilter.java - Get categories list and shopping card info for each GET request. Because these pieces of information are needed in the every page.
 * @author Namuun S
 * @version 1.0
 */
package edu.miu.cs.cs472.project.filters;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.mum.cs.cs472.project.service.ShoppingCardService;
import edu.mum.cs.cs472.project.service.ShoppingService;

/**
 * Servlet Filter implementation class ShopFilter
 */
@WebFilter("/*")
public class ShopFilter implements Filter {

	private ShoppingService shoppingService;
    private ShoppingCardService shoppingCardService;

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;        
        if(httpRequest.getMethod().equalsIgnoreCase("GET")){
			List<Category> categories = shoppingService.getCategories();
	    	ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
	    	request.setAttribute("categories", categories);
	    	request.setAttribute("shoppingCard", shoppingCard);
        }
        
        chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		shoppingService = new ShoppingService(fConfig.getServletContext());
		shoppingCardService = new ShoppingCardService(fConfig.getServletContext());
	}
}

/*
 * HomeController.java - Controller for the Home page.
 * @author Namuun S
 * @version 1.0
 */
package edu.miu.cs.cs472.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Product;
import edu.mum.cs.cs472.project.service.ShoppingService;

@WebServlet(description = "This is a home page", urlPatterns = {"/home", ""})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShoppingService shoppingService;
       
    public HomeController() {
        super();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> featuredProducts = shoppingService.getFeaturedProducts();
		List<Product> topProducts = shoppingService.getTopProducts();
		List<Product> hotProducts = shoppingService.getHotProducts();
    	request.setAttribute("featuredProducts", featuredProducts);
    	request.setAttribute("topProducts", topProducts);
    	request.setAttribute("hotProducts", hotProducts);
    	request.getRequestDispatcher("WEB-INF/views/home.jsp").forward(request, response);
	}

	public void init(ServletConfig config) throws ServletException {
    	shoppingService = new ShoppingService(config.getServletContext());
    }
}

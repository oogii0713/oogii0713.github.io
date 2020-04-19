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
import edu.mum.cs.cs472.project.service.ShoppingCardService;
import edu.mum.cs.cs472.project.service.ShoppingService;

/**
 * Servlet implementation class AboutController
 */
@WebServlet("/about-us")
public class AboutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ShoppingService shoppingService;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Category> categories = shoppingService.getCategories();
		request.setAttribute("categories", categories);
		request.getRequestDispatcher("WEB-INF/views/about.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
    public void init(ServletConfig config) throws ServletException {
    	shoppingService = new ShoppingService(config.getServletContext());
    
    }

}

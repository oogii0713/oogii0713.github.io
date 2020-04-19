package edu.miu.cs.cs472.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.cs.cs472.project.model.Product;
import edu.mum.cs.cs472.project.service.ShoppingService;

/**
 * Servlet implementation class ProductDetailController
 */
@WebServlet(description = "Product Detail Info", urlPatterns = { "/product","/product/*" })
public class ProductDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShoppingService shoppingService;
       
    public ProductDetailController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = shoppingService.getProductInfo(request.getParameter("productId"));
		List<Product> featuredProducts = shoppingService.getFeaturedProducts();
    	request.setAttribute("product", product);
    	request.setAttribute("featuredProducts", featuredProducts);
    	request.getRequestDispatcher("WEB-INF/views/product.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
    public void init(ServletConfig config) throws ServletException {
    	shoppingService = new ShoppingService(config.getServletContext());
    }

}

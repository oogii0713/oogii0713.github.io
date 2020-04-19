/*
 * CheckoutController.java - Controller for the checkout page.
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
import edu.miu.cs.cs472.project.model.Order;
import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.mum.cs.cs472.project.service.CheckoutService;
import edu.mum.cs.cs472.project.service.ShoppingCardService;
import edu.mum.cs.cs472.project.service.ShoppingService;

/**
 * Servlet implementation class CheckoutController
 */
@WebServlet(description = "Checkout", urlPatterns = { "/checkout" })
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShoppingCardService shoppingCardService;
	CheckoutService checkoutService;
	ShoppingService shoppingService;
       
    public CheckoutController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
		request.setAttribute("shoppingCard", shoppingCard);*/
		request.getRequestDispatcher("/WEB-INF/views/checkout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("----------------------");
		System.out.println("orderID:" + request.getParameter("lastOrderId"));
		System.out.println("----------------------");
		int orderId = Integer.parseInt(request.getParameter("lastOrderId"));
		Order newOrder = checkoutService.addOrder(
				request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("address"), request.getParameter("city"), request.getParameter("state"),
				request.getParameter("zipCode"), request.getParameter("email"), request.getParameter("phone"), request.getParameter("note"), orderId
		);
		request.setAttribute("orderInfo", newOrder);
		System.out.println(checkoutService.getOrders());
		
		/*Setting categories and shopping card data for the Thankyou.jsp. Because it's not a get request.*/
		List<Category> categories = shoppingService.getCategories();
    	ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
    	request.setAttribute("categories", categories);
    	request.setAttribute("shoppingCard", shoppingCard);
    	
		request.getRequestDispatcher("/WEB-INF/views/thankyou.jsp").forward(request, response);
	}
	
	public void init(ServletConfig config) throws ServletException {
		checkoutService = new CheckoutService(config.getServletContext());
		shoppingCardService = new ShoppingCardService(config.getServletContext());
		shoppingService = new ShoppingService(config.getServletContext());
	}

}

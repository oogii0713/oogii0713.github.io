package edu.miu.cs.cs472.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import edu.miu.cs.cs472.project.model.Order;
import edu.mum.cs.cs472.project.service.OrderService;


/**
 * Servlet implementation class OrdersController
 */
@WebServlet("/orders")
public class OrdersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	OrderService orderService;
       
    public OrdersController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Order> orders = orderService.getOrders();
		request.setAttribute("orders", orders);
		request.getRequestDispatcher("/WEB-INF/views/orders.jsp").forward(request, response);
	}	
	
	public void init(ServletConfig config) throws ServletException {
		orderService = new OrderService(config.getServletContext());
	}
}

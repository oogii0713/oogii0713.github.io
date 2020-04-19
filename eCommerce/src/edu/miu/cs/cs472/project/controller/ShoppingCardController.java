/*
 * ShoppingCardController.java - Controller for the shopping cart page.
 * @author Namuun S
 * @version 1.0
 */
package edu.miu.cs.cs472.project.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.miu.cs.cs472.project.repository.DataRepository;
import edu.mum.cs.cs472.project.service.ShoppingCardService;

/**
 * Servlet implementation class ShoppingCardController
 */
@WebServlet(description = "Shopping Card", urlPatterns = { "/cart","/cart/*" })
public class ShoppingCardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//ShoppingCardService shoppingCardService;
       
   public ShoppingCardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/cart.jsp").forward(request, response);
	}
			
	

}

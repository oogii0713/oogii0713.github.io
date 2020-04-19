package edu.miu.cs.cs472.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.miu.cs.cs472.project.repository.DataRepository;
import edu.mum.cs.cs472.project.service.ShoppingCardService;
import edu.mum.cs.cs472.project.service.ShoppingService;

@WebServlet(description = "This is a shopping page", urlPatterns = { "/shop" })
public class ShoppingController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    ShoppingService shoppingService;
    ShoppingCardService shoppingCardService;

    public ShoppingController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<Product> products = shoppingService.getProducts(request.getParameter("category"));
    	List<Category> categories = shoppingService.getCategories();
    	ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
    	request.setAttribute("products", products);
    	request.setAttribute("categories", categories);
    	request.setAttribute("shoppingCard", shoppingCard);
    	request.getRequestDispatcher("WEB-INF/views/shop.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<Category> categories = shoppingService.getCategories();
    	ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
    	request.setAttribute("categories", categories);
    	request.setAttribute("shoppingCard", shoppingCard);
    	
    	String str = "";
    	String cmd = request.getParameter("cmd");
		try {
			if(cmd != null && !cmd.isEmpty()) {
				switch(cmd) {
					case "addProductToCard":
						str = shoppingCardService.addItem(request.getParameter("quantity"),request.getParameter("productId"));
						break;
					case "removeProductFromCard":
						str = shoppingCardService.removeItem(request.getParameter("productId"));
						break;
				}
				response.setContentType("application/json");
		    	response.setCharacterEncoding("utf-8");

		    	PrintWriter out = response.getWriter();
		    	out.print(str);
		    	out.flush();
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}  
    }
    public void init(ServletConfig config) throws ServletException {
    	shoppingService = new ShoppingService(config.getServletContext());
    	shoppingCardService = new ShoppingCardService(config.getServletContext());
    
    }
    
}

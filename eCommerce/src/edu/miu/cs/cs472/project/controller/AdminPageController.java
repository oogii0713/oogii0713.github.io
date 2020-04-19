package edu.miu.cs.cs472.project.controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.repository.DataRepository;

import java.io.IOException;
import java.util.List;
@WebServlet(description = "AdminPageController", urlPatterns = {"/admin" })
public class AdminPageController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 DataRepository dataRepository;
         dataRepository  = (DataRepository)request.getServletContext().getAttribute("data");
         List<Category> categories = dataRepository.getCategoryList();
         List<Product> products = dataRepository.getProductList();
         for(int i = 0; i< products.size(); i++) {
        	 for(int k = 0; k < categories.size(); k++) {
        		 Category currentCategory = categories.get(k);        	 
	        	 Product current = products.get(i);
	        	 if(current.getCategory().getId() == currentCategory.getId()) {
	        		 //TODO
	        	 }	
        	 }
         }
         
         request.setAttribute("adminProducts", products);         
    	request.getRequestDispatcher("WEB-INF/views/admin.jsp").forward(request, response);
    }
}

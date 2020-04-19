package edu.miu.cs.cs472.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.repository.DataRepository;

/**
 * Servlet implementation class DeleteProductController
 */
@WebServlet(description = "DeleteProductController", urlPatterns = {"/delete-product" })
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DataRepository dataRepository;
        dataRepository  = (DataRepository)request.getServletContext().getAttribute("data");
        int productId = Integer.parseInt(request.getParameter("productId"));       
        List<Product> products = dataRepository.getProductList();        
        for(int i = 0; i < products.size(); i++){
        	Product p = products.get(i);
        	if(p.getId() == productId) {
        		products.remove(i);
        	}
        }
       
        request.setAttribute("adminProducts", products);         
        //request.getRequestDispatcher("WEB-INF/views/admin.jsp").forward(request, response);
        response.sendRedirect("admin");
	}

}

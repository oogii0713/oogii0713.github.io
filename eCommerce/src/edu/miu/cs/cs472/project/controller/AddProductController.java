package edu.miu.cs.cs472.project.controller;


import org.apache.commons.io.FilenameUtils;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.repository.DataRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.List;

@MultipartConfig(fileSizeThreshold = 1024 * 1024,
maxFileSize = 1024 * 1024 * 5,
maxRequestSize = 1024 * 1024 * 5 * 5)
@WebServlet(description = "Add Product", urlPatterns = {"/add-product"})
public class AddProductController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = "";
        DataRepository dataRepository;
        dataRepository  = (DataRepository)request.getServletContext().getAttribute("data");
        List<Product> products = dataRepository.getProductList();
        int id = Integer.parseInt(request.getParameter("id"));
    	String name = request.getParameter("name");
    	String description = request.getParameter("description");
    	double price = Double.parseDouble(request.getParameter("price"));
    	int quantity =Integer.parseInt(request.getParameter("quantity"));
    	int catId = Integer.parseInt(request.getParameter("category"));
    	
        String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
        File uploadDir = new File(uploadPath);
        if(!uploadDir.exists()) uploadDir.mkdir();
        for(Part part : request.getParts()){
            if(part.getSubmittedFileName() != null){
                fileName = "product" + id + "." + FilenameUtils.getExtension(part.getSubmittedFileName());
                part.write(uploadPath + File.separator + fileName);
                System.out.println("File Upload Path: " + uploadPath + File.separator + fileName);
            }
        }
        String imagePath = "uploads"  + File.separator + fileName;
        Category category = dataRepository.getCategoryById(catId);    	
        Product newProduct = new Product(id, name, description, price, imagePath, quantity, category);
        products.add(newProduct);
        System.out.println(newProduct);
        request.setAttribute("adminProducts", products);   
        
        request.getRequestDispatcher("WEB-INF/views/admin.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 DataRepository dataRepository;
         dataRepository  = (DataRepository)request.getServletContext().getAttribute("data");
    	List<Category> categories = dataRepository.getCategoryList();
    	request.setAttribute("categories", categories);
    	request.getRequestDispatcher("WEB-INF/views/addproduct.jsp").forward(request, response);
    }
}

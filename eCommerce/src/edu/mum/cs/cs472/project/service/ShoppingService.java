package edu.mum.cs.cs472.project.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import edu.miu.cs.cs472.project.repository.DataRepository;
import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Product;

public class ShoppingService {
	DataRepository dataRepository;
	ServletContext servletContext;
	public ShoppingService(ServletContext servletContext) {
		this.servletContext = servletContext;
		dataRepository  = (DataRepository)this.servletContext.getAttribute("data");
	}
	public List<Product> getProducts(String categoryId) {
		List<Product> products = dataRepository.getProductList();
		if(categoryId !=null && !categoryId.isEmpty()) {
			try {
				int id = Integer.parseInt(categoryId);
				return products.stream()
						.filter(e -> e.getCategory().getId() == id)
						.collect(Collectors.toList()); 
			}catch(Exception e) {
				return products;
			}	
		}
		return products;
	}
	public List<Category> getCategories() {
		return dataRepository.getCategoryList();
	}
	
	/*Added by: Otgonbayar; April 14, 2020; START:*/
	public Product getProductInfo(String productId) {
		return dataRepository.getProductById(Integer.parseInt(productId));
	}
	/*Added by: Otgonbayar; April 14, 2020; END*/
	
	/*Added by: Namuun; April 14, 2020; START:*/
	public List<Product> getFeaturedProducts(){
		return dataRepository.getFeaturedProducts();
	}
	public List<Product> getTopProducts(){
		return dataRepository.getTopSellingProducts();
	}
	public List<Product> getHotProducts(){
		return dataRepository.getHotOfferProducts();
	}
	/*Added by: Namuun; April 14, 2020; END*/
}

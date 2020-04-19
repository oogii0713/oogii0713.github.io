package edu.mum.cs.cs472.project.service;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import edu.miu.cs.cs472.project.model.BillingDetails;
import edu.miu.cs.cs472.project.model.Order;
import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.miu.cs.cs472.project.repository.DataRepository;

public class CheckoutService {
	DataRepository dataRepository;
	ServletContext servletContext;
	
	public CheckoutService(ServletContext servletContext) {
		this.servletContext = servletContext;
		dataRepository = (DataRepository) this.servletContext.getAttribute("data");
	}
	
	public ShoppingCard getShoppingCard() {
		return this.dataRepository.getShoppingCard();
	}	
		
	public Order addOrder(String fn, String ln, String addr, String c, String stt, String zip, String e, String ph, String n, int orderId) {
		//Creating billing details object
		BillingDetails bd = new BillingDetails(fn, ln, addr, zip, c, stt, e, ph, n);
		//calculating total payment		
		double sum = dataRepository.getShoppingCard().getItems().stream().mapToDouble(o->o.getPrice()).sum();
		//Creating new Order Object
		Order newOrder = dataRepository.addOrder(orderId,sum,bd);
		//Clearing shopping card object
		dataRepository.emptyShoppingCart();
		return newOrder;
	}
	
	public List<Order> getOrders(){
		return dataRepository.getOrderList();
	}
}

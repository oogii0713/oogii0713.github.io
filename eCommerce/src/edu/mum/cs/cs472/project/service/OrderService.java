package edu.mum.cs.cs472.project.service;

import java.util.List;

import javax.servlet.ServletContext;

import edu.miu.cs.cs472.project.model.Order;
import edu.miu.cs.cs472.project.repository.DataRepository;

public class OrderService {
	DataRepository dataRepository;
	ServletContext servletContext;
	
	public OrderService(ServletContext servletContext) {
		this.servletContext = servletContext;
		dataRepository  = (DataRepository)this.servletContext.getAttribute("data");
	}
	
	public List<Order> getOrders(){
		return dataRepository.getOrderList();
	}

}

package edu.miu.cs.cs472.project.model;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private int id;
	private List<Item> items;
	private double sum;
	private BillingDetails billingDetails;
	private LocalDate orderDate;
	
	public Order(int i, List<Item> il, double s, BillingDetails bd) {
		this.id = i;
		this.items = il;
		this.sum = s;
		this.billingDetails = bd;
		this.orderDate = LocalDate.now();
		 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public BillingDetails getBillingDetails() {
		return billingDetails;
	}

	public void setBillingDetails(BillingDetails billingDetails) {
		this.billingDetails = billingDetails;
	}
		
	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order id: " + this.id + "; Sum: " + sum + 
				"\nBilling Details:\n"+"First name: "+billingDetails.getFirstName() + "; Last Name: " + billingDetails.getLastName() + "; Order Date: " + orderDate;
	}
	
		
}

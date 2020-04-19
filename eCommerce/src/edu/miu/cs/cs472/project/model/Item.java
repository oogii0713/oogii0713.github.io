package edu.miu.cs.cs472.project.model;

public class Item {
	Product product;
	int quantity;
	double price;
	
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		this.price = quantity * product.getPrice();
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

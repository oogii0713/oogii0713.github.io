package edu.miu.cs.cs472.project.model;

public class ShippingAddress {
	private String street;
	private String zipcode;
	private String city;
	private String state;
	private String country;
	
	public ShippingAddress(String street, String zipcode, String city, String state, String country) {
		super();
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

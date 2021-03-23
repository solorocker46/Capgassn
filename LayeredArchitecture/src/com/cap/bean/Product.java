package com.cap.bean;

public class Product {
	private int productId;
	private String productName;
	private String category;
	private int price;
	private int quantity;
	//Quantity will be taken from user
	//This is a billing application
	public Product(int productId, String productName, String category, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}

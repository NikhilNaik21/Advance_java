package com.JDBC;
//POJO

import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {
	private int productId;
	private String productName;
	private int price;
	
	
	
	
	public Product() {
	
	}
	
	public Product(ResultSet rs) throws SQLException {
		
		this.productId = rs.getInt(1);
		this.productName = rs.getString(2);
		this.price = rs.getInt(3);
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	 
}

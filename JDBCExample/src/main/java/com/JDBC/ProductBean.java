package com.JDBC;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;




public class ProductBean implements Serializable{
	public List<Product> getEntries(){
		ArrayList<Product> entries = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceDB", "root","root123");
			/* PreparedStatement stmt = con.prepareStatement("select * from Product"); */
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Product");
			while(rs.next())
			{
				Product prod = new Product(rs);
				entries.add(prod);
			}
			return entries;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public void Addproduct(Product prod)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceDB", "root","root123");
			PreparedStatement ps =con.prepareStatement("insert into Product values(?,?,?)");
			ps.setInt(1,prod.getProductId());
			ps.setString(2,prod.getProductName());
			ps.setInt(3,prod.getPrice());
			int recordcount = ps.executeUpdate();
			System.out.println(recordcount + " Record Inserted Successfully");
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}

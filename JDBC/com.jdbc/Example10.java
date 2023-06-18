package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.Callable;

public class Example10 {

	public static void main(String[] args) {
		// Adding bonus using stored procedures
		
		try
		{
			// loads (registers) the Driver class and returns the reference of the Driver class
			Class.forName("org.postgresql.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");         											 //server ip/name with port/Database Name, user name, password
			
			CallableStatement stmt= con1.prepareCall("call addBonus(?,?)");
			stmt.setInt(1, 40);
			stmt.setInt(2, 50000);
			stmt.execute();
			System.out.println("Bonus Credited Successfully...");
			con1.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
			
		}
	}

}

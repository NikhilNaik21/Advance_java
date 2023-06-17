package com.mysqljdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example8 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		

		try
		{
			// loads (registers) the Driver class and returns the reference of the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://192.168.24.80:3306/cdac","root","root");
         											 //server ip/name with port/Database Name, user name, password
			
			Statement stmt = con1.createStatement();
			//ResultSet rs = stmt.executeQuery("Select * from student");
			ResultSet rs = stmt.executeQuery("Select * from dept");
		
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+"    "+rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
			
		}

	}

}

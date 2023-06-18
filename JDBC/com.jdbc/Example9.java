package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example9 {

	public static void main(String[] args) {
		// Creating table

		try
		{
			// loads (registers) the Driver class and returns the reference of the Driver class
			Class.forName("org.postgresql.Driver"); 
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");
         											 //server ip/name with port/Database Name, user name, password
			
			Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("Select * from student");
			 stmt.execute("CREATE TABLE employee20(empno int , empname varchar(50),balance int)");
		
			 int n=stmt.getUpdateCount();
			 System.out.println("NO of records Affected = "+ n);
			 con.close();
			 
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
			
		}
	}

}

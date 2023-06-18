package com.jdbc;
import java.sql.*;


public class Example1 {

	public static void main(String[] args) 
	{
		try
		{
			// loads (registers) the Driver class and returns the reference of the Driver class
			Class.forName("org.postgresql.Driver"); 
			//Acquiring connection with DB and java
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");
         											 //server ip /name with port/Database Name, user name, password
			//The object used for executing a static SQL statement and returning the results it produces. 
			Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("Select * from student");
			ResultSet rs = stmt.executeQuery("Select studentno, studentname from students");
		
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+"   "+rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
			
		}
	}
}




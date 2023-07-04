package com.labexam;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;


public class employeeBean implements Serializable{
	public List<employee> getEntries(){
		ArrayList<employee> entries = new ArrayList<>();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root","root");
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee where ename like 'S%'");
		System.out.println("eno\t"+"ename\t"+"department");
		while(rs.next())
			{
			System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		return entries;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		
	}
}	

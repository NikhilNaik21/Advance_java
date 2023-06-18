package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");
		PreparedStatement ps=con.prepareStatement("insert into students values(?,?)");
		
		
		System.out.println("Enter Student No: ");
		int studentno = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Name: ");
		String studentname = (br.readLine());
		ps.setInt(1, studentno);
		ps.setString(2,studentname);
		//	 ps.setInt(1, 30);
		//	 ps.setString(2,"Shekhar");
	
	
		int recordCount =ps.executeUpdate();
		System.out.println(recordCount + " Record Inserted Successfully");
		con.close();
	}

}

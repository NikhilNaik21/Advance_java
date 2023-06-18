package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// TODO Updating the database 

		
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");
		PreparedStatement ps=con.prepareStatement("update students set studentname=? where studentno=? ");
		
		System.out.println("Enter num of records you want to update: ");
		int count=Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;i++)
		{
		System.out.println("Enter Student No: ");
		int studentno = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Name: ");
		String studentname = (br.readLine());
		ps.setInt(2, studentno);
		ps.setString(1,studentname);

		
		int recordCount =ps.executeUpdate();
		}
		System.err.println(count + " Record updated Successfully");
		con.close();

	}

}

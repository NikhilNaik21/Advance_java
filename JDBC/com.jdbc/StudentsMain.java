package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Students s1 = new Students();
		s1.setStudentname("Nikhil");
		s1.setStudentno(100);
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");
		PreparedStatement ps=con.prepareStatement("insert into students values(?,?)");
		
		ps.setInt(1, s1.getStudentno());
		ps.setString(2, s1.getStudentname());
		
		int recordCount =ps.executeUpdate();
		System.out.println(recordCount + " Record Inserted Successfully");
		
	//	--------------------------
		Statement stmt = con.createStatement();
		ResultSet rs =stmt.executeQuery("Select * from students");
		while(rs.next())
		{
			s1.setStudentno(rs.getInt(1));
			s1.setStudentname(rs.getString(2));
			System.out.println(s1.getStudentno());
			System.out.println(s1.getStudentname());
		}
	//--------------------------
		con.close();
	}

}

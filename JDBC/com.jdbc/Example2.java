package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");
		PreparedStatement ps=con.prepareStatement("insert into students values(?,?)");
		ps.setInt(1, 30);
		ps.setString(2,"Shekhar");
		
		int recordCount =ps.executeUpdate();
		System.out.println(recordCount + " Record Inserted Successfully");
		con.close();
	}

}

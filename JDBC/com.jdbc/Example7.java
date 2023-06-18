package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// All in one--> CRUD
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Class.forName("org.postgresql.Driver");
		//connection String for postgresql
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cdac","postgres","root");
		int num;
		do {
			System.out.println("1.Insert\n2.Update\n3.Delete\n0.Exit");
			num=Integer.parseInt(br.readLine());
			
			switch(num)
			{
			case 1: 
				//insert into DB
				PreparedStatement ps=con.prepareStatement("insert into students values(?,?) ");
				
				System.out.println("Enter num of records you want to enter: ");
				int count=Integer.parseInt(br.readLine());
				
				for(int i=0;i<count;i++)
				{
				System.out.println("Enter Student No: ");
				int studentno = Integer.parseInt(br.readLine());
				System.out.println("Enter Student Name: ");
				String studentname = (br.readLine());
				ps.setInt(1, studentno);
				ps.setString(2,studentname);

				
				int Count =ps.executeUpdate();
				}
				System.out.println(count + " Record Inserted Successfully");
				// con.close();
				
				break;
				
			case 2:
				
				PreparedStatement ps3=con.prepareStatement("update students set studentname=? where studentno=? ");
				
				System.out.println("Enter num of records you want to update: ");
				int count1=Integer.parseInt(br.readLine());
				
				for(int i=0;i<count1;i++)
				{
				System.out.println("Enter Student No: ");
				int studentno = Integer.parseInt(br.readLine());
				System.out.println("Enter Student Name: ");
				String studentname = (br.readLine());
				ps3.setInt(2, studentno);
				ps3.setString(1,studentname);

				
				int Count1 =ps3.executeUpdate();
				
				}
				System.err.println(count1 + " Record updated Successfully");
			//	con.close();
				break;
			case 3:
				PreparedStatement ps2 = con.prepareStatement("delete from students where studentno=?");
				
				System.out.println("Enter num of records you want to update: ");
				int count2=Integer.parseInt(br.readLine());
				
				for(int i=0;i<count2;i++)
				{
				System.out.println("Enter Student No: ");
				int studentno = Integer.parseInt(br.readLine());
				/*System.out.println("Enter Student Name: ");
				String studentname = (br.readLine());*/
				
				ps2.setInt(1, studentno);
				/*ps.setString(1,studentname);*/

				
				int checkExecute =ps2.executeUpdate();
				if(checkExecute==1)
				{
					System.err.println(count2 + " Record deleted Successfully");
				}else 
					{
						System.err.println(count2 + " Record haven't deleted ");
					}
				}
				
		//		con.close();
				break;
			case 0:
				System.out.println("Exiting......\n");
				con.close();
				break;
				
			}
			
		}
		while(num!=0);
	}
	

}
	


package try_pg;
import java.sql.*;


public class JDBC_DemoR {

	public static void main(String[] args) 
	{
		try
		{
			// loads (registers) the Driver class and returns the reference of the Driver class
			Class.forName("org.postgresql.Driver"); 
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CDAC","postgres","root");
         											 //server ip/name with port/Database Name, user name, password
			
			Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("Select * from student");
			ResultSet rs = stmt.executeQuery("Select studentno, studentname from student");
		
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




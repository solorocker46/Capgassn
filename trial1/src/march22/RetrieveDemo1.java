package march22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step - 1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class found");
			//step - 2
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "emp", "emp");
			System.out.println("Connected");
			//step - 3 - Creating statement object
			System.out.println("Input id, name, dept and salary");
			//Statement stmt = conn.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from employee where id = 1");
			//while(rs.next())
			//{
			//	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			//}
			PreparedStatement ps = conn.prepareStatement("select * from employee where id = ?");
			ps.setInt(1, 5);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			}
		} 
		catch(Exception e)
		{
			System.out.println("Problems");
		}

	}

}

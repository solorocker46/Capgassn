package march22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ParameterizedQuery {

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
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?, ?, ?, ?)");
			ps.setInt(1, 3);
			ps.setString(2, "Sid");
			ps.setString(3, "HR");
			ps.setDouble(4, 45000);
			ps.execute();
			System.out.println("Inserted");
		} 
		catch(Exception e)
		{
			System.out.println("Problems");
		}
	}

}

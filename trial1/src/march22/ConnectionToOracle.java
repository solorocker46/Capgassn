package march22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToOracle {

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
			Statement stmt = conn.createStatement();
			//String sqlQuery = "insert into employee values(2, 'Sachin', 'Developer', 48000);";
			stmt.execute("insert into employee values(2, 'Sachin', 'Developer', 48000)");
			System.out.println("Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid login");
		}
		catch(Exception e)
		{
			System.out.println("Problems");
		}
	}

}

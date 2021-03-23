package march22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			//step - 1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class found");
			//step - 2
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "emp", "emp");
			System.out.println("Connected");
			//step - 3 - Creating statement object
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from register");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} 
		catch(Exception e)
		{
			System.out.println("Problems");
		}

	}

}

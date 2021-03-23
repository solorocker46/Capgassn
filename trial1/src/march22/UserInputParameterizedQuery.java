package march22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInputParameterizedQuery {

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
			System.out.println("Input id, name, dept and salary");
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?, ?, ?, ?)");
			ps.setInt(1, scanner.nextInt());
			ps.setString(2, scanner.next());
			ps.setString(3, scanner.next());
			ps.setDouble(4, scanner.nextDouble());
			ps.execute();
			System.out.println("Inserted");
		} 
		catch(Exception e)
		{
			System.out.println("Problems");
		}
	}

}

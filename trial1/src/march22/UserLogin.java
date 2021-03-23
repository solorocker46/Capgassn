package march22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. Login\t2. Register");
		int choice = scanner.nextInt();
		try {
			//step - 1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step - 2
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "emp", "emp");
			//step - 3 - Creating statement object
			/*Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from register");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}*/
			if(choice == 1)
			{
				System.out.println("Input username");
				String userName = scanner.next();
				//scanner.nextLine();
				System.out.println("Input password");
				String password = scanner.next();
				PreparedStatement ps = conn.prepareStatement("select * from register where username = ? and password = ?");
				ps.setString(1, userName);
				ps.setString(2, password);
				ResultSet rs1 = ps.executeQuery();
				int temp = 0;
				while(rs1.next())
				{
					temp = 1;
				}
				if(temp == 1)
				{
					System.out.println("Login successful");
				}
				else
				{
					System.out.println("Invalid credentials");
				}
			}
			else if(choice == 2)
			{
				System.out.println("Input username");
				String userName = scanner.next();
				//scanner.nextLine();
				System.out.println("Input password");
				String password = scanner.next();
				//scanner.nextLine();
				System.out.println("Input designation");
				String designation = scanner.next();
				PreparedStatement ps1 = conn.prepareStatement("insert into register values(?, ?, ?)");
				ps1.setString(1, userName);
				ps1.setString(2, password);
				ps1.setString(3, designation);
				ps1.execute();
				System.out.println("Registration successful");
			}
			else
			{
				System.out.println("Invalid choice number");
			}
			conn.close();
		} 
		catch(Exception e)
		{
			System.out.println("Problems");
		}
	}

}

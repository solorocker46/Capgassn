package march22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetadataDemo {

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
			ResultSet rs = stmt.executeQuery("select * from register");
			ResultSetMetaData rsm = rs.getMetaData();
			System.out.println(rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1));
			System.out.println(rsm.getColumnName(2));
			System.out.println(rsm.getColumnName(3));
			conn.close();
		} 
		catch(Exception e)
		{
			System.out.println("Problems");
		}
	}

}

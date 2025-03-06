package in;

import java.sql.*;
public class EstablishConnection {
	public static void main(String[] args) {
		
		try {
			//1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.establish the connection
			DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			System.out.println("hello");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

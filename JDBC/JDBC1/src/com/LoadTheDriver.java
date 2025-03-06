package com;

import java.sql.*;
public class LoadTheDriver {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// ways of loading the Driver
		
		// 1st way
		java.sql.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		//2nd way
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
	}

}

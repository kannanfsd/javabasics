package com.comcast.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDbDemo {

	public static void main(String[] args) {
		try {
			// Create the Driver Instance.
			Driver myDriver = new com.mysql.cj.jdbc.Driver();
			// Register the driver instance in DriverManager class
			DriverManager.registerDriver(myDriver);
			// Establish the connection between MySQL Database.
			String URL = "jdbc:mysql://localhost:3306/ibank";
			String username = "comcast";
			String password = "comcast";
			Connection con = DriverManager.getConnection(URL, username, password);
			if(con!=null) {
				System.out.println("Successfully connected.");
			}
			String query = "create table customer(id int primary key, name varchar(40))";
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Table is created.");
			stmt.close();
			con.close();
		} catch(SQLException e) {		
			e.printStackTrace();
		}	
	}
}

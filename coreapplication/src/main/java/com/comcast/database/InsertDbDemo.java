package com.comcast.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDbDemo {
	public static void main(String[] args) {
		try {
			Driver myDriver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibank", "comcast", "comcast");
			String query = "insert into customer(id, name) values(1201, 'mathi')";
			Statement stmt = con.createStatement();
			int rowCount = stmt.executeUpdate(query);
			System.out.println(rowCount+" Rows affected.");
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}

package com.comcast.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDbDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			Driver myDriver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibank", "comcast", "comcast");
			String query = "update customer set name=? where id=?";
			System.out.println("Enter the id for update, ");
			int cid = Integer.parseInt(scan.nextLine());
			System.out.println("Enter the name for update, ");
			String cname = scan.nextLine();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, cname);
			pstmt.setInt(2, cid);
			int count = pstmt.executeUpdate();
			System.out.println(count+" Rows affected.");
			pstmt.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		scan.close();
	}
}

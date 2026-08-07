package com.kodewala.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBInsert {

	public static void main(String[] args) {
		String query = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
		String dbUrl = "jdbc:mysql://localhost:3306/company_db";
		String dbUser = "root";
		String dbPassword = "root";
		try (
				Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
				PreparedStatement ps = con.prepareStatement(query)) 
		{
			ps.setInt(1, 102);
			ps.setString(2, "Raj");
			ps.setDouble(3, 50000.0);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				System.out.println("Record inserted successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

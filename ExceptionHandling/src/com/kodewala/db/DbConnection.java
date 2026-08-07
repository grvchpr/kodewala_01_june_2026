package com.kodewala.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
	public static void main(String[] args) {
		String query = "select * from employee";
		String dbUrl = "jdbc:mysql://localhost:3306/company_db";
		String dbUser = "root";
		String dbPassword = "root";
		try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

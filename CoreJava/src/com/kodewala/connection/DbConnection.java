package com.kodewala.connection;

import java.sql.Connection;

public class DbConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/company_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = java.sql.DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

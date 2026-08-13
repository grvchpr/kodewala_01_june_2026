package com.kodewala.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/company_db";
		String userName = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection(url, userName, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

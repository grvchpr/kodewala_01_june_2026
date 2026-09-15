package com.kodewala.streamapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company_db";
		String user = "root";
		String pass = "root";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("ID "+"Name "+"Department "+"Salary ");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM employee");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " 
						+ rs.getString("name") + " " 
						+ rs.getString("department") + " "
						+ rs.getDouble("salary"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "INSERT INTO employee VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, 102);
			ps.setString(2, "Lakhan");
			ps.setString(3, "HR");
			ps.setDouble(4, 56000.0);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

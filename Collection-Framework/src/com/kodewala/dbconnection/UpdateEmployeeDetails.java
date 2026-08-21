package com.kodewala.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployeeDetails {

	public static void main(String[] args) {

		Connection con = DB_Connection.getConnection();
		String query = "UPDATE employee SET name = ?, department = ?, salary = ? WHERE id = ?";
		if (con != null) {
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, "Gourav Chopra");
				ps.setString(2, "IT");
				ps.setDouble(3, 95000.00);
				ps.setInt(4, 101);
				int rowsAffected = ps.executeUpdate();
				System.out.println("Rows updated: " + rowsAffected);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
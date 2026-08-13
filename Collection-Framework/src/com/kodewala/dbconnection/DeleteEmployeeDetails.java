package com.kodewala.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployeeDetails {

	public static void main(String[] args) {
		Connection con = DB_Connection.getConnection();
		String query = "DELETE FROM employee WHERE id = ?";
		if (con != null) {
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, 102);
				int rowsAffected = ps.executeUpdate();
				System.out.println("Rows deleted: " + rowsAffected);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

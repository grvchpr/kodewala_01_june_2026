package com.kodewala.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDetailsInsert {

	public static void main(String[] args) {

		Connection con = DB_Connection.getConnection();
		String query = "INSERT INTO employee (id, name, department, salary) VALUES (?, ?, ?, ?)";
		if (con != null) {
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, 102);
				ps.setString(2, "John Doe");
				ps.setString(3, "IT");
				ps.setDouble(4, 60000.00);
				int rowsAffected = ps.executeUpdate();
				System.out.println("Rows inserted: " + rowsAffected);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
package com.kodewala.dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveEmployeeDetails {

	public static void main(String[] args) {
		Connection con = DB_Connection.getConnection();
		String query = "SELECT * FROM employee";
		if (con != null) {
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet resultSet = ps.executeQuery();
				System.out.println("Employee Details:");
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					String department = resultSet.getString("department");
					double salary = resultSet.getDouble("salary");

					System.out.println(
							"ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

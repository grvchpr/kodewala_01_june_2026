package com.kodewala.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.kodewala.connection.DbConnection;

public class EmployeeDAO {

	Scanner sc = new Scanner(System.in);

	// Add Employee
	public void addEmployee() {

		try {

			Connection con = DbConnection.getConnection();

			System.out.print("Enter Id : ");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.print("Enter Name : ");
			String name = sc.nextLine();

			System.out.print("Enter Salary : ");
			double salary = sc.nextDouble();

			String sql = "insert into employee values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, salary);

			int i = ps.executeUpdate();

			if (i > 0)
				System.out.println("Employee Added Successfully");
			else
				System.out.println("Failed");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Display Employee
	public void displayEmployee() {

		try {

			Connection con = DbConnection.getConnection();

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from employee");

			while (rs.next()) {

				System.out.println("--------------------------");
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Salary : " + rs.getDouble(3));
			}

			con.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// Update Employee
	public void updateEmployee() {

		try {

			Connection con = DbConnection.getConnection();

			System.out.print("Enter Employee Id : ");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.print("Enter New Name : ");
			String name = sc.nextLine();

			System.out.print("Enter New Salary : ");
			double salary = sc.nextDouble();

			String sql = "update employee set name=?,salary=? where id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, name);
			ps.setDouble(2, salary);
			ps.setInt(3, id);

			int i = ps.executeUpdate();

			if (i > 0)
				System.out.println("Updated Successfully");
			else
				System.out.println("Employee Not Found");

			con.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// Delete Employee
	public void deleteEmployee() {

		try {

			Connection con = DbConnection.getConnection();

			System.out.print("Enter Employee Id : ");

			int id = sc.nextInt();

			String sql = "delete from employee where id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int i = ps.executeUpdate();

			if (i > 0)
				System.out.println("Deleted Successfully");
			else
				System.out.println("Employee Not Found");

			con.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
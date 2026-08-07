package com.kodewala;

import java.util.Scanner;

import com.kodewala.dao.EmployeeDAO;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		EmployeeDAO dao = new EmployeeDAO();

		while (true) {

			System.out.println("\n===== Employee Management System =====");

			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");

			System.out.print("Enter Choice : ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				dao.addEmployee();
				break;

			case 2:
				dao.displayEmployee();
				break;

			case 3:
				dao.updateEmployee();
				break;

			case 4:
				dao.deleteEmployee();
				break;

			case 5:
				System.out.println("Thank You");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}

		}

	}

}
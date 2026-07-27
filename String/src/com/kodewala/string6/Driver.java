package com.kodewala.string6;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId (if not required, enter 0): ");
		long empId = sc.nextLong();
		System.out.println("Enter salary (if not required, enter 0): ");
		int salary = sc.nextInt();
		Employee employee = new Employee(empId, salary);
		String query = QueryBuilder.buildQuery(employee);
		System.out.println("Generated Query: ");
		System.out.println(query);
		sc.close();
	}

}

package com.kodewala.stream.api.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		Employee[] employees = { new Employee("Ajay"), new Employee("Bhanu"), new Employee("Chitra"),
				new Employee("Deepak"), new Employee("Esha"), new Employee("Arun"), new Employee("Bhavana"),
				new Employee("Chandan"), new Employee("Deepa"), new Employee("Eshwar") };

		List<Employee> employeeList = Arrays.asList(employees);
		
		List<String> output = employeeList.stream()
		.map(employee -> employee.name.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(output);
	}
}

class Employee {
	String name;

	public Employee(String name) {
		this.name = name;
	}
}
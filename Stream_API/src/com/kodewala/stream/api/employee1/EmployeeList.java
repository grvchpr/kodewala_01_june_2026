package com.kodewala.stream.api.employee1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		Employee[] empList = {new Employee("Ganesh", 1000000),
				new Employee("Rohit", 800000), 
				new Employee("Chandan", 900000),
				new Employee("Gourav", 9500000), 
				new Employee("Rahul", 1100000)};
		
		List<Employee> employeeList = Arrays.asList(empList);
		List<String> result = employeeList.stream()
				.filter(emp -> emp.empSalary > 1000000)
				.map(emp -> emp.empName).
				collect(Collectors.toList());
		for (String name : result) {
			System.out.println("Employee Name with salary above 10LPA: "+name);
		}
	}
}
class Employee {
	String empName;
	double empSalary;

	public Employee(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}
}

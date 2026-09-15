package com.kodewala;

import java.util.Arrays;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) {
		Employee[] empList= {new Employee("Gourav", 1500000),
				new Employee("Kavita", 1000000),
				new Employee("Lakhan", 1200000),
				new Employee("Vidhi", 1100000)};
		
		List<Employee> list=Arrays.asList(empList);
		
		list.stream()
		.filter(emp->emp.empSalary>1100000)
		.map(emp->emp.empName+" : "+emp.empSalary)
		.forEach(System.out::println);
	}
}

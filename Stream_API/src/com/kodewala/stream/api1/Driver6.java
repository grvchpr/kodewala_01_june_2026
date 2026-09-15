package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import lombok.Data;

public class Driver6 {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee("Rahul", 20000),
				new Employee("Mahesh", 30000),
				new Employee("Raja", 40000),
				new Employee("Mahesh", 56000),
				new Employee("Gautam", 106000));
		
		Employee output = employees.stream()
				.sorted((e1, e2)-> Integer.compare(e2.getSalary(), e1.getSalary()))
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println(output.getName()+" : "+output.getSalary());
	}

}

@Data
class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}
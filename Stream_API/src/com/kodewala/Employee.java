package com.kodewala;

import lombok.Data;

@Data
public class Employee {
	String empName;
	double empSalary;

	public Employee(String empName, double empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString() {
		return empName + " : " + empSalary;
	}

}

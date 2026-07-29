package com.kodewala.clonable;

import java.util.Scanner;

class Address {
	public String line1;

	Address(String line1) {
		this.line1 = line1;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1l(String line1) {
		this.line1 = line1;
	}

}

class Employee implements Cloneable {
	public String empName;
	public Address address;

	public Employee(String empName, Address address) {
		this.empName = empName;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee("Gourav", new Address("BTM Layout"));
		emp1.setEmpName("Gourav Chopra");
		emp1.address.setLine1l("Kudlu Gate");
		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2.empName);
		System.out.println(emp2.address.line1);

	}
}

package com.kodewala.clonable;

class Address {
	public String line1l;

	Address(String line1l) {
		this.line1l = line1l;
	}
}

class Employee implements Cloneable {
	public String empName;
	public Address address;

	public Employee(String empName, Address address) {
		this.empName = empName;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee("Gourav", new Address("BTM Layout"));
		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2.empName);
		System.out.println(emp2.address.line1l);

	}
}

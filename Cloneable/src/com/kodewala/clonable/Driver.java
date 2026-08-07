package com.kodewala.clonable;

class Address implements Cloneable {
	public String line1;

	Address(String line1) {
		this.line1 = line1;
	}

	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
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
	public Employee clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		employee.address = this.address.clone();
		return employee;
	}

}

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("BTM Layout");
		Employee emp1 = new Employee("Gourav", address);
		Employee emp2 = (Employee) emp1.clone();
		emp2.address.line1 = "Indiranagar";
		System.out.println("Original Obj: " + emp1.empName);
		System.out.println("Original Obj: " + emp1.address.line1);
		System.out.println();
		System.out.println("Cloned Obj: " + emp2.empName);
		System.out.println("Cloned Obj: " + emp2.address.line1);

	}
}

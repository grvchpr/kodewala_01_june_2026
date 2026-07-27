package com.intrf2;

class Employee implements Cloneable {
	private int empId;

	Employee(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(101);

		Employee emp2 = (Employee) emp.clone();

		System.out.println("Employee ID: " + emp2.getEmpId());
	}

}

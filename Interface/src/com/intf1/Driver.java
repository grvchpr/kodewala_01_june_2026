package com.intf1;

class Employee implements Cloneable {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Gourav", 30);
		Employee e2 = (Employee) e1.clone();
		System.out.println("Employee 1: " + e1.getName() + ", Age: " + e1.getAge());
		System.out.println();
		System.out.println("Employee 2: " + e2.getName() + ", Age: " + e2.getAge());

	}

}

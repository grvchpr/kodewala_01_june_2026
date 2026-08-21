package com.kodewala.set4;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 12345678;
	}
}

public class Driver {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>(64);

		Employee e1 = new Employee("Kodewala");
		Employee e2 = new Employee("Kodewala");
		Employee e3 = new Employee("Kodewala");
		Employee e4 = new Employee("Kodewala");
		Employee e5 = new Employee("Kodewala");
		Employee e6 = new Employee("Kodewala");
		Employee e7 = new Employee("Kodewala");
		Employee e8 = new Employee("Kodewala");
		Employee e9 = new Employee("Kodewala");

		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);

		System.out.println(set);
	}

}
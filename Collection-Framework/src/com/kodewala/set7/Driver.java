
package com.kodewala.set7;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		int result = Integer.compare(this.id, o.id);
		System.out.println("Comparing " + this.id + " with " + o.id + " : " + result);
		return result;
	}
}

public class Driver {

	public static void main(String[] args) {
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(new Employee(101, "Gourav"));
		empSet.add(new Employee(102, "Amit"));
		empSet.add(new Employee(100, "Rohit"));
		empSet.add(new Employee(101, "Gourav")); // Duplicate id, will not be added
		for (Employee employee : empSet) {
			System.out.println(employee.id + " " + employee.name);
		}
	}

}
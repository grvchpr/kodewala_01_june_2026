package com.kodewala.set8;

import java.util.HashSet;
import java.util.Set;

class Student {
	int id;

	public Student(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof Student && this.id == ((Student) o).id;
	}

	public int hashCode() {
		return super.hashCode();
	}
}

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(10);
		Student s2 = new Student(10);

		Set<Student> set = new HashSet<>();

		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
	}

}

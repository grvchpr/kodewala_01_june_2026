package com.kodewala.clonable1;

class Address {
	String line1;

	public Address(String line1) {
		this.line1 = line1;
	}
}

class Person implements Cloneable {
	String name;
	int age;
	Address address;

	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		return person;
	}
}

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = new Person("Gourav", 29, new Address("Sanawad"));
		System.out.println("Original Object: ");
		System.out.println("Name: " + person1.name);
		System.out.println("Age: " + person1.age);
		System.out.println("Address: " + person1.address.line1);
		/*
		 * clone person1 to person2
		 */
		Person person2 = (Person) person1.clone();
		System.out.println("\nCloned Object: ");
		System.out.println("Name: " + person2.name);
		System.out.println("Age: " + person2.age);
		System.out.println("Address: " + person2.address.line1);
	}
}

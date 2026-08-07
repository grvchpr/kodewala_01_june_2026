package com.kodewala.clonable;

interface Parent {
	default void print() {
		System.out.println("Parent");
	};
}

interface Child {
	default void print() {
		System.out.println("child");
	};
}

public class Test implements Parent, Child {

	public void print() {
		Parent.super.print();
		Child.super.print();
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.print();
	}
}

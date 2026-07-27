package com.inhr;

class Parent {

	public Post method2() {
		System.out.println("Parent method2");
		return new Post();
	}
}

class Child extends Parent {
	@Override
	public SpeedPost method2() {
		System.out.println("Child method2");
		return new SpeedPost();
	}
}

public class Driver {

	public static void main(String[] args) {

	}

}

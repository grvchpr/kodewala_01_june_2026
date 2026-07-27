package com.kodewala.string3;

class Test {
	final int MAX_NUMBER;

	Test(int maxNumber) {
		MAX_NUMBER = maxNumber;
	}
}

public class Demo extends Test {

	Demo(int maxNumber) {
		super(maxNumber);
	}

	public static void main(String[] args) {
		Test test = new Test(100);
		// test.maxNumber = 200; // This line will cause a compilation error because
		// MAX_NUMBER is final and
		// cannot be reassigned.
		System.out.println("MAX_NUMBER: " + test.MAX_NUMBER);
		Test test2 = new Test(200);
		System.out.println("MAX_NUMBER: " + test2.MAX_NUMBER);
	}

}

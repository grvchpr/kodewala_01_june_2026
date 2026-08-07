package com.kodewala.driver;

public class Driver2 {

	public static void main(String[] args) {
		int result = returnValue();
		System.out.println("Result: " + result);
	}

	public static int returnValue() {
		try {
			System.out.println("Inside try block");
			return 10;
		} finally {
			System.out.println("Inside finally block");
			return 20;
		}
	}

}

package com.kodewala;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver1 main method started");
		try {
			String name = null;
			int length = name.length();
			System.out.println("Length of the name is: " + length);
			System.out.println(name.charAt(15));
			doSomething();
		} catch (NullPointerException e) {
			System.out.println("Exception caught in main method");
			e.printStackTrace();

		}
		System.out.println("Driver1 main method ended");
	}

	private static void doSomething() {
		System.out.println("doSomething method started");
		System.out.println("Driver1.doSomething()");
		System.out.println("doSomething method ended");
	}

}

package com.kodewala;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main() START");
		String name = args[0];
		System.out.println(name.length());
		printName();
		System.out.println("Driver.main() END");
	}

	private static void printName() {
		System.out.println("Driver.printName() START");
		System.out.println("Driver.printName() printName");
		System.out.println("Driver.printName() END");
	}

}

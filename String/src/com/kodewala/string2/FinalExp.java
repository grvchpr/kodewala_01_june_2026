package com.kodewala.string2;

public class FinalExp {
	final int MAX_NUMBER = 100;

	public static void main(String[] args) {
		// MAX_NUMBER = 200; // This will give compile time error because MAX_NUMBER is
		// final and cannot be
		// reassigned
		FinalExp obj = new FinalExp();
		obj.display();
	}

	public final void display() {
		System.out.println("This is a final method");
	}
}

/*
 * class Test extends FinalExp {
 * This will give compile time error because FinalExp class is final and
 * cannot be extended
 * 
 * }
 */

/*
 * class Test extends FinalExp {
 * This will give compile time error because display() method is final and
 * cannot be overridden
 * 
 * @Override
 * public void display() {
 * System.out.println("This is a overridden method");
 * }
 * 
 * 
 * }
 */

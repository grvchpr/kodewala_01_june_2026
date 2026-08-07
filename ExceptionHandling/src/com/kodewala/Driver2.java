package com.kodewala;

public class Driver2 {

	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException npe) {
			System.out.println("Exception occurred: " + npe.getMessage());
		}
		try {
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Exception occurred: " + aioobe.getMessage());
		}
		try {
			int a = 10 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("Exception occurred: " + ae.getMessage());
		}
	}
}

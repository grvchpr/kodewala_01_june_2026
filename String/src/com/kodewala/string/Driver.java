package com.kodewala.string;

public class Driver {
	public static void main(String[] args) {
		String str = "Hello, World!";
		String str2 = new String("Hello, World!");
		System.out.println(str == str2); // false
		System.out.println(str.equals(str2)); // true
	}
}

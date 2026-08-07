package com.kodewala;

public class NumberEx {

	public static void main(String[] args) {
		try {
			String age = "Twenty";
			int value = Integer.parseInt(age);
			System.out.println("Age is: " + value);
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid number for age.");
		}
	}

}

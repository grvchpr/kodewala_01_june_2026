package com.kodewala;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int totalAmount = 10000;
			System.out.println("Enter the number of persons to divide the amount: ");
			int person = scanner.nextInt();
			int perPersonAmount = totalAmount / person;
			System.out.println("Per person amount: " + perPersonAmount);
		} catch (ArithmeticException e) {
			System.out.println("Error: Devide by zero is not allowed");
		} finally {
			scanner.close();
		}
	}
}

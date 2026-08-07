package com.kodewala;

import java.util.Scanner;

import com.kodewala.exception.InvalidAgeException;
import com.kodewala.exception.InvalidEmailException;

public class CustomerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Customer ID: ");
			int customerId = sc.nextInt();
			System.out.println("Enter Customer Name: ");
			String customerName = sc.next();
			System.out.println("Enter Customer Age: ");
			int customerAge = sc.nextInt();
			System.out.println("Enter Customer Email: ");
			String customerEmail = sc.next();

			if (customerAge < 18) {
				throw new InvalidAgeException("Customer age must be 18 or above.");
			}

			if (!customerEmail.contains("@")) {
				throw new InvalidEmailException("Invalid email format.");
			}

			System.out.println("Customer Details:");
			System.out.println("ID: " + customerId);
			System.out.println("Name: " + customerName);
			System.out.println("Age: " + customerAge);
			System.out.println("Email: " + customerEmail);

		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}

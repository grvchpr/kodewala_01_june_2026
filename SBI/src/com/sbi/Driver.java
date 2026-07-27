package com.sbi;

import java.util.Scanner;

import com.sbi.payment.PaymentMgmt;
import com.sbi.payment.card.CardPayment;
import com.sbi.payment.upi.UPIPayment;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n========================================");
		System.out.println("   Welcome to SBI Payment Management");
		System.out.println("========================================\n");

		boolean continuePayment = true;

		while (continuePayment) {
			System.out.println("Choose Payment Method:");
			System.out.println("1. Card Payment");
			System.out.println("2. UPI Payment");
			System.out.println("3. Exit");
			System.out.print("Enter your choice (1-3): ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
			case 1:
				processCardPayment(scanner);
				break;
			case 2:
				processUPIPayment(scanner);
				break;
			case 3:
				continuePayment = false;
				break;
			default:
				System.out.println("Invalid choice! Please try again.\n");
			}
		}

		System.out.println("========================================");
		System.out.println("   Thank you for using SBI Services!");
		System.out.println("========================================\n");
		scanner.close();
	}

	private static void processCardPayment(Scanner scanner) {
		System.out.print("\nEnter Card Number: ");
		String cardNumber = scanner.nextLine();

		System.out.print("Enter Card Holder Name: ");
		String cardHolderName = scanner.nextLine();

		System.out.print("Enter Payment Amount (₹): ");
		double paymentAmount = scanner.nextDouble();

		PaymentMgmt cardPayment = new CardPayment(cardNumber, cardHolderName);
		cardPayment.processPayment(paymentAmount);

		System.out.print("Do you want to process a refund? (yes/no): ");
		scanner.nextLine(); // consume newline
		String refundChoice = scanner.nextLine();

		if (refundChoice.equalsIgnoreCase("yes")) {
			System.out.print("Enter Refund Amount (₹): ");
			double refundAmount = scanner.nextDouble();
			cardPayment.refundPayment(refundAmount);
		}
		System.out.println();
	}

	private static void processUPIPayment(Scanner scanner) {
		System.out.print("\nEnter UPI ID: ");
		String upiId = scanner.nextLine();

		System.out.print("Enter Phone Number: ");
		String phoneNumber = scanner.nextLine();

		System.out.print("Enter Payment Amount (₹): ");
		double paymentAmount = scanner.nextDouble();

		PaymentMgmt upiPayment = new UPIPayment(upiId, phoneNumber);
		upiPayment.processPayment(paymentAmount);

		System.out.print("Do you want to process a refund? (yes/no): ");
		scanner.nextLine(); // consume newline
		String refundChoice = scanner.nextLine();

		if (refundChoice.equalsIgnoreCase("yes")) {
			System.out.print("Enter Refund Amount (₹): ");
			double refundAmount = scanner.nextDouble();
			upiPayment.refundPayment(refundAmount);
		}
		System.out.println();
	}

}

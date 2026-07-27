package com.phonepe.driver;

import java.util.Scanner;

import com.phonepe.user.User;
import com.phonepe.wallet.Wallet;

public class Driver {
	private static Wallet wallet;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("\n╔════════════════════════════════════════╗");
		System.out.println("║     WELCOME TO PHONEPE APP             ║");
		System.out.println("╚════════════════════════════════════════╝\n");

		// Create a new user
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your phone number: ");
		String phone = scanner.nextLine();
		System.out.print("Enter your UPI ID (e.g., username@phonepe): ");
		String upi = scanner.nextLine();

		User user = new User(name, phone, upi);
		wallet = new Wallet(user);

		System.out.println("\n✓ Account created successfully!\n");

		// Show main menu
		showMainMenu();

		scanner.close();
	}

	private static void showMainMenu() {
		boolean running = true;
		while (running) {
			System.out.println("\n╔════════════════════════════════════════╗");
			System.out.println("║          MAIN MENU - PhonePe           ║");
			System.out.println("╠════════════════════════════════════════╣");
			System.out.println("║  1. View Balance                       ║");
			System.out.println("║  2. Add Money to Wallet                ║");
			System.out.println("║  3. Send Money                         ║");
			System.out.println("║  4. Receive Money                      ║");
			System.out.println("║  5. View Transaction History           ║");
			System.out.println("║  6. View Profile                       ║");
			System.out.println("║  7. Exit                               ║");
			System.out.println("╚════════════════════════════════════════╝");
			System.out.print("Enter your choice (1-7): ");

			String choice = scanner.nextLine();

			switch (choice) {
				case "1":
					viewBalance();
					break;
				case "2":
					addMoney();
					break;
				case "3":
					sendMoney();
					break;
				case "4":
					receiveMoney();
					break;
				case "5":
					viewTransactionHistory();
					break;
				case "6":
					viewProfile();
					break;
				case "7":
					System.out.println("\n╔════════════════════════════════════════╗");
					System.out.println("║  Thank you for using PhonePe! Goodbye! ║");
					System.out.println("╚════════════════════════════════════════╝\n");
					running = false;
					break;
				default:
					System.out.println("✗ Invalid choice. Please try again.");
			}
		}
	}

	private static void viewBalance() {
		wallet.displayBalance();
	}

	private static void addMoney() {
		System.out.print("\nEnter amount to add (₹): ");
		try {
			double amount = Double.parseDouble(scanner.nextLine());
			wallet.addMoneyToWallet(amount);
		} catch (NumberFormatException e) {
			System.out.println("✗ Invalid amount. Please enter a valid number.");
		}
	}

	private static void sendMoney() {
		System.out.print("\nEnter recipient's UPI ID: ");
		String recipientUPI = scanner.nextLine();
		System.out.print("Enter amount to send (₹): ");
		try {
			double amount = Double.parseDouble(scanner.nextLine());
			wallet.sendMoney(amount, recipientUPI);
		} catch (NumberFormatException e) {
			System.out.println("✗ Invalid amount. Please enter a valid number.");
		}
	}

	private static void receiveMoney() {
		System.out.print("\nEnter sender's UPI ID: ");
		String senderUPI = scanner.nextLine();
		System.out.print("Enter amount received (₹): ");
		try {
			double amount = Double.parseDouble(scanner.nextLine());
			wallet.receiveMoney(amount, senderUPI);
		} catch (NumberFormatException e) {
			System.out.println("✗ Invalid amount. Please enter a valid number.");
		}
	}

	private static void viewTransactionHistory() {
		wallet.displayTransactionHistory();
	}

	private static void viewProfile() {
		wallet.displayUserInfo();
	}
}

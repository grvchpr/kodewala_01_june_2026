package com.uber;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Available options for ride booking: ");
		System.out.println("1. Uber");
		System.out.println("2. Bike");
		System.out.println("3. UberPet");
		System.out.println("4. Auto");
		System.out.println("5. Scooty");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		BookRide bookRide = new BookRide();
		switch (choice) {
		case 1:
			bookRide.bookRide(new Uber());
			break;
		case 2:
			bookRide.bookRide(new BikeSaver());
			break;
		case 3:
			bookRide.bookRide(new UberPet());
			break;
		case 4:
			bookRide.bookRide(new Auto());
			break;
		case 5:
			bookRide.bookRide(new Scooty());
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
		scanner.close();
	}

}

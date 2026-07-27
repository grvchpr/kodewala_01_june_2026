package com.flipkart;

import java.util.Scanner;

import com.flipkart.premium.PremiumUser;
import com.flipkart.process.ProcessOrder;
import com.flipkart.reseller.Reseller;
import com.flipkart.retail.RetailUser;

public class Flipkart {

	public static void main(String[] args) {
		ProcessOrder processOrder = new ProcessOrder();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Flipkart");
		System.out.println("1. Retail User");
		System.out.println("2. Premium User");
		System.out.println("3. reseller");
		System.out.println("Enter the type of user : ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			processOrder.processOrder(new RetailUser());
			break;
		case 2:
			processOrder.processOrder(new PremiumUser());
			break;
		case 3:
			processOrder.processOrder(new Reseller());
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		scanner.close();
	}

}
package com.kodewala;

import java.util.Scanner;

public class DiscountCoupon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total amount: ");
		double totalamount = scanner.nextDouble();
		if (totalamount <= 1000) {
			System.out.println("Total amount must be at least 100 to apply a coupon");
			// close the scanner before returning to avoid leaving the resource open
			scanner.close();
			return;
		} else {
			System.out.println("Enter coupon code: ");
			String couponCode = scanner.next();
			applyCoupon(couponCode, totalamount);
		}
		scanner.close();

	}

	private static void discount(String couponCode, double totalamount) {
		switch (couponCode) {
		case "SAVE10":
			totalamount = totalamount - (totalamount * 0.10);
			System.out.println("Discounted amount: " + totalamount);
			break;
		case "SAVE20":
			totalamount = totalamount - (totalamount * 0.20);
			System.out.println("Discounted amount: " + totalamount);
			break;
		case "SAVE30":
			totalamount = totalamount - (totalamount * 0.30);
			System.out.println("Discounted amount: " + totalamount);
			break;
		default:
			System.out.println("Invalid coupon code");
		}
	}

	private static void applyCoupon(String couponCode, double totalamount) {
		discount(couponCode, totalamount);
	}

}

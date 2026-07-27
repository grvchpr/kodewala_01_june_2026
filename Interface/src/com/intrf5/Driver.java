package com.intrf5;

public class Driver {

	public static void main(String[] args) {
		IDiscount iDiscount = (amount, discount) -> {
			int finalDiscount = amount * discount / 100;
			return finalDiscount;
		};
		int result = iDiscount.calculateDiscount(1000, 10);
		System.out.println("Discount Rs. = " + result);
	}

}

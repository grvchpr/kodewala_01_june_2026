package com.kodewala.arrays;

public class EmptyStringCheck {

	public static void main(String[] args) {

		String productNames[] = { "", "Laptop", "Mobile", "", "Tablet", "Smartwatch", "" };
		checkEMptyString(productNames);
	}

	private static void checkEMptyString(String[] productNames) {
		for (String productName : productNames) {
			if (productName.isEmpty()) {
				continue;
			}
			System.out.println(productName.toUpperCase());
		}
	}

}

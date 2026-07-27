package com.flipkart.product;

public class Electronics extends Product {
	public String brand;
	public int warrantyYears;

	@Override
	public void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Brand: ");
		brand = sc.next();
		System.out.println("Enter Warranty Years: ");
		warrantyYears = sc.nextInt();
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Brand: " + brand);
		System.out.println("Warranty Years: " + warrantyYears);
		System.out.println("Final Price  : ₹" + calculateDiscount());
	}

	@Override
	public double calculateDiscount() {
		if (price > 50000) {
			return price - (price * 10 / 100);
		}
		return price;
	}
}

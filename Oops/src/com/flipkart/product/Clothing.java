package com.flipkart.product;

public class Clothing extends Product {
	public String size;
	public String color;

	@Override
	public void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Size: ");
		size = sc.next();
		System.out.println("Enter Color: ");
		color = sc.next();
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Final Price  : ₹" + calculateDiscount());
	}

	@Override
	public double calculateDiscount() {
		if (price > 2000) {
			return price - (price * 20 / 100);
		}
		return price;
	}
}

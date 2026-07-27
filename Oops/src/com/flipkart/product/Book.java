package com.flipkart.product;

public class Book extends Product {
	public String author;
	public String genre;

	@Override
	public void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Author: ");
		author = sc.next();
		System.out.println("Enter Genre: ");
		genre = sc.next();
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Author: " + author);
		System.out.println("Genre: " + genre);
		System.out.println("Final Price  : ₹" + calculateDiscount());
	}

	@Override
	public double calculateDiscount() {
		return price - (price * 5 / 100);
	}
}

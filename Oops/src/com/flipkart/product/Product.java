package com.flipkart.product;

import java.util.Scanner;

public class Product {
	public int productId;
	public String productName;
	public double price;
	Scanner sc = new Scanner(System.in);

	public void acceptDetails() {
		System.out.println("Enter Product Id: ");
		productId = sc.nextInt();
		System.out.println("Enter Product Name: ");
		productName = sc.next();
		System.out.println("Enter Product Price: ");
		price = sc.nextDouble();
	}

	public void displayDetails() {
		System.out.println("Product Id: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
	}

	public double calculateDiscount() {
		return price;
	}
}

package com.flipkart;

import java.util.Scanner;

import com.flipkart.product.Book;
import com.flipkart.product.Clothing;
import com.flipkart.product.Electronics;

public class Flipkart {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Electronics");
		System.out.println("2. Clothing");
		System.out.println("3. Book");
		System.out.print("Enter your choice: ");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			Electronics e = new Electronics();
			e.acceptDetails();
			e.displayDetails();
			break;

		case 2:
			Clothing c = new Clothing();
			c.acceptDetails();
			c.displayDetails();
			break;

		case 3:
			Book b = new Book();
			b.acceptDetails();
			b.displayDetails();
			break;

		default:
			System.out.println("Invalid choice");
		}
		sc.close();
	}
}
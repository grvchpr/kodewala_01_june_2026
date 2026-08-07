package com.flipkart;

import com.flipkart.exception.InvalidQuantityException;
import com.flipkart.service.OrderService;

public class Flipkart {

	public static void main(String[] args) {

		OrderService service = new OrderService();

		try {

			service.placeOrder("Laptop", 5);

		} catch (InvalidQuantityException e) {

			System.out.println("Order Failed: " + e.getMessage());
		}
	}
}
package com.flipkart.service;

import com.flipkart.exception.InvalidQuantityException;

public class OrderService {

	public void placeOrder(String item, int qty) throws InvalidQuantityException {

		if (qty <= 0) {
			throw new InvalidQuantityException("Quantity must be greater than zero");
		}

		System.out.println("Item: " + item);
		System.out.println("Quantity: " + qty);
		System.out.println("Order placed successfully");
	}
}
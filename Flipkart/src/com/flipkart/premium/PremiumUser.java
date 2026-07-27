package com.flipkart.premium;

import com.flipkart.ordermanagement.OrderManagement;

public class PremiumUser extends OrderManagement {

	@Override
	public void placeOrder() {
		System.out.println("order place for premium user");
	}

	@Override
	public void editOrder() {
		System.out.println("Editing order for premium user");
	}

	@Override
	public void confirmOrder() {
		System.out.println("Confirming order for premium user");
	}

	@Override
	public void getOrderDetails() {
		System.out.println("Getting order details for Premium user");
	}

}

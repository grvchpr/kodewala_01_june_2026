package com.flipkart.retail;

import com.flipkart.ordermanagement.OrderManagement;

public class RetailUser extends OrderManagement {

	@Override
	public void placeOrder() {
		System.out.println("order place for retail user");
	}

	@Override
	public void editOrder() {
		System.out.println("Edit order by retail user");
	}

	@Override
	public void confirmOrder() {
		System.out.println("Confirming order for retail user");
	}

	@Override
	public void getOrderDetails() {
		System.out.println("Getting order details for retail user");
	}

}

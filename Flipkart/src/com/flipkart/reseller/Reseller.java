package com.flipkart.reseller;

import com.flipkart.ordermanagement.OrderManagement;

public class Reseller extends OrderManagement {

	@Override
	public void placeOrder() {
		System.out.println("order place for reseller");
	}

	@Override
	public void editOrder() {
		System.out.println("Editing order for reseller");
	}

	@Override
	public void confirmOrder() {
		System.out.println("Confirming order for reseller");
	}

	@Override
	public void getOrderDetails() {
		System.out.println("Getting order details for reseller");
	}

}

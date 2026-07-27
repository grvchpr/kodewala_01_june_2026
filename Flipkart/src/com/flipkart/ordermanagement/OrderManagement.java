package com.flipkart.ordermanagement;

public abstract class OrderManagement {

	public abstract void placeOrder();

	public abstract void editOrder();

	public abstract void confirmOrder();

	public void getOrderDetails() {
		System.out.println("Getting order details");
	}
}

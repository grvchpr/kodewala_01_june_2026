package com.flipkart.process;

import com.flipkart.ordermanagement.OrderManagement;

public class ProcessOrder {
	public void processOrder(OrderManagement orderManagement) {
		orderManagement.placeOrder();
		orderManagement.editOrder();
		orderManagement.confirmOrder();
		orderManagement.getOrderDetails();
	}
}

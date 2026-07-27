package com.abstraction;

public abstract class PaymentSystem {
	public abstract void processPayment(double amount);

	public void displayPaymentDetails() {
		System.out.println("Payment details displayed.");
	}
}

class Payment extends PaymentSystem {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment of amount: " + amount);
	}
}

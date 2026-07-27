package com.abstraction;

public class Driver {
	public static void main(String[] args) {
		PaymentSystem payment = new Payment();
		payment.processPayment(100.0);
		payment.displayPaymentDetails();
	}
}

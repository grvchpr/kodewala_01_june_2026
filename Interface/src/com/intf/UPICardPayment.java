package com.intf;

public class UPICardPayment implements IPaymentProcessor {

	@Override
	public void processPayment() {
		System.out.println("UPICardPayment.processPayment()");
		IPaymentProcessor.paymentMethod();
	}

	@Override
	public void validatePayment() {
		System.out.println("UPICardPayment.validatePayment()");
	}

	@Override
	public void transactionDetails() {
		System.out.println("UPI card payment transaction details: UPI ID: gourav@ybl, Amount: 1750.00");
	}

}

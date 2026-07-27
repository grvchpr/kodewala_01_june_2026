package com.intf;

public class CreditCardPayment implements IPaymentProcessor {

	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment...");
		IPaymentProcessor.paymentMethod();
	}

	@Override
	public void validatePayment() {
		System.out.println("CreditCardPayment.validatePayment()");
	}

	@Override
	public void transactionDetails() {
		System.out.println(
				"Credit card payment transaction details: Card Number: XXXX-XXXX-XXXX-1234, Expiry Date: 23/07, Amount: 1000.00");
	}

}

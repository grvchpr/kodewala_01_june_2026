package com.intf;

public class DebitCardPayment implements IPaymentProcessor {

	@Override
	public void processPayment() {
		System.out.println("DebitCardPayment.processPayment()");
		IPaymentProcessor.paymentMethod();
	}

	@Override
	public void validatePayment() {
		System.out.println("DebitCardPayment.validatePayment()");
	}

	@Override
	public void transactionDetails() {
		System.out.println(
				"Debit card payment transaction details: Card Number: XXXX-XXXX-XXXX-5678, Expiry Date: 23/07, Amount: 500.00");
	}

}

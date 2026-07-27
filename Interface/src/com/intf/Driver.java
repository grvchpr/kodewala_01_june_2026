package com.intf;

public class Driver {

	public static void main(String[] args) {

		IPaymentProcessor debitCardPayment = new DebitCardPayment();
		debitCardPayment.processPayment();
		debitCardPayment.validatePayment();
		debitCardPayment.transactionDetails();

		System.out.println();

		IPaymentProcessor upiCardPayment = new UPICardPayment();
		upiCardPayment.processPayment();
		upiCardPayment.validatePayment();
		upiCardPayment.transactionDetails();

		System.out.println();

		IPaymentProcessor creditCardPayment = new CreditCardPayment();
		creditCardPayment.processPayment();
		creditCardPayment.validatePayment();
		creditCardPayment.transactionDetails();
	}

}

package com.intf;

public interface IPaymentProcessor {
	void processPayment();

	void validatePayment();

	public default void transactionDetails() {
		System.out.println("There in no trasanction details available for this payment method.");
	}

	public static void paymentMethod() {
		connectToDB();
		System.out.println("Payment method is available.");
	}

	private static void connectToDB() {
		System.out.println("Connecting to database...");
	}

}

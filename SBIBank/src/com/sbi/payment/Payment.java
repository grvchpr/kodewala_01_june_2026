package com.sbi.payment;

public interface Payment {

	public void processPayment(double amount);

	public void refundPayment(double amount);

	public default void generateReceipt(double amount) {
		System.out.println("There is no receipt generated for this payment method");
	}

	public default void chechBalance(double amount) {
		System.out.println("There is no balance check for this payment method");
	}

	public default void transactionHistory() {
		System.out.println("There is no transaction history for this payment method");
	}
}

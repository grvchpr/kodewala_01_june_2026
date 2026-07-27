package com.sbi.payment;

public abstract class PaymentMgmt {

	public abstract void processPayment(double amount);

	public abstract void refundPayment(double amount);

}

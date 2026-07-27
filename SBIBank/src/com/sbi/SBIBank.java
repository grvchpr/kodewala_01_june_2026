package com.sbi;

import java.util.Scanner;

import com.sbi.payment.card.CreditCardPayment;
import com.sbi.payment.card.DebitCardPayment;
import com.sbi.payment.cash.CashPayment;
import com.sbi.payment.upi.UPIPayment;

public class SBIBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to SBI Bank");
		System.out.println("Please select your payment method");
		System.out.println("1. Cash Payment");
		System.out.println("2. Credit Card Payment");
		System.out.println("2. Debit Card Payment");
		System.out.println("3. UPI Payment");

		System.out.println("Please enter your choice: ");
		int choice = sc.nextInt();
		double amount = 1000;
		switch (choice) {
		case 1:
			CashPayment cashPayment = new CashPayment();
			cashPayment.processPayment(amount);
			cashPayment.refundPayment(amount);
			cashPayment.generateReceipt(amount);
			cashPayment.chechBalance(amount);
			cashPayment.transactionHistory();
			break;
		case 2:
			CreditCardPayment creditCardPayment = new CreditCardPayment();
			creditCardPayment.processPayment(amount);
			creditCardPayment.refundPayment(amount);
			creditCardPayment.generateReceipt(amount);
			creditCardPayment.chechBalance(amount);
			creditCardPayment.transactionHistory();
		case 3:
			DebitCardPayment debitCardPayment = new DebitCardPayment();
			debitCardPayment.processPayment(amount);
			debitCardPayment.refundPayment(amount);
			debitCardPayment.generateReceipt(amount);
			debitCardPayment.chechBalance(amount);
			debitCardPayment.transactionHistory();
			break;
		case 4:
			UPIPayment upiPayment = new UPIPayment();
			upiPayment.processPayment(amount);
			upiPayment.refundPayment(amount);
			upiPayment.generateReceipt(amount);
			upiPayment.chechBalance(amount);
			upiPayment.transactionHistory();
			break;
		default:
			System.out.println("Invalid choice");
		}
		sc.close();
	}
}

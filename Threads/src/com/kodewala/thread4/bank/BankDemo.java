package com.kodewala.thread4.bank;

public class BankDemo {

	public static void main(String[] args) throws InterruptedException {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		Thread phonePe = new TansferThread1(account1, account2);
		Thread googlePay = new TansferThread2(account1, account2);

		phonePe.setName("PhonePe");
		googlePay.setName("GooglePay");

		phonePe.start();
		googlePay.start();

		phonePe.join();
		googlePay.join();

		System.out.println("Account 1: " + account1.getBalance());
		System.out.println("Account 2: " + account2.getBalance());
	}

}

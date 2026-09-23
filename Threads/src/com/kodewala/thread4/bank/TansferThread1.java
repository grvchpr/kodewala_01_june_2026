package com.kodewala.thread4.bank;

public class TansferThread1 extends Thread {
	private BankAccount sender;
	private BankAccount receiver;

	public TansferThread1(BankAccount sender, BankAccount receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}

	public void run() {
		sender.transfer(receiver, 800);
	}

}

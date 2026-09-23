package com.kodewala.thread4.bank;

public class BankAccount {
	private int balance = 1000;

	public void transfer(BankAccount receiver, int amount) {
		System.out.println(
				"[" + Thread.currentThread().getName() + "] Sending Email Nitification ...... Fund Transfer Started");
		synchronized (this) {
			if (balance >= amount) {
				System.out.println("[" + Thread.currentThread().getName() + "] Checked Balance: " + balance);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - amount;
				receiver.balance = receiver.balance + amount;
				System.out.println("[" + Thread.currentThread().getName() + "] Transferred Amount: " + amount);
			} else {
				System.out.println("[" + Thread.currentThread().getName() + "] Insufficient Balance");
			}
		}

		System.out.println("[" + Thread.currentThread().getName() + "] Fund Transfer Completed");

	}

	public int getBalance() {
		return balance;
	}

}

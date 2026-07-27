package com.icici.account;

public class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > 0) {
			this.balance = balance;
		}
	}
}

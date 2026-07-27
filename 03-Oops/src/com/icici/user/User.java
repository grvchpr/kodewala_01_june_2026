package com.icici.user;

import com.icici.account.Account;

public class User {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("Before modification Balance: " + account.getBalance());
		// account.balance = -1000;
		account.setBalance(10000);
		System.out.println("After modification Balance: " + account.getBalance());
	}
}

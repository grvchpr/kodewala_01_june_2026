package com.kodewala.account;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	private int accountNumber;
	private String accountHolderName;
	private transient double balance;
	private String accountType;
	private String branchName;

	public Account(int accountNumber, String accountHolderName, double balance, String accountType, String branchName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.branchName = branchName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getBranchName() {
		return branchName;
	}

}

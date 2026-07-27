package com.phonepe.user;

public class User {
	private String name;
	private String phoneNumber;
	private String upiId;
	private double balance;

	public User() {
		this.balance = 0;
	}

	public User(String name, String phoneNumber, String upiId) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.upiId = upiId;
		this.balance = 0;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public void addMoney(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("✓ Added ₹" + amount + " to your wallet");
		} else {
			System.out.println("✗ Invalid amount");
		}
	}

	public boolean sendMoney(double amount, String recipientUPI) {
		if (amount <= 0) {
			System.out.println("✗ Invalid amount");
			return false;
		}
		if (amount > balance) {
			System.out.println("✗ Insufficient balance. Your balance: ₹" + balance);
			return false;
		}
		balance -= amount;
		System.out.println("✓ Transferred ₹" + amount + " to " + recipientUPI);
		System.out.println("  Remaining balance: ₹" + balance);
		return true;
	}

	public boolean receiveMoney(double amount, String senderUPI) {
		if (amount > 0) {
			balance += amount;
			System.out.println("✓ Received ₹" + amount + " from " + senderUPI);
			System.out.println("  Current balance: ₹" + balance);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", upiId='" + upiId + '\'' +
				", balance=" + balance +
				'}';
	}
}

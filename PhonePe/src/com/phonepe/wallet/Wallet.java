package com.phonepe.wallet;

import java.util.ArrayList;
import java.util.List;

import com.phonepe.transaction.Transaction;
import com.phonepe.user.User;

public class Wallet {
	private User user;
	private List<Transaction> transactionHistory;

	public Wallet(User user) {
		this.user = user;
		this.transactionHistory = new ArrayList<>();
	}

	public void displayBalance() {
		System.out.println("\n╔═══════════════════════════════════╗");
		System.out.println("║   YOUR WALLET BALANCE              ║");
		System.out.println("╠═══════════════════════════════════╣");
		System.out.println("║  Name: " + user.getName());
		System.out.println("║  UPI ID: " + user.getUpiId());
		System.out.println("║  Balance: ₹" + String.format("%.2f", user.getBalance()));
		System.out.println("╚═══════════════════════════════════╝\n");
	}

	public void addMoneyToWallet(double amount) {
		user.addMoney(amount);
		transactionHistory.add(new Transaction("ADDED", amount, "Wallet Top-up", "SUCCESS"));
	}

	public boolean sendMoney(double amount, String recipientUPI) {
		boolean success = user.sendMoney(amount, recipientUPI);
		if (success) {
			transactionHistory.add(new Transaction("SENT", amount, recipientUPI, "SUCCESS"));
		}
		return success;
	}

	public void receiveMoney(double amount, String senderUPI) {
		user.receiveMoney(amount, senderUPI);
		transactionHistory.add(new Transaction("RECEIVED", amount, senderUPI, "SUCCESS"));
	}

	public void displayTransactionHistory() {
		if (transactionHistory.isEmpty()) {
			System.out.println("\n✓ No transactions yet!\n");
			return;
		}
		System.out.println("\n╔════════════════════════════════════════════╗");
		System.out.println("║       TRANSACTION HISTORY                  ║");
		System.out.println("╚════════════════════════════════════════════╝\n");
		for (Transaction t : transactionHistory) {
			System.out.println(t.toString());
		}
		System.out.println();
	}

	public void displayDetailedTransaction(int index) {
		if (index >= 0 && index < transactionHistory.size()) {
			System.out.println(transactionHistory.get(index).getDetailedInfo());
		} else {
			System.out.println("✗ Invalid transaction index");
		}
	}

	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

	public void displayUserInfo() {
		System.out.println("\n╔═══════════════════════════════════╗");
		System.out.println("║       YOUR PROFILE                 ║");
		System.out.println("╠═══════════════════════════════════╣");
		System.out.println("║  Name: " + user.getName());
		System.out.println("║  Phone: " + user.getPhoneNumber());
		System.out.println("║  UPI ID: " + user.getUpiId());
		System.out.println("║  Balance: ₹" + String.format("%.2f", user.getBalance()));
		System.out.println("╚═══════════════════════════════════╝\n");
	}
}

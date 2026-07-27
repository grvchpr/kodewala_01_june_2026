package com.phonepe.transaction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	private String transactionId;
	private String type; // "SENT", "RECEIVED", "ADDED"
	private double amount;
	private String otherPartyUPI;
	private LocalDateTime timestamp;
	private String status; // "SUCCESS", "PENDING", "FAILED"

	private static int transactionCounter = 1000;
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	public Transaction(String type, double amount, String otherPartyUPI, String status) {
		this.transactionId = "TXN" + (++transactionCounter);
		this.type = type;
		this.amount = amount;
		this.otherPartyUPI = otherPartyUPI;
		this.timestamp = LocalDateTime.now();
		this.status = status;
	}

	// Getters
	public String getTransactionId() {
		return transactionId;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public String getOtherPartyUPI() {
		return otherPartyUPI;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		String symbol = type.equals("SENT") ? "→" : "←";
		String prefix = type.equals("SENT") ? "-" : "+";
		return String.format("%s [%s] %s ₹%.2f to/from %s on %s (Status: %s)",
				transactionId, type, symbol, amount, otherPartyUPI,
				timestamp.format(formatter), status);
	}

	public String getDetailedInfo() {
		return "─────────────────────────────────\n" +
				"Transaction ID: " + transactionId + "\n" +
				"Type: " + type + "\n" +
				"Amount: ₹" + amount + "\n" +
				"Other Party UPI: " + otherPartyUPI + "\n" +
				"Date & Time: " + timestamp.format(formatter) + "\n" +
				"Status: " + status + "\n" +
				"─────────────────────────────────";
	}
}

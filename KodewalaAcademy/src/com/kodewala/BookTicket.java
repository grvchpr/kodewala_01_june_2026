package com.kodewala;

public class BookTicket {
	// Main method
	public static void main(String[] args) {

		String userType = args[0];
		int tickets = Integer.parseInt(args[1]);

		bookTicket(userType, tickets);
	}

	// Retail user method
	public static void bookRetailTicket(int tickets) {
		if (tickets <= 6) {
			System.out.println("Retail user booked " + tickets + " tickets successfully.");
		} else {
			System.out.println("Retail user can book maximum 6 tickets in a day.");
		}
	}

	// Agent user method
	public static void bookAgentTicket(int tickets) {
		System.out.println("Agent booked " + tickets + " tickets successfully.");
	}

	// Common method using switch case
	public static void bookTicket(String userType, int tickets) {

		switch (userType.toLowerCase()) {

		case "retail":
			bookRetailTicket(tickets);
			break;

		case "agent":
			bookAgentTicket(tickets);
			break;

		default:
			System.out.println("Warning: User type not supported.");
			break;
		}
	}

}
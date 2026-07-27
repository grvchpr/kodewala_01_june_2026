package com.sbi.user1;

public class Driver {

	public static void main(String[] args) {
		// calling parameterized constructor to create an object of Account class and
		// printing the name and balance using getter methods
		Account acc = new Account("Gourav", 1000);
		System.out.println("Account Name: " + acc.getName());
		System.out.println("Account Balance: " + acc.getBalance());

		// updating name and balance using setter methods
		acc.setName("Gourav Chopra");
		acc.setBalance(1500);

		System.out.println("\nUpdated Account Name: " + acc.getName());
		System.out.println("Updated Account Balance: " + acc.getBalance());

	}

}

package com.sbi.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SBIUser {
	private String name;
	private String userId;
	private String password;
	private int balance;

	public static void main(String[] args) {
		System.out.println("Main method Started");
		// SBIUser sbiUser = new SBIUser();

		SBIUser sbiUser = new SBIUser("Gourav", "gourav123", "gourav@12345", 10000);
		System.out.println("User Name: " + sbiUser.name);
		System.out.println("User ID: " + sbiUser.userId);
		System.out.println("User Password: " + sbiUser.password);
		System.out.println("User Balance: " + sbiUser.balance);

		System.out.println();

		System.out.println("updating user details");
		sbiUser.setName("Gourav Chopra");
		sbiUser.setUserId("this.gourav");
		sbiUser.setPassword("this.gourav@123");
		sbiUser.setBalance(20000);
		System.out.println("User Name: " + sbiUser.getName());
		System.out.println("User ID: " + sbiUser.getUserId());
		System.out.println("User Password: " + sbiUser.getPassword());
		System.out.println("User Balance: " + sbiUser.getBalance());
		System.out.println("Main method Ended");
	}

}

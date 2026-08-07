package com.kodewala.user;

public class User {

	public void createUser(String userName) {
		String userId = null;
		try {
			userId = userName.substring(0, 5) + "@5968";
			System.out.println("User created with ID: " + userId);
		} catch (NullPointerException e) {
			System.out.println("User name cannot be null");
		}
	}
}
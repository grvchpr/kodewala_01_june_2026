package com.inhr3;

public class UserRegistration {
	public void registerUser(String username, String userCountry) {
		System.out.println("User registered successfully with username: " + username + " from country: " + userCountry);
	}

	public void registerUser(String username, String userCountry, int age) {
		System.out.println("User registered successfully with username: " + username + " from country: " + userCountry
				+ " and age: " + age);
	}

	public int registerUser(String username, String userCountry, int age, String email) {
		System.out.println("User registered successfully with username: " + username + " from country: " + userCountry
				+ ", age: " + age + " and email: " + email);
		return 1;
	}

	public static String registerUser(String username, String userCountry, int age, String email, String phoneNumber) {
		System.out.println("User registered successfully with username: " + username + " from country: " + userCountry
				+ ", age: " + age + ", email: " + email + " and phone number: " + phoneNumber);
		return "Success";
	}
}

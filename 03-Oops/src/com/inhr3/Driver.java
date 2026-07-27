package com.inhr3;

public class Driver {
	public static void main(String[] args) {
		UserRegistration userReg = new UserRegistration();
		userReg.registerUser("Gourav", "India");
		userReg.registerUser("Gourav", "India", 29);
		int result = userReg.registerUser("Gourav", "IN", 29, "gourav@gmail.com");
		String result2 = UserRegistration.registerUser("Gourav", "IN", 29, "gourav@gmail.com", "84352-86065");

	}
}

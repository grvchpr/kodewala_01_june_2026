package com.amazon;

public class User {
	private String userName;
	private String uID;
	private String mobile;
	private String email;

	User(String _userId) {
		this("Guest User", _userId, "0000000000", "abc@gmail.com");
		System.out.println("User 1");
	}

	User(String userName, String uID, String mobile, String email) {
		System.out.println("User 2");
		this.userName = userName;
		this.uID = uID;
		this.mobile = mobile;
		this.email = email;
	}

}

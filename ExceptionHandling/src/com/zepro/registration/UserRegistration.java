package com.zepro.registration;

import com.zepro.exception.UserAlreadyExistsException;

public class UserRegistration {
	public static boolean userRegistration(String userId) throws UserAlreadyExistsException {
		boolean status = false;

		boolean isUserExists = true;
		if (!isUserExists) {
			System.out.println("User registered successfully with userId: " + userId);
			status = true;
		} else {
			System.out.println("User registration failed. User already exists with userId: " + userId);
			status = false;
			throw new UserAlreadyExistsException("User already exists with userId: " + userId);
		}
		return status;
	}
}

package com.kodewala.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kodewala.account.Account;

public class Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Account account = new Account(12345, "Gourav", 1000.0, "Savings", "BTM Layout");
		System.out.println("Serialization started");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"));
		oos.writeObject(account);
		System.out.println("Serialization completed");
	}

}

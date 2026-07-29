package com.kodewala.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.kodewala.account.Account;

public class Deserialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Deserialization started");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.ser"));
		Account account = (Account) ois.readObject();
		System.out.println("Deserialization completed");
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Holder Name: " + account.getAccountHolderName());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Account Type: " + account.getAccountType());
		System.out.println("Branch Name: " + account.getBranchName());
		ois.close();
	}
}

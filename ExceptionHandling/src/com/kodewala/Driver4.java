package com.kodewala;

public class Driver4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.kodewala.Order");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

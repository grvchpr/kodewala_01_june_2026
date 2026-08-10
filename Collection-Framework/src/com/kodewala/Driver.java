package com.kodewala;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Gourav");
		names.add("Rahul");
		names.add("Nirmal");
		names.add("Rohit");
		for (String name : names) {
			System.out.println(name);
		}

	}
}

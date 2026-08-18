package com.kodewala.list;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(100);
		names.add("Gourav");
		names.add("Rahul");
		names.add("Nirmal");
		names.add("Rohit");
		names.add("Saurabh");
		names.add(0, "Ruchi");
		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}

		for (String namee : names) {
			System.out.println(namee);
		}

	}
}

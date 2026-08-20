package com.kodewala.set5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();
		cities.add("BLR");
		cities.add("MUM");
		cities.add("DEL");
		cities.add("BLR"); // Duplicate entry, will not be added
		cities.add("CHE");

		System.out.println("Cities in the set: " + cities);
	}
}

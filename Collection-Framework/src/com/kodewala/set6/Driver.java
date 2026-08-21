
package com.kodewala.set6;

import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		Set<String> cities = new TreeSet<String>();
		cities.add("BLR");
		cities.add("MUM");
		cities.add("DEL");
		cities.add("BLR"); // Duplicate entry, will not be added
		cities.add("CHE");
		cities.add("HYD");
		cities.add("AHM");
		cities.add("BLO");

		System.out.println("Cities in the set: " + cities);
	}

}
package com.kodewala;

import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("BLR", "CHE", "MYS", "HYD", "MUM", "DEL", "AHM");
		cities.stream()
		.sorted()
		.skip(1)
		.limit(2)
		.forEach(System.out::println);
		
	}

}

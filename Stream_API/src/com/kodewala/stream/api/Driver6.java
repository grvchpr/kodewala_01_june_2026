package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;

public class Driver6 {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("BLR", "MUM", "DEL", "HYD", "CHN", "CH", "BLR", "MUM", "DEL", "HYD", "CHN",
				"CH");

		cities.stream()
		.sorted()
		.distinct()
		.skip(3)
		.forEach(city -> System.out.println(city));
	}

}

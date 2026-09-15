package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;

public class Driver4 {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("BLR", "MUM", "DEL", "HYD", "CHN", "CH", "BLR", "MUM", "DEL", "HYD", "CHN",
				"CH");
		
		cities.stream()
		.distinct()
		.forEach(city -> System.out.println(city));
	}

}

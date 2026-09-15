package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Noida", "Surat", "Jaipur", "Bangalore", "Chennai", "Mysore", "Ahmedabad",
				"Pune", "Gurugram");

		Long count = cities.stream().collect(Collectors.counting());

		System.out.println(count);

		Map<Object, List<String>> lenth = cities.stream().collect(Collectors.groupingBy(c -> c.length()));

		System.out.println(lenth);
	}

}

package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("BLR", "MUM", "DEL", "HYD", "CHN", "CH");
		
		List<String> output = cities.stream()
				.filter(city -> city.startsWith("C"))
				.map(city -> city.toLowerCase())
				.filter(city -> city.length() > 2)
				.collect(Collectors.toList());
		System.out.println(output);
	}
}

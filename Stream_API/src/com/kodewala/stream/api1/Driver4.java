package com.kodewala.stream.api1;

import java.util.Map;
import java.util.stream.Collectors;

public class Driver4 {

	public static void main(String[] args) {
		String input = "swiss";

		Map<Character, Long> output = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(output);
	}

}

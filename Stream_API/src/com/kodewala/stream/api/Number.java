package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 50, 60, 70, 10, 100, 200, 300, 400, 500);
		List<Integer> output = numbers.stream().filter(num -> num > 50).collect(Collectors.toList());
		System.out.println(output);
	}

}

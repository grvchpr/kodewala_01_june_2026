package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(2, 3, 4, 5, 6, 45, 65, 345, 35, 536, 656, 346745, 53462, 646, 536, 75, 5345,
				23523, 6345632);

		Map<Boolean, List<Integer>> output = input.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

		System.out.println(output);
	}

}

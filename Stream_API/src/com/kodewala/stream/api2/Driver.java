package com.kodewala.stream.api2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("BLR","CHE","HYD","MUM","DEL","PUN","MYS","AHM","JAI","RAI");
		
		List<String> output = list.stream()
				.filter(w -> w.startsWith("B")).collect(Collectors.toList());
		
		System.out.println(output);
		
		List<String> output1 = list.parallelStream()
				.filter(w -> w.startsWith("B")).collect(Collectors.toList());
		
		System.out.println(output1);
	}

}

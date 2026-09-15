package com.kodewala.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Driver2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);

		List<Integer> readOnly = Collections.unmodifiableList(list);

		//readOnly.add(30);

		System.out.println(readOnly);
		
		Stream.of(1,2,3,4,5).filter(n->{
			System.out.println(n+"");
			return n>2;
		}).findFirst().ifPresent(n-> System.out.println(n));

	}

}

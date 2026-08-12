package com.kodewala.arraylist1;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(3);
		System.out.println("Original list: " + list);
		ArrayList<Integer> newList = new ArrayList<>();
		for (Integer element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}
		System.out.println("List after removing duplicates: " + newList);
	}

}

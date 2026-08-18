package com.kodewala.list.linkedlist1;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(0, 100);

		System.out.println("Linked List: " + list);
	}

}

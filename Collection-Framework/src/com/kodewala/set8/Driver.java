package com.kodewala.set8;

import java.util.HashSet;
import java.util.Set;

class Key {
	int id;

	Key(int id) {
		this.id = id;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		return o instanceof Key k && k.id == id;
	}
}

public class Driver {

	public static void main(String[] args) {
		Set<Key> set = new HashSet<>();
		Key k = new Key(1);
		set.add(k);
		k.id = 2;

		System.out.println(set.contains(k));
		System.out.println(set.contains(new Key(2)));
		System.out.println(set.size());
	}

}

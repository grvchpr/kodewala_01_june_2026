package com.kodewala.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Karnataka", "Bangalore");
		map.put("Maharashtra", "Mumbai");
		map.put("Tamil Nadu", "Chennai");
		map.put("Kerala", "Thiruvananthapuram");
		map.put("Gujarat", "Gandhinagar");
		map.put("Rajasthan", "Jaipur");
		map.put("Karnataka", "BLR"); // This will overwrite the previous value for Karnataka
		System.out.println("HashMap: " + map);

		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());

		}

		/*
		 * Map<String, String> linkedHashMap = new LinkedHashMap<>();
		 * linkedHashMap.put("Karnataka", "Bangalore"); linkedHashMap.put("Maharashtra",
		 * "Mumbai"); linkedHashMap.put("Tamil Nadu", "Chennai");
		 * linkedHashMap.put("Kerala", "Thiruvananthapuram");
		 * linkedHashMap.put("Gujarat", "Gandhinagar"); linkedHashMap.put("Rajasthan",
		 * "Jaipur"); linkedHashMap.put("Karnataka", "BLR"); // This will overwrite the
		 * previous value for Karnataka System.out.println("LinkedHashMap: " +
		 * linkedHashMap);
		 * 
		 * Map<String, String> treeMap = new TreeMap<>(); treeMap.put("West Bengal",
		 * "Kotkata"); treeMap.put("Karnataka", "Bangalore"); treeMap.put("Maharashtra",
		 * "Mumbai"); treeMap.put("Tamil Nadu", "Chennai"); treeMap.put("Kerala",
		 * "Thiruvananthapuram"); treeMap.put("Gujarat", "Gandhinagar");
		 * treeMap.put("Rajasthan", "Jaipur"); treeMap.put("Karnataka", "BLR"); // This
		 * will overwrite the previous value for Karnataka
		 * System.out.println("TreeMap: " + treeMap);
		 */
	}

}

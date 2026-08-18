package com.kodewala.list.linkedlist;

import java.util.LinkedList;

public class CityService {
	public LinkedList<String> getCities() {
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("BLR");
		cities.add("MUM");
		cities.add("DEL");
		cities.add("HYD");
		cities.add("CHN");
		cities.add("KOL");

		return cities;
	}
}

package com.kodewala.arraylist1;

import java.util.ArrayList;

public class CityService {
	public ArrayList<String> getCities() {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Bangalore");
		cities.add("Mysore");
		cities.add("Mangalore");
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Chennai");
		cities.add("Kolkata");

		cities.add(2, "Pune");

		cities.remove("Delhi");
		return cities;
	}
}

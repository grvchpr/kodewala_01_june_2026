package com.kodewala.arraylist1;

public class Driver {

	public static void main(String[] args) {
		CityService cityService = new CityService();
		cityService.getCities().forEach(System.out::println);
		for (String city : cityService.getCities()) {
			if (city.startsWith("M")) {
				System.out.println("\n" + city);
			}
		}
	}

}
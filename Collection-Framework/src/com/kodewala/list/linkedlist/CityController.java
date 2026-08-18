package com.kodewala.list.linkedlist;

public class CityController {

	public static void main(String[] args) {
		CityService cityService = new CityService();
		System.out.println("Cities: " + cityService.getCities());
		for (String city : cityService.getCities()) {
			if (city.equalsIgnoreCase("DeL")) {
				System.out.println("DEL is present in the list");
			}
			System.out.println(city);
		}
	}

}

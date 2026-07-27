package com.kodewala.string4;

public class Driver {

	public static void main(String[] args) {
		/*
		 * String city = "Bangalore";
		 * city.concat(" India");
		 * System.out.println(city);
		 * 
		 * StringBuilder city1 = new StringBuilder("Bangalore");
		 * city1.append(" India");
		 * System.out.println(city1);
		 * city1.append(" is the capital of Karnataka");
		 * System.out.println(city1);
		 * 
		 * city1.delete(0, 13);
		 * System.out.println();
		 * System.out.println(city1);
		 * 
		 * city1.insert(0, "Bangalore");
		 * System.out.println();
		 * System.out.println(city1);
		 */

		/*
		 * String city = "Bangalore";
		 * city = city.concat(" India");
		 * 
		 * for (int i = 0; i < city.length(); i++) {
		 * System.out.println(city + " " + i);
		 */
		// System.out.println(city.charAt(i));
		// }

		StringBuffer city2 = new StringBuffer("Bangalore");
		// System.out.println(city2);
		// city2.append(" India");

		char[] charArray = city2.toString().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (city2.toString().indexOf(c) != city2.toString().lastIndexOf(c)) {
				System.out.println("First non-repeating character: " + c + " at index " + i);
				// break;

			}
		}

		/*
		 * for (int i = 0; i < city2.length(); i++) {
		 * // city2.append(" India");
		 * System.out.println(city2.charAt(i) + " " + i);
		 * // city2.append(" India");
		 * // System.out.println(city2.charAt(i));
		 * }
		 */

	}

}

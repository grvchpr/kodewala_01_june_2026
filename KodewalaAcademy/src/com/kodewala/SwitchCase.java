package com.kodewala;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Main Method() Start");
		int day = Integer.parseInt(args[0]);
		String output = SwitchCase.identifyDay(day);
		System.out.println(output);
		System.out.println("Main Method() End");

	}

	private static String identifyDay(int day) {
		String output = "";
		switch (day) {
		case 1:
			output = "Monday";
			break;
		case 2:
			output = "Tuesday";
			break;
		case 3:
			output = "Wednesday";
			break;
		case 4:
			output = "Thursday";
			break;
		case 5:
			output = "Friday";
			break;
		case 6:
			output = "Saturday";
			break;
		case 7:
			output = "Sunday";
			break;
		default:
			output = "Invalid Day";
		}
		return output;
	}

}

package com.kodewala;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		double principle = scanner.nextDouble();
		System.out.print("Enter the interest rate (in %): ");
		double rate = scanner.nextDouble();
		System.out.print("Enter the number of days: ");
		int days = scanner.nextInt();
		double simpleInterest = InterestCalculator.calculateSimpleInterest(principle, rate, days);
		System.out.println("The simple interest is: " + simpleInterest);
		scanner.close();
	}
}

/*
 * Simple Interest Calculator
 * Principal * Days divide by
 * if rate is 1% then divide by 3000
 * else if rate is 1.25% then divide by 2400
 * else if rate is 1.5% then divide by 2000
 * else if rate is 1.75% then divide by 1714
 * else if rate is 1.90% then divide by 1577
 * else if rate is 2% then divide by 1500
 * if rate is 2.5% then divide by 1200
 */
class InterestCalculator {
	public static double calculateSimpleInterest(double principle, double rate, int days) {
		double interest = 0.0;
		if (rate == 1.0) {
			interest = (principle * days) / 3000;
		} else if (rate == 1.25) {
			interest = (principle * days) / 2400;
		} else if (rate == 1.5) {
			interest = (principle * days) / 2000;
		} else if (rate == 1.75) {
			interest = (principle * days) / 1714;
		} else if (rate == 1.9) {
			interest = (principle * days) / 1577;
		} else if (rate == 2.0) {
			interest = (principle * days) / 1500;
		} else if (rate == 2.5) {
			interest = (principle * days) / 1200;
		}
		return interest;
	}
}
package com.kodewala.thread1;

import java.util.ArrayList;
import java.util.List;

class OddThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i += 2) {
			System.out.println("Odd Thread: " + i);
			System.out.println("-------------------");
		}
	}

}

class EvenThread extends Thread {
	@Override
	public void run() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println("Even Thread: " + i);
			System.out.println("-------------------");
		}
	}
}

public class Driver2 {
	public static void main(String[] args) {

		OddThread odd = new OddThread();
		odd.start();
		EvenThread even = new EvenThread();
		even.start();

	}
}

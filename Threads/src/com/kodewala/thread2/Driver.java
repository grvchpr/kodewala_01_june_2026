package com.kodewala.thread2;

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Task.run()");
	}

}

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main()");

		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start();
	}

}

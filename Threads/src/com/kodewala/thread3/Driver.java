package com.kodewala.thread3;

class Task implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				try {
					System.out.println("Sleeping");
					Thread.sleep(5000);
					System.out.println("Sleep time is over... Now thread start work again");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Printing i: " + i);
		}
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

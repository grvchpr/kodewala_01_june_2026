package com.kodewala.thread;

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Start run()");
		System.out.println("Executing run method");

		System.out.println("MyThread : THis code is executing by [" + Thread.currentThread().getName() + "] thread");
		System.out.println("End run()");
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println("Start main()");

		System.out.println("THis code is executing by [" + Thread.currentThread().getName() + "] thread");
		System.out.println("Hello World");

		MyThread t1 = new MyThread();
		t1.start();

		MyThread t2 = new MyThread();
		t2.start();

		System.out.println("End main()");
	}

}

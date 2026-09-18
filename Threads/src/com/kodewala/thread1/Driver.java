package com.kodewala.thread1;

class EmailSender extends Thread {
	@Override
	public void run() {
		System.out.println("Sending email....." + Thread.currentThread().getName());
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		EmailSender s1 = new EmailSender();
		s1.start();
		//s1.start();
	}

}

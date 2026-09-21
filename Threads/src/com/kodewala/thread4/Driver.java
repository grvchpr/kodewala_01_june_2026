package com.kodewala.thread4;

class PrintNumber {
	public synchronized void printNumber() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing Numbers: " + i + " [" 
					+ Thread.currentThread().getName() + " ]");
		}
		System.out.println();
	}
}

class PrintThread extends Thread{
	PrintNumber p;
	public PrintThread(PrintNumber p) {
		this.p = p;
	}
	@Override
	public void run() {
		p.printNumber();
	}
}

public class Driver {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		PrintThread p1 = new PrintThread(p);
		p1.setName("First Thread");
		p1.start();
		
		PrintThread p2 = new PrintThread(p);
		p2.setName("Second Thread");
		p2.start();
	}

}

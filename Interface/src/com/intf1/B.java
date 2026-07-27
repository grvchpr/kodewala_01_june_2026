package com.intf1;

interface D {
	void Sc();

	default void track() {
		System.out.println("Tracking");
	}
}

public class B implements D {

	@Override
	public void Sc() {
		System.out.println("Scheduling");

	}

	public static void main(String[] args) {
		B obj = new B();
		obj.Sc();
		obj.track();
	}

}

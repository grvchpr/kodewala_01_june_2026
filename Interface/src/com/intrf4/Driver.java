package com.intrf4;

public class Driver {
	public static void main(String[] args) {
		MyInterface obj = () -> System.out.println("Hello from myMethod!");
		obj.myMethod();
	}
}

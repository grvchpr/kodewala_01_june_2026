package com.intf1;

public class Test {
	void show(Object obj) {
		System.out.println("Object version");
	}

	void show(Integer str) {
		System.out.println("Integer version");
	}

	public static void main(String[] args) {
		new Test().show(null); // This will call the String version because String is more specific than Object
	}

}

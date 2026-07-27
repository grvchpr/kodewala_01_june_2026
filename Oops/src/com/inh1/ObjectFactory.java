package com.inh1;

public class ObjectFactory {

	public Object objectFactory(String className) {
		Object obj = null;
		if (className.equalsIgnoreCase("Product")) {
			obj = new Product();
		} else if (className.equalsIgnoreCase("Electronics")) {
			obj = new Electronics();
		} else {
			System.out.println("Invalid class name");
		}
		return obj;
	}
}

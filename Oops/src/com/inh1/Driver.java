package com.inh1;

class Product {
	Product() {
		System.out.println("Product constructor");
	}

	public void displayProductDetails() {
		System.out.println("Product details");
	}
}

class Electronics extends Product {

	Electronics() {
		System.out.println("Electronics constructor");
	}

	public void displayProductDetails() {
		System.out.println("Electronics product details");
	}
}

public class Driver {

	public static void main(String[] args) {
		ObjectFactory factory = new ObjectFactory();
		Product p = (Product) factory.objectFactory("Electronics");
		System.out.println(p);

		// p.displayProductDetails();
	}

}

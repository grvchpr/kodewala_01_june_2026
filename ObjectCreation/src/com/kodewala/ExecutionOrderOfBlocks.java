package com.kodewala;

public class ExecutionOrderOfBlocks {

	public static void main(String[] args) {
		Demo demo = new Demo(10);
		demo.Display();
	}
}

class Model {// Parent class
	static {// 1
		System.out.println("Model class static block");
	}
	{// 3
		System.out.println("Model class instance block");
	}// 4

	public Model() {
		System.out.println("Model class constructor");
	}

	public void display() {// 5
		System.out.println("Model class display method");
	}
}

class Demo extends Model { // Child class
	static {// 2
		System.out.println("Demo class static block");
	}
	{
		System.out.println("Demo class instance block");
	}

	public Demo() {
		System.out.println("Demo class constructor");
	}

	public Demo(int x) {
		this();
		System.out.println("Demo class parameterized constructor");
	}

	public void Display() {
		super.display();
		System.out.println("Demo class display method");
	}
}

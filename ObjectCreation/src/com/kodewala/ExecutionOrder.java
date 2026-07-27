package com.kodewala;

class Parent {
	static {// parent static initialization block
		System.out.println("Parent SIB");
	}
	{// parent instance initialization block
		System.out.println("Parent IIB");
	}

	Parent() {// parent constructor
		System.out.println("Parent Constructor");
	}

	void display() {// parent method
		System.out.println("Parent Display Method");
	}
}

class Child extends Parent {
	static {// child static initialization block
		System.out.println("Child SIB");
	}
	{// child instance initialization block
		System.out.println("Child IIB");
	}

	Child() {// child constructor
		super(); // calls parent constructor
		System.out.println("Child Constructor");
	}

	Child(int x) {// child parameterized constructor
		this(); // calls current class constructor
		System.out.println("Child Parameterized Constructor");
	}

	void show() {// child method
		super.display(); // calling parent display method
		System.out.println("Child Method");
	}
}

public class ExecutionOrder {
	public static void main(String[] args) {

		Child childObj = new Child(10);

		childObj.show();
	}
}
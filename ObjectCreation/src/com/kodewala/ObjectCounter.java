package com.kodewala;

public class ObjectCounter {

	private static int objectCount;

	static {
		objectCount = 0;
		System.out.println("Static block executed: Class loaded, counter initialized to 0.");
	}

	{
		objectCount++;
		System.out.println("Instance block executed: Object created. Current count: " + objectCount);
	}

	ObjectCounter() {

	}

	private static int getObjectCount() {
		return objectCount;
	}

	public static void main(String[] args) {
		System.out.println("--- Main Method Started ---");

		ObjectCounter obj1 = new ObjectCounter();
		ObjectCounter obj2 = new ObjectCounter();
		ObjectCounter obj3 = new ObjectCounter();
		ObjectCounter obj4 = new ObjectCounter();

		System.out.println("Final Total Objects Created: " + getObjectCount());
		System.out.println("--- Main Method ENDED ---");
	}
}

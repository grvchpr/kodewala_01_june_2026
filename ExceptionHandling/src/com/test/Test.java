package com.test;

class MyResource implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closed");
	}

	void work() {
		System.out.println("Working");
	}
}

public class Test {
	public static void main(String[] args) {
		try (MyResource resource = new MyResource()) {
			resource.work();
		}
	}

}

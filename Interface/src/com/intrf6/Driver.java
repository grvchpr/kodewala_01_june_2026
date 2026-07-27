package com.intrf6;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {
	public static void main(String[] args) {
		Predicate<Integer> isTrue = (n) -> n < 100;
		System.out.println(isTrue.test(50));

		Supplier<String> supplier = () -> "Hello, World!";
		System.out.println(supplier.get());

		Supplier<Integer> randomNumberSupplier = () -> 1000 + (int) (Math.random() * 9000);
		System.out.println("Your Pin is : " + randomNumberSupplier.get());

		Consumer<String> consumer = (email) -> System.out.println("Email has been to " + email);
		consumer.accept("gouravc@gmail.com");

		Function<Integer, Integer> function = (a) -> a + a;
		System.out.println(function.apply(5));
	}
}

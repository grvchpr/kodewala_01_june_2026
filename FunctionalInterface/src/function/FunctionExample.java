package function;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, Integer> function = (s) -> s.length();
		System.out.println(function.apply("Gourav")); // 6

		Function<Integer, Integer> calculateDiscount = (i) -> i = i - (i * 10 / 100);
		System.out.println("After discount final price: " + calculateDiscount.apply(100)); // 90
	}
}

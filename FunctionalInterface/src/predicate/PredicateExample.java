package predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() <= 5;
		System.out.println(predicate.test("Hello!")); // false

		Predicate<String> predicate2 = (s) -> s.contains("st");
		System.out.println(predicate2.test("string"));// true

		Predicate<String> predicate3 = (s) -> s.concat(" World").length() > 10;
		System.out.println(predicate3.test("Hello!"));// true

		Predicate<Integer> predicate4 = (i) -> i % 2 == 0;
		System.out.println(predicate4.test(5)); // false
	}

}

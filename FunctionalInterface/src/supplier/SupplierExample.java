package supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello, World!";
		System.out.println(supplier.get()); // Hello, World!

		Supplier<Integer> supplier2 = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Your OTP : " + supplier2.get()); // Random 6 digit number

	}
}

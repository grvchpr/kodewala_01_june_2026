package consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> sendEmail = email -> System.out.println("Sending email to " + email);
		sendEmail.accept("gouravchopra1406@gmail.com");
	}

}

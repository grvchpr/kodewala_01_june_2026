package com.inhr6;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProcessNotification process = new ProcessNotification();
		System.out.println("Enter the type of notification to send (whatsapp/push/sms/email): ");
		String notificationType = scanner.nextLine();
		if (notificationType.equalsIgnoreCase("whatsapp")) {
			process.processNotification(new WhatsAppNotification());
		} else if (notificationType.equalsIgnoreCase("push")) {
			process.processNotification(new PushNotification());
		} else if (notificationType.equalsIgnoreCase("sms")) {
			process.processNotification(new SMSNotification());
		} else if (notificationType.equalsIgnoreCase("email")) {
			process.processNotification(new EmailNotification());
		} else {
			System.out.println("Invalid notification type");
		}
		scanner.close();
	}

}

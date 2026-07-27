package com.inhr6;

public class WhatsAppNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("WhatsAppNotification.sendNotification() ---> Sending WhatsApp notification");
	}
}

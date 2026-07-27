package com.inhr6;

public class EmailNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("EmailNotification.sendNotification() ---> Sending email notification");
	}
}

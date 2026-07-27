package com.inhr6;

public class PushNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("PushNotification.sendNotification() ---> Sending Push notification");
	}
}

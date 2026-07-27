package com.inhr6;

public class SMSNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("SMSNotification.sendNotification() ---> Sending SMS notification");
	}
}

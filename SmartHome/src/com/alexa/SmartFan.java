package com.alexa;

public class SmartFan implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Smart Fan is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Fan is turned off.");
	}

	@Override
	public void reStart() {
		System.out.println("Smart Fan is restarting...");
	}

	@Override
	public void updateFirmware() {
		System.out.println("Smart Fan firmware is updating...");
	}

}

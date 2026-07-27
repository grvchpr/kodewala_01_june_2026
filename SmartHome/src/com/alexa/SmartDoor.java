package com.alexa;

public class SmartDoor implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Smart Door is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Door is turned off.");
	}

	@Override
	public void reStart() {
		System.out.println("Smart Door is restarting...");
	}

	@Override
	public void updateFirmware() {
		System.out.println("Smart Door firmware is updating...");
	}

}

package com.alexa;

public class SmartLight implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Smart Light is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Light is turned off.");
	}

	@Override
	public void reStart() {
		System.out.println("Smart Light is restarting...");
	}

	@Override
	public void updateFirmware() {
		System.out.println("Smart Light firmware is updating...");
	}

	@Override
	public void enableVoiceControl() {
		System.out.println("Voice control is enabled for Smart Light.");
	}

}

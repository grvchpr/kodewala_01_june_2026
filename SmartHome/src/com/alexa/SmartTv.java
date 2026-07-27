package com.alexa;

public class SmartTv implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Smart TV is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV is turned off.");
	}

	@Override
	public void reStart() {
		System.out.println("Smart TV is restarting...");
	}

	@Override
	public void updateFirmware() {
		System.out.println("Smart TV firmware is updating...");
	}

	@Override
	public void enableVoiceControl() {
		System.out.println("Voice control is enabled for Smart TV.");
	}

}

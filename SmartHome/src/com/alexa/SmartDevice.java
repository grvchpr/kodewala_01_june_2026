package com.alexa;

public interface SmartDevice {
	public void turnOn();

	public abstract void turnOff();

	void reStart();

	public void updateFirmware();

	// Default method for enabling voice control
	public default void enableVoiceControl() {
		System.out.println("Voice control not support in this device.");
	}
}

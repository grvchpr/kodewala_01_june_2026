package com.alexa;

public class Driver {

	public static void main(String[] args) {
		SmartDevice smartLight = new SmartLight();
		SmartDevice smartTv = new SmartTv();
		SmartDevice smartFan = new SmartFan();
		SmartDevice smartDoor = new SmartDoor();

		System.out.println("===Smart Light===");
		smartLight.turnOn();
		smartLight.turnOff();
		// smartLight.reStart();
		// smartLight.updateFirmware();
		smartLight.enableVoiceControl();

		System.out.println("\n===Smart TV===");
		smartTv.turnOn();
		smartTv.turnOff();
		// smartTv.reStart();
		// smartTv.updateFirmware();
		smartTv.enableVoiceControl();

		System.out.println("\n===Smart Fan===");
		smartFan.turnOn();
		smartFan.turnOff();
		// smartFan.reStart();
		// smartFan.updateFirmware();
		smartFan.enableVoiceControl();

		System.out.println("\n===Smart Door===");
		smartDoor.turnOn();
		smartDoor.turnOff();
		// smartDoor.reStart();
		// smartDoor.updateFirmware();
		smartDoor.enableVoiceControl();

	}

}

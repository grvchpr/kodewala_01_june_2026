package com.apple;

import java.util.Scanner;

import com.apple.info.PhoneInfo;
import com.apple.service.PhoneService;
import com.apple.service.PhoneServiceImpl;

public class Driver {

    public static void main(String[] args) {
        PhoneService service = new PhoneServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to FindMyiPhone (demo). Enter serial number to get phone info.");
        while (true) {
            System.out.print("Enter serial number (or type exit to quit): ");
            String input = scanner.nextLine();
            if (input == null) {
                break;
            }
            input = input.trim();
            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting. Goodbye!");
                break;
            }

            PhoneInfo info = service.getPhoneInfo(input);
            if (info == null) {
                System.out.println("No phone found with serial: " + input);
            } else {
                System.out.println("--- Phone details ---");
                System.out.println(info.toString());
                System.out.println("--- Device behaviors (polymorphism demo) ---");

                AppleDevice device = createDeviceForModel(info.getModel());
                if (device != null) {
                    device.unlockDevice();
                    device.useSiriAi();
                    device.findMyIPhone();
                } else {
                    System.out.println("No device class available for model: " + info.getModel());
                }
            }
        }

        scanner.close();
    }

    private static AppleDevice createDeviceForModel(String model) {
        if (model == null) {
            return null;
        }
        switch (model) {
        case "Iphone15":
            return new Iphone15();
        case "Iphone15Pro":
            return new Iphone15Pro();
        case "Iphone17ProMax":
            return new Iphone17ProMax();
        default:
            return null;
        }
    }

}

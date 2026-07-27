package com.apple;

public class Iphone17ProMax implements AppleDevice {

    @Override
    public void unlockDevice() {
        System.out.println("iPhone 17 Pro Max unlocked using Face ID.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " using iPhone 17 Pro Max.");
    }

    @Override
    public void useFaceTime(String contact) {
        System.out.println("Starting FaceTime with " + contact + ".");
    }

    @Override
    public void useAppleMaps(String destination) {
        System.out.println("Navigating to " + destination + " using Apple Maps.");
    }

    @Override
    public void useSiriAi() {
        System.out.println("Siri Ai is available on iPhone 17 Pro Max.");
    }

    @Override
    public void findMyIPhone() {
        System.out.println("Finding iPhone 17 Pro Max location.");
    }
}

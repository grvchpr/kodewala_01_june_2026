package com.apple;

public class Iphone15Pro implements AppleDevice {

    @Override
    public void unlockDevice() {
        System.out.println("iPhone 15 pro unlocked using Face ID.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " using iPhone 15 pro.");
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
        System.out.println("Siri Ai is available on iPhone 15 pro.");
    }

    @Override
    public void findMyIPhone() {
        System.out.println("Finding iPhone 15 pro location.");
    }
}

package com.apple.repo;

import java.util.HashMap;
import java.util.Map;

import com.apple.info.PhoneInfo;

public class PhoneRepository {

    private final Map<String, PhoneInfo> phones = new HashMap<>();

    public PhoneRepository() {
        // sample data
        phones.put("SN1001", new PhoneInfo("SN1001", "Iphone15", "Black", 128, "Gourav",
                "356789012345678", "iOS 17", 2024));
        phones.put("SN1002", new PhoneInfo("SN1002", "Iphone15Pro", "Silver", 256, "Aman",
                "356789012345679", "iOS 17.1", 2024));
        phones.put("SN1003", new PhoneInfo("SN1003", "Iphone17ProMax", "Blue", 512, "Rahul",
                "356789012345680", "iOS 18", 2026));
    }

    public PhoneInfo findBySerial(String serial) {
        if (serial == null) {
            return null;
        }
        return phones.get(serial.trim());
    }
}

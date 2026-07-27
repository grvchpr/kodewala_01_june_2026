package com.apple.service;

import com.apple.info.PhoneInfo;

public interface PhoneService {
    /**
     * Retrieve phone info by serial number. Returns null if not found.
     */
    PhoneInfo getPhoneInfo(String serial);
}

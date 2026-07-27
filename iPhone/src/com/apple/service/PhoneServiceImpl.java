package com.apple.service;

import com.apple.info.PhoneInfo;
import com.apple.repo.PhoneRepository;

public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository repository;

    public PhoneServiceImpl() {
        this.repository = new PhoneRepository();
    }

    @Override
    public PhoneInfo getPhoneInfo(String serial) {
        return repository.findBySerial(serial);
    }
}

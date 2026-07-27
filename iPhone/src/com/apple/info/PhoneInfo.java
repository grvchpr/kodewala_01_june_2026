package com.apple.info;

public class PhoneInfo {

    private String serialNum;
    private String model;
    private String color;
    private int storageGB;
    private String ownerName;
    private String imei;
    private String osVersion;
    private int manufactureYear;

    public PhoneInfo(String serialNum, String model, String color, int storageGB, String ownerName, String imei,
            String osVersion, int manufactureYear) {
        this.serialNum = serialNum;
        this.model = model;
        this.color = color;
        this.storageGB = storageGB;
        this.ownerName = ownerName;
        this.imei = imei;
        this.osVersion = osVersion;
        this.manufactureYear = manufactureYear;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "PhoneInfo{" +
                "serialNum='" + serialNum + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storageGB=" + storageGB +
                ", ownerName='" + ownerName + '\'' +
                ", imei='" + imei + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}

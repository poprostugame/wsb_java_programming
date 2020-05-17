package com.company.devices;

public abstract class Device {
    public String producer;
    public String mode;
    public Integer yearOfProduction;

    public Device(String producer, String mode, Integer yearOfProduction) {
    }

    public abstract String toString();
    public abstract void turnOn();

}

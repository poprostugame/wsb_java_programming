package com.company.devices;

import com.company.salleable;

public abstract class Device implements salleable {
    public String producer;
    public String mode;
    public Integer yearOfProduction;

    public Device(String producer, String mode, Integer yearOfProduction) {
    }

    public abstract String toString();
    public abstract void turnOn();

}

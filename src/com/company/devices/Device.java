package com.company.devices;

import com.company.salleable;

public abstract class Device implements salleable {
    public String producer;
    public String mode;
    public Integer yearOfProduction;
    public Double value;

    public Device(String producer, String mode, Integer yearOfProduction, Double value) {
    }

    public abstract String toString();
    public abstract void turnOn();

    public Integer getYearOfProduction() {
        return this.yearOfProduction;
    }
}

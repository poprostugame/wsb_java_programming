package com.company.devices;

public class LPG extends Car {
    public LPG(String mark, String model, Double engineCapacity, String color, Double value, String producer, String mode, Integer yearOfProduction) {
        super(mark, model, engineCapacity, color, value, producer, mode, yearOfProduction);
    }

    @Override
    public void reFuel() {
        System.out.println("Gas cylinder is full.");
    }
    @Override
    public Integer getYearOfProduction() {
        return super.yearOfProduction;
    }
}

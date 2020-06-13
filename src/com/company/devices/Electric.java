package com.company.devices;

public class Electric extends Car {
    public Electric(String mark, String model, Double engineCapacity, String color, Double value, String producer, String mode, Integer yearOfProduction) {
        super(mark, model, engineCapacity, color, value, producer, mode, yearOfProduction);
    }

    @Override
    public void reFuel() {
        System.out.println("The battery has been charged");
    }
    @Override
    public Integer getYearOfProduction() {
        return super.yearOfProduction;
    }
}

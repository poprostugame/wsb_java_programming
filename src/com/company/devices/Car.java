package com.company.devices;

public class Car {
    public final String mark;
    public final String model;
    public final Integer yearOfProduction;
    public final Double engineCapacity;
    public final String color;
    public Double value;
    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String color, Double value) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.value = value;
    }
    public String toString(){
        return this.mark + " " +
        this.model + " " +
        this.yearOfProduction;
    }

}

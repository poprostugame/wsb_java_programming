package com.company;

public class Car {
    final String mark;
    final String model;
    final Integer yearOfProduction;
    final Double engineCapacity;
    final String color;
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

package com.company.devices;

public class Car extends Device{
    public final String mark;
    public final String model;
    public final Double engineCapacity;
    public final String color;
    public Double value;

    public Car(String mark, String model,
               Double engineCapacity, String color,
               Double value,String producer, String mode, Integer yearOfProduction) {
        super(producer, mode, yearOfProduction);
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.value = value;

    }
    @Override
    public String toString(){
        return this.mark + " " +
        this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Brum brum brum wrrr wrrr\n" + this.model +" is turned ON");
    }

}

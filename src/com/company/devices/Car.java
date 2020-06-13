package com.company.devices;

import com.company.creatures.Human;

abstract public class Car extends Device {
    public final String mark;
    public final String model;
    public final Double engineCapacity;
    public final String color;


    public Car(String mark, String model,
               Double engineCapacity, String color,
               Double value, String producer, String mode, Integer yearOfProduction) {
        super(producer, mode, yearOfProduction, value);
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.value = value;
        this.yearOfProduction = yearOfProduction;

    }

    public abstract void reFuel();

    @Override
    public Integer getYearOfProduction() {
        return super.yearOfProduction;
    }


    @Override
    public String toString() {
        return this.mark + " " +
                this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Brum brum brum wrrr wrrr\n" + this.model + " is turned ON");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

        if (seller.contains(seller.garage, this)) {
            if (buyer.isFreePosition(buyer.garage) != null) {
                if (buyer.cash >= price) {
                    buyer.cash = buyer.cash - price;
                    seller.cash = seller.cash + price;
                    buyer.setCar(this, buyer.isFreePosition(seller.garage));
                    seller.removeVehicle(seller.carPosition(seller.garage, this));
                    System.out.println(buyer + " just bought " + this + " transaction was successful.");
                } else throw new Exception(buyer + " doesn't have enough money.");
            } else throw new NullPointerException(buyer.firstName + " " + buyer.lastName + " have garage full of cars and there's no place for another one");


        } else throw new Exception("This is not he's car!");
    }
}

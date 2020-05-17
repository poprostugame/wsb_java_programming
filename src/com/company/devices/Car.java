package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if(seller.getVehicle() == this)
        {
            if(buyer.cash >= price)
            {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.setVehicle(this);
                seller.removeVehicle();
                System.out.println(buyer + " just buy " + this);
            }
            else System.out.println(buyer + " doesn't have enough money.");
        }
        else System.out.println("This is not he's car!");
    }
}

package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {
    final String mark;
    final String model;
    public Double value;

    public Phone(String mark, String model,String producer, String mode, Integer yearOfProduction, Double value){
    super(producer, mode, yearOfProduction);
        this.mark = mark;
        this.model = model;
        this.value = value;
    }
    @Override
    public String toString(){
        return this.mark + " " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome I'm your " + this.model + "!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone == this)
        {
            if(buyer.cash >= price)
            {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.phone = this;
                seller.phone = null;
                System.out.println(buyer + " just buy " + this);
            }
            else System.out.println(buyer + " don't have enough money.");
        }
        else System.out.println("This is not he's phone!");
    }

}

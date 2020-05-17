package com.company.devices;

public class Phone extends Device{
    final String mark;
    final String model;

    public Phone(String mark, String model,String producer, String mode, Integer yearOfProduction){
    super(producer, mode, yearOfProduction);
        this.mark = mark;
        this.model = model;
    }
    @Override
    public String toString(){
        return this.mark + " " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome I'm your " + this.model + "!");
    }
}

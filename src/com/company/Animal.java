package com.company;

import java.io.File;
import java.sql.SQLOutput;

public class Animal implements salleable{
    final String species;
    private Double weight; // I did it in exercise 0
    public String name;
    File pic;
    public Double value;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.01;
    public static final Double DEFAULT_LION_WEIGHT = 123.0;

    public Animal(String species,Double value) {
        this.species = species;
        this.value = value;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }
    }

    void feed() {
        if (weight > 0.0) {
            weight++;
            System.out.println("thx for food bro, " + weight + "kg");
        } else {
            System.out.println("Man! Your dog is dead you cannot feed him");
        }
    }

    void takeForAWalk() {
        if (weight > 0.0) {
            weight--;
            if (weight == 0.0) {
                System.out.println("You killed your dog by taking him for walk without feeding!");
            }
            else {
                System.out.println("thx for taking me for walk, " + weight + "kg");
            }
        } else {
            System.out.println("Man! Your dog is dead you cannot take him for a walk");
            System.out.println("Your dog is dead");
        }
    }
    boolean imDead() {
        if (weight <= 0.0) {
            System.out.println("Mum always said \"Remember to feed the dog\"");
            return false;
        } else {
            return true;
        }
    }
    public String toString(){
        return this.name + " " + this.species + " " + this.weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if(seller.pet == this)
        {
            if(buyer.cash >= price)
            {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.pet = this;
                seller.pet = null;
                System.out.println(buyer + " just buy " + this);
            }
            else System.out.println(buyer + " don't have enough money.");
        }
        else System.out.println("This is not he's animal!");
    }

}

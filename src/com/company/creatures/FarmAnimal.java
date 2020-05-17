package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    public FarmAnimal(String name,String species,Double value) {
        super(species, value);
        this.name = name;
    }

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println(this.name + " has been eaten");
    }

    @Override
    public void feed() {
        if (weight > 0.0) {
            weight++;
            System.out.println("thx for food bro, " + weight + "kg");
        } else {
            System.out.println("Man! Your animal is dead you cannot feed him");
        }
    }

    @Override
    public void feed(Double foodWeight) {
        if (this.weight <= 0.0){
            System.out.println("Man! Your animal is dead you cannot feed him anymore.");
        }
        else if(foodWeight <= this.weight/10)
        {
            weight += foodWeight;
            System.out.println("thx for food bro, " + weight + "kg");
        }
        else if (foodWeight > this.weight/10)
        {
            System.out.println("Dude it's too much for " + this.name + ".");
        }

    }
    }


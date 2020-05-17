package com.company.creatures;

public class Pet extends Animal{
    public Pet(String name,String species,Double value) {
        super(species, value);
        this.name = name;
    }

    @Override
    public void feed(Double foodWeight) {
        if (foodWeight > this.weight) {
            System.out.println("Dude it's too much for " + this.name + ".");
        }
        else {
            if (this.weight > 0.0) {
                this.weight += foodWeight;
                System.out.println("thx for food bro, " + this.weight + "kg");
            } else {
                System.out.println("Man! Your animal is dead you cannot feed him");
            }
        }
    }
}

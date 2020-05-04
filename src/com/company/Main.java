package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        System.out.println(me.pet.name);

        Animal dog = new Animal("dog");
        dog.name = "Akita";
        me.pet = dog;

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        do {
            me.pet.takeForAWalk();
        } while (me.pet.imDead());

        Car passeratti = new Car("Volksvawgen", "Passat", 1998, 1.9, "silver");
        me.vehicle = passeratti;
        me.setSalary(2500.0);
        me.getSalary();
        me.setSalary(-2599.0);
        me.getSalary();
        me.setSalary(15000.0);
        me.getSalary();
    }
}

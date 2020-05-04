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

        Car passeratti = new Car("Volksvawgen", "Passat", 1998, 1.9, "silver",50000.0);

        me.setSalary(2500.0);
        me.getSalary();
        me.setSalary(-2599.0);
        me.getSalary();
        me.setSalary(3500.0);
        me.getSalary();
        me.setVehicle(passeratti);
        Car corsze = new Car("Opel","Corsa",2000,1.0,"black",4500.0);
        me.setVehicle(corsze);
        me.getVehicle();
        Car cienias = new Car("Fiat", "Cinquecento", 1995,0.6,"pink",500.0);
        me.setVehicle(cienias);
        me.getVehicle();
    }
}

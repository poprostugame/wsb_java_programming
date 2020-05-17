package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

//        Human me = new Human();
//        me.firstName = "Jacek";
//        me.lastName = "Placek";
//        me.pet = new Animal("mouse");
//        me.pet.name = "Myszojeleń";
//        me.pet.feed();
//
//        System.out.println(me.pet.name);
//
//        Animal dog = new Animal("dog");
//        dog.name = "Akita";
//        me.pet = dog;
//
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//        do {
//            me.pet.takeForAWalk();
//        } while (me.pet.imDead());
//
//        Car passeratti = new Car("Volksvawgen", "Passat", 1998, 1.9, "silver",50000.0);
//
//        me.setSalary(2500.0);
//        me.getSalary();
//        me.setSalary(-2599.0);
//        me.getSalary();
//        me.setSalary(3500.0);
//        me.getSalary();
//        me.setVehicle(passeratti);
//        Car corsze = new Car("Opel","Corsa",2000,1.0,"black",4500.0);
//        me.setVehicle(corsze);
//        me.getVehicle();
//        Car cienias = new Car("Fiat", "Cinquecento", 1995,0.6,"pink",500.0);
//        me.setVehicle(cienias);
//        me.getVehicle();
//
//        Car corszeV2 = new Car("Opel","Corsa",2000,1.0,"black",4500.0);
//        System.out.println(corsze==corszeV2);
//        System.out.println(corsze.equals(corszeV2));
//        System.out.println(corsze);
//        System.out.println(corszeV2);
//
//        Phone siao = new Phone("Xiaomi","Mi 10");
//        System.out.println(corsze);
//        System.out.println(me);
//        System.out.println(dog);
//        System.out.println(siao);

        // EXERCISE 7
//        Device octavia = new Car("Skoda","Octavia",1.6,"yellow",1500.0,
//                "Volkswagen AG","sedan",1998);
//        System.out.println(octavia);
//        octavia.turnOn();
//
//        Device galaxy = new Phone("Samsung", "Galaxy 100",
//                "Samsung Company", "smartphone", 2020);
//        System.out.println(galaxy);
//        galaxy.turnOn();

        //EXERCISE 8
//        Human coolGuy = new Human();
//        coolGuy.firstName="Jack";
//        coolGuy.lastName="Cake";
//        coolGuy.cash = 1000.0;
//        Animal rocky = new Animal("dog",200.0);
//        rocky.name = "Rocky";
//        Car octavia = new Car("Skoda","Octavia",1.6,"yellow",1500.0,
//                "Volkswagen AG","sedan",1998);
//        coolGuy.pet = rocky;
//        coolGuy.setVehicle(octavia);
//        Phone galaxy = new Phone("Samsung", "Galaxy 100",
//                "Samsung Company", "smartphone", 2020,500.0);
//        Human richGuy = new Human();
//        richGuy.firstName = "Bill";
//        richGuy.lastName = "Gates";
//        richGuy.cash = 2000.0;
//        richGuy.phone=galaxy;
//
//        galaxy.sell(coolGuy,richGuy,100.0);
//        galaxy.sell(richGuy,coolGuy,5000.0);
//        galaxy.sell(richGuy,coolGuy,100.0);
//        rocky.sell(coolGuy,richGuy,200.0);
//        octavia.sell(coolGuy,richGuy,3000.0);
//        octavia.sell(richGuy,coolGuy,100.0);
//        octavia.sell(coolGuy,richGuy,1000.0);
//
//        richGuy.sell(richGuy,coolGuy,2000.0);
//
        //EXERCISE 9
        Pet mickey = new Pet("Mickey","mouse",20.0);
        mickey.feed();
        mickey.feed(300.0);
        FarmAnimal victoria = new FarmAnimal("Victoria","cow",5000.0);
        victoria.feed();
        victoria.feed(300.0);
        victoria.beEaten();
        victoria.feed();
        victoria.feed(300.0);
    }
}

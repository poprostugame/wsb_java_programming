package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

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
//        Pet mickey = new Pet("Mickey","mouse",20.0);
//        mickey.feed();
//        mickey.feed(300.0);
//        FarmAnimal victoria = new FarmAnimal("Victoria","cow",5000.0);
//        victoria.feed();
//        victoria.feed(300.0);
//        victoria.beEaten();
//        victoria.feed();
//        victoria.feed(300.0);

        //EXERCISE 10
//        Phone galaxy = new Phone("Samsung", "Galaxy 100",
//                "Samsung Company", "smartphone", 2020,500.0,"gmail");
//        galaxy.installAnApp("Tiktok");
//        galaxy.installAnApp("Gadu gadu", 3.4);
//        galaxy.installAnApp("Mapy", 5.4, "www.mapska.com.pl");
//        List<String> appsList = new ArrayList<>();
//        appsList.add("mms");
//        appsList.add("insta");
//        appsList.add("calc");
//        galaxy.installAnApp(appsList);
//        for (String app:galaxy.apps
//             ) {
//            System.out.println(app);
//        }
//        Electric tesla = new Electric("Tesla", "X",25.0,
//                "red",300000.0,"Tesla Motors","Electric",2020);
//        tesla.reFuel();


        //EXERCISE 11
//        Phone samsung = new Phone("Samsung", "x2", "Samsung CO.", "smartphone",
//                2019, 2500.0, "gmail");
//        Animal york = new Pet("Rocky", "dog", 100.0);
//        Human john = new Human("John", "Smith", samsung, york, 3);
//        Human elizabeth = new Human("Elizabeth", "Smith", samsung, york, 1);
//        Human sam = new Human();
//        sam.firstName = "Sam";
//        sam.lastName = "Kowalski";
//        Diesel passerati = new Diesel("Volkswagen", "Passat", 1.9,
//                "pink", 2500.0, "VAG", "kombi", 1998);
//        Electric teslax = new Electric("Tesla", "X", 0.0,
//                "black", 250000.0, "Musk", "sport", 2019);
//
//        LPG tico = new LPG("Deawoo", "Tico", 0.9,
//                "green", 500.0, "Deawoo", "city", 1995);
//        john.setCar(passerati,2);
//        john.setCar(teslax,0);
//        sam.setCar(tico,0);
//        john.getCar(0);
//        Double garageValue = john.garageValue();
//        System.out.println(garageValue + "$");
//
//        sam.setCar(passerati,0);
//        sam.setCar(tico,1);
//        System.out.println(Arrays.toString(sam.garage));
//        sam.garageNewOrder();
//        System.out.println(Arrays.toString(sam.garage));
//
//        john.cash = 100.0;
//        elizabeth.cash = 20000.0;
//
//        passerati.sell(john,elizabeth,2500.0);
//
//        System.out.println(Arrays.toString(john.garage));
//        System.out.println(Arrays.toString(elizabeth.garage));

        //EXERCISE 12
//
//        Phone samsung = new Phone("Samsung", "x2", "Samsung CO.", "smartphone",
//                2019, 2500.0, "gmail");
//        Animal york = new Pet("Rocky", "dog", 100.0);
//        Human john = new Human("John", "Smith", samsung, york, 3);
//        Human elizabeth = new Human("Elizabeth", "Smith", samsung, york, 1);
//        Diesel passerati = new Diesel("Volkswagen", "Passat", 1.9,
//                "pink", 2500.0, "VAG", "kombi", 1998);
//        Electric teslax = new Electric("Tesla", "X", 0.0,
//                "black", 250000.0, "Musk", "sport", 2019);
//
//        LPG tico = new LPG("Deawoo", "Tico", 0.9,
//                "green", 500.0, "Deawoo", "city", 1995);
//        john.setCar(passerati,2);
//        john.setCar(teslax,0);
//
//        john.cash = 100.0;
//        elizabeth.cash = 20000.0;
//
//        passerati.sell(john,elizabeth,2500.0);
//
//        passerati.wasOwner(john);
//        passerati.wasTransaction(john,elizabeth);
//        passerati.numberOfTransactions();


        //EXERCISE 13
        Human owner = new Human();
        owner.cash = 100.0;
        owner.phone = new Phone("Samsung", "x2", "Samsung CO.", "smartphone",
                2019, 2500.0, "gmail");
        Application gmail = new Application("Mail",1.0,29.99);
        Application map = new Application("Map",3.0,690.99);
        Application gallery = new Application("Gallery",2.2,5.0);
        Application bank = new Application("Banking App",11.3,0.0);
        Application music = new Application("Music everywhere",0.5,0.0);

        owner.phone.installNewApp(owner,gmail);
        owner.phone.installNewApp(owner,map);
        owner.phone.installNewApp(owner,gallery);
        owner.phone.installNewApp(owner,bank);
        owner.phone.installNewApp(owner,music);
        if(owner.phone.isInstalledAlready(map)){
            System.out.println("Application " + map + " is already installed");
        } else System.out.println("Application " + map + "isn't installed on " + owner.phone);
        if(owner.phone.isInstalledAlready("Gallery")){
            System.out.println("Application is already installed");
        } else System.out.println("Application isn't installed on " + owner.phone);
        System.out.println("\n*** FREE APPS ***");
        owner.phone.freeApplications();
        System.out.println("\n*** ALL APS VALUE ***");
        System.out.println(owner.phone.valueOfAllApplications());
        System.out.println("\n*** ALPHABETICAL APPLICATIONS LIST ***");
        owner.phone.applicationsAlphabetical();
        System.out.println("\n** APPLICATIONS LIST SORTED BY VALUE ***");
        owner.phone.applicationsByPrice();
    }
}
package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.salleable;

import java.util.*;

public class Human implements salleable {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Car[] garage;
    private Double salary;
    List<String> dateOfGettingSalary = new ArrayList<>();
    public Double cash;

    public static final Integer DEFAULT_GARAGE_SIZE = 2;

    public Human() {
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }


    public Human(String firstName, String lastName, Phone phone, Animal pet, Integer garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        Date d = new Date();
        dateOfGettingSalary.add(d + " " + salary);
        for (String info : dateOfGettingSalary
        ) {
            System.out.println(info);
        }
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary >= 0.0) {
            System.out.println("Information about new salary has been sent to accounting system");
            System.out.println("Pick up the annex from Mrs. Hania for HR");
            System.out.println("ZUS and US already know about your new salary so don't try to hide it");
            this.salary = salary;
        } else {
            System.out.println("Negative salary? Really? ... Try again");
        }
    }

    public Car getCar(Integer garagePosition) {
        Car car = garage[garagePosition];
        System.out.println(car);
        return car;
    }

    public void setCar(Car vehicle, Integer garagePosition) {

        garage[garagePosition] = vehicle;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void sell(Human seller, Human buyer, Double Price) {
        System.out.println("Human trade is illegal I'm calling the police right now!");
    }

    public void removeVehicle(Integer garagePosition) {
        garage[garagePosition] = null;
    }

    public boolean contains(Car[] garage, Car car) {
        for (int i = 0; i <= garage.length - 1; i++) {
            if (car == this.garage[i]) {
                return true;
            }
        }
        return false;
    }

    public Integer carPosition(Car[] garage, Car car) {
        int number = 0;
        for (int i = 0; i <= garage.length - 1; i++) {
            if (car == this.garage[i]) {
                number = i;
                break;
            }
        }
        return number;
    }

    public Integer isFreePosition(Car[] garage) {
        int number;
        for (int i = 0; i <= garage.length - 1; i++) {
            if (this.garage[i] == null) {
                number = i;
                return number;
            }
        }
        return null;
    }

    public Double garageValue() {
        double sum = 0.0;
        for (int i = 0; i <= this.garage.length - 1; i++) {
            if (this.garage[i] != null) {
                sum = sum + this.garage[i].value;
            }
        }
        return sum;
    }

    public void garageNewOrder() {
        Arrays.sort(garage, Comparator.comparing(Car::getYearOfProduction));
    }


}

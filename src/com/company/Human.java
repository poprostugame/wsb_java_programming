package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Human implements salleable{
    String firstName;
    String lastName;
    public Phone phone;
    public Animal pet;
    private Car vehicle;
    private Double salary;
    List<String> dateOfGettingSalary = new ArrayList<>();
    public Double cash;

    public Double getSalary() {
        Date d = new Date();
        dateOfGettingSalary.add(d + " " + salary);
        for (String info:dateOfGettingSalary
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
        }
        else {
            System.out.println("Negative salary? Really? ... Try again");
        }
    }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) {
        this.vehicle = vehicle;
//        if(salary > vehicle.value){
//            System.out.println("You just buy this car for a cash");
//            this.vehicle = vehicle;
//        }
//        else if( salary > (1.0/12.0 * vehicle.value))
//        {
//            System.out.println("Bank just buy this car for you.. credit credit credit");
//            this.vehicle = vehicle;
//        }
//        else System.out.println("Change your job you're too poor");
    }
    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void sell(Human seller, Human buyer, Double Price) {
        System.out.println("Human trade is illegal I'm calling the police right now!");
    }
    public void removeVehicle()
    {
        vehicle = null;
    }
}

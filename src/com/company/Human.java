package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car vehicle;
    private Double salary;
    List<String> dateOfGettingSalary = new ArrayList<>();

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

}

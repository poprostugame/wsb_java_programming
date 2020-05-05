package com.company.devices;

public class Phone {
    final String mark;
    final String model;

    public Phone(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String toString(){
        return this.mark + " " + this.model;
    }
}

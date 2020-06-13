package com.company.devices;

import com.company.creatures.Human;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {
    final String mark;
    final String model;
    public Double value;
    public String appName;
    public String serverAddress;
    public Integer portNumber;
    public String versionName;
    public List<String> apps = new ArrayList<>();

    public static final List<String> server = new ArrayList<>();
    public static final List<Integer> protocol = new ArrayList<>();
    public static final List<String> version = new ArrayList<>();


    public void setApp() {
        server.add("www.google.com");
        server.add("www.java.com");
        server.add("www.test.com");
        protocol.add(3333);
        protocol.add(80);
        protocol.add(110);
        version.add("matrix");
        version.add("stone");
        version.add("jet");
    }


    public Phone(String mark, String model, String producer, String mode, Integer yearOfProduction, Double value, String appName){
    super(producer, mode, yearOfProduction, value);
        this.mark = mark;
        this.model = model;
        this.value = value;
        this.appName = appName;
        setApp();
        switch (appName) {
            case "gmail":
                serverAddress = server.get(0);
                portNumber = protocol.get(2);
                versionName = version.get(0);
                break;
            case "maps":
                serverAddress = server.get(1);
                portNumber = protocol.get(0);
                versionName = version.get(2);
                break;
            case "pictures":
                serverAddress = server.get(2);
                portNumber = protocol.get(1);
                versionName = version.get(1);
                break;
            default:
                serverAddress = "error 404";
                portNumber = 0;
                this.versionName = "no version";
                break;
        }
    }
    @Override
    public String toString(){
        return this.mark + " " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome I'm your " + this.model + "!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.phone == this)
        {
            if(buyer.cash >= price)
            {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.phone = this;
                seller.phone = null;
                System.out.println(buyer + " just buy " + this);
            }
            else System.out.println(buyer + " don't have enough money.");
        }
        else System.out.println("This is not he's phone!");
    }
    public void installAnApp(String appName)
    {
        apps.add(appName);
    }
    public void installAnApp(String appName, Double version)
    {
        apps.add(appName + " " + version);
    }
    public void installAnApp(String appName, Double version, String serverAddress)
    {
        apps.add(appName + " " + version + " source" + serverAddress);
    }
    public void installAnApp(List<String> appsList)
    {
        apps.addAll(appsList);
    }
    public void installAnnApp(URL address)
    {
        apps.add(address.getFile()+ " " + " protocol :" + address.getProtocol() + " source:" + address.getHost());
    }

}

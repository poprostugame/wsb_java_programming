package com.company.devices;

public class Application {
    private String appName;
    private Double version;
    private Double price;

    public Application(String appName, Double version,
                       Double price){
        this.appName = appName;
        this.version = version;
        this.price = price;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String toString(){
        return this.appName + " " + this.version;
    }
}

package com.company;

import java.util.Date;

public class Car {
    private String name;
    private String manufacturer;
    private Date date;
    private float engineVolume;

    public Car(String name, String manufacturer, Date date, float engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.date = date;
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return name + " " + engineVolume + "L " + manufacturer + " (" + date + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }
}

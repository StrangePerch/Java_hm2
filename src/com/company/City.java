package com.company;

import java.util.Date;

public class City {
    private String name;
    private int postalCode;
    private float area;
    private Date founded;
    private int population;

    public City(String name, int postalCode, float area, Date founded, int population) {
        this.name = name;
        this.postalCode = postalCode;
        this.area = area;
        this.founded = founded;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

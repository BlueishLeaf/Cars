package com.example.killian.cars.Models;

import java.util.ArrayList;

/**
 * Created by Killian on 06/07/2016.
 */

public class Car {

    //Car is the framework for the information page of each car in the catalog
    //Attributes for a car's id, model, color, description, price, and image URL

    private int id;
    private String model;
    private String color;
    private String description;
    private Double price;
    private ArrayList<String> urls;

    public Car(final int id, final String model, final String color, final String description, final Double price, final ArrayList<String>urls){

        this.id = id;
        this.model = model;
        this.color = color;
        this.description = description;
        this.price = price;
        this.urls = urls;
    }

    public int getId(){
        return id;
    }

    public String model(){
        return model;
    }

    public String color(){
        return color;
    }

    public String description(){
        return description;
    }

    public double price(){
        return price;
    }

    public ArrayList<String> urls(){
        return urls;
    }
}

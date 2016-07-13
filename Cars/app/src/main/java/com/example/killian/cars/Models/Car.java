package com.example.killian.cars.Models;

import java.util.List;

/**
 * This class (@code Car) governs the framework for the car object and its corresponding variables
 *
 * @author Killian.
 * @since 11/07/2016.
 */

public class Car {

    //Car is the framework for the information page of each car in the catalog
    //Attributes for a car's id, model, color, description, price, and image URL

    private int id;
    private String model;
    private String color;
    private String description;
    private String price;
    private List<String> urls;

    public Car(final int id, final String model, final String color,  final String price, final String description, final List<String>urls){

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

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public String getDescription(){
        return description;
    }

    public String getPrice(){
        return price;
    }

    public List<String> urls(){
        return urls;
    }

}

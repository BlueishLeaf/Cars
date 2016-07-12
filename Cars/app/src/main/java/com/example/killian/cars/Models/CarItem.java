package com.example.killian.cars.Models;

/**
 * @author Killian.
 * @since 11/07/2016.
 */

public class CarItem {

    //CarItem is the framework for the cards of cars in the catalog
    //CarItem will have an id, an image URL, and a model

    private int id;
    private String model;
    private String url;

    public CarItem(final int id, final String model, final String url){

        this.id = id;
        this.model = model;
        this.url = url;
    }

    public int getId(){
        return id;
    }

    public String getModel(){
        return model;
    }

    public String getUrl(){
        return url;
    }
}

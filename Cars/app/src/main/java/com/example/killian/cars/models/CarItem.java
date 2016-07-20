package com.example.killian.cars.models;

/**
 * This class (@code CarItem) governs the framework for the cards of cars in the catalog
 *
 * @author Killian.
 * @since 11/07/2016.
 */
public class CarItem {

    private int id;
    private String model;
    private String url;

    public CarItem(final int id, final String model, final String url) {
        this.id = id;
        this.model = model;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getUrl() {
        return url;
    }

}

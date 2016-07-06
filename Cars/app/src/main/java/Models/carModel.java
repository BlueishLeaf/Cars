package Models;

/**
 * Created by Killian on 06/07/2016.
 */
public class carModel {
    //model: id int, model string, color string, price double, desc string, URLs
    private int id;
    private String model;
    private String color;
    private String description;
    private Double price;
    private String url;

    public carModel(final int id, final String model, final String color, final String description, final Double price, final String url){
        this.id = id;
        this.model = model;
        this.color = color;
        this.description = description;
        this.price = price;
        this.url = url;
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
    public String url(){
        return url;
    }
}

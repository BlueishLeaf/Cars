package com.example.killian.cars;

/**
 * Created by Killian on 05/07/2016.
 */
public class Person {
    private int age;
    private String name;
    private String hairColour;

    public Person(final int age, final String name, final String hairColour) {
        this.age = age;
        this.name = name;
        this.hairColour = hairColour;

    }

    public int getAge(){
        return age;
    }

    public String getname(){
        return name;
    }

    public String gethairColour(){
        return hairColour;
    }
}

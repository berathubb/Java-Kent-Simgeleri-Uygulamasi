package com.beratates.kentsimgeleri;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String country;
    int image;
    String architect;
    //int date;



    //Constructor
    public Landmark(String name, String country, int image, String architect ) {
        this.name = name;
        this.country = country;
        this.image = image;
        this.architect = architect;
       // this.date = date;


    }
}

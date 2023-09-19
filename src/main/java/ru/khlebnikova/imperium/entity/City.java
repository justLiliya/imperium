package ru.khlebnikova.imperium.entity;

import ru.khlebnikova.imperium.util.Structures;

public class City extends Structures {

    String cityName;
    int citySize;

    public City(String cityName, int citySize){
        super();
        this.cityName = cityName;
        this.citySize = citySize;
    }

    public String getName(){
        return this.cityName;
    }
}

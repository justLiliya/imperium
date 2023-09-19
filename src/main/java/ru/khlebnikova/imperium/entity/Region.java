package ru.khlebnikova.imperium.entity;

public class Region {

    String regionName;
    int regionSize;

    public Region(String regionName, int regionSize){
        super();
        this.regionName = regionName;
        this.regionSize = regionSize;
    }

    public String getName(){
        return this.regionName;
    }
}

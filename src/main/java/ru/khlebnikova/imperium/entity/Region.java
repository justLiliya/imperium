package ru.khlebnikova.imperium.entity;

import ru.khlebnikova.imperium.util.Structures;

public class Region extends Structures {

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

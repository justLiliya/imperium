package ru.khlebnikova.imperium.entity;

import ru.khlebnikova.imperium.util.Structures;

public class District extends Structures {

    String districtName;
    int districtSize;

    public District(String districtName, int districtSize){
        super();
        this.districtName = districtName;
        this.districtSize = districtSize;
    }

    public String getName(){
        return this.districtName;
    }
}

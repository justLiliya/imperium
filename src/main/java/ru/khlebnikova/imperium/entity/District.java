package ru.khlebnikova.imperium.entity;

public class District {

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

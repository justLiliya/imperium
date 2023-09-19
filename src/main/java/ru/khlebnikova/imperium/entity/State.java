package ru.khlebnikova.imperium.entity;

import java.util.ArrayList;
import java.util.List;

public class State {
    private static State status;
    static String statusName = "Russia";
    static List<Region> allRegions = new ArrayList<Region>();
    static List<District> allDistricts = new ArrayList<District>();
    static List<City> allSCities = new ArrayList<City>();


    public static State getState(){
        if (status == null){
            status = new State();
        }
        return status;
    }

    private State(){

    }

    public static void addCities(City s){
        allSCities.add(s);
    }

    public static void addRegion(Region r){
        allRegions.add(r);
    }

    public static String getRegion(int count){
       return allRegions.get(count).getName();
    }

    public static void addDistrict(District d){
        allDistricts.add(d);
    }

    public static String getDistrict(int count){
        return allDistricts.get(count).getName();
    }

    public static String getName(){
        return statusName;
    }

    public static String getSCities(int count){
        return allSCities.get(count).getName();
    }



}

package ru.khlebnikova.imperium.entity;

import ru.khlebnikova.imperium.util.Structures;

import java.util.ArrayList;
import java.util.List;

public class State {
    private static State status;
    static String statusName = "Russia";
    static List<Region> allRegion = new ArrayList<Region>();
    static List<Structures> allStructures = new ArrayList<Structures>();


    public static State getState(){
        if (status == null){
            status = new State();
        }
        return status;
    }

    private State(){

    }

    public static void addStructures(Structures st){
        allStructures.add(st);
    }

    public static void addRegion(Region r){
        allRegion.add(r);
    }

    public static String getRegion(int count){
       return allRegion.get(count).getName();
    }

    public static String getName(){
        return statusName;
    }

    public static Structures getStructure(int count){
        return allStructures.get(count);
    }

    public static String getStructureName(int count){
        return allStructures.get(count).getName();
    }


}

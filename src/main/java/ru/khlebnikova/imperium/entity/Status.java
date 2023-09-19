package ru.khlebnikova.imperium.entity;

import ru.khlebnikova.imperium.util.Structures;

import java.util.ArrayList;
import java.util.List;

public class Status {
    private static Status status;
    static String statusName = "Russia";
    static List<Structures> allStructures = new ArrayList<Structures>();


    public static Status getStatus(){
        if (status == null){
            status = new Status();
        }
        return status;
    }

    private Status(){

    }

    public static void addStructures(Structures st){
        allStructures.add(st);
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
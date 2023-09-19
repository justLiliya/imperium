package ru.khlebnikova.imperium.main;

import ru.khlebnikova.imperium.entity.City;
import ru.khlebnikova.imperium.entity.District;
import ru.khlebnikova.imperium.entity.Region;
import ru.khlebnikova.imperium.entity.State;

public class _Main {

    public static void main(String[] args) {
         State.getState();
         Region region = new Region("Татарстан", 10000);
         District district = new District("Верхнеуслонский", 1000);
         City city = new City("Иннополис", 500);
         State.addCities(city);
         State.addRegion(region);
         State.addDistrict(district);
         System.out.println("Мое государство: \n" + State.getName());
         System.out.println("Мой регион: " + State.getRegion(0));
         System.out.println("Мой район: " + State.getDistrict(0));
         System.out.println("Мой город: " + State.getSCities(0));
    }

}

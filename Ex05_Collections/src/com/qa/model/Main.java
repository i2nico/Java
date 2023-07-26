package com.qa.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Cat C1 = new Cat("Whiskers", 10);
        Cat C2 = new Cat("Midas", 8);
        Dog D1 = new Dog("Spot", 2);
        Rabbit R1 = new Rabbit("Peter", 2);
        Rabbit R2 = new Rabbit("Cottontail", 3);

        ArrayList<Animal> animalArrayList = new ArrayList<>();

        animalArrayList.add(C1);
        animalArrayList.add(C2);
        animalArrayList.add(D1);
        animalArrayList.add(R1);
        animalArrayList.add(R2);

        for (int i = 0; i < animalArrayList.size(); i++){
            System.out.println(animalArrayList.get(i).sayHello());
        }
    }
}
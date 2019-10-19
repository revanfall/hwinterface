package com.company;

public class HomeAnimal extends Animal {
    String name;
    boolean isVacinated;

    public HomeAnimal(int id, int age, int weight, String color, String name,Boolean isVacinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVacinated=isVacinated;
    }
}

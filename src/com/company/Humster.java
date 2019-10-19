package com.company;

public class Humster extends HomeAnimal implements Speakable {

    public Humster(int id, int age, int weight, String color, String name, Boolean isVacinated) {
        super(id, age, weight, color, name, isVacinated);
    }

    @Override
    public String getVoice() {
        return "Ts, ts, ts, ts";
    }
}

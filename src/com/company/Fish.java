package com.company;

public class Fish extends Animal implements Speakable {
    public Fish(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return "...";
    }
}

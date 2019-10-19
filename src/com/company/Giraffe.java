package com.company;

public class Giraffe extends Animal implements Speakable {
    public Giraffe(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return "I'm a wild animal";
    }
}

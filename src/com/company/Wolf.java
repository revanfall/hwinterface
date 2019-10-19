package com.company;

public class Wolf extends Animal implements Speakable,Predator {
    public Wolf(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return "I am a wild animal";
    }

    @Override
    public void getWildVoice() {
        System.out.println("I'm hungry");
    }

    @Override
    public void eatMeat() {
        System.out.println("I've eaten somebody");
    }
}

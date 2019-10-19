package com.company;

public class Crocodile extends Animal implements Speakable,Predator{
    public Crocodile(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public void getWildVoice() {
        System.out.println("And I'm hungry");

    }

    @Override
    public String getVoice() {
        return "I am a wild animal";
    }

    @Override
    public void eatMeat() {
        System.out.println("I've eaten somebody");
    }
}

package com.company;

public class Lion extends Animal implements Speakable,Predator{
    public Lion(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return "I'm wild animal";
    }

    @Override
    public void getWildVoice() {
        System.out.println("And I'm hungry");

    }

    @Override
    public void eatMeat() {
        System.out.println("I've eaten somebody");
    }
}

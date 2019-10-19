package com.company;

public class Dog extends HomeAnimal implements Speakable, Guidable {
    boolean isTrained;

    public Dog(int id, int age, int weight, String color, String name, Boolean isVacinated, boolean isTrained) {
        super(id, age, weight, color, name, isVacinated);
        this.isTrained=isTrained;
    }

    @Override
    public String getVoice() {
        return "Hello, my name is "+name+" woof,woof";
    }

    @Override
    public void getHome() {
        if(isTrained==true)
            System.out.println("I can take you home");
        else System.out.println("I can't take you home");
    } // чтобы не создавать 2 отдельных класса с собакой и собакой-поводырём
}

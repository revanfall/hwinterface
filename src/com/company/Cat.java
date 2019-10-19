package com.company;

public class Cat extends HomeAnimal implements Speakable {
    public Cat(int id, int age, int weight, String color, String name, Boolean isVacinated) {
        super(id, age, weight, color, name, isVacinated);
    }

    @Override
    public String getVoice() {
        return "Hello, my name is"+ name+ " ,purrr";
    }
}

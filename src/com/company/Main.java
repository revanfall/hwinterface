package com.company;

public class Main {

    public static void main(String[] args) {
	Wolf wolf=new Wolf(1,4,15,"black");
        System.out.println(wolf.getVoice());
        wolf.getWildVoice();
        wolf.eatMeat();
    Dog dog=new Dog(2,5,10,"Green","Gleb",true,true);
        System.out.println(dog.getVoice());
        dog.getHome();

    }
}

package com.sparta.kch;

public class Cat extends Animal{
    public Cat(String name, String breed, int age){
        super(name,breed,age);
    }
    //Overwriting
    @Override
    public void play(){
        System.out.println(super.getName() + " does not want to play");
    }
}

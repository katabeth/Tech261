package com.sparta.kch;

public class Cat extends Animal{
    public Cat(String name, String breed, int age){
        super(name,breed,age);
    }
    //Overwriting
    @Override //stops from unnecessary or unwanted overloading
    public void play(){
        System.out.println(super.getName() + " does not want to play");
    }
}
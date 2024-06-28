package com.sparta.kch;


import static com.sparta.kch.logger.LoggerInitialiser.*;


public class Cat extends Animal{

    public Cat(String name, String breed, int age){
        super(name,breed,age);
    }
    //Overwriting
    @Override //stops from unnecessary or unwanted overloading
    public void play(){
        //System.out.println(super.getName() + " does not want to play");
        logger.info(super.getName() + " does not want to play");
    }

    @Override
    public void eat() {
        //System.out.println("Cat is eating");
        logger.info("Cat is eating");
    }
    public void climb(){
        //System.out.println("Cat is climbing!");
        logger.info("Cat is climbing!");
    }
}

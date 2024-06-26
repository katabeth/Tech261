package com.sparta.kch;

public class Dog extends Animal implements Drinkable{

    public Dog(String name, String breed, int age){
        super(name,breed,age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    //Overloading
    //1. Return type
    //2. Type of parameters
    //3. Order of parameters
    public void play(String name){
        System.out.println(name + " wants to play with" + super.getName());
    }

    @Override
    public void drink() {
        Drinkable.doSomething();
    }

    @Override
    public String goToSleep() {
        return "";
    }
}

package com.sparta.kch;

//Abstract deals with State and Behaviour
public abstract class Animal {
    private String name;
    private String breed;
    private int age;

    public Animal (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void play(){
        System.out.println(name + " wants to play");
    }
    /*
    public void eat() {
        System.out.println("animal is eating"); //everyone will override this
    }
    */
    public abstract void eat(); //Forced to be implemented in subclasses

}

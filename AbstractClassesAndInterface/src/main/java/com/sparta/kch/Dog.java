package com.sparta.kch;

public class Dog extends Animal{

    public Dog(String name, String breed, int age){

    }
    
    public static void main(String[] args){
        Dog max = new Dog("Max", "Terrier", 2);
        Dog fido = new Dog("Fido", "Cockerspaniel", 5);
        System.out.println(max.getName());
    }

}

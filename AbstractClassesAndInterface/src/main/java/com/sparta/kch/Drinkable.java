package com.sparta.kch;

public interface Drinkable extends Sleepable{

    int max = 10; //Inherently public static final
    void drink();
    String goToSleep();

    //Public, Private, Default, Protected

    default void print(){ //A standard method body - for batch implementation of functions that CANNOT be changed
        printFromInterface();
    }

    private static void printFromInterface() { //A private method for use within the interface
        System.out.println("I am printing form an interface");
    }
    static void doSomething(){ //A lovely static method
        System.out.println("Static method from an Interface");
    }
}

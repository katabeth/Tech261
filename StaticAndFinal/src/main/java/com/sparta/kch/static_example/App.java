package com.sparta.kch.static_example;

public class App {
    public static void main(String[] args) {
        Spartan kat = new Spartan();
        Spartan alex = new Spartan();

        kat.setName("Kat"); //Instance method - called from objects
        alex.setName("Alex");

        System.out.println(kat.getName());
        System.out.println(alex.getName());

        Spartan.printSpartan(kat); //Static method - called from a class
    }
}

package com.sparta.kch.factory;

public class AnimalFactory {
    // Gives access but hides objects
    public static Speakable getAnimal(String animal){
        return switch (animal) {
            case "Dog" -> new Dog();
            case "Cat" -> new Cat();
            case "Goldfish" -> new Goldfish();
            //case "Hound Dog" -> new Dog("UwU");
            default -> null;
        };
    }
}

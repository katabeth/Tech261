package com.sparta.kch;

public class App {
    public static void main(String[] args){
        Dog dog = new Dog("Max", "Cocker Spaniel", 2);
        Cat cat = new Cat("Jasper", "Tabby", 2);
        Animal cat2 = new Cat("Lucky","Black",11);

        Animal[] animals = {dog, cat};
        //anti pattern - opposite of good practise - code smell
        ((Cat) cat2).play();
        cat.play();
        dog.play();


    }
}

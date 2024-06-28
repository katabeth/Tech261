package com.sparta.kch;

import com.sparta.kch.logger.CustomFormatter;
import com.sparta.kch.logger.LoggerInitialiser;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sparta.kch.logger.LoggerInitialiser.*;

public class App extends LoggerInitialiser {

    public static void main(String[] args){
        setUpLogINFO();
        setUpLogFINEST();
        Dog dog = new Dog("Max", "Cocker Spaniel", 2);
        Cat cat = new Cat("Jasper", "Tabby", 2);
        Animal cat2 = new Cat("Lucky","Black",11);

        Animal[] animals = {dog, cat};
        //anti pattern - opposite of good practise - code smell
        ((Cat) cat2).play();
        logger.info("This is Main");
        cat.play();
        dog.play();


    }
}

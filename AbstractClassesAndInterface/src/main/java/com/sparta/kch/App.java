package com.sparta.kch;

import com.sparta.kch.logger.CustomFormatter;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args){
        Dog dog = new Dog("Max", "Cocker Spaniel", 2);
        Cat cat = new Cat("Jasper", "Tabby", 2);
        Animal cat2 = new Cat("Lucky","Black",11);

        logger.setUseParentHandlers(false);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        consoleHandler.setFormatter(new CustomFormatter());

        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log",false); //log files should be in the gitignore
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        Animal[] animals = {dog, cat};
        //anti pattern - opposite of good practise - code smell
        ((Cat) cat2).play();
        cat.play();
        dog.play();


    }
}

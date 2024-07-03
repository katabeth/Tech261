package com.sparta.kch;

//import java.util.logging.*;

import com.sparta.kch.logging.LoggerInitialiser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    final static Logger logger = LoggerInitialiser.getLogger(Level.ALL,false);

    public static void main(String[] args) {
        //  finestLogger.log(Level.INFO, "This is an info message");
        App2.testCase();
        logger.info("This is also an info message");
        logger.warning("This is a warning message");
        logger.fine("We're all fine here thank you");



        //finestLogger.setLevel(Level.OFF);         //Turns off the finestLogger - stops any code from doing anything with it
        /*
        You print at that level and higher - What's in the level? we decide
        Class LogManager is a singleton
        Default handler level is INFO
        Severe - Highest Value
        Warning
        Info
        Config
        Fine
        Finer
        Finest - Lowest Value
         */



    }
}

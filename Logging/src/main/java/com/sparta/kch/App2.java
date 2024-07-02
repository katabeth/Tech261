package com.sparta.kch;

import com.sparta.kch.logging.LoggerInitialiser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App2 {
    final static Logger logger = LoggerInitialiser.getLogger(Level.ALL, Level.FINE, false, false);
    public static void testCase(){
        logger.fine("Is this reached?");
    }
}

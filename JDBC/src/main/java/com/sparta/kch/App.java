package com.sparta.kch;

import com.sparta.kch.logging.LoggerInitialiser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    // Connection
    // Statements
    // Results
    final static Logger logger = LoggerInitialiser.getLogger(Level.ALL, true);
    public static void main(String[] args){
        ConnectToDatabase.queryDatabase();
    }
}

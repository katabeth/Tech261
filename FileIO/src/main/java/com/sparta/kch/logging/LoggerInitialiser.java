package com.sparta.kch.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerInitialiser{
    // Use this in the class you want:
    //final static Logger logger = LoggerInitialiser.getLogger(Level.FINE, Level.ALL, true);
    public static final Logger logger = Logger.getLogger(LoggerInitialiser.class.getName());

    public static Logger getLogger (Level fileLevel,Level consoleLevel, boolean append){
        setupConsoleHandler(consoleLevel);
        setupFileHandler(fileLevel,append);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        return logger;
    }
    public static void setupConsoleHandler(Level level) {

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new CustomFormatterTerminal());
        consoleHandler.setLevel(level);
        logger.addHandler(consoleHandler);

    }
    public static void setupFileHandler(Level level, boolean append){
        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log",append); //log files should be in the gitignore
            fileHandler.setLevel(level);
            fileHandler.setFormatter(new CustomFormatterFile());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to set up file handler");
            throw new RuntimeException(e);
        }
    }

}

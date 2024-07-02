package com.sparta.kch;

import com.sparta.kch.logging.LoggerInitialiser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    final static Logger logger = LoggerInitialiser.getLogger(Level.FINE, Level.ALL, false);
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader
                            ("src/main/resources/employees-corrupted(in).csv"));
            // Avoid first line
            // print rest of document

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
                logger.info(line.replace(",", ",\t"));
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

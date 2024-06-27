package com.sparta.kch.logging;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    public static int index = 8;
    @Override
    public String format(LogRecord record) {
        String[] colour = {"\u001B[31m ","\u001B[33m ","\u001B[32m "
                ,"\u001B[34m ","\u001B[36m ","\u001B[35m ","\u001B[37m ", "\u001B[30m "};
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd MMM");
        DateTimeFormatter myTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        if (index >= (colour.length -2)){
            index = -1;
        }
        index ++;
        //TODO set as string builder
        //TODO fix with log files
        //TODO figure out how to reach end of array
        return colour[index] + LocalTime.now().format(myTimeFormat)
                + " " + LocalDate.now().format(myDateFormat)
                +" in application: " + record.getSourceClassName()
                + "\n" + colour[index+1] + record.getLevel()
                +" " + record.getMessage()
                + "\n";
    }
}
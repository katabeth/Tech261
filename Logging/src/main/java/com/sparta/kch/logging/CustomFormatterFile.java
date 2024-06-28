package com.sparta.kch.logging;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatterFile extends Formatter {
    @Override
    public String format(LogRecord record) {

        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd MMM");
        DateTimeFormatter myTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        //TODO set as string builder
        //TODO fix with log files
        //TODO figure out how to reach end of array
        return LocalTime.now().format(myTimeFormat)
                + " " + LocalDate.now().format(myDateFormat)
                +" in application: " + record.getSourceClassName()
                + "\n" + record.getLevel()
                +" " + record.getMessage()
                + "\n";
    }
}
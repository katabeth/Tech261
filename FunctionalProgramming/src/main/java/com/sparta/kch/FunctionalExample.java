package com.sparta.kch;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionalExample {
    public static void main(String[] args) {
        // Stream
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Leonardo",
                "Michelangelo",
                "Donatello",
                "Raphael"));
        names.stream()
                .map(String::toUpperCase)
                //.peek(name -> System.out.println(name))
                .filter(name -> name.contains("O"))
                .forEach(System.out::println);
    }
}

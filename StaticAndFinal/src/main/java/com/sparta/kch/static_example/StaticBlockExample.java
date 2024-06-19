package com.sparta.kch.static_example;

import java.util.ArrayList;

public class StaticBlockExample {
    private static ArrayList<String> names = new ArrayList<>();

    static{ //A  block whihc is run once when the class is loaded in JVm memory
        names.add("Kat");
        names.add("Alex");
    }

    public static void main(String[] args) {
        System.out.println(names);
    }
}

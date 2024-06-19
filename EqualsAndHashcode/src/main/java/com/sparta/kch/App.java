package com.sparta.kch;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello".hashCode());
        Spartan spartan1 = new Spartan("Kat","Carver-Hardy");
        Spartan spartan2 = new Spartan("Kat","Carver-Hardy");

        System.out.println(spartan1 == spartan2);
        System.out.println(spartan1.equals(spartan2));
        //Why is this false?
    }
}

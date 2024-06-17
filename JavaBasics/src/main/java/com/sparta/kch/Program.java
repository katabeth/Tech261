package com.sparta.kch;
//Readability, Maintainable, Testability
/*
                Logic is wrong, with overlapping boundaries, unnecessary searches and unchanging variable
                All code should never all exist in the main
                Each method should only do one thing
                    e.g. initialising, logic, printing
*/


public class Program {
    public static void main(String[] args) { //entry point (methods)
        int timeOfDay = 21;
        //type, name, value
        //strongly typed language (TYPE must always be declared)
        //statically typed language (TYPE cannot be changed from the declaration)

        getGreeting(timeOfDay);


    }
    //Cannot be seen outside of class, -- , doesn't return a value
    private static void getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) { //always a boolean
            System.out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
}
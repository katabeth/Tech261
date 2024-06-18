package com.sparta.kch;
//Readability, Maintainable, Testability
/*
    Logic is wrong, with overlapping boundaries, unnecessary searches and unchanging variable
    All code should never all exist in the main
    Each method should only do one thing
        e.g. initialising, logic, printing
    Do not make external behaviour changes before checking user stories and stakeholder wants
*/
public class Program {
    public static void main(String[] args) { //entry point (methods)
        int timeOfDay = 12;
        //TYPE, NAME, VALUE
        //strongly typed language (TYPE must always be declared)
        //statically typed language (TYPE cannot be changed from the declaration)
        System.out.println(getGreeting(timeOfDay));
    }
    //Private means cannot be seen outside of class
    //Static means
    //void means doesn't return a value
    //Needs to be public to be tested
    public static String getGreeting(int timeOfDay) {
        String greeting;

        if (timeOfDay > 24 || timeOfDay < 0){  //Checking time inside 0 to 24
            greeting = "Invalid time";
        } else if (timeOfDay < 5){
            greeting = "Good night!";
        } else if (timeOfDay < 12) {
            greeting = "Good morning!";
        } else if (timeOfDay < 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
        /*
        if (timeOfDay >= 5 && timeOfDay <= 12) { //always a boolean
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        */

    }
}
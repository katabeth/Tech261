package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {
    /*
    @Test //Carries Metadata. Passes this to the JVM --> Run this with JUnit not Java
    @DisplayName("This is my first test")
    public void basicTest(){
        Assertions.assertTrue(5 == 6);
    }
    */
    //Evening number
    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good evening!") //is not always readable
    void checkThat21GivesGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
        //Assertions.assertEquals("Good evening!", Program.getGreeting(21));
        // The variables don't need to be made for the code to function
    }
    //Time as a negative -- invalid time
    @Test
    @DisplayName("Given a time of -1, then the output should be Invalid Time")
    void checkThatMinus1GivesErrorMessage(){
        int time = -1;
        String expectedGreeting = "Invalid time";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    //Time above 24 -- invalid time
    @Test
    @DisplayName("Given a time of greater than 24, then the output should be Invalid time")
    void checkThat25GivesErrorMessage(){
        int time = 25;
        String expectedGreeting = "Invalid time";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    //Between 12 - 18 -- Good afternoon!
    @Test
    @DisplayName("Given a time of 12, then the greeting should be Good afternoon!")
    void checkThat12GivesGoodAfternoon(){
        int time = 12;
        String expectedGreeting = "Good afternoon!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    //Between 18 - 24 -- Good evening!
    @Test
    @DisplayName("Given a time of 18, then the output should be Good evening!")
    void checkThat18GivesGoodEvening(){
        int time = 18;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }
    //Between 0 - 5 -- Good night!
    @Test
    @DisplayName("Given a time of 0, then the output should be Good night!")
    void checkThat0GivesGoodNight(){
        int time = 0;
        String expectedGreeting = "Good night!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);

    }
    //Between 5 - 12 -- Good morning!
    @Test
    @DisplayName("Given a time of 5, then the output should be Good morning!")
    void checkThat5GivesGoodMorning(){
        int time = 5;
        String expectedGreeting = "Good morning!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
    }

    //At least 3 tests to test all 3 outputs, then check the boundary cases and exceptions
    //Between 0 - 5 -- Good night!
    //Between 5 - 12 -- Good morning!
    //Between 12 - 18 -- Good afternoon!
    //Between 18 - 24 -- Good evening!
    //All cases within 0-24 -- always give an output,
    //Output is always a value
    //Time in words?
    //Check if time is an int -- not usually needed


}

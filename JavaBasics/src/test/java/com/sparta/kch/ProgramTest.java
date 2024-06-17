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
    @Test
    @DisplayName("Given a time of 21, then the greeting should be Good Evening") //is not always readable
    void checkThat21GivesGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good evening!";
        String actualGreeting = Program.getGreeting(time);
        Assertions.assertEquals(expectedGreeting, actualGreeting);
        //Assertions.assertEquals("Good evening!", Program.getGreeting(21));
        // The variables don't need to be made for the code to function
    }


}

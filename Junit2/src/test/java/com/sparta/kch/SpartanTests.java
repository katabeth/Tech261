package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SpartanTests {

    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME) // Repeats the test x times
    @DisplayName("Are tests even real?")
    void simpleTest(){
        Assertions.assertEquals(1,1);
        
    }


}

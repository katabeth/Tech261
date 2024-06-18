package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CKArrayTest {
    //Print numbers in order
    //Number /3 = Fizz
    //Number /5 = Buzz
    //Number /5 & /3 = FizzBuzz

    //Most simple test - Does 1 give 1?
    @Test
    @DisplayName("Input number is 1, then print number 1")
    void InputOf1Returns1() {
        //Arrange
        //int input = 1;
        //String expected = "1";
        //Act
        //String actual = FizzBuzz.getFizzBuzzFrom(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
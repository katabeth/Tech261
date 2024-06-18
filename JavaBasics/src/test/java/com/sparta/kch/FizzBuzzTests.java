package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    //Print numbers in order
    //Number /3 = Fizz
    //Number /5 = Buzz
    //Number /5 & /3 = FizzBuzz

    //Most simple test - Does 1 give 1?
    @Test
    @DisplayName("Input number is 1, then print number 1")
    void givenInputOf1AppReturns1() {
        //Arrange
        int input = 1;
        String expected = "1";
        //Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    //Numbers after 1
    @ParameterizedTest
    @CsvSource({            //Copying the format of a CSV so can input a whole file
            "2 , 2",        //Will convert the input string to an int if possible
            "4 , 4",
            "7 , 7",
            "8 , 8"
    })
    @DisplayName("Input number is not divisible by 5 or 3, then print number as output")
    void givenInputNotDivBy3Or5AppReturnsNumber(int input, String expected) {
        //Arrange -- sorted
        //Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    //Fizz time
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("Input is divisible by 3, then print word Fizz")
    void givenInputDivisibleBy3AppReturnsFizz(int input) {
        String expected = "Fizz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    //Buzz time
    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    @DisplayName("Input is divisible by 5, then print word Buzz")
    void givenInputDivisibleBy5AppReturnsBuzz(int input) {
        String expected = "Buzz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }
    //FizzBuzz Baby
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    @DisplayName("Input is divisible by 3 and 5, then print word FizzBuzz")
    void givenInputDivisibleBy3And5AppReturnsFizzBuzz(int input) {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }
}
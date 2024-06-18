package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    //Print numbers in order
    //Number /3 = Fizz
    //Number /5 = Buzz
    //Number /5 & /3 = FizzBuzz

    //Most simple test - Does 1 give 1?
    @Test
    @DisplayName("When the input number is 1, then print number 1")
    void givenInputOf1AppReturns1(){
        //Arrange
        int input = 1;
        String expected = "1";
        //Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    //Fizz time
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    @DisplayName("When the input is divisible by 3, then print word Fizz")
    void givenInputDivisibleBy3AppReturnsFizz(int input){
        String expected = "Fizz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }




}
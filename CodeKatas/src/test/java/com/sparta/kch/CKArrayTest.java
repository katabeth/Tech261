package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CKArrayTest {
    /*
    Given an array of integers, convert them to a single int made up of the digits
    for example the array:
        int[] numbers = {1, 0, 2, 4}
        should return the int 1024.
    An empty Array should return 0
    Use TDD and ask if you need any requirements clarified
    */

    //Most simple test - Does an array of 12345 give an output of 12345?
    @Test
    @DisplayName("Input array is 1,2,3,4,5, then print number 12345")
    void inputOf12345Returns12345() {
        //Arrange
        int[] input = {1,2,3,4,5};
        int expected = 12345;
        //Act
        int actual = CKArrayMain.getCalcVal(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    //Array starting with 0
    @Test
    @DisplayName("Input array is 0,1,2,3, then print number 123")
    void inputOf0123Returns123(){
        int[] input = {0,1,2,3};
        int expected = 123;
        int actual = CKArrayMain.getCalcVal(input);
        Assertions.assertEquals(expected, actual);
    }
    //Checking if only first 0 is removed
    @Test
    @DisplayName("Input array is 1,0,2,4 then print number 1024")
    void inputOf1034Returns1034(){
        int[] input = {1,0,2,4};
        int expected = 1024;
        int actual = CKArrayMain.getCalcVal(input);
        Assertions.assertEquals(expected, actual);
    }
    //Checking if empty array returns 0
    @Test
    @DisplayName("Input array is empty then print number 0")
    void inputOfBlankReturns0(){
        int[] input = {};
        int expected = 0;
        int actual = CKArrayMain.getCalcVal(input);
        Assertions.assertEquals(expected, actual);
    }
    //If an entry is negative
    @Test
    @DisplayName("Input array contains negative numbers then print number them as positive")
    void inputOf12neg34Returns1234(){
        int[] input = {1,2,-3,4};
        int expected = 1234;
        int actual = CKArrayMain.getCalcVal(input);
        Assertions.assertEquals(expected, actual);
    }
}
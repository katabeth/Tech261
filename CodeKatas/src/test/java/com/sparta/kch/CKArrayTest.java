package com.sparta.kch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CKArrayTest {
    //An array like this {1, 23, 4, 5} should return 12345 and an array like this {0, 1, 2, 3} should return 123
    //An empty Array should return 0

    //Most simple test - Does an array of 12345 give an output of 12345?
    @Test
    @DisplayName("Input array is 1,2,3,4,5, then print number 12345")
    void inputOf12345Returns12345() {
        //Arrange
        int[] input = {1,2,3,4,5};
        String expected = "12345";
        //Act
        String actual = CKArrayMain.getCalcVal(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    //Array starting with 0
    @Test
    @DisplayName("Input array is 0,1,2,3, then print number 103")
    void inputOf0123Returns123(){
        int[] input = {0,1,2,3};
        String expected = "123";
        String actual = CKArrayMain.getCalcVal(input);
        Assertions.assertEquals(expected, actual);
    }
    //Checking if only first 0 is removed
    @Test
    @DisplayName("Input array is 1,0,3,4 then print number 1034")
    void inputOf1034Returns1034(){
        int[] input = {1,0,3,4};
        String expected = "1034";
        String actual = CKArrayMain.getCalcVal(input);
        Assertions.assertEquals(expected, actual);
    }
}
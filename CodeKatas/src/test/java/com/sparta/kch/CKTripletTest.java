package com.sparta.kch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
public class CKTripletTest {
    //{ 2, 3, 3, 3, 5, 7 } returns true
    @Test
    @DisplayName("Input array is 2,3,3,3,5,7, then return true")
    void inputOf2333575ReturnsTrue() {
        //Arrange
        int[] input = {2,3,3,3,5,7};
        boolean expected = true;
        //Act
        boolean actual = CKTripletMain.isTripletPresent(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    //{ 3, 4, 5, 1, 2 } returns false
    @Test
    @DisplayName("Input array is 3,4,5,1,2, then return false")
    void inputOf34512ReturnsFalse() {
        //Arrange
        int[] input = {3,4,5,1,2};
        boolean expected = false;
        //Act
        boolean actual = CKTripletMain.isTripletPresent(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input array is too short")
    void inputOf12ReturnsFalse() {
        //Arrange
        int[] input = {1,2};
        boolean expected = false;
        //Act
        boolean actual = CKTripletMain.isTripletPresent(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input array is null")
    void inputOfNullReturnsFalse() {
        //Arrange
        int[] input = null;
        boolean expected = false;
        //Act
        boolean actual = CKTripletMain.isTripletPresent(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
}

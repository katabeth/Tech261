package com.sparta.kch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
public class CKPalindromeTest {

    @Test
    @DisplayName("Input string /'Dad' Returns true")
    void inputOfDadReturnsTrue() {
        //Arrange
        String input = "Dad";
        boolean expected = true;
        //Act
        boolean actual = CKPalindromeMain.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string /'Race car' Returns false")
    void inputOfRace_carReturnsTrue() {
        //Arrange
        String input = "Race car";
        boolean expected = false;
        //Act
        boolean actual = CKPalindromeMain.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string shorter than 3 Returns false")
    void inputOfaaReturnsTrue() {
        //Arrange
        String input = "aa";
        boolean expected = false;
        //Act
        boolean actual = CKPalindromeMain.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string Null Returns false")
    void inputOfNullReturnsTrue() {
        //Arrange
        String input = null;
        boolean expected = false;
        //Act
        boolean actual = CKPalindromeMain.isPalindrome(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
}

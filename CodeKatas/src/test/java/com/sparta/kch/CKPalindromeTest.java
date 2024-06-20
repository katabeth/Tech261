package com.sparta.kch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CKPalindromeTest {

    @Test
    @DisplayName("Input string /'Dad' Returns true")
    void inputOfDadReturnsTrue() {
        //Arrange
        String input = "Dad";
        boolean expected = true;
        //Act
        boolean actual = CKPalindromeMain.isWordPalindrome(input);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string /'Race car' Returns false")
    void inputOfRace_carReturnsTrue() {
        String input = "Race car";
        boolean expected = false;
        boolean actual = CKPalindromeMain.isWordPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string shorter than 3 Returns false")
    void inputOfaaReturnsTrue() {
        String input = "aa";
        boolean expected = false;
        boolean actual = CKPalindromeMain.isWordPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string Null Returns false")
    void inputOfNullReturnsTrue() {
        String input = null;
        boolean expected = false;
        boolean actual = CKPalindromeMain.isWordPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
}

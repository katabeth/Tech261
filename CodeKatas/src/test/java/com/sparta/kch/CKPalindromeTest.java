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
    
}

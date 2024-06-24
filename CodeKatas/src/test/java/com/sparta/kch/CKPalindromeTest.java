package com.sparta.kch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CKPalindromeTest {

    @Test
    @DisplayName("Input string /'Dad' Returns true")
    void testDadReturnsTrue() {
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
    void testRace_carReturnsTrue() {
        String input = "Race car";
        boolean expected = false;
        boolean actual = CKPalindromeMain.isWordPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string shorter than 3 Returns false")
    void testaaReturnsFalse() {
        String input = "aa";
        boolean expected = false;
        boolean actual = CKPalindromeMain.isWordPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Input string Null Returns false")
    void testNullReturnsTrue() {
        String input = null;
        boolean expected = false;
        boolean actual = CKPalindromeMain.isWordPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }
    //Sentence tests
    //No Palindromes
    @Test
    @DisplayName("Input sentence of /'The cat jumped over the hedge' to return /'None'")
    void testNoPalReturnFalse(){
        String input = "The cat jumped over the hedge";
        String expected = "None";
        String actual = CKPalindromeMain.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }
    //1 palindrome
    @Test
    @DisplayName("Input sentence of /'The dad jumped over the hedge' to return /'dad'")
    void testOnePalReturnWord(){
        String input = "The dad jumped over the hedge";
        String expected = "dad";
        String actual = CKPalindromeMain.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }
    //2 palindromes
    @Test
    @DisplayName("Input sentence of /'The dad jumped over the racecar' to return /'racecar'")
    void testTwoPalDiffLenReturnWord(){
        String input = "The dad jumped over the racecar";
        String expected = "racecar";
        String actual = CKPalindromeMain.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }
    //2 same length palindromes
    @Test
    @DisplayName("Input sentence of /'The racecar was deified' to return /'racecar and deified'")
    void testTwoPalSameLen(){
        String input = "The racecar was deified";
        String expected = "racecar and deified";
        String actual = CKPalindromeMain.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }
    //Non-alphabetic characters present inside a palindrome
    @Test
    @DisplayName("Input sentence of /'The ra1324cecar 12321 was deified' to return /'racecar and deified'")
    void testNonAlBeChar(){
        String input = "The ra1324cecar 12321 was deified";
        String expected = "racecar and deified";
        String actual = CKPalindromeMain.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }
    //2 identical palindromes
    @Test
    @DisplayName("Input sentence of /'The racecar jumped over the racecar' to return /'racecar'")
    void testDuplPal(){
        String input = "The racecar jumped over the racecar";
        String expected = "racecar";
        String actual = CKPalindromeMain.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }
    //Testing extra spaces
    @Test
    @DisplayName("Input sentence of /'The racecar            jumped over the racecar' to return /'racecar'")
    void testUnneededSpaces(){
        String input = "       The racecar            jumped over the racecar           ";
        String expected = "racecar";
        String actual = CKPalindromeMain.getLongestPalindromes(input);
        Assertions.assertEquals(expected, actual);
    }
}

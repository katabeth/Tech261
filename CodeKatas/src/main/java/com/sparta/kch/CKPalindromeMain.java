package com.sparta.kch;

//Create a method which checks if a word is a palindrome.
//
//A palindrome is at minimum 3 characters long and is the same forwards as it is backwards
//Spaces should not be ignored
//The method should be case-insensitive
//
//For example: "Dad" is a palindrome, but "race car" is not.

public class CKPalindromeMain {
    public static boolean isPalindrome(String wordToCheck){
        //Checks if same forward as is backwards
        //Could break down in to char and compare
        //Case insensitive
        StringBuilder wordBackwards = new StringBuilder();
        char[] charWordToCheck = wordToCheck.toLowerCase().toCharArray();
        for (int element = wordToCheck.length()-1; element > 0; element--){
            wordBackwards.append(charWordToCheck[element]);
        }

        return wordBackwards.toString().equals(wordToCheck);
    }

}

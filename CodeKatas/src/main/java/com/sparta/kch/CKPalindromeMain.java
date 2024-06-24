package com.sparta.kch;

// Create a method which checks if a word is a palindrome.
//
// A palindrome is at minimum 3 characters long and is the same forwards as it is backwards
// Spaces should not be ignored
// The method should be case-insensitive
//
// For example: "Dad" is a palindrome, but "race car" is not.

import java.util.Arrays;

public class CKPalindromeMain {
    public static boolean isWordPalindrome(String wordToCheck){

        if (wordToCheck == null || wordToCheck.length() <3){
            return false;
        }
        StringBuilder wordBackwards = new StringBuilder(wordToCheck.toLowerCase());
        wordBackwards.reverse();
        return wordBackwards.toString().equals(wordToCheck.toLowerCase());
    }

    public static String getLongestPalindromes(String sentenceToCheck){

        String[] wordsInSentence = formatSentence(sentenceToCheck);
        int palindromeLength = 0;
        StringBuilder longestPalindromes = new StringBuilder("None");
        for (String word : wordsInSentence) {
            if (isWordPalindrome(word)) {
                if (word.length() > palindromeLength){
                    palindromeLength = word.length();
                    longestPalindromes.delete(0,longestPalindromes.length()).append(word);
                } else if (word.length() == palindromeLength && longestPalindromes.indexOf(word) == -1) {
                    longestPalindromes.append(" and ").append(word);
                }
            }
        }
        return longestPalindromes.toString();

    }
    private static String [] formatSentence(String sentenceToFormat){
        sentenceToFormat = sentenceToFormat
                            .replaceAll("[^a-zA-Z ]", "")
                            .toLowerCase();

        return  sentenceToFormat.split(" ");
    }


}

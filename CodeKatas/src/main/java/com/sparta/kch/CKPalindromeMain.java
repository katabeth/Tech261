package com.sparta.kch;

// Create a method which checks if a word is a palindrome.
//
// A palindrome is at minimum 3 characters long and is the same forwards as it is backwards
// Spaces should not be ignored
// The method should be case-insensitive
//
// For example: "Dad" is a palindrome, but "race car" is not.

public class CKPalindromeMain {
    public static boolean isWordPalindrome(String wordToCheck){
        // Checks if same forward as is backwards
        // Could break down in to char and compare
        // Case insensitive
        // char[] charWordToCheck = wordToCheck.toLowerCase().toCharArray();
        // for (int element = wordToCheck.length()-1; element >= 0; element--){
        //      wordBackwards.append(charWordToCheck[element]);
        // }
        if (wordToCheck == null || wordToCheck.length() <3){
            return false;
        }
        StringBuilder wordBackwards = new StringBuilder(wordToCheck.toLowerCase());
        wordBackwards.reverse();
        return wordBackwards.toString().equals(wordToCheck.toLowerCase());
    }
    // Create a program that finds the longest unique Palindrome in a sentence.
    // A sentence is defined as a single string of words separated by whitespace
    // If there are 2 or more largest palindromes, both should be returned
    // The program should ignore all non-alphabet characters

    public static String getLongestPalindromes(String sentenceToCheck){
        // Break sentence down into words
        // Check if word is palindrome
        // Return the word as a string if yes
        // Return None if no
        // Track the word length ... if the word is a palindrome and is longest then save and output
        // Ignore all non-alphabet characters

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
        sentenceToFormat = sentenceToFormat.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        return  sentenceToFormat.split(" ");
    }


}

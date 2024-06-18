package com.sparta.kch;

public class FizzBuzz {
    public static String getFizzBuzzFrom (int number){
        String fizzBuzzString = Integer.toString(number);
        if (number % 3 == 0){
            fizzBuzzString = "Fizz";
        } else if (number % 5 == 0){
            fizzBuzzString = "Buzz";
        }
        return fizzBuzzString;
    }
}

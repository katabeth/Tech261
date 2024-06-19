package com.sparta.kch;

public class CKTripletMain {
//    Create a method which checks whether an array of integers contains the same value 3 times in a row.
//
//    For example: { 2, 3, 3, 3, 5, 7 } returns true whilst { 3, 4, 5, 1, 2 } returns false
    public static boolean isTripletPresent(int[] numbers){
        //search through array in order
        //remember values if equal to one before
        //if count of equal values is 3 then return true
        //if value changes from previous reset counter
        if (numbers == null){
            return false;
        }
        for (int element = 2; element < numbers.length; element++) {
            if (numbers[element] == numbers[element -1] && numbers[element]==numbers[element-2]){
                return true;
            }
        }
        return false;
    }
}

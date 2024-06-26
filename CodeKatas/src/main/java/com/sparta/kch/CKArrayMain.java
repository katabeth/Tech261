package com.sparta.kch;

public class CKArrayMain {

        //An array like this {1, 23, 4, 5} should return 12345 and an array like this {0, 1, 2, 3} should return 123
        //An empty Array should return 0

    public static int getCalcVal(int[] numbers){
        StringBuilder concatArray = new StringBuilder();
        if (numbers.length == 0){
            concatArray.append("0");
        } else {
            for (int element : numbers) {
                concatArray.append(Math.abs(element));
            }
        }
        return Integer.parseInt(concatArray.toString());
    }
}

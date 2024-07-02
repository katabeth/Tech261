package com.sparta.kch;

public class ExceptionExample {
    static void getException(){
        System.out.println(1/0);
    }
    public static void getCheckedException() throws InterruptedException {
        // Generic Code
        throw new InterruptedException();

    }
}

package com.sparta.kch;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello";
        string1 = string1.toUpperCase(); //Immutable, so doesn't change the string saved but makes another version
        System.out.println(string1.toCharArray());//

        String string = String.valueOf(100);

        String name = "Kat";
        System.out.println("Hello " + name); //Creates 3 strings

        //String Builder
        //Creates and deletes string as needed to make the string look mutable
        //String Buffer
        //The same as String Builder but is "Thread Safe" - multiple threads can work on the same string

    }
}

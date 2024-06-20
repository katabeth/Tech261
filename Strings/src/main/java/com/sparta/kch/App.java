package com.sparta.kch;

public class App {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = new String("Hello");
        String string4 = new String("Hello");

        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string3.hashCode());
        System.out.println(string4.hashCode());
        System.out.println("");
        System.out.println(string1 == string2);     //True
        System.out.println(string1 == string3);     //False
        System.out.println(string4 == string3);     //False
        System.out.println(string1.equals(string3));//True


    }
}

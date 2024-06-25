package com.sparta.pcw.codesmellsrefactoring;

public class Address {
    private int houseNumber;
    private String street;
    private String town;
    public Address(int houseNumber, String street, String town) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.town = town;
    }
    @Override
    public String toString(){
        return "Address: " + houseNumber+ " " + street + ", " + town;
    }
}
package com.sparta.pcw.codesmellsrefactoring;

public class Address {
    private int houseNumber = 0;
    private String street = "";
    private String town = "";
    public Address(int houseNumber, String street, String town) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.town = town;
    }
    public Address(){};
    public int getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString(){
        return "Address: " + houseNumber+ " " + street + ", " + town;
    }
}
package com.sparta.kch.decorator;

public class Italian extends Pizza{
    @Override
    public double getCost() {
        return 20;
    }
    @Override
    public String getDescription() {
        return "Italian";
    }
}

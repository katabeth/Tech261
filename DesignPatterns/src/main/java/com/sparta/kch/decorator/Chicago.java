package com.sparta.kch.decorator;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Chicago";
    }
    @Override
    public double getCost() {
        return 25;
    }
}

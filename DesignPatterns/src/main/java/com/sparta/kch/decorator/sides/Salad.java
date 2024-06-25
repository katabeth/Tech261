package com.sparta.kch.decorator.sides;

import com.sparta.kch.decorator.Pizza;

public class Salad extends Sides{
    public Salad(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " and salad";
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}

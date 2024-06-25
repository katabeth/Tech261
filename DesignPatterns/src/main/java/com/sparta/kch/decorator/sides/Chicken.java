package com.sparta.kch.decorator.sides;

import com.sparta.kch.decorator.Pizza;

public class Chicken extends Sides{
    public Chicken(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chicken";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15;
    }
}

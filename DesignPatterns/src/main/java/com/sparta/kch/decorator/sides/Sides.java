package com.sparta.kch.decorator.sides;

import com.sparta.kch.decorator.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }
    public abstract String getDescription();
}

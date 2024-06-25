package com.sparta.kch.decorator;

import com.sparta.kch.decorator.sides.Chicken;
import com.sparta.kch.decorator.sides.Salad;

public class App {
    public static void main(String[] args) {
        Italian italian = new Italian();
        Chicago chicago = new Chicago();
        System.out.println(italian.getDescription()+ " Cost: " + italian.getCost());

        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());

        Chicken chicken = new Chicken(chicago);
        System.out.println(chicken.getDescription() + " Cost: " + chicken.getCost());
    }
}

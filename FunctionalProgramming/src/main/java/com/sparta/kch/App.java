package com.sparta.kch;

public class App {
    public static void main(String[] args) {
        SwitchOnable switchOnable = new SwitchOnable() {
            // Creates an Anonymous Inner Class
            // An inline implementation
            @Override
            public void switchOn() {
                // Parameters
                // Method Body -> return
                System.out.println("Switch on");
            }
        };

        SwitchOnable switchOnable1 = () -> System.out.println("Switch on");

        switchOnable.switchOn();
        System.out.println(switchOnable.getClass());
    }
}

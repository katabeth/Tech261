package com.sparta.kch;

import java.util.Arrays;

public enum Days {
    // Can create as many different objects but of a limited type
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7);

    private String name;
    private int noInWeek;
    Days(String name, int noInWeek) {   // Constructor applies to declared types
        this.name = name;
        this.noInWeek = noInWeek;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNoInWeek() {
        return noInWeek;
    }
    public void setNoInWeek(int noInWeek) {
        this.noInWeek = noInWeek;
    }

    public static void main(String[] args) {
        Days dayOff = Days.SATURDAY;
        System.out.println(dayOff.compareTo(FRIDAY)); // Returns 1 as it is 1 higher in the list
        System.out.println(dayOff.compareTo(SUNDAY)); // Returns -1 as it is 1 lower in the list

        System.out.println(dayOff.describeConstable());

        System.out.println(Arrays.toString(Days.values()));    // Prints all types
        System.out.println(Days.valueOf("FRIDAY"));     // Returns corresponding ENUM type
    }
}

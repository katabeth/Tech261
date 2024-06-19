package com.sparta.kch;

import java.util.Objects;

public class Spartan {
    private String firstName;
    private String lastName;
    public Spartan(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Spartan spartan = (Spartan) o;
//        return Objects.equals(firstName, spartan.firstName) && Objects.equals(lastName, spartan.lastName);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        return (object instanceof Spartan otherSpartan)                 //Are these both Spartan Objects
                && getFirstName().equals(otherSpartan.getFirstName())   //Do they have the same first name
                && getLastName().equals(otherSpartan.getLastName());    //Do they have the same last name
    }
    @Override
    public int hashCode() {
       return Objects.hash(firstName, lastName);
    }

}

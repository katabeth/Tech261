package com.sparta.pcw.codesmellsrefactoring;

public class Person
{
    private final String firstName;
    private final String lastName;
    private Address address;
    private int age = 0;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, Address address) {
        this(firstName, lastName);
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public  String toString() { //Inconsistent spacing -- ah yes my favourite name of 'String'
        var addressString = address.toString();
        if (addressString.equals("Address: 0 , ")) {
            addressString = "Address: <no address set>";
        }
        return String.format("%s Name: %s  %s Age: %s. %s",
                             super.toString(),
                             firstName,
                             lastName,
                             age,
                             addressString);
    }


}
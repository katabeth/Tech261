package com.sparta.kch;
/*
Create an abstract class called Trainee with the following fields:

name
age
email
phone
*/
public abstract class Trainee {
    private String name;
    private int age;
    private String email;
    private String phone; //As sting to keep length and leading 0s
    
    public Trainee (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

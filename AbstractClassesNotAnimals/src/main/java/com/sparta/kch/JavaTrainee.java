package com.sparta.kch;
/*
Create a subclass called JavaTrainee that extends Trainee and has the following fields:
github
 */
public class JavaTrainee extends Trainee implements Trainable{
    public JavaTrainee(String name, int age, String email, String phone, String experience, String certifications, String projects){
        super(name, age, email, phone,experience,certifications,projects);
    }
    private String github;

    @Override
    public void train() {

    }

    @Override
    public void study() {

    }
}

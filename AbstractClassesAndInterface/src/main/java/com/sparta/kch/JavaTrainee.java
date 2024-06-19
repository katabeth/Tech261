package com.sparta.kch;
/*
Create a subclass called JavaTrainee that extends Trainee and has the following fields:

experience
certifications
projects
github
 */
public class JavaTrainee extends Trainee implements Trainable{
    public JavaTrainee(String name, int age, String email, String phone){
        super(name, age, email, phone);
    }


    private String experience;
    private String certifications;
    private String projects;
    private String github;

    @Override
    public void train() {

    }

    @Override
    public void study() {

    }
}

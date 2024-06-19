package com.sparta.kch;
/*
Create a subclass called DevOpsTrainee that extends Trainee and has the following fields:

experience
certifications
projects
 */
public class DevOpsTrainee extends Trainee implements Trainable{
    public DevOpsTrainee(String name, int age, String email, String phone, String experience, String certifications, String projects){
        super(name, age, email, phone,experience,certifications,projects);
    }

    @Override
    public void train() {

    }

    @Override
    public void study() {

    }
}

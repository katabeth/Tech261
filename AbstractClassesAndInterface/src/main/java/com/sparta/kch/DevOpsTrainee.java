package com.sparta.kch;
/*
Create a subclass called DevOpsTrainee that extends Trainee and has the following fields:

experience
certifications
projects
 */
public class DevOpsTrainee extends Trainee{
    public DevOpsTrainee(String name, int age, String email, String phone){
        super(name, age, email, phone);
    }
    private String experience;
    private String certifications;
    private String projects;
}
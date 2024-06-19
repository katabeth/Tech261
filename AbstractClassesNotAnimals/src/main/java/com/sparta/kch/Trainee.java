package com.sparta.kch;
/*
Create an abstract class called Trainee with the following fields:
name
age
email
phone
experience
certifications
projects
*/
public abstract class Trainee {
    private String name;
    private int age;
    private String email;
    private String phone; //As sting to keep length and leading 0s
    private String experience;
    private String certifications;
    private String projects;
    //Constructor
    public Trainee (String name, int age, String email, String phone, String experience, String certifications, String projects){
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.experience = experience;
        this.certifications = certifications;
        this.projects = projects;
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

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


}

package com.school.model;

public class Applicant {
    private String firstName;
    private  String lastName;
    private int age;

    public Applicant(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static Applicant[] generateApplicants() {
        Applicant[] applicants = {
                new Applicant("James", "Stephen", 20),
                new Applicant("Aisha", "Minna", 17),
                new Applicant("Judy", "Yul", 18),
        };
        return applicants;
    }
}

package com.school.model;

import com.school.enums.Course;
import com.school.enums.Gender;
import com.school.enums.Role;
import com.school.services.AdmitsApplicant;
import com.school.services.TeachCourse;

public class Teacher extends Staff {

    private int id;

    public Teacher(String firstName, String lastName, int age, Gender gender, Role role, Course course, int id) {
        super(firstName, lastName, age, gender, role, course);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                '}';
    }

    public static Teacher[] generateTeachers(){
        Teacher[] teacher = {
                new Teacher("Praise", "Abu", 39, Gender.MALE, Role.PRINCIPAL, Course.ENGLISH, 301),
                new Teacher("Sani", "Dogo", 37, Gender.MALE, Role.TEACHER, Course.AGRICULTURE, 302),
                new Teacher("Dera", "Chinbu", 28, Gender.FEMALE, Role.TEACHER, Course.CHEMISTRY, 303),
                new Teacher("Isioma", "Nwobi", 30, Gender.FEMALE, Role.TEACHER, Course.BIOLOGY, 304),
                new Teacher("Emmanuel", "Onaivi", 31, Gender.MALE, Role.TEACHER, Course.LITERATURE, 305),
                new Teacher("Vivian", "Abner", 31, Gender.FEMALE, Role.TEACHER, Course.MATHEMATICS, 305),
        };
        return teacher;
    }

//    @Override
//    public void teachCourse() {
//        System.out.println(getRole() + " " + getFirstName() + " " + getLastName() + " teaches " + getCourse());
//    }
//
//    @Override
//    public void admitApplicant(Applicant applicant) {
//        if(applicant.getAge() > 18){
//            System.out.println(getRole() + " " + getFirstName() + " " + getLastName() + " admits " + applicant.getFirstName() + " " + applicant.getLastName());
//        } else{
//            System.out.println(applicant.getFirstName() + " " + applicant.getLastName() + " is too young to be admitted");
//        }
//    }
}

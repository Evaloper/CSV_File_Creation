package com.school.model;

import com.school.enums.Course;
import com.school.enums.Gender;
import com.school.enums.Role;
import com.school.services.TakeCourse;

public class Student extends Person {

    private int adminNum;

    public Student(String firstName, String lastName, int age, Gender gender, Role role, Course course, int adminNum) {
        super(firstName, lastName, age, gender, role, course);
        this.adminNum = adminNum;
    }

    public int getAdminNum() {
        return adminNum;
    }

    public void setAdminNum(int adminNum) {
        this.adminNum = adminNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "adminNum=" + adminNum +
                '}';
    }

    public static Student[] generateStudents() {
        Student[] students = {
                new Student("Gbaje", "Eva", 24, Gender.FEMALE,Role.STUDENT, Course.BIOLOGY, 501),
                new Student("Austin", "Dave", 30, Gender.MALE,Role.STUDENT,Course.CHEMISTRY, 502),
                new Student("Chukwu", "Tochi", 27, Gender.MALE,Role.STUDENT, Course.ENGLISH,503),
                new Student("Tamar", "Pere", 22, Gender.FEMALE,Role.STUDENT, Course.LITERATURE, 504),
                new Student("Barrack", "Obama", 29, Gender.MALE,Role.STUDENT, Course.MATHEMATICS,505),
        };
        return students;
    }

//    @Override
//    public void takeCourse() {
//        System.out.println(getFirstName() + " " + getLastName() +  " with the id of " + getAdminNum() + " is taking " + getCourse());
//    }
}

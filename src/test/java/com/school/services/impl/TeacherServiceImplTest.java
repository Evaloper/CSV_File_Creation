package com.school.services.impl;

import com.school.enums.Course;
import com.school.enums.Gender;
import com.school.enums.Role;
import com.school.model.Applicant;
import com.school.model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TeacherServiceImplTest {

    @Test
    void teachCourse() {

        //Create a mock Teacher object
        Teacher teacherInput = new Teacher("Austin", "Tochukwu", 35, Gender.MALE, Role.TEACHER, Course.ENGLISH, 301);
        //create an instance of TeacherServiceImpl
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        //Act
        //Call the method to be tested

        teacherService.teachCourse(teacherInput);

        String expected = "TEACHER Austin Tochukwu teaches ENGLISH\n";

        //Assert
        assertEquals(expected, actualContent.toString());


    }

    @Test
    void admitApplicant() {
        Teacher teacherInput2 = new Teacher("Austin", "Tochukwu", 35, Gender.MALE, Role.TEACHER, Course.ENGLISH, 301);
        Applicant applicant = new Applicant("Eva", "Gbaje", 25);
        //create an instance of TeacherServiceImpl
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        //Act
        //Call the method to be tested

        teacherService.admitApplicant(teacherInput2, applicant);
        String expectedOutput;
        if (applicant.getAge() > 18) {
            expectedOutput = "TEACHER Austin Tochukwu admits Eva Gbaje\n";
        } else {
            expectedOutput = "Eva Gbaje is too young to be admitted\n";
        }
        assertEquals(expectedOutput, actualContent.toString());
    }
}
package com.school.services.impl;

import com.school.enums.Course;
import com.school.enums.Gender;
import com.school.enums.Role;
import com.school.model.Student;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    @Test
    void takeCourse() {
        //Arrange

        //Create a mock Teacher object
        Student student = new Student("James", "Hebrew", 25, Gender.MALE, Role.STUDENT, Course.MATHEMATICS, 501);
        StudentServiceImpl studentService = new StudentServiceImpl();
        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        //Act
        //Call the method to be tested
        studentService.takeCourse(student);
        String expected = "James Hebrew with the id of 501 is taking MATHEMATICS\n";

        //Assert
        assertEquals(expected, actualContent.toString());
    }
}
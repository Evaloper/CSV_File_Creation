package com.school.services.impl;

import com.school.model.Student;
import com.school.services.TakeCourse;

public class StudentServiceImpl implements TakeCourse {
    @Override
    public void takeCourse(Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() +  " with the id of " + student.getAdminNum() + " is taking " + student.getCourse());
    }
}

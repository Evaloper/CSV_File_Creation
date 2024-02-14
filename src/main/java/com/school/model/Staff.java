package com.school.model;

import com.school.enums.Course;
import com.school.enums.Gender;
import com.school.enums.Role;

abstract public class Staff extends Person {
    public Staff(String firstName, String lastName, int age, Gender gender, Role role, Course course) {
        super(firstName, lastName, age, gender, role, course);
    }
}

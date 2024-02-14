package com.school.services.impl;

import com.school.model.Applicant;
import com.school.model.Teacher;
import com.school.services.AdmitsApplicant;
import com.school.services.TakeCourse;
import com.school.services.TeachCourse;

public class TeacherServiceImpl implements TeachCourse, AdmitsApplicant {



    @Override
    public void teachCourse(Teacher teacher) {
        System.out.println( teacher.getRole() + " " + teacher.getFirstName() + " " + teacher.getLastName() + " teaches " + teacher.getCourse());
    }

    @Override
    public void admitApplicant(Teacher teacher, Applicant applicant) {
        if(applicant.getAge() > 18){
            System.out.println(teacher.getRole() + " " + teacher.getFirstName() + " " + teacher.getLastName() + " admits " + applicant.getFirstName() + " " + applicant.getLastName());
        } else{
            System.out.println(applicant.getFirstName() + " " + applicant.getLastName() + " is too young to be admitted");
        }
    }

}

package com.school.services;

import com.school.model.Applicant;
import com.school.model.Teacher;

public interface AdmitsApplicant {

    void admitApplicant(Teacher teacher, Applicant applicant);
}

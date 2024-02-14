package com.school;

import com.school.model.Applicant;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.services.impl.StudentServiceImpl;
import com.school.services.impl.TeacherServiceImpl;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            WriteFile.writeStudentToCSV();
            List<Student> students = ReadFile.readStudentToCSV("/studentFile.csv");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Teacher List");
        try {
            WriteTeacherFile.writeTeachertoCSV();
            List<Teacher>  teachers = ReadTeacherFile.readTeacherToCsv("/teacherFile.csv");
            for (Teacher teacher : teachers){
                System.out.println(teacher);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Applicant List");
        System.out.println(" ");

        try {
            WriteApplicantFIle.writeApplicantToCSV();
            List<Applicant> applicants = ReadApplicantsFile.readApplicantToCSV("/applicantFile.csv");
            for (Applicant applicant : applicants){
                System.out.println(applicant);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        System.out.println("--------------");


        Student student = Student.generateStudents()[1];
        Teacher teacher = Teacher.generateTeachers()[1];
        Teacher teacher2 = Teacher.generateTeachers()[2];
        Teacher principal = Teacher.generateTeachers()[0];
        Applicant applicant1 = Applicant.generateApplicants()[0];
        Applicant applicant2 = Applicant.generateApplicants()[2];
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();

        teacherService.teachCourse(teacher);
//        student.takeCourse();
        studentService.takeCourse(student);
        teacherService.admitApplicant(principal, applicant1);
        teacherService.admitApplicant(principal, applicant2);


    }
}

package com.school;

import com.school.model.Teacher;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTeacherFile {
    public static void writeTeachertoCSV() throws IOException {
        String desktop = System.getProperty("user.home") + "/IdeaProjects/CSVProject/src/main/resources";
        FileWriter fw = new FileWriter(desktop + "/teacherFile.csv");

        fw.write("Id, FirstName, Lastname, Gender, Role, Course, Age \n");

        try{
            for (Teacher teacher : Teacher.generateTeachers()){
                fw.write(teacher.getId() +",");
                fw.write(teacher.getFirstName() +",");
                fw.write(teacher.getLastName()+",");
                fw.write(teacher.getGender()+",");
                fw.write(teacher.getRole() +",");
                fw.write(teacher.getCourse() +",");
                fw.write(teacher.getAge() +"\n");
            }
            fw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

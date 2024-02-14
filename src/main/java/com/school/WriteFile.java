package com.school;

import com.school.model.Student;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeStudentToCSV() throws IOException {
        String desktop = System.getProperty("user.home") + "/IdeaProjects/CSVProject/src/main/resources";

        FileWriter fw = new FileWriter(desktop + "/studentFile.csv");
        fw.write("Admission Number, FirstName, Lastname, Gender, Age \n");

        try {
            for(Student std : Student.generateStudents()){
                fw.write(std.getAdminNum() + ",");
                fw.write(std.getFirstName() + ",");
                fw.write(std.getLastName() + ",");
                fw.write(std.getGender() + ",");
                fw.write(std.getAge() + "\n");

//                System.out.println("Successful");
            }
            fw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

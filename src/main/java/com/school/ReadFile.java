package com.school;

import com.school.enums.Course;
import com.school.enums.Gender;
import com.school.enums.Role;
import com.school.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Student> readStudentToCSV(String string) throws IOException {
        List<Student> students = new ArrayList<>();
        String path = System.getProperty("user.home") + "/IdeaProjects/CSVProject/src/main/resources";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path + "/studentFile.csv"));
            boolean firstLine = true;
            while ((line = br.readLine()) != null){
//                System.out.println(line);
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(",");

//                String firstName = data[0];
//                String lastName = data[1];
//                int age = Integer.parseInt(data[2].trim());
//                Gender gender = Gender.valueOf(data[3].trim());
//                Role role = Role.valueOf(data[4].trim());
//                Course course = Course.valueOf(data[5].trim());
//                int adminNum = Integer.parseInt(data[6].trim());

                System.out.println("FirstName: " + data[0]);
                System.out.println("LastName: " + data[1]);
                System.out.println("Age: " + data[2]);
                System.out.println("Gender: " + data[3]);
                System.out.println("Role: " + data[4]);
                System.out.println("Course: " + data[5]);
                System.out.println("Admin Number: " + data[6]);
                System.out.println("");
                System.out.println("*****************");

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
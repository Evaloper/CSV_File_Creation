package com.school;

import com.school.model.Student;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Student> readStudentToCSV(String string) throws IOException {
        List<Student> students = new ArrayList<>();
        String path = System.getProperty("user.home") + "/IdeaProjects/CSVProject/src/main/resources";


        try {
            Reader rd = new FileReader(path + "/studentFile.csv");

            int readContent = rd.read();
            while (readContent != -1) {
                System.out.print((char) readContent);
                readContent = rd.read();
            }
            rd.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}

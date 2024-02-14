package com.school;

import com.school.model.Teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTeacherFile {

    public static List<Teacher> readTeacherToCsv(String string) throws FileNotFoundException {
        List<Teacher> teachers = new ArrayList<>();
        String path = System.getProperty("user.home") + "/IdeaProjects/CSVProject/src/main/resources";
        FileReader fr = new FileReader(path + "/teacherFile.csv");
//        BufferedReader br = new BufferedReader(fr);
//
//        try {
//            int data = br.read();
//            while (data != -1){
//                System.out.print((char) data);
//                data = br.read();
//            }
//            fr.close();
//            br.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try {
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
                String[] array = line.split(",");
                System.out.println("Teacher's Id: " + array[0]);
                System.out.println("Teacher's Firstname: " + array[1]);
                System.out.println("Teacher's Lastname: " + array[2]);
                System.out.println("Teacher's Gender: " + array[3]);
                System.out.println("Teacher's Role: " + array[4]);
                System.out.println("Teacher's Course: " + array[5]);
                System.out.println("Teacher's Age: " + array[6]);
                System.out.println("");
                System.out.println("------------------------");
                System.out.println("");
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return teachers;
    }
}

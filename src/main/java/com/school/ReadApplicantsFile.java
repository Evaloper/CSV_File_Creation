package com.school;

import com.school.model.Applicant;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadApplicantsFile {
    public static List<Applicant> readApplicantToCSV(String string) throws FileNotFoundException {
        List<Applicant> applicants = new ArrayList<>();
        String path = System.getProperty("user.home") + "/IdeaProjects/CSVProject/src/main/resources";
        FileReader fr = new FileReader(path + "/applicantFile.csv");
        BufferedReader br = new BufferedReader(fr);

        try {
            int data;
            while ((data = br.read()) != -1){
                System.out.print((char) data);

            }

            fr.close();
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return applicants;
    }
}

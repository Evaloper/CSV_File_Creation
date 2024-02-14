package com.school;

import com.school.model.Applicant;

import java.io.FileWriter;
import java.io.IOException;

public class WriteApplicantFIle {

    public static void writeApplicantToCSV() throws IOException {
        String desktop = System.getProperty("user.home") + "/IdeaProjects/CSVProject/src/main/resources";

        FileWriter fw = new FileWriter(desktop + "/applicantFile.csv");

        fw.write("Firstname, Lastname, Age \n");
        try {
            for(Applicant applicant : Applicant.generateApplicants()){
                fw.write(applicant.getFirstName() + ", ");
                fw.write(applicant.getLastName() + ", ");
                fw.write(applicant.getAge() + "\n");
            }

            fw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

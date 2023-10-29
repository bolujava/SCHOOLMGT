package org.example.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicantTest {

    @Test
    void applicantStatus() {
       {

             Applicant applicant= new Applicant(); // Create an instance of the class containing the method
            applicant.setApplicantAge(13); // Set the applicant's age to a value between 12 and 15


            String result = applicant.applicantStatus(); // Call the method


            assertEquals("YOU ARE ADMITTED", result);
        }

    }@Test
    public void testApplicantStatusNotAdmitted() {

        Applicant applicant = new Applicant();
        applicant.setApplicantAge(18);


        String result = applicant.applicantStatus();


        assertEquals("YOU CANNOT BE ADMITTED", result);
    }
}





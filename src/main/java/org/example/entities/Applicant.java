package org.example.entities;

public class Applicant extends User {
    private String applicantId;
    private int applicantAge;
    private String modeOfInvitation;

    public Applicant(String fullName, String applicantId, int applicantAge, String modeOfInvitation ) {

    }

    public Applicant() {

    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    public String getModeOfInvitation() {
        return modeOfInvitation;
    }

    public void setModeOfInvitation(String modeOfInvitation) {
        this.modeOfInvitation = modeOfInvitation;
    }


    public Applicant(String applicantId, String modeOfInvitation, int applicantAge) {
        this.applicantId = applicantId;
        this.modeOfInvitation = modeOfInvitation;
        this.applicantAge = applicantAge;
    }


    public String applicantStatus(){

        boolean condition = applicantAge >12 && applicantAge<=15;
        String admission = condition?"YOU ARE ADMITTED":"YOU CANNOT BE ADMITTED";
        System.out.println(admission);
        return admission;
    }


    public static void main(String[] args) {
        Applicant applicant = new Applicant("ADESHOLA FEMI", "656TY", 10, "REFERRAL");
        applicant.setApplicantAge(15);
        applicant.applicantStatus();
        System.out.println(applicant);


    }
}


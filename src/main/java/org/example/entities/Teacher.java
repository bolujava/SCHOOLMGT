package org.example.entities;

import org.example.Course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
        private String qualification;
        private String  subjectTaught;
        private Long salary2;
        private String salaryTime;

    public String getSalaryTime() {
        return salaryTime;
    }

    public void setSalaryTime(String salaryTime) {
        this.salaryTime = String.valueOf(LocalDate.parse(salaryTime));
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    public Long getSalary2() {
        return salary2;
    }

    public void setSalary2(Long salary2) {
        this.salary2 = salary2;
    }

    public Teacher() {

    }

    public Teacher(String name) {
        super();
    }

    public Teacher(String name, String qualification, String subjectTaught) {
        super();
    }


    public String getQualification() {
            return qualification;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
        }

        public String getSubjecttaught() {
            return subjectTaught;
        }

        public void setSubjectTaught(Course subjecttaught) {
            this.subjectTaught = subjectTaught;
        }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    public Teacher(String name, String qualification, Course subjecttaught) {

            this.qualification = qualification;
            this.subjectTaught = subjectTaught;

        }

    @Override
    public String toString() {
        return "Teacher{" +
                "qualification='" + qualification + '\'' +
                ", subjectTaught='" + subjectTaught + '\'' +
                ", salary2=" + salary2 +
                ", salaryTime='" + salaryTime + '\'' +
                '}';
    }




    }





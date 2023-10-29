package org.example.entities;

import java.time.LocalDate;

public class Principal extends User {
    private String professionalLevel;
    private String certification;
    private Long salary1;

    public String getSalaryTime() {
        return salaryTime;
    }

    private String salaryTime;

    public void setSalaryTime(String salaryTime) {
        this.salaryTime = String.valueOf(LocalDate.parse(salaryTime));
    }

    @Override
    public String toString() {
        return "Principal{" +
                "professionalLevel='" + professionalLevel + '\'' +
                ", certification='" + certification + '\'' +
                ", salary1=" + salary1 +
                ", salaryTime='" + salaryTime + '\'' +
                '}';
    }


    public String getProfessionalLevel() {
        return professionalLevel;
    }

    public void setProfessionalLevel(String professionalLevel) {
        this.professionalLevel = professionalLevel;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Long getSalary1() {
        return salary1;
    }

    public void setSalary1(Long salary1) {
        this.salary1 = salary1;
    }
}

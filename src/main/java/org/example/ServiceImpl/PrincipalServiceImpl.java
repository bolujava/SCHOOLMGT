package org.example.ServiceImpl;

import org.example.SchoolService.PrincipalInterface;
import org.example.entities.*;
import org.example.enums.ClassForm;
import org.example.enums.SchoolingType;

import java.util.ArrayList;
import java.util.List;

public class PrincipalServiceImpl implements PrincipalInterface {
    private String behaviour;
    private Long salary1;
    private Long salary2;

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public void admit(Principal principal, Applicant applicant) {
        boolean condition = applicant.getApplicantAge() > 12 && applicant.getApplicantAge() <= 15;
        String admission = condition ? "YOU ARE ADMITTED" : "YOU CANNOT BE ADMITTED";
        System.out.println(admission);
        applicant.setFirstName("SMALL");
        applicant.setLastName("BANGA");
        applicant.setApplicantAge(10);
        Principal principal1 = new Principal();
        principal1.setFirstName("MR COLLINS");
        principal1.setLastName("MAYOWA");
        System.out.println("AUTHORIZED BY: " + principal1.getFirstName()+ " " +principal1.getLastName());

        System.out.println("USER: " + applicant.getFirstName() + " " +applicant.getLastName() + " aged " + applicant.getApplicantAge() + " cannot be admitted ");

    }

    @Override
    public void expel(Student students, Principal principal) {

    }


    @Override

    public void expel(Student student) {
        boolean condition = behaviour == "BAD";
        String expulsion = condition ? "NOT EXPELLED!" : "EXPELLED!";
        System.out.println(expulsion);
        student.setBehaviour("BAD");
        student.setFirstName("EMEKA");
        student.setLastName("AUDU");
        student.setForm(ClassForm.JSS3);
        student.setAdmissionNum("678766/SCL");
        student.setSchoolingType(SchoolingType.BOARDING);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        System.out.println(student);
        System.out.println(student.getFirstName() + " " +student.getLastName()+ " " + student.getBehaviour() + " " + student.getForm());
    }


    @Override
    public void paySalary(Principal principal, Teacher teacher, NonAcademic nonAcademic) {


        if (principal.getSalaryTime() == "23-10-2023") {
            System.out.println(salary1 + "sent successfully!");

        } else if (principal.getSalaryTime() == "24-10-2023") {
            System.out.println(salary2 + " sent successfully!");
        } else {
            System.out.println("ALL SALARY HAVE BEEN PAID");
        }


    }
    Teacher teacher1 = new Teacher();

    public void setTeacher1(Teacher teacher1) {
        this.teacher1 = teacher1;
    }

    public Teacher getTeacher1() {
        return teacher1;
    }
}




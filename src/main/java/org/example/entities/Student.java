package org.example.entities;

import org.example.Course;
import org.example.enums.ClassForm;
import org.example.enums.SchoolingType;

import javax.security.auth.Subject;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String admissionNum;

    private SchoolingType schoolingType;
    private ClassForm form;
    private List<Course>course;

    public Student(String firstName, String lastName, String address, String nationality, String stateOfOrigin, String dateOfBirth, int age, String admissionNum, SchoolingType schoolingType, List<Course> course) {
        super(firstName, lastName, address, nationality, stateOfOrigin, dateOfBirth, age);
    }

    private  String behaviour;

    public Student() {

    }

    //public Student() {

    //}

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public String getAdmissionNum() {
        return admissionNum;
    }

    public void setAdmissionNum(String admissionNum) {
        this.admissionNum = admissionNum;
    }

    public SchoolingType getSchoolingType() {
        return schoolingType;
    }

    public void setSchoolingType(SchoolingType schoolingType) {
        this.schoolingType = schoolingType;
    }

    public ClassForm getForm() {
        return form;
    }

    public void setForm(ClassForm form) {
        this.form = form;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }




    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admissionNum='" + admissionNum + '\'' +
                ", schoolingType=" + schoolingType +
                ", form=" + form +
                ", course=" + course +
                ", behaviour='" + behaviour + '\'' +
                '}';
    }

    public Student(String admissionNum, SchoolingType schoolingType, ClassForm form, List<Course> course, String behaviour) {
        this.admissionNum = admissionNum;
        this.schoolingType = schoolingType;
        this.form = form;
        this.course = new ArrayList<>(course);
        this.behaviour = behaviour;
    }




    public void StudentExpulsion(){



        boolean condition = behaviour == "BAD";
        String expulsion =  condition?"EXPELLED!":"NOT EXPELLED!";
        System.out.println(expulsion);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setBehaviour("BAD");
        student.StudentExpulsion();

        //student.setName("EMEKA WAZIRI");
        //System.out.println(student.getName());
        //System.out.println("BEHAVIOUR: " +student.getBehaviour());

    }
    public String studentExpulsion() {
        return studentExpulsion();
    }

}

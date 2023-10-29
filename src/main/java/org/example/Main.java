package org.example;

import org.example.ServiceImpl.PrincipalServiceImpl;
import org.example.ServiceImpl.StudentImpl;
import org.example.ServiceImpl.TeacherImpl;
import org.example.entities.*;
import org.example.enums.ClassForm;
import org.example.enums.SchoolingType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ADMIT AN APPLICANT BASED ON AGE

            /*PrincipalServiceImpl principalOnly = new PrincipalServiceImpl();
            Principal principal2 = new Principal();
            principalOnly.admit(principal2, new Applicant());


            //EXPELLING A STUDENT OUT OF SCHOOL FOR BAD BEHAVIOUR AND NOT OFFERING ANY SUBJECT FOR THE TERM

            PrincipalServiceImpl principalServiceImpl = new PrincipalServiceImpl();
            Student student1 = new Student();
            principalServiceImpl.expel(student1);


            // PAYING TEACHER SALARY
        PrincipalServiceImpl salaryAuthorization = new PrincipalServiceImpl();
        Principal principal = new Principal();
        Teacher teacher1 = new Teacher();
        Student student = new Student();
        NonAcademic nonAcademic = new NonAcademic();
        salaryAuthorization.paySalary(principal, teacher1, nonAcademic);

        //TEACHER TAKING COURSES
        TeacherImpl teacher = new TeacherImpl();
        teacher.teachersDetail();*/


            //COURSES TAKEN BY STUDENT
        List<Course>studentCourse = new ArrayList<>();
        studentCourse.add(new Course("MATHEMATICS", "THE USE OF ANGLES", "12:30PM", "MATHS LAB", "DARO GADIBIA"));
        studentCourse.add(new Course("ENGLISH LANGUAGE", "THE USE OF SYNTAX", "1:00PM", "LANGUAGE ROOM", "ELON GATE"));
        studentCourse.add(new Course("MUSIC", "THE USE OF CHORDS", "2:00PM", "MUSIC HALL", "MILEY CYRUS"));
        Student student = new Student("123/IOP", SchoolingType.BOARDING, ClassForm.JSS3, studentCourse, "GOOD");
        StudentImpl student2 = new StudentImpl();
        student2.takeCourse(student, studentCourse);






    }
}
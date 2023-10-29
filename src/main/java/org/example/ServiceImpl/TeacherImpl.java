package org.example.ServiceImpl;

import org.example.SchoolService.TeacherInterface;
import org.example.entities.Student;
import org.example.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherImpl implements TeacherInterface {

    @Override
    public void teach(Teacher teacher, Student student) {

    }
    public void teachersDetail(){
        System.out.println("Teacher details: " );
        Teacher teacher1 = new Teacher("DARO GIBIA", "MSC", "MATHEMATICS");
        Teacher teacher2 = new Teacher("ELON GATE", "MSC", "ENGLISH LANGUAGE");
        Teacher teacher3 = new Teacher("MILEY CYRUS", "MSC", "MUSIC");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        System.out.println(teacherList);

    }
}

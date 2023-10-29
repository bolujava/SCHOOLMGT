package org.example.SchoolService;

import org.example.Course;
import org.example.entities.Student;

import java.util.LinkedList;
import java.util.List;

public interface StudentInterface {
    void takeCourse(Student student, List<Course> course);

}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseTitle;
    private String courseName;
    private String timeSchedule;
    private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    private String venue;


    public Course(String courseTitle, String courseName, String timeSchedule, String venue, String teacherName) {
        this.courseTitle = courseTitle;
        this.courseName = courseName;
        this.timeSchedule = timeSchedule;
        this.venue = venue;
        this.teacherName = teacherName;
    }

    public Course(String courseName, String courseTitle, String timeSchedule, String venue) {
        this.courseName = courseName;
        this.courseTitle = courseTitle;
        this.timeSchedule = timeSchedule;
        this.venue = venue;
    }

    public Course() {

    }

    public String getTimeSchedule() {
        return timeSchedule;
    }

    public void setTimeSchedule(String timeSchedule) {
        this.timeSchedule = timeSchedule;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTitle='" + courseTitle + '\'' +
                ", courseName='" + courseName + '\'' +
                ", timeSchedule='" + timeSchedule + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public void selectedCourse(){
      Course  course1 = new Course("MATHEMATICS", "THE USE OF ANGLES", "12:30PM", "MATHS LAB", "DARO GADIBIA");
      Course course2 = new Course("ENGLISH LANGUAGE", "THE USE OF SYNTAX", "1:00PM", "LANGUAGE ROOM", "ELON GATE");
      Course course3 = new Course("MUSIC", "THE USE OF CHORDS", "2:00PM", "MUSIC HALL", "MILEY CYRUS");
        List<Course>course = new ArrayList<>();
        course.add(course1);
        course.add(course2);
        course.add(course3);
        System.out.println(course);
    }


}

package org.example.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void testStudentExpulsionExpelled() {

        Student student = new Student();
        student.setBehaviour("BAD");


        String result = student.studentExpulsion();


        assertEquals("EXPELLED!", result);
    }

    @Test
    public void testStudentExpulsionNotExpelled() {

        Student yourObject = new Student();
        yourObject.setBehaviour("GOOD");


        String result = yourObject.studentExpulsion();


        assertEquals("NOT EXPELLED!", result);
    }
}


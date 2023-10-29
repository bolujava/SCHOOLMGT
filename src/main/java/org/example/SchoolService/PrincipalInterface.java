package org.example.SchoolService;

import org.example.entities.*;
import org.example.entities.Student;

public interface PrincipalInterface {

    void admit(Principal principal, Applicant applicant);


    void expel(Student students, Principal principal);

    void expel(Student student);

    void paySalary(Principal principal, Teacher teacher, NonAcademic nonAcademic);
}

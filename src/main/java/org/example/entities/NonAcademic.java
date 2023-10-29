package org.example.entities;

import org.example.enums.Role;

public class NonAcademic extends User {
    private Role role;
    private Long salary2;

    public NonAcademic(String firstName, String lastName, String address, String nationality, String stateOfOrigin, String dateOfBirth, int age) {
        super(firstName, lastName, address, nationality, stateOfOrigin, dateOfBirth, age);
    }

    public NonAcademic() {
        super();
    }

    @Override
    public String toString() {
        return "NonAcademic{" +
                "role=" + role +
                ", salary2=" + salary2 +
                ", salaryTime='" + salaryTime + '\'' +
                '}';
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getSalary2() {
        return salary2;
    }

    public void setSalary2(Long salary2) {
        this.salary2 = salary2;
    }

    public String getSalaryTime() {
        return salaryTime;
    }

    public void setSalaryTime(String salaryTime) {
        this.salaryTime = salaryTime;
    }

    private String salaryTime;
}

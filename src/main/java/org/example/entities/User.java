package org.example.entities;

public abstract class User {
    private String firstName;
    private String lastName;
    private String address;

    public User(String firstName, String lastName, String address, String nationality, String stateOfOrigin, String dateOfBirth, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.nationality = nationality;
        this.stateOfOrigin = stateOfOrigin;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String nationality;
    private String stateOfOrigin;
    private String dateOfBirth;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                '}';
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}


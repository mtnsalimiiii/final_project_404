package com.example.final_project_404;

import java.util.ArrayList;
import java.util.List;

public abstract class  Person {
    private String first_name;
    private String last_name;
    private String dateOfBirth;
    private String nationalId;
    private String phoneNumber;
    public static List<Teacher> allTeachers = new ArrayList<>();
    public static List<Employee> allEmployees = new ArrayList<>();
    public static List<Student> allStudent = new ArrayList<>();


    public Person(String first_name,String last_name,String dateOfBirth){
        this.first_name=first_name;
        this.last_name=last_name;
        this.dateOfBirth=dateOfBirth;
        this.nationalId=nationalId;
        this.phoneNumber=phoneNumber;
    }
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    public void setLast_name(String last_name){
        this.last_name=last_name;
    }
    public void setDateOfBirthate(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

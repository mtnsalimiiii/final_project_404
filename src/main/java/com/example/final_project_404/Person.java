package com.example.final_project_404;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class  Person implements Serializable {
    private String first_name;
    private String last_name;
    private String fullName;
//    private String dateOfBirth;
    private String nationalId;
    private com.example.final_project_404.Date dateOfBirth;
    private Gender gender;
    private String phoneNumber;
//    private String dateOfJoin;
    private com.example.final_project_404.Date dateOfJoin;
    private Status status;


    Person(String first_name, String last_name, Date dateOfBirth, String nationalId, Gender gender, String phoneNumber, Date dateOfJoin, Status status){
        this.first_name = first_name;
        this.last_name = last_name;
        this.dateOfBirth = dateOfBirth;
        this.nationalId = nationalId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.dateOfJoin = dateOfJoin;
        this.status = status;
    }


    public  String getFirst_name(){
        return first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }

    public String getLast_name(){
        return last_name;
    }
    public void setLast_name(String last_name){
        this.last_name=last_name;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }
    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFullName() {
        setFullName();
        return fullName;
    }
    public void setFullName() {
        fullName = first_name.concat(" ").concat(last_name);
    }
}

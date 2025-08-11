
package com.example.final_project_404;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String fullName;
    private String firstName;
    private String lastName;
    private String nationalId;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoin;
    private Gender gender;
    private Status status;

    public Person(String firstName, String lastName, LocalDate dateOfBirth, String nationalId, Gender gender,
                  String phoneNumber, LocalDate dateOfJoin, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalId = nationalId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.dateOfJoin = dateOfJoin;
        this.status = status;
        updateFullName();
    }

    public String getFirst_name() {
        return firstName;
    }
    public void setFirst_name(String firstName) {
        this.firstName = firstName;
        updateFullName();
    }

    public String getLast_name() {
        return lastName;
    }
    public void setLast_name(String lastName) {
        this.lastName = lastName;
        updateFullName();
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public LocalDate getDateOfJoin() {
        return dateOfJoin;
    }
    public void setDateOfJoin(LocalDate dateOfJoin) {
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
        return fullName;
    }
    private void updateFullName() {
        this.fullName = firstName + " " + lastName;
    }
}
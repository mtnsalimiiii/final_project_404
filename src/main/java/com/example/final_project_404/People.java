package com.example.final_project_404;

import javafx.beans.property.*;

import java.io.PushbackInputStream;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.IllegalFormatCodePointException;

public class People implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final StringProperty fullNameProperty;
    private final StringProperty firstNameProperty;
    private final StringProperty lastNameProperty;
    private final IntegerProperty ageProperty;
    private final StringProperty nationalIdProperty;
    private final StringProperty phoneNumberProperty;
    private final StringProperty genderProperty;
    private final StringProperty dateOfRegistration;
    private LocalDate dateOfRegistrationLocalDate;
    private final StringProperty dateOfDeactivation;
    private LocalDate dateOfDeactivationLocalDate;
    private final StringProperty roleProperty;
    private final StringProperty idProperty;
    private final StringProperty facultyProperty;
    private final StringProperty departmentProperty;
    private final StringProperty majorProperty;
    private final StringProperty degreeProperty;
    private final StringProperty statusProperty;

    public People(String first_name, String last_name, LocalDate dateOfBirth, String nationalId, Gender gender, String phoneNumber, LocalDate dateOfJoin, String role, String id, String faculty, String department, String major, String degree, Status status, LocalDate dateOfDeactivation) {

        this.firstNameProperty = new SimpleStringProperty(first_name);
        this.lastNameProperty = new SimpleStringProperty(last_name);
        this.ageProperty = new SimpleIntegerProperty(Period.between(dateOfBirth, LocalDate.now()).getYears());
        this.nationalIdProperty = new SimpleStringProperty(nationalId);

        this.genderProperty = new SimpleStringProperty(gender.toString());

        this.phoneNumberProperty = new SimpleStringProperty(phoneNumber);
        this.dateOfRegistration = new SimpleStringProperty(dateOfJoin.getDayOfMonth() + "-" + Month.of(dateOfJoin.getMonthValue()) + "-" + dateOfJoin.getYear());
        this.dateOfRegistrationLocalDate = dateOfJoin;
        this.dateOfDeactivation = new SimpleStringProperty(dateOfDeactivation == null ? "----" : dateOfDeactivation.getDayOfMonth() + "-" + Month.of(dateOfDeactivation.getMonthValue()) + "-" + dateOfDeactivation.getYear());
        this.dateOfDeactivationLocalDate = dateOfDeactivation;

        this.roleProperty = new SimpleStringProperty(role);
        this.idProperty = new SimpleStringProperty(id);
        this.facultyProperty = new SimpleStringProperty(faculty);
        this.departmentProperty = new SimpleStringProperty(department);
        this.majorProperty = new SimpleStringProperty(major);
        this.degreeProperty = new SimpleStringProperty(degree);

        this.statusProperty = new SimpleStringProperty(status.toString());

        // مقداردهی fullName
        this.fullNameProperty = new SimpleStringProperty(first_name + " " + last_name);

        // وقتی firstName یا lastName تغییر کرد، fullName آپدیت بشه
        this.firstNameProperty.addListener((obs, oldVal, newVal) -> updateFullName());
        this.lastNameProperty.addListener((obs, oldVal, newVal) -> updateFullName());
    }

    // ---------- First Name ----------
    public String getFirst_name() {
        return firstNameProperty.get();
    }
    public StringProperty firstNameProperty() {
        return firstNameProperty;
    }
    public void setFirst_name(String first_name) {
        this.firstNameProperty.set(first_name);
    }

    // ---------- Last Name ----------
    public String getLast_name() {
        return lastNameProperty.get();
    }
    public StringProperty lastNameProperty() {
        return lastNameProperty;
    }
    public void setLast_name(String last_name) {
        this.lastNameProperty.set(last_name);
    }

    // ---------- Date of Birth ----------
    public int getAge() {
        return ageProperty.get();
    }
    public IntegerProperty ageProperty() {
        return ageProperty;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.ageProperty.set(Period.between(dateOfBirth, LocalDate.now()).getYears());
    }

    // ---------- National ID ----------
    public String getNationalId() {
        return nationalIdProperty.get();
    }
    public StringProperty nationalIdProperty() {
        return nationalIdProperty;
    }
    public void setNationalId(String nationalId) {
        this.nationalIdProperty.set(nationalId);
    }

    // ---------- Phone Number ----------
    public String getPhoneNumber() {
        return phoneNumberProperty.get();
    }
    public StringProperty phoneNumberProperty() {
        return phoneNumberProperty;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumberProperty.set(phoneNumber);
    }

    // ---------- Date of Join ----------
    public String getDateOfJoin() {
        return dateOfRegistration.get();
    }
    public LocalDate getDateOfRegistrationLocalDate() {
        return dateOfRegistrationLocalDate;
    }
    public StringProperty dateOfRegistrationProperty() {
        return dateOfRegistration;
    }
    public void setDateOfJoin(LocalDate dateOfJoin) {
        this.dateOfRegistration.set(dateOfJoin.getDayOfMonth() + "-" + Month.of(dateOfJoin.getMonthValue()) + "-" + dateOfJoin.getYear());
    }

    // ---------- Date of Deactivation ----------
    public String getDateOfDeactivation() {
        return dateOfDeactivation.get();
    }
    public LocalDate getDateOfDeactivationLocalDate() {
        return dateOfDeactivationLocalDate;
    }
    public StringProperty dateOfDeactivationProperty() {
        return dateOfDeactivation;
    }
    public void setDateOfDeactivation(LocalDate dateOfDeactivation) {
        this.dateOfDeactivation.set(dateOfDeactivation.getDayOfMonth() + "-" + Month.of(dateOfDeactivation.getMonthValue()) + "-" + dateOfDeactivation.getYear());
    }

    // ---------- Gender ----------
    public String getGender() {
        return genderProperty.get();
    }
    public StringProperty genderProperty() {
        return genderProperty;
    }
    public void setGender(Gender gender) {
        this.genderProperty.set(gender.toString());
    }

    // ---------- ID ----------
    public String getId() {
        return idProperty.get();
    }
    public StringProperty idProperty() {
        return idProperty;
    }
    public void setId(String id) {
        this.idProperty.set(id);
    }

    // ---------- Faculty ----------
    public String getFaculty() {
        return facultyProperty.get();
    }
    public StringProperty facultyProperty() {
        return facultyProperty;
    }
    public void setFaculty(String faculty) {
        this.facultyProperty.set(faculty);
    }

    // ---------- Department ----------
    public String getDepartment() {
        return departmentProperty.get();
    }
    public StringProperty departmentProperty() {
        return departmentProperty;
    }
    public void setDepartment(String department) {
        this.departmentProperty.set(department);
    }

    // ---------- Major ----------
    public String getMajor() {
        return majorProperty.get();
    }
    public StringProperty majorProperty() {
        return majorProperty;
    }
    public void setMajor(String major) {
        this.majorProperty.set(major);
    }

    // ---------- Degree ----------
    public String getDegree() {
        return degreeProperty.get();
    }
    public StringProperty degreeProperty() {
        return degreeProperty;
    }
    public void setDegree(String degree) {
        this.degreeProperty.set(degree);
    }

    // ---------- Status ----------
    public String getStatus() {
        return statusProperty.get();
    }
    public StringProperty statusProperty() {
        return statusProperty;
    }
    public void setStatus(Status status) {
        this.statusProperty.set(status.toString());
    }

    // ---------- Full Name ----------
    public String getFullName() {
        return fullNameProperty.get();
    }
    public StringProperty fullNameProperty() {
        return fullNameProperty;
    }
    private void updateFullName() {
        fullNameProperty.set(getFirst_name() + " " + getLast_name());
    }

    // ---------- Role ----------
    public String getRole() {
        return roleProperty.get();
    }
    public StringProperty roleProperty() {
        return roleProperty;
    }
    public void setRole(String role) {
        this.roleProperty.set(role);
    }
}

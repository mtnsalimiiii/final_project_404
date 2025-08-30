package com.example.final_project_404;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serial;
import java.io.Serializable;

public class CourseGroupReports implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final StringProperty courseNameProperty;
    private final IntegerProperty courseCreditProperty;
    private final StringProperty semesterCodeProperty;
    private final StringProperty professorNameProperty;
    private final StringProperty idProperty;
    private final StringProperty majorProperty;
    private final StringProperty degreeProperty;
    private final StringProperty statusProperty;
    private final IntegerProperty capacityProperty;


    public CourseGroupReports(String name, int credit, String semesterCode, String professor, String id, String major, String degree, Status status, int capacity) {
        this.courseNameProperty = new SimpleStringProperty(name);
        this.courseCreditProperty = new SimpleIntegerProperty(credit);
        this.professorNameProperty = new SimpleStringProperty(professor);
        this.semesterCodeProperty = new SimpleStringProperty(semesterCode);
        this.idProperty = new SimpleStringProperty(id);
        this.statusProperty = new SimpleStringProperty(status.toString());
        this.capacityProperty = new SimpleIntegerProperty(capacity);
        this.majorProperty = new SimpleStringProperty(major);
        this.degreeProperty = new SimpleStringProperty(degree);
    }

    public String getCourseName() {
        return courseNameProperty.get();
    }
    public StringProperty courseNameProperty() {
        return courseNameProperty;
    }
    public void setCourseName(String name) {
        this.courseNameProperty.set(name);
    }

    public int getCourseCredit() {
        return courseCreditProperty.get();
    }
    public IntegerProperty courseCreditProperty() {
        return courseCreditProperty;
    }
    public void setCourseCredit(int credit) {
        this.courseCreditProperty.set(credit);
    }

    public String getSemesterCode() {
        return semesterCodeProperty.get();
    }
    public StringProperty semesterCodeProperty() {
        return semesterCodeProperty;
    }
    public void setSemesterCode(String code) {
        this.semesterCodeProperty.set(code);
    }

    public String getProfessorName() {
        return professorNameProperty.get();
    }
    public StringProperty professorNameProperty() {
        return professorNameProperty;
    }
    public void setProfessorName(String name) {
        this.professorNameProperty.set(name);
    }

    public String getId() {
        return idProperty.get();
    }
    public StringProperty idProperty() {
        return idProperty;
    }
    public void setId(String id) {
        this.idProperty.set(id);
    }

    public String getStatus() {
        return statusProperty.get();
    }
    public StringProperty statusProperty() {
        return statusProperty;
    }
    public void setStatus(Status status) {
        this.statusProperty.set(status.toString());
    }


    public String getMajor() {
        return majorProperty.get();
    }
    public StringProperty majorProperty() {
        return majorProperty;
    }
    public void setMajor(String major) {
        this.majorProperty.set(major);
    }


    public String getDegree() {
        return degreeProperty.get();
    }
    public StringProperty degreeProperty() {
        return degreeProperty;
    }
    public void setDegree(String degree) {
        this.degreeProperty.set(degree);
    }

    public int getCapacity() {
        return capacityProperty.get();
    }
    public IntegerProperty capacityProperty() {
        return capacityProperty;
    }
    public void setCapacity(int capacity) {
        this.capacityProperty.set(capacity);
    }
}

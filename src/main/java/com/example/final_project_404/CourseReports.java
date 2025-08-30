package com.example.final_project_404;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serial;
import java.io.Serializable;

public class CourseReports implements Serializable{
    @Serial
    private static final long SerialVersionUID = 1L;

    private final StringProperty nameProperty;
    private final IntegerProperty creditProperty;
    private final StringProperty idProperty;
    private final StringProperty statusProperty;
    private final StringProperty majorProperty;
    private final StringProperty degreeProperty;

    public CourseReports(String name, int credit, String id,String major, String degree, Status status) {
        this.nameProperty = new SimpleStringProperty(name);
        this.idProperty = new SimpleStringProperty(id);
        this.creditProperty = new SimpleIntegerProperty(credit);
        this.statusProperty = new SimpleStringProperty(String.valueOf(status));
        this.majorProperty = new SimpleStringProperty(major);
        this.degreeProperty = new SimpleStringProperty(degree);
    }

    public String getName() {
        return nameProperty.get();
    }
    public StringProperty nameProperty() {
        return nameProperty;
    }
    public void setName(String name) {
        this.nameProperty.set(name);
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

    public int getCredit() {
        return creditProperty.get();
    }
    public IntegerProperty creditProperty() {
        return creditProperty;
    }
    public void setCredit(int credit) {
        this.creditProperty.set(credit);
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
}

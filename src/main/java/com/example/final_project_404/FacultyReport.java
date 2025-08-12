package com.example.final_project_404;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serial;
import java.io.Serializable;

public class FacultyReport implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final StringProperty facultyNameProperty;
    private final StringProperty facultyIdProperty;
    private final IntegerProperty establishmentYearProperty;
    private final StringProperty statusProperty; // "Active" or "Inactive"

    public FacultyReport(String facultyName, String facultyId, int establishmentYear, String status) {
        this.facultyNameProperty = new SimpleStringProperty(facultyName);
        this.facultyIdProperty = new SimpleStringProperty(facultyId);
        this.establishmentYearProperty = new SimpleIntegerProperty(establishmentYear);
        this.statusProperty = new SimpleStringProperty(status);
    }

    public String getFacultyName() { return facultyNameProperty.get(); }
    public StringProperty facultyNameProperty() { return facultyNameProperty; }
    public void setFacultyName(String facultyName) { this.facultyNameProperty.set(facultyName); }

    public String getFacultyId() { return facultyIdProperty.get(); }
    public StringProperty facultyIdProperty() { return facultyIdProperty; }
    public void setFacultyId(String facultyId) { this.facultyIdProperty.set(facultyId); }

    public int getEstablishmentYear() { return establishmentYearProperty.get(); }
    public IntegerProperty establishmentYearProperty() { return establishmentYearProperty; }
    public void setEstablishmentYear(int establishmentYear) { this.establishmentYearProperty.set(establishmentYear); }

    public String getStatus() { return statusProperty.get(); }
    public StringProperty statusProperty() { return statusProperty; }
    public void setStatus(String status) { this.statusProperty.set(status); }
}

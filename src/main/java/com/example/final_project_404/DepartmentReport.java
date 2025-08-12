package com.example.final_project_404;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serial;
import java.io.Serializable;

public class DepartmentReport implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final StringProperty departmentNameProperty;
    private final StringProperty departmentIDProperty;
    private final StringProperty facultyProperty;
    private final StringProperty estYearProperty;
    private final StringProperty statusProperty;

    public DepartmentReport(String departmentName, String departmentID, String faculty, String estYear, String status) {
        this.departmentNameProperty = new SimpleStringProperty(departmentName);
        this.departmentIDProperty = new SimpleStringProperty(departmentID);
        this.facultyProperty = new SimpleStringProperty(faculty);
        this.estYearProperty = new SimpleStringProperty(estYear);
        this.statusProperty = new SimpleStringProperty(status);
    }

    public String getDepartmentName() { return departmentNameProperty.get(); }
    public StringProperty departmentNameProperty() { return departmentNameProperty; }
    public void setDepartmentName(String departmentName) { this.departmentNameProperty.set(departmentName); }

    public String getDepartmentID() { return departmentIDProperty.get(); }
    public StringProperty departmentIDProperty() { return departmentIDProperty; }
    public void setDepartmentID(String departmentID) { this.departmentIDProperty.set(departmentID); }

    public String getFaculty() { return facultyProperty.get(); }
    public StringProperty facultyProperty() { return facultyProperty; }
    public void setFaculty(String faculty) { this.facultyProperty.set(faculty); }

    public String getEstYear() { return estYearProperty.get(); }
    public StringProperty estYearProperty() { return estYearProperty; }
    public void setEstYear(String estYear) { this.estYearProperty.set(estYear); }

    public String getStatus() { return statusProperty.get(); }
    public StringProperty statusProperty() { return statusProperty; }
    public void setStatus(String status) { this.statusProperty.set(status); }
}

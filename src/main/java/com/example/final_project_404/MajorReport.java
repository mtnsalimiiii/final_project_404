package com.example.final_project_404;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serial;
import java.io.Serializable;

public class MajorReport implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final StringProperty majorName;
    private final StringProperty majorId;
    private final StringProperty faculty;
    private final StringProperty department;
    private final IntegerProperty establishmentYear;
    private final StringProperty status;

    public MajorReport(String majorName, String majorId, String faculty, String department, int establishmentYear, String status) {
        this.majorName = new SimpleStringProperty(majorName);
        this.majorId = new SimpleStringProperty(majorId);
        this.faculty = new SimpleStringProperty(faculty);
        this.department = new SimpleStringProperty(department);
        this.establishmentYear = new SimpleIntegerProperty(establishmentYear);
        this.status = new SimpleStringProperty(status);
    }

    public String getMajorName() { return majorName.get(); }
    public void setMajorName(String value) { majorName.set(value); }
    public StringProperty majorNameProperty() { return majorName; }

    public String getMajorId() { return majorId.get(); }
    public void setMajorId(String value) { majorId.set(value); }
    public StringProperty majorIdProperty() { return majorId; }

    public String getFaculty() { return faculty.get(); }
    public void setFaculty(String value) { faculty.set(value); }
    public StringProperty facultyProperty() { return faculty; }

    public String getDepartment() { return department.get(); }
    public void setDepartment(String value) { department.set(value); }
    public StringProperty departmentProperty() { return department; }

    public int getEstablishmentYear() { return establishmentYear.get(); }
    public void setEstablishmentYear(int establishmentYear) { this.establishmentYear.set(establishmentYear); }
    public IntegerProperty establishmentYearProperty() { return establishmentYear; }

    public String getStatus() { return status.get(); }
    public void setStatus(String value) { status.set(value); }
    public StringProperty statusProperty() { return status; }

}

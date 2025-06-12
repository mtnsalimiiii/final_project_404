package com.example.final_project_404;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Employee extends Person{
    private int employeeId;
    private String dateOfHire;
    public Employee(String first_name,String last_name,String dateOfBirth,int employeeId,String dateOfHire){
        //super(first_name,last_name,dateOfBirth);
        this.employeeId=employeeId;
        this.dateOfHire=dateOfHire;
    }
    public String getDateOfHire() {
        return dateOfHire;
    }
    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void addTeacher(){

    }
}

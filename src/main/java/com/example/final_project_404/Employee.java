package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Employee extends Person implements Serializable{
    private String id;
    private String facultyEmployee;
    private String departmentEmployee;

    public Employee(String first_name, String last_name, String dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id, String department, String faculty, String dateOfHire){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber,dateOfHire);
        this.id=id;
        this.departmentEmployee = department;
        this.facultyEmployee = faculty;
    }

    public String getId() {
        return id;
    }
    public void setId(String employeeId) {
        this.id = employeeId;
    }
    public String getFacultyEmployee(){
        return facultyEmployee;
    }
    public void setFacultyEmployee(String facultyEmployee){
        this.facultyEmployee = facultyEmployee;
    }
    public String getDepartmentEmployee(){
        return departmentEmployee;
    }
    public void setDepartmentEmployee(String departmentEmployee){
        this.departmentEmployee = departmentEmployee;
    }

    public static void loadAllEmployee() {
        File file = new File("allEmployees.ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                   University.allEmployees = (List<Employee>) input.readObject();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading students: " + e.getMessage());
        }
    }

    public static void saveAllEmployee() throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("allEmployees.ser"))) {
            output.writeObject(University.allEmployees);
        } catch (IOException e) {
            System.err.println("Error saving Employess list: " + e.getMessage());
        }
    }
}
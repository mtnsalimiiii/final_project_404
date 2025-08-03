package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Employee extends Person implements Serializable{
    private String id;
    private String faculty;
    private String department;

    public Employee(String first_name, String last_name, Date dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id, String department, String faculty, Date dateOfHire, Status status){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber,dateOfHire,status);
        this.id=id;
        this.faculty = faculty;
        this.department = department;
    }

    public String getId() {
        return id;
    }
    public void setId(String employeeId) {
        this.id = employeeId;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setFaculty(String facultyEmployee){
        this.faculty = facultyEmployee;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String departmentEmployee){
        this.department = departmentEmployee;
    }

    public static void loadAllEmployee() {
        University.allEmployees.clear();
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
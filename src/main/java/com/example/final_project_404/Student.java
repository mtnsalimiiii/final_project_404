package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Student extends Person implements Serializable {
    private final String id;
    private String faculty;
    private String department;
    private String major;

    public Student(String first_name, String last_name, Date dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id, Date dateOfRegistration, String faculty, String department, String major,Status status){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber, dateOfRegistration,status);
        this.id=id;
        this.faculty = faculty;
        this.department = department;
        this.major = major;
    }


    public String getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public static void loadAllStudents() {
        File file = new File("allStudents.ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    University.allStudents=(List<Student>) input.readObject();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading students: " + e.getMessage());
        }
    }

    public static void saveAllStudent() throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("allStudents.ser"))) {
            output.writeObject(University.allStudents);
        } catch (IOException e) {
            System.err.println("Error saving Students list: " + e.getMessage());
        }
    }
}
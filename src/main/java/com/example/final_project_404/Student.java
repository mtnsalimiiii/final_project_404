package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Serializable {
    private final String id;
    private String faculty;
    private String department;
    private String major;
    private List<Semester> semesters = new ArrayList<>();


    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    private String degree;

    public Student(String first_name, String last_name, Date dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id, Date dateOfRegistration, String faculty, String department, String major,Status status,String degree){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber, dateOfRegistration,status);
        this.id=id;
        this.faculty = faculty;
        this.department = department;
        this.major = major;
        this.degree=degree;
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
        University.allStudents.clear();
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
    public Semester getSemesterByName(String name) {
        for (Semester s : semesters) {
            if (s.getName().equals(name)) return s;
        }
        return null;
    }
    public List<Semester> getSemesters() {
        return semesters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return id != null && id.equals(other.getId());
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
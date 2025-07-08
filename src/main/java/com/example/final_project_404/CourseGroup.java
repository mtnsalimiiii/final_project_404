package com.example.final_project_404;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseGroup implements Serializable {
    private String semasterCode;
    private String professorName;
    private Status status;
    private int capacity;
    private String id;
    private Map<Student, Double> grades = new HashMap<>();
    private List<Student> enrolledStudents = new ArrayList<>();
    public CourseGroup(String professorName,int capacity,String id,Status status) {
        this.professorName = professorName;
        this.capacity=capacity;
        this.id=id;
        this.status=status;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Status getStatus() {return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getSemasterCode() {
        return semasterCode;
    }
    public void setSemasterCode(String semasterCode) {
        this.semasterCode = semasterCode;
    }

    public String getProfessor() {
        return professorName;
    }
    public void setProfessor(String professorName) {
        this.professorName = professorName;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

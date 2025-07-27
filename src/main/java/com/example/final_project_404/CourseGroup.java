package com.example.final_project_404;

import javax.tools.Diagnostic;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseGroup implements Serializable {
    private Course course;
    private String semasterCode;
    private String professorName;
    private Status status;
    private int capacity;
    private String id;
    private String semesterCode;
    private Map<Student, Double> grades = new HashMap<>();
    private List<Student> enrolledStudents = new ArrayList<>();
    public CourseGroup(String professorName,String semasterCode,int capacity,String id,Status status, Course course) {
        this.professorName = professorName;
        this.semasterCode=semasterCode;
        this.capacity=capacity;
        this.id=id;
        this.status=status;
        this.course=course;
    }
    public String getId() {
        return id;
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

    public List<Student> getRegisteredStudents() {
        return enrolledStudents;
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

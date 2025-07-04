package com.example.final_project_404;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseGroup implements Serializable {
    private Course course;
    private String semasterCode;
    private Professor professor;
    private Status status;

    private Map<Student, Double> grades = new HashMap<>();
    private List<Student> enrolledStudents = new ArrayList<>();

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemasterCode() {
        return semasterCode;
    }
    public void setSemasterCode(String semasterCode) {
        this.semasterCode = semasterCode;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

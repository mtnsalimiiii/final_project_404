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
    private List<Student> enrolledStudents = new ArrayList<>();
    private Map<Student, Double> grades = new HashMap<>();
}

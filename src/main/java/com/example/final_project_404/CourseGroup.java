package com.example.final_project_404;

import javax.tools.Diagnostic;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseGroup implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Course course;
    private String semesterCode;
    private String professorName;
    private Status status;
    private int capacity;
    private String id;
    private Map<String, Double> grades = new HashMap<>();
    private List<Student> enrolledStudents = new ArrayList<>();
    public CourseGroup(String professorName,String semasterCode,int capacity,String id,Status status, Course course) {
        this.professorName = professorName;
        this.semesterCode=semasterCode;
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
        return semesterCode;
    }
    public void setSemasterCode(String semasterCode) {
        this.semesterCode = semasterCode;
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
    public String getProfessorName() {
        return professorName;
    }

    public String getCourseCode() {
        return course != null ? course.getId() : "";
    }

    public String getCourseName() {
        return course != null ? course.getName() : "";
    }

    public int getCredits() {
        return course != null ? course.getCredit() : 0;
    }

    /*public String getGradeForStudent(Student student) {
        return grades.containsKey(student) ? String.valueOf(grades.get(student)) : "-";
    }*/

    public String getStatusText() {
        return status == Status.Active ? "Active" : "Inactive";
    }

    public Double getScore(Student student) {
        return grades.get(student.getId());
    }
    public Map<String, Double> getGrades() {
        return grades;
    }
}

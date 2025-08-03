package com.example.final_project_404;

import javafx.beans.property.*;

public class StudentGradeRow {
    private final StringProperty studentId;
    private final StringProperty studentName;
    private final DoubleProperty score;
    private final StringProperty status;

    public StudentGradeRow(String studentId, String studentName, Double score, String status) {
        this.studentId = new SimpleStringProperty(studentId);
        this.studentName = new SimpleStringProperty(studentName);
        this.score = new SimpleDoubleProperty(score != null ? score : 0.0);
        this.status = new SimpleStringProperty(status);
    }

    public String getStudentId() {
        return studentId.get();
    }
    public void setStudentId(String value) {
        studentId.set(value);
    }
    public StringProperty studentIdProperty() {
        return studentId;
    }

    public String getStudentName() {
        return studentName.get();
    }
    public void setStudentName(String value) {
        studentName.set(value);
    }
    public StringProperty studentNameProperty() {
        return studentName;
    }

    public Double getScore() {
        return score.get();
    }
    public void setScore(Double value) {
        score.set(value);
    }
    public DoubleProperty scoreProperty() {
        return score;
    }

    public String getStatus() {
        return status.get();
    }
    public void setStatus(String value) {
        status.set(value);
    }
    public StringProperty statusProperty() {
        return status;
    }
}

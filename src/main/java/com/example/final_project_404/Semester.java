package com.example.final_project_404;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Semester implements Serializable {
    private String name;
    private Status status;
    private List<CourseGroup> courseGroups;

    public Semester(String name) {
        this.name = name;
        this.status = Status.Active;
        this.courseGroups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<CourseGroup> getCourseGroups() {
        return courseGroups;
    }

    public void addCourseGroup(CourseGroup courseGroup) {
        courseGroups.add(courseGroup);
    }
}

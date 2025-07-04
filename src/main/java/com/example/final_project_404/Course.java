package com.example.final_project_404;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private String name;
    private int credit;
    private String id;
    private Status status;

    public List<CourseGroup> courseGroups = new ArrayList<>();

    public Course(String name,int credit,String id, Status status) {
        this.name = name;
        this.credit=credit;
        this.id=id;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}

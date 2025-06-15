package com.example.final_project_404;

import java.io.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable {
    private String name;
    private int id;
    public List<Major> majors=new ArrayList<>();
    public Department(String name,int id) {
        this.name = name;
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Department{name=" + name + "," + "Id=" + id + "}";
    }
    public void saveToFile() {
        String fileName = "Department_" + name + ".ser";
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(this);
        } catch (IOException e) {
            System.err.println("Error saving Department: " + e.getMessage());
        }
    }
}

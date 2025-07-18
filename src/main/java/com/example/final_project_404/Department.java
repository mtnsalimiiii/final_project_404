package com.example.final_project_404;

import java.io.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Department implements Serializable {
    private String name;
    private int establishmentYear;
    private String id;
    private Status status;

    public List<Major> majors = new ArrayList<>();
    public List<Employee> employees = new ArrayList<>();

    public Department(String name, int establishmentYear, String id, Status status) {
        this.name = name;
        this.establishmentYear = establishmentYear;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getEstablishmentYear(){
        return establishmentYear;
    }
    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

//    public List<Major> getMajors() {
//        return majors;
//    }
//
//    public void addMajor(Major major) {
//        if (major != null) {
//            majors.add(major);
//            saveToFile();
//        }

//    }

    public void addMajor(Major major){
        if(major != null){
            if(!majors.contains(major)){
                majors.add(major);
            }
        }
    }

    public void addEmployee(Employee employee){
        if(employee != null) {
            if (!employees.contains(employee)) {
                employees.add(employee);
            }
        }
    }

//    @Override
//    public String toString() {
//        return "Department{name=" + name + "," + "Id=" + id + "}";
//    }

//    public void saveToFile() {
//        String filename = "Department_" + this.name + ".ser";
//        try {
//            new File(filename).delete();
//            try (ObjectOutputStream oos = new ObjectOutputStream(
//                    new FileOutputStream(filename))) {
//                oos.writeObject(this);
//                oos.flush();
//            }
//        } catch (IOException e) {
//            System.err.println("Error saving department: " + e.getMessage());
//        }
//    }

//    public static Department loadFromFile(String departmentName) {
//        File file = new File("Department_" + departmentName + ".ser");
//        if (!file.exists()){
//            return null;
//        }
//
//        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
//            return (Department) input.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            System.err.println("Error loading department: " + e.getMessage());
//            return null;
//        }
//    }
}

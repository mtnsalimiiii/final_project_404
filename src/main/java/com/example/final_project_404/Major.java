package com.example.final_project_404;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Major implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String id;
    private int establishmentYear;
    private Status status;

    public List<Degree> degrees=new ArrayList<>();
    public List<Student> students = new ArrayList<>();
    public List<Professor> professors = new ArrayList<>();

    public Major(String name, String id, int establishmentYear, Status status) {
        this.name = name;
        this.id = id;
        this.establishmentYear = establishmentYear;
        this.status = status;
    }

//    public void addStudent(Student student) {
//        students.add(student);
//    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEstablishmentYear() {
        return establishmentYear;
    }
    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }

//    public static void addStudentToMajor(String departmentName, String majorName, Student student) {
//        Department department = null;
//        String fileName = "Department_" + departmentName + ".ser";
//        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
//            department = (Department) input.readObject();
//        } catch (Exception e) {
//            System.out.println("Error loading department: " + e.getMessage());
//            return;
//        }
//        boolean found = false;
//        for (Major major : department.majors) {
//            if (major.getName().equalsIgnoreCase(majorName)) {
//                major.addStudent(student);
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Major not found in department");
//            return;
//        }
//        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
//            output.writeObject(department);
//            System.out.println("Student added successfully to major: " + majorName);
//        } catch (IOException e) {
//            System.out.println("Error saving department: " + e.getMessage());
//        }
//    }

    public void addStudent(Student student){
        if(student != null){
            if(!students.contains(student)){
                students.add(student);
            }
        }
    }

    public void addProfessor(Professor professor){
        if(professor != null){
            if(!professors.contains(professor)){
                professors.add(professor);
            }
        }
    }

}

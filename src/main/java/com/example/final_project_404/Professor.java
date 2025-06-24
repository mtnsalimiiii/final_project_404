package com.example.final_project_404;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Professor extends Person implements Serializable {
    private final String id;
    private String faculty;
    private String department;
    private String major;

    public Professor(String first_name, String last_name, String dateOfBirth, String nationalId, Gender gender, String phoneNumber, String id, String dateOfHire, String faculty, String department, String major){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber,dateOfHire);
        this.id = id;
        this.faculty = faculty;
        this.department = department;
        this.major = major;
    }

    public String getId() {
        return id;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    public static void loadAllProfessor() throws Exception {
        File file = new File("allProfessors.ser");
        if (!file.exists()) {
            return;
        }
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        try {
            while (true) {
                try {
                    Professor professor = (Professor) input.readObject();
                    University.allProfessors.add(professor);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading Professors: " + e.getMessage());
        }
        input.close();
    }

//    public static void addProfessor(String firstname,String lastname,String dateOfBirth,String nationalId,Gender gender,String phoneNumber,String professorId,String dateOfHire,String faculty,String department){
//        University.allProfessors.add(new Professor(firstname,lastname,dateOfBirth,nationalId,gender,phoneNumber, professorId, dateOfHire, faculty, department));
//
//    }

    public static void saveAllProfessor() throws IOException {
        File file=new File("allProfessors.ser");
        try(ObjectOutputStream output= new ObjectOutputStream(Files.newOutputStream(Paths.get("allProfessors.ser")))) {
            for (Professor professor : University.allProfessors) {
                output.writeObject(professor);
            }
            output.close();
        }catch (Exception ex){
            System.out.println("Error Saving Professors");
        }
    }
}

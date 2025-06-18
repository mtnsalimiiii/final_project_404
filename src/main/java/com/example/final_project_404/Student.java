package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Student extends Person implements Serializable {
    private final String id;
    private String dateOfRegistratoin;
    public Student(String first_name, String last_name, String dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id, String dateOfRegistration){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber);
        this.id=id;
        this.dateOfRegistratoin = dateOfRegistration;
    }
    public Student() {
        super();
        this.id = "";
    }

    public String getId() {
        return id;
    }
    public static void loadAllStudents() {
        File file = new File("allStudents.ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    University.allStudents=(List<Student>) input.readObject();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading students: " + e.getMessage());
        }
    }
    public static void saveAllStudent() throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("allStudents.ser"))) {
            output.writeObject(University.allStudents);
        } catch (IOException e) {
            System.err.println("Error saving Students list: " + e.getMessage());
        }
    }
}
package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Student extends Person implements Serializable {
    private String id;
    public Student(String first_name, String last_name, String dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber);
        this.id=id;
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
                    Student student = (Student) input.readObject();
                    University.allStudents.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading students: " + e.getMessage());
        }
    }


    public static void addStudent(Student student,String majorName){
        University.allStudents.add(student);

    }
    public static void saveStudent() throws IOException {
        File file=new File("allStudents.ser");
        try(ObjectOutputStream output= new ObjectOutputStream(Files.newOutputStream(Paths.get("allStudents.ser")))) {
            for (Student student : University.allStudents) {
                output.writeObject(student);
            }
            output.close();
        }catch (Exception ex){
            System.out.println("Error Saving Students");
        }
    }
}
package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Student extends Person implements Serializable {
    private int id;
    private String dateOfRegistration;
    public Student(String first_name, String last_name, String dateOfBirth, String nationalId, String phoneNumber, int id, String dateOfRegistration){
        super(first_name,last_name,dateOfBirth,nationalId,phoneNumber);
        this.id=id;
        this.dateOfRegistration=dateOfRegistration;
    }
    public Student() {
        super();
        this.id = 0;
        this.dateOfRegistration=dateOfRegistration;
    }
    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
    public static void loadStudents() throws Exception {
        File file = new File("StudentsList.ser");
        if (!file.exists()) {
            return;
        }
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        try {
            while (true) {
                try {
                    Student student = (Student) input.readObject();
                    allStudents.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading students: " + e.getMessage());
        }
        input.close();
    }
    public static void addStudent(){
        allStudents.add(new Student("ali","ganji","Salam","25255","09211608894",1,"1"));
    }
    public static void saveStudent() throws IOException {
        File file=new File("StudentsList.ser");
        try(ObjectOutputStream output= new ObjectOutputStream(Files.newOutputStream(Paths.get("StudentsList.ser")))) {
            for (Student student : allStudents) {
                output.writeObject(student);
            }
            output.close();
        }catch (Exception ex){
            System.out.println("Error Saving Students");
        }
    }
}
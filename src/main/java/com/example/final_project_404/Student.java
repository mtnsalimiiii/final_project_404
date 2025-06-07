package com.example.final_project_404;

import java.io.*;
import java.util.ArrayList;

public class Student extends Person implements Serializable{
    private int id;
    public static ArrayList<Student> students=new ArrayList<>();
    public Student(String first_name,String last_name,String dateOfBirth,int id){
        super(first_name,last_name,dateOfBirth);
        this.id=id;
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
                    students.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading students: " + e.getMessage());
        }
    }
}

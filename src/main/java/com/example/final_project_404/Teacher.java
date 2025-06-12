package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Teacher extends Person implements Serializable {
    private String id;
    public Teacher(String first_name, String last_name, String dateOfBirth, String nationalId, String phoneNumber, String id){
        super(first_name,last_name,dateOfBirth,nationalId,phoneNumber);
        this.id=id;
    }
    public Teacher() {
        super();
        this.id = "0";
    }
    public String getId() {
        return id;
    }
    public static void loadTeacher() throws Exception {
        File file = new File("TeachersList.ser");
        if (!file.exists()) {
            return;
        }
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        try {
            while (true) {
                try {
                    Teacher teacher = (Teacher) input.readObject();
                    University.allTeachers.add(teacher);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading teachers: " + e.getMessage());
        }
        input.close();
    }
    public static void addteacher(String firstname,String lastname,String date,String nationalId,String number){
        University.allTeachers.add(new Teacher("ali","ganji","25255","09211608894","1","1"));
    }
    public static void saveTeacher() throws IOException {
        File file=new File("TeachersList.ser");
        try(ObjectOutputStream output= new ObjectOutputStream(Files.newOutputStream(Paths.get("TeachersList.ser")))) {
            for (Teacher teacher : University.allTeachers) {
                output.writeObject(teacher);
            }
            output.close();
        }catch (Exception ex){
            System.out.println("Error Saving Teachers");
        }
    }
}

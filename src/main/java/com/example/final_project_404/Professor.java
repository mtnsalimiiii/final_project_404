package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Professor extends Person implements Serializable {
    private final String id;
    private String dateOfHire;
    public Professor(String first_name, String last_name, String dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id, String dateOfHire){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber);
        this.id = id;
        this.dateOfHire = dateOfHire;
    }
    public String getId() {
        return id;
    }
    public static void loadProfessor() throws Exception {
        File file = new File("ProfessorsList.ser");
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
    public static void addProfessor(String firstname,String lastname,String date,String nationalId,Gender gender,String number,String id){
        University.allProfessors.add(new Professor("ali","ganji","30-11-2005","25255",Gender.Male,"09211608894", "1234", "12-06-2025"));
    }
    public static void saveProfessor() throws IOException {
        File file=new File("ProfessorsList.ser");
        try(ObjectOutputStream output= new ObjectOutputStream(Files.newOutputStream(Paths.get("ProfessorsList.ser")))) {
            for (Professor professor : University.allProfessors) {
                output.writeObject(professor);
            }
            output.close();
        }catch (Exception ex){
            System.out.println("Error Saving Professors");
        }
    }
}

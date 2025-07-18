package com.example.final_project_404;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class University implements Serializable{
    public static List<Professor> allProfessors = new ArrayList<>();
    public static List<Employee> allEmployees = new ArrayList<>();
    public static List<Student> allStudents = new ArrayList<>();
    public static List<Faculty> allFaculties = new ArrayList<>();

    public static void loadFaculties() {
        File file = new File("Faculties.ser");
        if (!file.exists()){
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            allFaculties = (List<Faculty>) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading faculty list: " + e.getMessage());
        }
    }

    public static void saveFaculties() {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Faculties.ser"))) {
            output.writeObject(allFaculties);
        } catch (IOException e) {
            System.err.println("Error saving faculty list: " + e.getMessage());
        }
    }

    public static Faculty findFacultyByName(String name) {
        for (Faculty faculty : allFaculties) {
            if (faculty.getFacultyName().equalsIgnoreCase(name)) {
                return faculty;
            }
        }
        return null;
    }

//    public static void addFaculty(Faculty faculty) {
//        allFaculties.add(faculty);
//        faculty.saveToFile();
//    }


    public int getEstablishmetYear() {
        return  1991;
    }

    public String getUniName() {
        return "imam khomeini international university";
    }

    public String getUniCity() {
        return "qazvin";
    }

}

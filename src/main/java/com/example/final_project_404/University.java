package com.example.final_project_404;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class University {
    public static List<Teacher> allTeachers = new ArrayList<>();
    public static List<Employee> allEmployees = new ArrayList<>();
    public static List<Student> allStudents = new ArrayList<>();
    public static List<Faculty> allFaculties = new ArrayList<>();
    private String name;
    private String address;
    private int establishmetYear;
    public static List<Faculty> faculties=new ArrayList<>();
    public static void loadFaculties() {
        File file = new File("Faculties.ser");
        if (!file.exists()) return;

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            faculties = (List<Faculty>) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading faculty list: " + e.getMessage());
        }
    }

    public static void saveFaculties() {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Faculties.ser"))) {
            output.writeObject(faculties);
        } catch (IOException e) {
            System.err.println("Error saving faculty list: " + e.getMessage());
        }
    }

    public static Faculty findFacultyByName(String name) {
        for (Faculty faculty : faculties) {
            if (faculty.getFacultyName().equalsIgnoreCase(name)) {
                return faculty;
            }
        }
        return null;
    }

    public static void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        saveFaculties();
        faculty.saveToFile();
    }
    /*public static void loadFaculty() {
        File file = new File("Faculties.ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Faculty faculty = (Faculty) input.readObject();
                    faculties.add(faculty);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading faculties: " + e.getMessage());
        }
    }
    public static void addFaculty(Faculty faculty) {
        if (faculty != null) {
            faculties.add(faculty);
            String fileName = "Faculty_" + faculty.getFacultyName() + ".ser";
            fileName = fileName.replaceAll("[^a-zA-Z0-9.-]", "_");

            try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
                output.writeObject(faculty);
                System.out.println("Faculty file created: " + fileName);
            } catch (IOException e) {
                System.err.println("Error creating faculty file: " + e.getMessage());
            }
        }
    }
    public static void saveFaculty() {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Faculties.ser"))) {
            for (Faculty faculty : faculties) {
                output.writeObject(faculty);
            }
        } catch (IOException ex) {
            System.err.println("Error Saving faculties: " + ex.getMessage());
        }
    }*/
}

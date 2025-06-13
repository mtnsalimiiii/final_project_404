package com.example.final_project_404;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;

public class Major {
    private String name;
    private int id;
    public List<Major> majors=new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*public void loadMajor(String name){
        File file = new File("Department_"+name+".ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Major major = (Major) input.readObject();
                    majors.add(major);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading major: " + e.getMessage());
        }
*/
    public static void addStudentToMajor(String departmentName, String majorName, Student student) {
        Department department = null;
        String fileName = "Department_" + departmentName + ".ser";
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            department = (Department) input.readObject();
        } catch (Exception e) {
            System.out.println("Error loading department: " + e.getMessage());
            return;
        }
        boolean found = false;
        for (Major major : department.majors) {
            if (major.getName().equalsIgnoreCase(majorName)) {
                major.addStudent(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Major not found in department");
            return;
        }
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(department);
            System.out.println("Student added successfully to major: " + majorName);
        } catch (IOException e) {
            System.out.println("Error saving department: " + e.getMessage());
        }
    }
}

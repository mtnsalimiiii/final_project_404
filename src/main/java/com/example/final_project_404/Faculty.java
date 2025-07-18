package com.example.final_project_404;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Faculty implements Serializable {
    private String facultyName;
    private String id;
    private int establishmentYear;
    private Status status;

    public List<Department> departments = new ArrayList<>();

    public Faculty(String facultyName, String id, int establishmentYear, Status status) {
        this.facultyName = facultyName;
        this.id = id;
        this.establishmentYear = establishmentYear;
        this.status = status;
    }

    public String getFacultyName() { return facultyName; }
    public void setFacultyName(String name){
        this.facultyName = name;
    }

    public String getId() { return id; }
    public void setId(String id1){
        this.id = id1;
    }

    public int getEstablishmentYear() { return establishmentYear;}
    public void setEstablishmentYear(int establishmentYear1){
        this.establishmentYear = establishmentYear1;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

//    public List<String> getDepartmentNames() {
//        return departmentNames;

//    }
//    public Department getDepartment(String departmentName) {
//        if (!departmentNames.contains(departmentName)) return null;
//
//        String fileName = "Department_" + departmentName + ".ser";
//        File file = new File(fileName);
//        if (!file.exists()) return null;
//
//        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
//            return (Department) input.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            System.err.println("Error loading department: " + e.getMessage());
//            return null;
//        }

//    }


    public void addDepartment(Department department) {
//        if (department != null) {
//            if (!departmentNames.contains(department.getName())) {
//                departmentNames.add(department.getName());
//                saveToFile();
//                department.saveToFile();
//            }
//        }// amir
        if(department != null){
            if(!departments.contains(department)){
                departments.add(department);
            }
        }// matin
    }

//    public void saveToFile() {
//        String fileName = "Faculty_" + facultyName + ".ser";
//        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
//            output.writeObject(this);
//        } catch (IOException e) {
//            System.err.println("Error saving faculty: " + e.getMessage());
//        }
//    }

//    public static Faculty loadFromFile(String facultyName) throws FileNotFoundException {
//        File file = new File("Faculty_" + facultyName + ".ser");
//        if (!file.exists()) {
//            throw new FileNotFoundException("Faculty file not found for: " + facultyName);
//        }
//
//        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
//            return (Faculty) input.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            System.err.println("Error loading faculty: " + e.getMessage());
//            return null;
//        }
//
//    }
    /*private String facultyName;
    private int id;
    //private int numberOfDepartment;
    public static List<Department> departments = new ArrayList<>();
    public Faculty(String facultyNAme,int id) {
        this.facultyName=facultyNAme;
        this.id = id;
    }
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public int getId() {
        return id;
    }

    public void setNumberOfDepartment(int id) {
        this.id = id;
    }
    public void loadDepartment(String name){
        File file = new File("Faculties_"+name+".ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Department department = (Department) input.readObject();
                    departments.add(department);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading departments: " + e.getMessage());
        }
    }
    public  void addDepartment(Department department) {
        if (department != null) {
            departments.add(department);
            String fileName = "Department_" + department.getName() + ".ser";
            fileName = fileName.replaceAll("[^a-zA-Z0-9.-]", "_");

            try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
                output.writeObject(department);
                System.out.println("Faculty file created: " + fileName);
            } catch (IOException e) {
                System.err.println("Error creating faculty file: " + e.getMessage());
            }
        }
    }
    public void saveFaculty(String name) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Faculties_"+name+".ser"))) {
            for (Department department : departments) {
                output.writeObject(department);
            }
        } catch (IOException ex) {
            System.err.println("Error Saving departments: " + ex.getMessage());
        }
    }
    public static void loadDepartment(String departmentName,String majorName) {
        File file = new File("Department_"+departmentName+".ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Department department = (Department) input.readObject();
                    departments.add(department);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading students: " + e.getMessage());
        }
    }*/
}

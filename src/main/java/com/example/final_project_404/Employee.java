package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Employee extends Person implements Serializable{
    private String id;
    public Employee(String first_name, String last_name, String dateOfBirth, String nationalId,Gender gender, String phoneNumber, String id){
        super(first_name,last_name,dateOfBirth,nationalId,gender,phoneNumber);
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String employeeId) {
        this.id = employeeId;
    }
    public static void loadAllEmployee() {
        File file = new File("allEmployees.ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                   University.allEmployees=(List<Employee>) input.readObject();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading students: " + e.getMessage());
        }
    }
    public static void saveEmployee() throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("allEmployees.ser"))) {
            output.writeObject(University.allEmployees);
        } catch (IOException e) {
            System.err.println("Error saving Employess list: " + e.getMessage());
        }
    }
}

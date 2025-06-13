package com.example.final_project_404;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Employee extends Person{
    private String id;
    public Employee(String first_name, String last_name, String dateOfBirth, String nationalId, String phoneNumber, String id){
        super(first_name,last_name,dateOfBirth,nationalId,phoneNumber);
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
                    Employee employee = (Employee) input.readObject();
                    University.allEmployees.add(employee);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading students: " + e.getMessage());
        }
    }
    public static void addEmployee(){
        University.allEmployees.add(new Employee("ali","ganji","25255","09211608894","1","1"));
    }
    public static void saveEmployee() throws IOException {
        File file=new File("allEmployees.ser");
        try(ObjectOutputStream output= new ObjectOutputStream(Files.newOutputStream(Paths.get("allEmployees.ser")))) {
            for (Employee employee : University.allEmployees) {
                output.writeObject(employee);
            }
            output.close();
        }catch (Exception ex){
            System.out.println("Error Saving employee");
        }
    }
}

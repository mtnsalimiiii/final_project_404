package com.example.final_project_404;


import java.util.ArrayList;

public class Faculty {
    private String FacultyName;
    private int numberOfDepartment;
    private ArrayList<String> department = new ArrayList<String>();



    public void addDepartment(String department_name){
        department.add(department_name);
    }
    public void removeDepartment(String department_name){
        department.remove(department_name);
    }
    public void updateDepartment(String lastDepartment, String newDepartment){
        int indexOfPreviousDepartment = department.indexOf(lastDepartment);
        department.set(indexOfPreviousDepartment, newDepartment);
    }
    public void getDepartment(int index){
        department.get(index);
    }
}

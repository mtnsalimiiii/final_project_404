package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ResourceBundle;

public class AddEmployeeAdminPortalController implements Initializable {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private DatePicker dateOfBirthRegisterEmployeeAdmin;

    @FXML
    private ComboBox<String> departmentChooserRegisterEmployeeAdmin;

    @FXML
    private ComboBox<String> facultyChooserRegisterEmployeeAdmin;

    @FXML
    private TextField firstnameRegisterEmployeeAdmin;

    @FXML
    private ComboBox<Gender> genderChooserRegisterEmployeeAdmin;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField lastnameRegisterEmployeeAdmin;

    @FXML
    private TextField nationalIdRegisterEmployeeAdmin;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TextField phoneNumberRegisterEmployeeAdmin;


    @FXML
    void addDepartmentAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddMajorAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportsAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateDepartmentAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateMajorAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public Date getDateOfBirth(ActionEvent event) {
        Date dateOfBirth = new Date();
        dateOfBirth.setYear(dateOfBirthRegisterEmployeeAdmin.getValue().getYear());
        dateOfBirth.setMonth(dateOfBirthRegisterEmployeeAdmin.getValue().getMonthValue());
        dateOfBirth.setDay(dateOfBirthRegisterEmployeeAdmin.getValue().getDayOfMonth());
        return dateOfBirth;
    }

    public Date getDateOfHire(){
        Date date = new Date();
        date.setYear(LocalDate.now().getYear());
        date.setMonth(LocalDate.now().getMonthValue());
        date.setDay(LocalDate.now().getDayOfMonth());
        return date;
    }

    public String getEmployeeId(){
        return "EMP"+(University.allEmployees.size()+1);
    }

    public void addNewEmployee(ActionEvent event) throws IOException {
        Employee.loadAllEmployee();
        University.loadFaculties();

        Date dateOfBirth = getDateOfBirth(event);
        String firstName = firstnameRegisterEmployeeAdmin.getText().trim();
        String lastName = lastnameRegisterEmployeeAdmin.getText().trim();
        String phoneNumber = phoneNumberRegisterEmployeeAdmin.getText().trim();
        String nationalId = nationalIdRegisterEmployeeAdmin.getText().trim();
        Gender gender = genderChooserRegisterEmployeeAdmin.getValue();
        String faculty = facultyChooserRegisterEmployeeAdmin.getValue();
        String department = departmentChooserRegisterEmployeeAdmin.getValue();
        Date dateOfHire = getDateOfHire();
        String id = getEmployeeId();

        if (!firstName.isBlank() && !lastName.isBlank() && !phoneNumber.isBlank() && !nationalId.isBlank() && gender!=null && faculty!=null && department!=null) {
            Employee employee = new Employee(firstName, lastName, dateOfBirth, nationalId, gender, phoneNumber, id, department, faculty, dateOfHire, Status.Active);
            for (Faculty faculty1 : University.allFaculties) {
                if (faculty1.getFacultyName().equals(faculty) && faculty1.getStatus().equals(Status.Active)) {
                    for (Department department1 : faculty1.departments) {
                        if (department1.getName().equals(department) && department1.getStatus().equals(Status.Active)) {
                            if (!department1.employees.contains(employee)) {
                                department1.employees.add(employee);

                            } else {
                                System.out.println("This Employee has Registered earlier!!");
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            University.saveFaculties();

            University.allEmployees.add(employee);
            Employee.saveAllEmployee();
            System.out.println("Successful\nid : " + id);
            System.out.println("Password : National ID");
            System.out.println();
            System.out.println(firstName+" "+lastName);
            System.out.println(dateOfBirth);
            System.out.println(phoneNumber);
            System.out.println(nationalId);
            System.out.println(gender);
            System.out.println(faculty);
            System.out.println(department);
            System.out.println(dateOfHire);

            Parent root = FXMLLoader.load(getClass().getResource("AddEmployeeAdminPortal.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Add New Employee");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else {
            System.out.println("Please Fill All Fields!");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        for(Faculty faculty : University.allFaculties){
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserRegisterEmployeeAdmin.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserRegisterEmployeeAdmin.setVisibleRowCount(4);

        facultyChooserRegisterEmployeeAdmin.setOnAction(e -> {
            departmentChooserRegisterEmployeeAdmin.getItems().clear();
            departmentChooserRegisterEmployeeAdmin.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserRegisterEmployeeAdmin.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserRegisterEmployeeAdmin.getItems().add(department.getName());
                        }
                    }
                    departmentChooserRegisterEmployeeAdmin.setVisibleRowCount(4);
                    break;
                }
            }
        });

        genderChooserRegisterEmployeeAdmin.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserRegisterEmployeeAdmin.setVisibleRowCount(2);
    }
}

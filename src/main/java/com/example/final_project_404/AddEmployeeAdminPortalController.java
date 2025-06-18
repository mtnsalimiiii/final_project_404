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
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddMajorAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportsAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root, 350, 480);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateDepartmentAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 530);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateMajorAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public String getDateOfBirth(ActionEvent event) {
        return dateOfBirthRegisterEmployeeAdmin.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public String getDateOfHire(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getId(List<Employee> employees){
        return "EMP"+(employees.size()+1);
    }
    public void addNewEmployee(ActionEvent event) throws IOException {
        String dateOfBirth = getDateOfBirth(event);
        String firstName = firstnameRegisterEmployeeAdmin.getText().trim();
        String lastName = lastnameRegisterEmployeeAdmin.getText().trim();
        String phoneNumber = phoneNumberRegisterEmployeeAdmin.getText().trim();
        String nationalId = nationalIdRegisterEmployeeAdmin.getText().trim();
        Gender gender = genderChooserRegisterEmployeeAdmin.getValue();
        String faculty = facultyChooserRegisterEmployeeAdmin.getValue();
        String department = departmentChooserRegisterEmployeeAdmin.getValue();
        String dateOfHire = getDateOfHire();
        Employee.loadAllEmployee();
        String id = getId(University.allEmployees);
        Employee emp = new Employee(firstName,lastName,dateOfBirth,nationalId,gender,phoneNumber,id);
        University.allEmployees.add(emp);
        Employee.saveEmployee();
        Department dep = Department.loadFromFile(department);
        if (dep == null) {
            System.out.println("Department not found: " + department);
            return;
        }

        dep.employees.add(emp);
        dep.saveToFile();
        System.out.println("Successful\nid : "+id);
        System.out.println("Password : National ID");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        for(Faculty faculty : University.faculties){
            facultyChooserRegisterEmployeeAdmin.getItems().add(faculty.getFacultyName());
        }
        facultyChooserRegisterEmployeeAdmin.setVisibleRowCount(4);

        facultyChooserRegisterEmployeeAdmin.setOnAction(e -> {
            String selectedFaculty = facultyChooserRegisterEmployeeAdmin.getValue();
            departmentChooserRegisterEmployeeAdmin.getItems().clear();
            Faculty faculty1 = null;
            try {
                faculty1 = Faculty.loadFromFile(selectedFaculty);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            if (faculty1 != null) {
                departmentChooserRegisterEmployeeAdmin.getItems().addAll(faculty1.getDepartmentNames());
                departmentChooserRegisterEmployeeAdmin.setVisibleRowCount(4);
            }
        });

        genderChooserRegisterEmployeeAdmin.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserRegisterEmployeeAdmin.setVisibleRowCount(2);
    }
}

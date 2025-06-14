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

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private ComboBox<String> majorChooserRegisterEmployeeAdmin;

    @FXML
    private TextField nationalidRegisterEmployeeAdmin;

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

    public String getDateOfBirth(ActionEvent event) {
        return dateOfBirthRegisterEmployeeAdmin.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public String getDateOfHire(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void addNewEmployee(ActionEvent event) {
        String dateOfBirth = getDateOfBirth(event);
        String firstName = firstnameRegisterEmployeeAdmin.getText().trim();
        String lastName = lastnameRegisterEmployeeAdmin.getText().trim();
        String phoneNumber = phoneNumberRegisterEmployeeAdmin.getText().trim();
        String nationalId = nationalidRegisterEmployeeAdmin.getText().trim();
        Gender gender = genderChooserRegisterEmployeeAdmin.getValue();
        String faculty = facultyChooserRegisterEmployeeAdmin.getValue();
        String department = departmentChooserRegisterEmployeeAdmin.getValue();
        String major = majorChooserRegisterEmployeeAdmin.getValue();
        String dateOfHire = getDateOfHire();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        departmentChooserRegisterEmployeeAdmin.getItems().addAll("Computer Engineering", "Electrical Engineering", "Civil Engineering", "Mechanical Engineering", "Mining engineering");
        departmentChooserRegisterEmployeeAdmin.setVisibleRowCount(5);

        facultyChooserRegisterEmployeeAdmin.getItems().addAll("Faculty of Technology and Engineering", "Faculty of Basic Sciences", "Faculty of Social Sciences", "Faculty of Literature and Humanities", "Faculty of Architecture and Urban Planning", "Faculty of Agriculture", "Faculty of Islamic Sciences and Research");
        facultyChooserRegisterEmployeeAdmin.setVisibleRowCount(5);

        majorChooserRegisterEmployeeAdmin.getItems().addAll("Software","Faculty of Technology and Engineering", "Faculty of Basic Sciences", "Faculty of Social Sciences", "Faculty of Literature and Humanities", "Faculty of Architecture and Urban Planning", "Faculty of Agriculture", "Faculty of Islamic Sciences and Research");
        majorChooserRegisterEmployeeAdmin.setVisibleRowCount(5);

        genderChooserRegisterEmployeeAdmin.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserRegisterEmployeeAdmin.setVisibleRowCount(2);
    }
}

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
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class RegisterProfessorController implements Initializable {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private DatePicker dateOfBirthRegisterProfessorEmployee;

    @FXML
    private ComboBox<String> departmentChooserRegisterProfessorEmployee;

    @FXML
    private ComboBox<String> facultyChooserRegisterProfessorEmployee;

    @FXML
    private TextField firstnameRegisterProfessorEmployee;

    @FXML
    private ComboBox<Gender> genderChooserRegisterProfessorEmployee;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField lastnameRegisterProfessorEmployee;

    @FXML
    private ComboBox<String> majorChooserRegisterProfessorEmployee;

    @FXML
    private TextField nationalidRegisterProfessorEmployee;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TextField phoneNumberRegisterProfessorEmployee;

    @FXML
    void RegisterNewStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterStudent.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Register New Student");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMainPagePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Employee Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void professorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfessorsEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Professors");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root, 350, 480);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void studentsEmpoyeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Students");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void addNewProfessor(ActionEvent event) {
        String dateOfBirth = getDateOfBirth(event);
        String firstName = firstnameRegisterProfessorEmployee.getText().trim();
        String lastName = lastnameRegisterProfessorEmployee.getText().trim();
        String phoneNumber = phoneNumberRegisterProfessorEmployee.getText().trim();
        String nationalId = nationalidRegisterProfessorEmployee.getText().trim();
        Gender gender = genderChooserRegisterProfessorEmployee.getValue();
        String faculty = facultyChooserRegisterProfessorEmployee.getValue();
        String department = departmentChooserRegisterProfessorEmployee.getValue();
        String major = majorChooserRegisterProfessorEmployee.getValue();
    }

    public String getDateOfBirth(ActionEvent event) {
        return dateOfBirthRegisterProfessorEmployee.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        departmentChooserRegisterProfessorEmployee.getItems().addAll("Computer Engineering", "Electrical Engineering", "Civil Engineering", "Mechanical Engineering", "Mining engineering");
        departmentChooserRegisterProfessorEmployee.setVisibleRowCount(5);

        facultyChooserRegisterProfessorEmployee.getItems().addAll("Faculty of Technology and Engineering", "Faculty of Basic Sciences", "Faculty of Social Sciences", "Faculty of Literature and Humanities", "Faculty of Architecture and Urban Planning", "Faculty of Agriculture", "Faculty of Islamic Sciences and Research");
        facultyChooserRegisterProfessorEmployee.setVisibleRowCount(5);

        majorChooserRegisterProfessorEmployee.getItems().addAll("Software","Faculty of Technology and Engineering", "Faculty of Basic Sciences", "Faculty of Social Sciences", "Faculty of Literature and Humanities", "Faculty of Architecture and Urban Planning", "Faculty of Agriculture", "Faculty of Islamic Sciences and Research");
        majorChooserRegisterProfessorEmployee.setVisibleRowCount(5);

        genderChooserRegisterProfessorEmployee.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserRegisterProfessorEmployee.setVisibleRowCount(2);

    }
}

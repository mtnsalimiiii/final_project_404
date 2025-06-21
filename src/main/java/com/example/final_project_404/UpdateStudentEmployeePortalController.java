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
import java.util.ResourceBundle;

public class UpdateStudentEmployeePortalController implements Initializable {

    @FXML
    private VBox containerBarDeactiveVBox;

    @FXML
    private VBox containerBarEditVBox;

    @FXML
    private DatePicker dateOfBirthUpdateEmployee;

    @FXML
    private ComboBox<String> departmentChooserDeactiveUpdateEmployee;

    @FXML
    private ComboBox<String> departmentChooserEditUpdateEmployee;

    @FXML
    private ComboBox<String> employeeChooserDeactiveUpdateEmployee;

    @FXML
    private ComboBox<String> employeeChooserEditUpdateEmployee;

    @FXML
    private ComboBox<String> facultyChooserDeactiveUpdateEmployee;

    @FXML
    private ComboBox<String> facultyChooserEditUpdateEmployee;

    @FXML
    private TextField firstNameUpdateEmployee;

    @FXML
    private ComboBox<Gender> genderChooserUpdateEmployee;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField lastNameUpdateEmployee;

    @FXML
    private TextField nationalIdUpdateEmployee;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private ComboBox<String> operationChooserUpdateStudentEmployee;

    @FXML
    private TextField phoneNumberUpdateEmployee;

    @FXML
    void RegisterNewProfessorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterProfessor.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Register New Professor");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

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
    void StudentsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Students");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void UpdateProfessorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateProfessorEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Professor");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Employee Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void deactiveEmployee(ActionEvent event) {

    }

    @FXML
    void editEmployee(ActionEvent event) {

    }

    @FXML
    void professorsEmployeePortal(ActionEvent event) throws IOException {
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
        stage.setTitle("Report");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void setEmployeeChooserEditUpdateEmployee(ActionEvent event) {

    }

    @FXML
    void setOperationChooserUpdateStudentEmployee(ActionEvent event) {
        if(operationChooserUpdateStudentEmployee.getValue().equals("EDIT")){
            containerBarDeactiveVBox.setDisable(true);
            containerBarEditVBox.setDisable(false);
        } else if(operationChooserUpdateStudentEmployee.getValue().equals("DEACTIVE")){
            containerBarEditVBox.setDisable(true);
            containerBarDeactiveVBox.setDisable(false);
        }
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        operationChooserUpdateStudentEmployee.getItems().addAll("EDIT", "DEACTIVE");
        operationChooserUpdateStudentEmployee.setVisibleRowCount(2);


    }
}

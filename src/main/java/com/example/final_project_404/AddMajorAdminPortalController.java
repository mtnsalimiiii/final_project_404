package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AddMajorAdminPortalController implements Initializable {


    @FXML
    private VBox containerBarVBox;

    @FXML
    private ComboBox<String> departmentChooserAddMajorAdmin;

    @FXML
    private ComboBox<String> facultyChooserAddMajorAdmin;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField majorNameAddMajorAdmin;

    @FXML
    private VBox navigationBarVBox;

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
    void addEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Employee");
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
    public int getMajorId(String faculty, String department){
        int id = 11;
        for(Faculty faculty1 : University.faculties){
            if(faculty1.getFacultyName()==faculty){
                for(Department department1 : faculty1.departments){
                    if(department1.getName()==department){
                        id = department1.majors.size()+11;
                    }
                }
            }
        }
        return id;
    }
    public int getPublishYear(){
        return LocalDate.now().getYear();
    }
    public void addNewMajor(ActionEvent event) {
        String faculty = facultyChooserAddMajorAdmin.getValue().trim();
        String department = departmentChooserAddMajorAdmin.getValue().trim();
        String nameMajor = majorNameAddMajorAdmin.getText();
        int publishYear = getPublishYear();
        int majorId = getMajorId(faculty, department);
        System.out.println("faculty: " + faculty);
        System.out.println("department: " + department);
        System.out.println("majorName: " + nameMajor);
        System.out.println("publish year: " + publishYear);
        System.out.println("major id: " + majorId);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        departmentChooserAddMajorAdmin.getItems().addAll("1", "2", "3", "4");
        departmentChooserAddMajorAdmin.setVisibleRowCount(4);

        facultyChooserAddMajorAdmin.getItems().addAll("1", "2", "3", "4");
        facultyChooserAddMajorAdmin.setVisibleRowCount(4);
    }
}

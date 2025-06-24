package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.net.InterfaceAddress;
import java.net.URL;
import java.util.IllegalFormatCodePointException;
import java.util.ResourceBundle;

public class UpdateMajorAdminPortalController implements Initializable {

    @FXML
    private VBox containerBarDeactiveVBox;

    @FXML
    private VBox containerBarEditVBox;

    @FXML
    private Button deactiveButton;

    @FXML
    private ComboBox<String> departmentChooserDeactive;

    @FXML
    private ComboBox<String> departmentChooserEdit;

    @FXML
    private Button editButton;

    @FXML
    private ComboBox<String> facultyChooserDeactive;

    @FXML
    private ComboBox<String> facultyChooserEdit;

    @FXML
    private HBox headerHBox;

    @FXML
    private ComboBox<String> majorChooserDeactive;

    @FXML
    private ComboBox<String> majorChooserEdit;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TextField newEstablishmentYearEditMajor;

    @FXML
    private TextField newMajorNameEditMajor;

    @FXML
    private ComboBox<String> operationChooserUpdateMajorAdmin;

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
    void addMajorAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddMajorAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void deactiveMajor(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserDeactive.getValue())){
                        department.majors.removeIf( major -> major.getName().equals(majorChooserDeactive.getValue()));
                        break;
                    }
                }
                break;
            }
        }
        University.saveFaculties();
        System.out.println("successful");

        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 530);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void editMajor(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEdit.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEdit.getValue())){
                        for (Major major : department.majors){
                            if (major.getName().equals(majorChooserEdit.getValue())){
                                if (!newMajorNameEditMajor.getText().isBlank()){
                                    major.setName(newMajorNameEditMajor.getText());
                                }
                                if (!newEstablishmentYearEditMajor.getText().isBlank()){
                                    major.setEstablishmentYear(Integer.parseInt(newEstablishmentYearEditMajor.getText()));
                                }
                                System.out.println("successful");
                                System.out.println(major.getName());
                                System.out.println(major.getEstablishmentYear());
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        University.saveFaculties();

        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 530);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ProfileAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ReportsAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void setDepartmentDeactive(ActionEvent event) {

    }

    @FXML
    void setDepartmentEdit(ActionEvent event) {

    }

    @FXML
    void setFacultyDeactive(ActionEvent event) {

    }

    @FXML
    void setFacultyEdit(ActionEvent event) {

    }

    @FXML
    void setMajorDeactive(ActionEvent event) {

    }

    @FXML
    void setMajorEdit(ActionEvent event) {

    }

    @FXML
    void setOperationChooserUpdateMajor(ActionEvent event) {
        if(operationChooserUpdateMajorAdmin.getValue().equals("EDIT")){
            containerBarEditVBox.setDisable(false);
            containerBarDeactiveVBox.setDisable(true);
            //newMajorNameEditMajor.setDisable(true);
            //newEstablishmentYearEditMajor.setDisable(true);
            //editButton.setDisable(true);
        } else if (operationChooserUpdateMajorAdmin.getValue().equals("DEACTIVE")) {
            containerBarDeactiveVBox.setDisable(false);
            containerBarEditVBox.setDisable(true);
            //deactiveButton.setDisable(true);
        }
    }

    @FXML
    void signOutAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root, 350, 480);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateDepartmentAdminPortal(ActionEvent event) throws IOException{
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        operationChooserUpdateMajorAdmin.getItems().addAll("EDIT","DEACTIVE");
        operationChooserUpdateMajorAdmin.setVisibleRowCount(2);

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            facultyChooserDeactive.getItems().add(faculty.getFacultyName());
            facultyChooserEdit.getItems().add(faculty.getFacultyName());
        }
        facultyChooserEdit.setVisibleRowCount(4);
        facultyChooserDeactive.setVisibleRowCount(4);

        facultyChooserEdit.setOnAction(event -> {
            departmentChooserEdit.getItems().clear();
            departmentChooserEdit.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEdit.getValue())){
                    for (Department department : faculty.departments){
                        departmentChooserEdit.getItems().add(department.getName());
                    }
                    departmentChooserEdit.setVisibleRowCount(4);
                    break;
                }
            }
        });

        facultyChooserDeactive.setOnAction(event -> {
            departmentChooserDeactive.getItems().clear();
            departmentChooserDeactive.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())){
                    for (Department department : faculty.departments){
                        departmentChooserDeactive.getItems().add(department.getName());
                    }
                    break;
                }
            }
        });

        departmentChooserEdit.setOnAction(event -> {
            majorChooserEdit.getItems().clear();
            majorChooserEdit.setPromptText("Major");


            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEdit.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEdit.getValue())){
                            for (Major major : department.majors){
                                majorChooserEdit.getItems().add(major.getName());
                            }
                            majorChooserEdit.setVisibleRowCount(4);
                            break;
                        }
                    }
                    break;
                }
            }
        });

        departmentChooserDeactive.setOnAction(event -> {
            majorChooserDeactive.getItems().clear();
            majorChooserDeactive.setPromptText("Major");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactive.getValue())){
                            for (Major major : department.majors){
                                majorChooserDeactive.getItems().add(major.getName());
                            }
                            majorChooserDeactive.setVisibleRowCount(4);
                            break;
                        }
                    }
                    break;
                }
            }
        });
    }

}

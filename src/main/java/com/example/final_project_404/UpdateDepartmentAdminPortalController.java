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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UpdateDepartmentAdminPortalController implements Initializable {

    @FXML
    private VBox containerBarDeactiveVBox;

    @FXML
    private VBox containerBarEditVBox;

    @FXML
    private Button editButton;

    @FXML
    private Button deactiveButton;

    @FXML
    private ComboBox<String> departmentChooserDeactiveUpdateDepartment;

    @FXML
    private ComboBox<String> departmentChooserEditUpdateDepartment;

    @FXML
    private TextField departmentNameUpdateDepartment;

    @FXML
    private TextField establishmentYearUpdateDepartment;

    @FXML
    private ComboBox<String> facultyChooserDeactiveUpdateDepartment;

    @FXML
    private ComboBox<String> facultyChooserEditUpdateDepartment;

    @FXML
    private HBox headerHBox;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private ComboBox<String> operationChooserUpdateDepartmentAdmin;

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
    void setDepartmentChooserDeactiveUpdateDepartment(ActionEvent event) {

    }

    @FXML
    void setDepartmentChooserEditUpdateDepartment(ActionEvent event) {
        if(!departmentChooserEditUpdateDepartment.getValue().isEmpty() && !facultyChooserEditUpdateDepartment.getValue().isEmpty()){
            departmentNameUpdateDepartment.setDisable(false);
            establishmentYearUpdateDepartment.setDisable(false);
            editButton.setDisable(false);
        }
    }

    @FXML
    void setFacultyChooserDeactiveUpdateDepartment(ActionEvent event) {
        if (!departmentChooserDeactiveUpdateDepartment.getValue().isEmpty() && !facultyChooserDeactiveUpdateDepartment.getValue().isEmpty()) {
            deactiveButton.setDisable(false);
        }
    }

    @FXML
    void setFacultyChooserEditUpdateDepartment(ActionEvent event) {
        if(!departmentChooserEditUpdateDepartment.getValue().isEmpty() && !facultyChooserEditUpdateDepartment.getValue().isEmpty()){
            departmentNameUpdateDepartment.setDisable(false);
            establishmentYearUpdateDepartment.setDisable(false);
            editButton.setDisable(false);
        }
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

    @FXML
    void deactiveDepartment(ActionEvent event) {

    }

    @FXML
    void editDepartment(ActionEvent event) {

    }

    @FXML
    void operationChooserUpdateDepartmentAdmin(ActionEvent event) {
        if(operationChooserUpdateDepartmentAdmin.getValue().toString()=="EDIT"){
            containerBarEditVBox.setDisable(false);
            containerBarDeactiveVBox.setDisable(true);
            departmentNameUpdateDepartment.setDisable(true);
            establishmentYearUpdateDepartment.setDisable(true);
            editButton.setDisable(true);
        } else if (operationChooserUpdateDepartmentAdmin.getValue().toString() == "DEACTIVE") {
            containerBarDeactiveVBox.setDisable(false);
            containerBarEditVBox.setDisable(true);
            deactiveButton.setDisable(true);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        operationChooserUpdateDepartmentAdmin.getItems().addAll("EDIT", "DEACTIVE");

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            facultyChooserEditUpdateDepartment.getItems().add(faculty.getFacultyName());
            facultyChooserDeactiveUpdateDepartment.getItems().add(faculty.getFacultyName());
        }
        facultyChooserEditUpdateDepartment.setVisibleRowCount(4);
        facultyChooserDeactiveUpdateDepartment.setVisibleRowCount(4);


        departmentChooserEditUpdateDepartment.getItems().addAll("hello", "how are your");
        departmentChooserEditUpdateDepartment.setVisibleRowCount(4);
    }
}

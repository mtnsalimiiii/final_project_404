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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class UpdateFacultyAdminPortalController implements Initializable {

    @FXML
    private VBox containerBarDeactiveVBox;

    @FXML
    private VBox containerBarEditVBox;

    @FXML
    private ComboBox<String> facultyChooserDeactiveUpdateFaculty;

    @FXML
    private ComboBox<String> facultyChooserEditUpdateFaculty;

    @FXML
    private HBox headerHBox;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private Button deactiveButton;

    @FXML
    private Button editButton;

    @FXML
    private TextField newEstablishmentYearUpdateFaculty;

    @FXML
    private TextField newFacultyNameUpdateFaculty;

    @FXML
    private ComboBox<String> operationChooserUpdateFacultyAdmin;

    @FXML
    void addDepartmentAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addEmployeeAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addFacultyAdminPortal(ActionEvent event) throws IOException{
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
    void deactiveFaculty(ActionEvent event) throws IOException {
        University.loadFaculties();
        for(Faculty faculty : University.allFaculties){
            if(faculty.getFacultyName() == facultyChooserDeactiveUpdateFaculty.getValue()){
                University.allFaculties.remove(faculty);
            }
        }
        University.saveFaculties();
        University.loadFaculties();
        for(Faculty faculty : University.allFaculties){
            System.out.println(faculty.getFacultyName() + faculty.getId() + faculty.getEstablishmentYear());
        }

        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void editFaculty(ActionEvent event) throws IOException {
        University.loadFaculties();
        for(Faculty faculty : University.allFaculties){
            if(Objects.equals(faculty.getFacultyName(), facultyChooserEditUpdateFaculty.getValue())){
                if(!newFacultyNameUpdateFaculty.getText().isEmpty()){
                    faculty.setFacultyName(newFacultyNameUpdateFaculty.getText());
                }
                if(!newEstablishmentYearUpdateFaculty.getText().isEmpty()){
                    faculty.setEstablishmentYear(Integer.parseInt(newEstablishmentYearUpdateFaculty.getText()));
                }
            }
        }
        University.saveFaculties();

        Faculty faculty = Faculty.loadFromFile(facultyChooserDeactiveUpdateFaculty.getValue());
        System.out.println(faculty.getFacultyName()+faculty.getId()+ faculty.getEstablishmentYear());
        /*if(!newFacultyNameUpdateFaculty.getText().isEmpty()){
            faculty.setFacultyName(newFacultyNameUpdateFaculty.getText());
        }
        if(!newEstablishmentYearUpdateFaculty.getText().isEmpty()){
            faculty.setEstablishmentYear(Integer.parseInt(newEstablishmentYearUpdateFaculty.getText()));
        }
        faculty.saveToFile();
*/
        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void setFacultyChooserDeactiveUpdateFaculty(ActionEvent event) {
        if(!facultyChooserDeactiveUpdateFaculty.getValue().isBlank()){
            deactiveButton.setDisable(false);
        }
    }

    @FXML
    void setFacultyChooserEditUpdateFaculty(ActionEvent event) {
        if (!facultyChooserEditUpdateFaculty.getValue().isBlank()){
            newFacultyNameUpdateFaculty.setDisable(false);
            newEstablishmentYearUpdateFaculty.setDisable(false);
            editButton.setDisable(false);
        }
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
    void setOperationChooserUpdateFacultyAdmin(ActionEvent event) {
        if(operationChooserUpdateFacultyAdmin.getValue() == "EDIT"){
            containerBarDeactiveVBox.setDisable(true);
            containerBarEditVBox.setDisable(false);
            /*newFacultyNameUpdateFaculty.setDisable(true);
            newEstablishmentYearUpdateFaculty.setDisable(true);
            editButton.setDisable(true);*/
        } else if (operationChooserUpdateFacultyAdmin.getValue() == "DEACTIVE") {
            containerBarEditVBox.setDisable(true);
            containerBarDeactiveVBox.setDisable(false);
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
    void updateMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateMajorAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        operationChooserUpdateFacultyAdmin.getItems().addAll("EDIT", "DEACTIVE");
        operationChooserUpdateFacultyAdmin.setVisibleRowCount(2);

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            facultyChooserDeactiveUpdateFaculty.getItems().add(faculty.getFacultyName());
            facultyChooserEditUpdateFaculty.getItems().add(faculty.getFacultyName());
        }
        facultyChooserEditUpdateFaculty.setVisibleRowCount(4);
        facultyChooserDeactiveUpdateFaculty.setVisibleRowCount(4);
    }
}

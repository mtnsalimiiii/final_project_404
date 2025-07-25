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
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addEmployeeAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addFacultyAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addMajorAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddMajorAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void deactiveFaculty(ActionEvent event) throws IOException {
        University.loadFaculties();

//        University.allFaculties.removeIf(faculty -> faculty.getFacultyName().equals(facultyChooserDeactiveUpdateFaculty.getValue()));

        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserDeactiveUpdateFaculty.getValue())){
                faculty.setStatus(Status.Inactive);
                break;
            }
        }

        University.saveFaculties();
        System.out.println("successful");

        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void editFaculty(ActionEvent event) throws IOException {

        University.loadFaculties();
        for(Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditUpdateFaculty.getValue())){
                if (!newFacultyNameUpdateFaculty.getText().isBlank()){
                    faculty.setFacultyName(newFacultyNameUpdateFaculty.getText());
                }
                if (!newEstablishmentYearUpdateFaculty.getText().isBlank()){
                    faculty.setEstablishmentYear(Integer.parseInt(newEstablishmentYearUpdateFaculty.getText()));
                }
                System.out.println("successful");
                System.out.println(faculty.getFacultyName());
                System.out.println(faculty.getEstablishmentYear());
                break;
            }
        }
        University.saveFaculties();

        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void setFacultyChooserEdit(ActionEvent event) {
        if(facultyChooserEditUpdateFaculty.getValue().isBlank()){
            editButton.setDisable(true);
        } else {
            editButton.setDisable(false);
        }

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditUpdateFaculty.getValue())){
                newFacultyNameUpdateFaculty.setPromptText(faculty.getFacultyName());
                newEstablishmentYearUpdateFaculty.setPromptText(String.valueOf(faculty.getEstablishmentYear()));
                break;
            }
        }
    }

    @FXML
    void setFacultyChooserDeactive(ActionEvent event) {
        if (facultyChooserDeactiveUpdateFaculty.getValue().isBlank()){
            deactiveButton.setDisable(true);
        } else {
            deactiveButton.setDisable(false);
        }
    }

    @FXML
    void profileAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ProfileAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ReportsAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void setOperationChooserUpdateFacultyAdmin(ActionEvent event) {
        if(operationChooserUpdateFacultyAdmin.getValue().equals("EDIT")){
            containerBarEditVBox.setVisible(true);
            containerBarDeactiveVBox.setVisible(false);
            if (facultyChooserEditUpdateFaculty.getValue()!=null){
            editButton.setDisable(false);
            } else {
                editButton.setDisable(true);
            }
        } else if (operationChooserUpdateFacultyAdmin.getValue().equals("DEACTIVE")) {
            containerBarEditVBox.setVisible(false);
            containerBarDeactiveVBox.setVisible(true);
            if (facultyChooserDeactiveUpdateFaculty.getValue()!=null){
                deactiveButton.setDisable(false);
            } else {
                deactiveButton.setDisable(true);
            }
        }
    }

    @FXML
    void signOutAdminPortal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateDepartmentAdminPortal(ActionEvent event) throws IOException{
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
    void updateMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateMajorAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Major");
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
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserDeactiveUpdateFaculty.getItems().add(faculty.getFacultyName());
                facultyChooserEditUpdateFaculty.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserEditUpdateFaculty.setVisibleRowCount(4);
        facultyChooserDeactiveUpdateFaculty.setVisibleRowCount(4);
    }
}

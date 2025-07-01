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

import java.io.FileNotFoundException;
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
    private TextField establishmentYearAddMajorAdmin;

    @FXML
    private TextField majorNameAddMajorAdmin;

    @FXML
    private VBox navigationBarVBox;

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
    void addEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Employee");
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


    public String getMajorId(String facultyName, String departmentName) throws FileNotFoundException {
        String id = "";
        for (Faculty faculty : University.allFaculties){
            if(faculty.getFacultyName().equals(facultyName)){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentName)){
                        id = department.getId()+(department.majors.size()+1);
                    }
                }
                break;
            }
        }
        return id;
    }

//    public int getPublishYear(){
//        return LocalDate.now().getYear();
//    }

    public void addNewMajor(ActionEvent event) throws IOException {
        University.loadFaculties();

        String facultyName = facultyChooserAddMajorAdmin.getValue().trim();
        String departmentName = departmentChooserAddMajorAdmin.getValue().trim();
        String nameMajor = majorNameAddMajorAdmin.getText();
        int establishmentYear = Integer.parseInt(establishmentYearAddMajorAdmin.getText());
        String majorId = getMajorId(facultyName, departmentName);

        if (!nameMajor.isBlank() && !establishmentYearAddMajorAdmin.getText().isBlank()){
            Major newMajor = new Major(nameMajor, majorId, establishmentYear, Status.Active);

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyName) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(departmentName) && department.getStatus().equals(Status.Active)) {
                            if (!department.majors.contains(newMajor)) {
                                department.majors.add(newMajor);
                            } else {
                                System.out.println("This Major has Registered earlier!");
                            }
                            break;
                        }
                    }
                }
            }
            University.saveFaculties();

            System.out.println("faculty: " + facultyName);
            System.out.println("department: " + departmentName);
            System.out.println("majorName: " + nameMajor);
            System.out.println("publish year: " + establishmentYear);
            System.out.println("major id: " + majorId);

            Parent root = FXMLLoader.load(getClass().getResource("AddMajorAdminPortal.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Add New Major");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else {
            System.out.println("Please Fill All Fields!!");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserAddMajorAdmin.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserAddMajorAdmin.setVisibleRowCount(4);

        facultyChooserAddMajorAdmin.setOnAction(e -> {
            departmentChooserAddMajorAdmin.getItems().clear();
            departmentChooserAddMajorAdmin.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserAddMajorAdmin.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserAddMajorAdmin.getItems().add(department.getName());
                        }
                    }
                    departmentChooserAddMajorAdmin.setVisibleRowCount(4);
                }
            }

        });
    }
}

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
import java.net.URL;
import java.util.Objects;
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
    void addMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddMajorAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Major");
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
    void setDepartmentChooserDeactive(ActionEvent event) {
        if (departmentChooserDeactiveUpdateDepartment.getValue().isEmpty()){
            deactiveButton.setDisable(true);
        } else {
            deactiveButton.setDisable(false);
        }
    }

    @FXML
    void setDepartmentChooserEdit(ActionEvent event) {
        if (departmentChooserEditUpdateDepartment.getValue().isEmpty()){
            editButton.setDisable(true);
        } else {
            editButton.setDisable(false);
        }
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditUpdateDepartment.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditUpdateDepartment.getValue())){
                        departmentNameUpdateDepartment.setPromptText(department.getName());
                        establishmentYearUpdateDepartment.setPromptText(String.valueOf(department.getEstablishmentYear()));
                        break;
                    }
                }
                break;
            }
        }
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

    @FXML
    void deactiveDepartment(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserDeactiveUpdateDepartment.getValue())){
                faculty.departments.removeIf( department -> department.getName().equals(departmentChooserDeactiveUpdateDepartment.getValue()));
                break;
            }
        }
        University.saveFaculties();
        System.out.println("successful");

        Parent root = FXMLLoader.load(getClass().getResource("UpdateDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void editDepartment(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditUpdateDepartment.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditUpdateDepartment.getValue())){
                        if (!departmentNameUpdateDepartment.getText().isBlank()){
                            department.setName(departmentNameUpdateDepartment.getText());
                        }
                        if (!establishmentYearUpdateDepartment.getText().isBlank()){
                            department.setEstablishmentYear(Integer.parseInt(establishmentYearUpdateDepartment.getText()));
                        }
                        System.out.println("Successful");
                        System.out.println(department.getName());
                        System.out.println(department.getEstablishmentYear());
                        System.out.println(department.getId());

                        break;
                    }
                }
                break;
            }
        }
        University.saveFaculties();
        System.out.println("successful");

        Parent root = FXMLLoader.load(getClass().getResource("UpdateDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void operationChooserUpdateDepartmentAdmin(ActionEvent event) {
        if(operationChooserUpdateDepartmentAdmin.getValue().equals("EDIT")){
            containerBarEditVBox.setDisable(false);
            containerBarDeactiveVBox.setDisable(true);
            if (departmentChooserEditUpdateDepartment.getValue()!=null){
                editButton.setDisable(false);
            } else {
                editButton.setDisable(true);
            }
        } else if (operationChooserUpdateDepartmentAdmin.getValue().toString() == "DEACTIVE") {
            containerBarDeactiveVBox.setDisable(false);
            containerBarEditVBox.setDisable(true);
            if (departmentChooserDeactiveUpdateDepartment.getValue()!=null){
                deactiveButton.setDisable(false);
            } else {
                deactiveButton.setDisable(true);
            }
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


        facultyChooserDeactiveUpdateDepartment.setOnAction(event -> {
            departmentChooserDeactiveUpdateDepartment.getItems().clear();
            departmentChooserDeactiveUpdateDepartment.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveUpdateDepartment.getValue())){
                    for (Department department : faculty.departments){
                        departmentChooserDeactiveUpdateDepartment.getItems().add(department.getName());
                    }
                    departmentChooserDeactiveUpdateDepartment.setVisibleRowCount(4);
                    break;
                }
            }

        });
        facultyChooserEditUpdateDepartment.setOnAction(event -> {
            departmentChooserEditUpdateDepartment.getItems().clear();
            departmentChooserEditUpdateDepartment.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditUpdateDepartment.getValue())){
                    for (Department department : faculty.departments){
                        departmentChooserEditUpdateDepartment.getItems().add(department.getName());
                    }
                    departmentChooserEditUpdateDepartment.setVisibleRowCount(4);
                    break;
                }
            }
        });

    }
}

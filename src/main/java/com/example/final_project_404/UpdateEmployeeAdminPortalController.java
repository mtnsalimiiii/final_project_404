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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UpdateEmployeeAdminPortalController implements Initializable {

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
    private ComboBox<String> operationChooserUpdateEmployeeAdmin;

    @FXML
    private TextField phoneNumberUpdateEmployee;

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
    void deactiveEmployee(ActionEvent event) {

    }

    @FXML
    void editEmployee(ActionEvent event) {

    }

    @FXML
    void setEmployeeChooserEditUpdateEmployee(ActionEvent event) {
        /*if(employeeChooserEditUpdateEmployee.getValue()!=null){
            lastNameUpdateEmployee.setDisable(false);
            lastNameUpdateEmployee.setDisable(false);
            genderChooserUpdateEmployee.setDisable(false);
            dateOfBirthUpdateEmployee.setDisable(false);
            phoneNumberUpdateEmployee.setDisable(false);
            nationalIdUpdateEmployee.setDisable(false);
        } else {
            lastNameUpdateEmployee.setDisable(true);
            lastNameUpdateEmployee.setDisable(true);
            genderChooserUpdateEmployee.setDisable(true);
            dateOfBirthUpdateEmployee.setDisable(true);
            phoneNumberUpdateEmployee.setDisable(true);
            nationalIdUpdateEmployee.setDisable(true);
        }*/
    }

    @FXML
    void setOperationChooserUpdateEmployeeAdmin(ActionEvent event) {
        if(operationChooserUpdateEmployeeAdmin.getValue().toString() == "EDIT"){
            containerBarEditVBox.setDisable(false);
            containerBarDeactiveVBox.setDisable(true);
        } else if (operationChooserUpdateEmployeeAdmin.getValue().toString() == "DEACTIVE") {
            containerBarDeactiveVBox.setDisable(false);
            containerBarEditVBox.setDisable(true);
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {;
        operationChooserUpdateEmployeeAdmin.getItems().addAll(  "DEACTIVE", "EDIT");
        operationChooserUpdateEmployeeAdmin.setVisibleRowCount(2);

        University.loadFaculties();
        for(Faculty faculty : University.allFaculties){
            facultyChooserDeactiveUpdateEmployee.getItems().addAll(faculty.getFacultyName());
            facultyChooserEditUpdateEmployee.getItems().addAll(faculty.getFacultyName());
        }
        facultyChooserDeactiveUpdateEmployee.setVisibleRowCount(4);
        facultyChooserEditUpdateEmployee.setVisibleRowCount(4);

        facultyChooserEditUpdateEmployee.setOnAction(e -> {
            String selectedFaculty = facultyChooserEditUpdateEmployee.getValue();
            departmentChooserEditUpdateEmployee.getItems().clear(); // پاک کردن آیتم‌های قبلی
            departmentChooserEditUpdateEmployee.setPromptText("Department");
            Faculty faculty = null;
            try {
                faculty = Faculty.loadFromFile(selectedFaculty);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            if (faculty != null) {
                departmentChooserEditUpdateEmployee.getItems().addAll(faculty.getDepartmentNames());
                departmentChooserEditUpdateEmployee.setVisibleRowCount(4);
            }
        });

        facultyChooserDeactiveUpdateEmployee.setOnAction(e -> {
            String selectedFaculty = facultyChooserDeactiveUpdateEmployee.getValue();
            departmentChooserDeactiveUpdateEmployee.getItems().clear(); // پاک کردن آیتم‌های قبلی
            departmentChooserDeactiveUpdateEmployee.setPromptText("Department");
            Faculty faculty = null;
            try {
                faculty = Faculty.loadFromFile(selectedFaculty);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            if (faculty != null) {
                departmentChooserDeactiveUpdateEmployee.getItems().addAll(faculty.getDepartmentNames());
                departmentChooserDeactiveUpdateEmployee.setVisibleRowCount(4);
            }
        });

        departmentChooserEditUpdateEmployee.setOnAction(e -> {
            String selectedDepartment = departmentChooserEditUpdateEmployee.getValue();
            employeeChooserEditUpdateEmployee.getItems().clear();
            employeeChooserEditUpdateEmployee.setPromptText("Employee");
            Department department = null;

            department = Department.loadFromFile(selectedDepartment);

            if (department != null) {
                for (Employee employee : department.employees) {
                    employeeChooserEditUpdateEmployee.getItems().add(employee.getFirst_name() + " " + employee.getLast_name() + "(ID : " + employee.getId() + ")");
                }
                employeeChooserEditUpdateEmployee.setVisibleRowCount(4);
            }
        });

        departmentChooserDeactiveUpdateEmployee.setOnAction(event -> {
            String selectedDepartment = departmentChooserDeactiveUpdateEmployee.getValue();
            employeeChooserDeactiveUpdateEmployee.getItems().clear();
            employeeChooserDeactiveUpdateEmployee.setPromptText("Employee");

            Department department = null;

            if(department != null){
                for (Employee employee : department.employees){
                    employeeChooserDeactiveUpdateEmployee.getItems().add(employee.getFirst_name() + " " + employee.getLast_name() + "(ID : " + employee.getId() + ")");
                }
                employeeChooserDeactiveUpdateEmployee.setVisibleRowCount(4);
            }
        });

        genderChooserUpdateEmployee.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserUpdateEmployee.setVisibleRowCount(2);

    }

}

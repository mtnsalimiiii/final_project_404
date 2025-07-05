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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.Month;
import java.util.ResourceBundle;

public class UpdateEmployeeAdminPortalController implements Initializable {

    @FXML
    private Button deactiveButton;

    @FXML
    private Button editButton;

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
    void deactiveEmployee(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserEditUpdateEmployee.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserEditUpdateEmployee.getValue())) {

//                        department.employees.removeIf(employee -> employee.getId().equals(employeeChooserDeactiveUpdateEmployee.getValue()));
//                        break;

                        for (Employee employee : department.employees){
                            if (employee.getId().equals(employeeChooserDeactiveUpdateEmployee.getValue())){
                                employee.setStatus(Status.Inactive);
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

        Employee.loadAllEmployee();
        University.allEmployees.removeIf(employee -> employee.getId().equals(employeeChooserDeactiveUpdateEmployee.getValue()));
        Employee.saveAllEmployee();
        System.out.println("successful");

        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void editEmployee(ActionEvent event) throws IOException {

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditUpdateEmployee.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditUpdateEmployee.getValue())){
                        for (Employee employee : department.employees){
                            if (employee.getId().equals(employeeChooserEditUpdateEmployee.getValue())){
                                if (!firstNameUpdateEmployee.getText().isBlank()){
                                    employee.setFirst_name(firstNameUpdateEmployee.getText());
                                }
                                if (!lastNameUpdateEmployee.getText().isBlank()){
                                    employee.setLast_name(lastNameUpdateEmployee.getText());
                                }
                                if (genderChooserUpdateEmployee.getValue() != null){
                                    employee.setGender(genderChooserUpdateEmployee.getValue());
                                }
                                if (dateOfBirthUpdateEmployee.getValue() != null){
                                    Date date = new Date();
                                    date.setYear(dateOfBirthUpdateEmployee.getValue().getYear());
                                    date.setMonth(dateOfBirthUpdateEmployee.getValue().getMonthValue());
                                    date.setDay(dateOfBirthUpdateEmployee.getValue().getDayOfMonth());
                                    employee.setDateOfBirth(date);
                                }
                                if (!nationalIdUpdateEmployee.getText().isBlank()){
                                    employee.setNationalId(nationalIdUpdateEmployee.getText());
                                }
                                if (!phoneNumberUpdateEmployee.getText().isBlank()){
                                    employee.setPhoneNumber(phoneNumberUpdateEmployee.getText());
                                }
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

        Employee.loadAllEmployee();
        for (Employee employee : University.allEmployees){
            if (employee.getId().equals(employeeChooserEditUpdateEmployee.getValue())){
                if (!firstNameUpdateEmployee.getText().isBlank()){
                    employee.setFirst_name(firstNameUpdateEmployee.getText());
                }
                if (!lastNameUpdateEmployee.getText().isBlank()){
                    employee.setLast_name(lastNameUpdateEmployee.getText());
                }
                if (genderChooserUpdateEmployee.getValue() != null){
                    employee.setGender(genderChooserUpdateEmployee.getValue());
                }
                if (dateOfBirthUpdateEmployee.getValue() != null){
                    Date date = new Date();
                    date.setYear(dateOfBirthUpdateEmployee.getValue().getYear());
                    date.setMonth(dateOfBirthUpdateEmployee.getValue().getMonthValue());
                    date.setDay(dateOfBirthUpdateEmployee.getValue().getDayOfMonth());
                    employee.setDateOfBirth(date);
                }
                if (!nationalIdUpdateEmployee.getText().isBlank()){
                    employee.setNationalId(nationalIdUpdateEmployee.getText());
                }
                if (!phoneNumberUpdateEmployee.getText().isBlank()){
                    employee.setPhoneNumber(phoneNumberUpdateEmployee.getText());
                }
                System.out.println("successful");
                System.out.println(employee.getFirst_name()+" "+employee.getLast_name());
                System.out.println(employee.getDateOfBirth());
                System.out.println(employee.getPhoneNumber());
                System.out.println(employee.getNationalId());
                System.out.println(employee.getGender());
                System.out.println(employee.getFaculty());
                System.out.println(employee.getDepartment());

                break;
            }
        }
        Employee.saveAllEmployee();

        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void setEmployeeChooserEdit(ActionEvent event) {
        if (employeeChooserEditUpdateEmployee.getValue().isEmpty()) {
            editButton.setDisable(true);
        } else {
            editButton.setDisable(false);
        }
        Employee.loadAllEmployee();
        for (Employee employee : University.allEmployees){
            if (employee.getId().equals(employeeChooserEditUpdateEmployee.getValue())){
                firstNameUpdateEmployee.setPromptText(employee.getFirst_name());
                lastNameUpdateEmployee.setPromptText(employee.getLast_name());
                genderChooserUpdateEmployee.setPromptText(String.valueOf(employee.getGender()));
                nationalIdUpdateEmployee.setPromptText(employee.getNationalId());
                phoneNumberUpdateEmployee.setPromptText(employee.getPhoneNumber());
                dateOfBirthUpdateEmployee.setPromptText(employee.getDateOfBirth().getDay() + " " + Month.of(employee.getDateOfBirth().getMonth()) + " " + employee.getDateOfBirth().getYear());
                break;
            }
        }
    }

    @FXML
    void setEmployeeChooserDeactive(ActionEvent event) {
        if (employeeChooserDeactiveUpdateEmployee.getValue().isEmpty()) {
            deactiveButton.setDisable(true);
        } else {
            deactiveButton.setDisable(false);
        }
    }

    @FXML
    void setOperationChooserUpdateEmployeeAdmin(ActionEvent event) {
        if(operationChooserUpdateEmployeeAdmin.getValue().toString() == "EDIT"){
            containerBarEditVBox.setDisable(false);
            containerBarDeactiveVBox.setDisable(true);
            if (employeeChooserEditUpdateEmployee.getValue()!=null) {
                editButton.setDisable(false);
            } else {
                editButton.setDisable(true);
            }
        } else if (operationChooserUpdateEmployeeAdmin.getValue().toString() == "DEACTIVE") {
            containerBarDeactiveVBox.setDisable(false);
            containerBarEditVBox.setDisable(true);
            if (employeeChooserDeactiveUpdateEmployee.getValue()!=null) {
                deactiveButton.setDisable(false);
            } else {
                deactiveButton.setDisable(true);
            }
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {;
        operationChooserUpdateEmployeeAdmin.getItems().addAll(  "EDIT", "DEACTIVE");
        operationChooserUpdateEmployeeAdmin.setVisibleRowCount(2);

        University.loadFaculties();

        for(Faculty faculty : University.allFaculties){
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserDeactiveUpdateEmployee.getItems().addAll(faculty.getFacultyName());
                facultyChooserEditUpdateEmployee.getItems().addAll(faculty.getFacultyName());
            }
        }
        facultyChooserDeactiveUpdateEmployee.setVisibleRowCount(4);
        facultyChooserEditUpdateEmployee.setVisibleRowCount(4);

        facultyChooserEditUpdateEmployee.setOnAction(e -> {
            departmentChooserEditUpdateEmployee.getItems().clear();
            departmentChooserEditUpdateEmployee.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditUpdateEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserEditUpdateEmployee.getItems().add(department.getName());
                        }
                    }
                    departmentChooserEditUpdateEmployee.setVisibleRowCount(4);
                    break;
                }
            }
        });

        facultyChooserDeactiveUpdateEmployee.setOnAction(e -> {
            departmentChooserDeactiveUpdateEmployee.getItems().clear();
            departmentChooserDeactiveUpdateEmployee.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveUpdateEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserDeactiveUpdateEmployee.getItems().add(department.getName());
                        }
                    }
                    departmentChooserDeactiveUpdateEmployee.setVisibleRowCount(4);
                    break;
                }
            }
        });

        departmentChooserEditUpdateEmployee.setOnAction(e -> {
            employeeChooserEditUpdateEmployee.getItems().clear();
            employeeChooserEditUpdateEmployee.setPromptText("Employee");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditUpdateEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEditUpdateEmployee.getValue()) && department.getStatus().equals(Status.Active)){
                            for (Employee employee : department.employees){
                                if (employee.getStatus().equals(Status.Active)){
                                    employeeChooserEditUpdateEmployee.getItems().add(employee.getId());
                                }
                            }
                            employeeChooserEditUpdateEmployee.setVisibleRowCount(4);
                            break;
                        }
                    }
                    break;
                }
            }
        });

        departmentChooserDeactiveUpdateEmployee.setOnAction(event -> {
            employeeChooserDeactiveUpdateEmployee.getItems().clear();
            employeeChooserDeactiveUpdateEmployee.setPromptText("Employee");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveUpdateEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactiveUpdateEmployee.getValue()) && department.getStatus().equals(Status.Active)){
                            for (Employee employee : department.employees){
                                if (employee.getStatus().equals(Status.Active)){
                                    employeeChooserDeactiveUpdateEmployee.getItems().add(employee.getId());
                                }
                            }
                            employeeChooserDeactiveUpdateEmployee.setVisibleRowCount(4);
                            break;
                        }
                    }
                    break;
                }
            }
        });

        genderChooserUpdateEmployee.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserUpdateEmployee.setVisibleRowCount(2);
    }
}

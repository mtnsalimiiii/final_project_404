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
import java.time.Month;
import java.util.ResourceBundle;

public class ProfileEmployeePortalController implements Initializable {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private HBox headerHBox;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private DatePicker newDateOfBirth;

    @FXML
    private TextField newFirstName;

    @FXML
    private ComboBox<Gender> newGender;

    @FXML
    private TextField newLastName;

    @FXML
    private TextField newNationalId;

    @FXML
    private TextField newPhoneNumber;

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
    void UpdateProfessorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateProfessorEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 550);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Professor");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void UpdateStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateStudentEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 550);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Student");
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
    public void addDegreeEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddDegreeEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Degree");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addCourseEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddCourseEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Course");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void professorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfessorsEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Professors");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
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

    @FXML
    void studentsEmpoyeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Students");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void changeProfile(ActionEvent event) throws IOException {

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFacultyEmployee())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(LoginPanelController.employeePerson.getDepartmentEmployee())){
                        for (Employee employee : department.employees){
                            if (employee.equals(LoginPanelController.employeePerson)){
                                if (!newFirstName.getText().isBlank()){
                                    employee.setFirst_name(newFirstName.getText());
                                }
                                if (!newLastName.getText().isBlank()){
                                    employee.setLast_name(newLastName.getText());
                                }
                                if (!newPhoneNumber.getText().isBlank()){
                                    employee.setPhoneNumber(newPhoneNumber.getText());
                                }
                                if (!newNationalId.getText().isBlank()){
                                    employee.setNationalId(newNationalId.getText());
                                }
                                if (newGender.getValue() != null){
                                    employee.setGender(newGender.getValue());
                                }
                                if (newDateOfBirth.getValue() != null){
                                    com.example.final_project_404.Date date = new Date();

                                    date.setYear(newDateOfBirth.getValue().getYear());
                                    date.setMonth(newDateOfBirth.getValue().getMonthValue());
                                    date.setDay(newDateOfBirth.getValue().getDayOfMonth());

                                    LoginPanelController.employeePerson.setDateOfBirth(date);
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
            if (employee.equals(LoginPanelController.employeePerson)){
                if (!newFirstName.getText().isBlank()){
                    employee.setFirst_name(newFirstName.getText());
                }
                if (!newLastName.getText().isBlank()){
                    employee.setLast_name(newLastName.getText());
                }
                if (!newPhoneNumber.getText().isBlank()){
                    employee.setPhoneNumber(newPhoneNumber.getText());
                }
                if (!newNationalId.getText().isBlank()){
                    employee.setNationalId(newNationalId.getText());
                }
                if (newGender.getValue() != null){
                    employee.setGender(newGender.getValue());
                }
                if (newDateOfBirth.getValue() != null){
                    com.example.final_project_404.Date date = new Date();

                    date.setYear(newDateOfBirth.getValue().getYear());
                    date.setMonth(newDateOfBirth.getValue().getMonthValue());
                    date.setDay(newDateOfBirth.getValue().getDayOfMonth());

                    LoginPanelController.employeePerson.setDateOfBirth(date);
                }
                break;
            }
        }
        Employee.saveAllEmployee();

        if (!newFirstName.getText().isBlank()){
            LoginPanelController.employeePerson.setFirst_name(newFirstName.getText());
        }
        if (!newLastName.getText().isBlank()){
            LoginPanelController.employeePerson.setLast_name(newLastName.getText());
        }
        if (!newPhoneNumber.getText().isBlank()){
            LoginPanelController.employeePerson.setPhoneNumber(newPhoneNumber.getText());
        }
        if (!newNationalId.getText().isBlank()){
            LoginPanelController.employeePerson.setNationalId(newNationalId.getText());
        }
        if (newGender.getValue() != null){
            LoginPanelController.employeePerson.setGender(newGender.getValue());
        }
        if (newDateOfBirth.getValue() != null){
            com.example.final_project_404.Date date = new Date();

            date.setYear(newDateOfBirth.getValue().getYear());
            date.setMonth(newDateOfBirth.getValue().getMonthValue());
            date.setDay(newDateOfBirth.getValue().getDayOfMonth());

            LoginPanelController.employeePerson.setDateOfBirth(date);
        }

        System.out.println("Successful");
        System.out.println();
        System.out.println(LoginPanelController.employeePerson.getFirst_name());
        System.out.println(LoginPanelController.employeePerson.getLast_name());
        System.out.println(LoginPanelController.employeePerson.getGender());
        System.out.println(LoginPanelController.employeePerson.getPhoneNumber());
        System.out.println(LoginPanelController.employeePerson.getNationalId());
        System.out.println(LoginPanelController.employeePerson.getDateOfBirth().getDay() + " " + Month.of(LoginPanelController.employeePerson.getDateOfBirth().getMonth()) + " " + LoginPanelController.employeePerson.getDateOfBirth().getYear()); // must work on dates of Date
        System.out.println(LoginPanelController.employeePerson.getDateOfJoin().getDay() + " " + Month.of(LoginPanelController.employeePerson.getDateOfJoin().getMonth()) + " " + LoginPanelController.employeePerson.getDateOfJoin().getYear()); // must work on dates of Date

        Parent root = FXMLLoader.load(getClass().getResource("ProfileEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Employee employee = LoginPanelController.employeePerson;
        newFirstName.setPromptText(employee.getFirst_name());
        newLastName.setPromptText(employee.getLast_name());
        newGender.setPromptText(employee.getGender().toString());
        newNationalId.setPromptText(employee.getNationalId());
        newPhoneNumber.setPromptText(employee.getPhoneNumber());
        newDateOfBirth.setPromptText(employee.getDateOfBirth().getDay() + " " + Month.of(employee.getDateOfBirth().getMonth()) + " " + employee.getDateOfBirth().getYear()); // must work on dates of Date

        newGender.getItems().addAll(Gender.Male, Gender.Female);
    }
}

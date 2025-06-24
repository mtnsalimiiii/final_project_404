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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class RegisterProfessorController implements Initializable {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private DatePicker dateOfBirthRegisterProfessorEmployee;

    @FXML
    private ComboBox<String> departmentChooserRegisterProfessorEmployee;

    @FXML
    private ComboBox<String> facultyChooserRegisterProfessorEmployee;

    @FXML
    private TextField firstnameRegisterProfessorEmployee;

    @FXML
    private ComboBox<Gender> genderChooserRegisterProfessorEmployee;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField lastnameRegisterProfessorEmployee;

    @FXML
    private ComboBox<String> majorChooserRegisterProfessorEmployee;

    @FXML
    private TextField nationalidRegisterProfessorEmployee;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TextField phoneNumberRegisterProfessorEmployee;

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
    void UpdateProfessorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateProfessorEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Professor");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void UpdateStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateStudentEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Student");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
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
    public String getDateOfHire(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getDateOfBirth(ActionEvent event) {
        return dateOfBirthRegisterProfessorEmployee.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
    }

    public String generateProfessorId(){
        return "PRO" + (University.allProfessors.size()+1);
    }

    public void addNewProfessor(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();

        String dateOfBirth = getDateOfBirth(event);
        String firstName = firstnameRegisterProfessorEmployee.getText().trim();
        String lastName = lastnameRegisterProfessorEmployee.getText().trim();
        String phoneNumber = phoneNumberRegisterProfessorEmployee.getText().trim();
        String nationalId = nationalidRegisterProfessorEmployee.getText().trim();
        Gender gender = genderChooserRegisterProfessorEmployee.getValue();
        String faculty = facultyChooserRegisterProfessorEmployee.getValue();
        String department = departmentChooserRegisterProfessorEmployee.getValue();
        String major = majorChooserRegisterProfessorEmployee.getValue();
        String dateOfHire = getDateOfHire();
        String professorId = generateProfessorId();

        if (!firstName.isBlank() && !lastName.isBlank() && !phoneNumber.isBlank() && !nationalId.isBlank() && gender!=null && faculty!=null && department!=null && major!=null){
            Professor professor = new Professor(firstName,lastName, dateOfBirth, nationalId,gender,phoneNumber,professorId,dateOfHire,faculty,department,major);

            for (Faculty faculty1 : University.allFaculties) {
                if (faculty1.getFacultyName().equals(faculty)) {
                    for (Department department1 : faculty1.departments) {
                        if (department1.getName().equals(department)) {
                            for (Major major1 : department1.majors) {
                                if (!major1.professors.contains(professor)) {
                                    major1.professors.add(professor);
                                } else {
                                    System.out.println("The Professor Has Registered Earlier.");
                                }
                                break;
                            }
                        }
                    }
                }
            }
            University.saveFaculties();

            University.allProfessors.add(professor);
            Professor.saveAllProfessor();
            System.out.println("successful\nID: "+ professorId);
            System.out.println("password: "+nationalId);
            System.out.println();
            System.out.println(firstName+" "+lastName);
            System.out.println(dateOfBirth);
            System.out.println(phoneNumber);
            System.out.println(nationalId);
            System.out.println(gender);
            System.out.println(faculty);
            System.out.println(department);
            System.out.println(major);
            System.out.println(dateOfHire);

            Parent root = FXMLLoader.load(getClass().getResource("RegisterProfessor.fxml"));
            Scene scene = new Scene(root, 800, 500);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Register New Professor");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else {
            System.out.println("Please Fill All Fields!");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            facultyChooserRegisterProfessorEmployee.getItems().add(faculty.getFacultyName());
        }
        facultyChooserRegisterProfessorEmployee.setVisibleRowCount(4);

        facultyChooserRegisterProfessorEmployee.setOnAction(event -> {
            departmentChooserRegisterProfessorEmployee.getItems().clear();
            departmentChooserRegisterProfessorEmployee.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserRegisterProfessorEmployee.getValue())){
                    for (Department department : faculty.departments){
                        departmentChooserRegisterProfessorEmployee.getItems().add(department.getName());
                    }
                    departmentChooserRegisterProfessorEmployee.setVisibleRowCount(4);
                    break;
                }
            }
        });

        departmentChooserRegisterProfessorEmployee.setOnAction(event -> {
            majorChooserRegisterProfessorEmployee.getItems().clear();
            majorChooserRegisterProfessorEmployee.setPromptText("Major");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserRegisterProfessorEmployee.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserRegisterProfessorEmployee.getValue())){
                            for (Major major : department.majors){
                                majorChooserRegisterProfessorEmployee.getItems().add(major.getName());
                            }
                            majorChooserRegisterProfessorEmployee.setVisibleRowCount(4);
                            break;
                        }
                    }
                }
            }
        });

        genderChooserRegisterProfessorEmployee.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserRegisterProfessorEmployee.setVisibleRowCount(2);

    }
}

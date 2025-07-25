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

public class RegisterStudentController implements Initializable {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private DatePicker dateOfBirthRegisterStudentEmployee;

    @FXML
    private ComboBox<String> departmentChooserRegisterStudentEmployee;

    @FXML
    private ComboBox<String> facultyChooserRegisterStudentEmployee;

    @FXML
    private TextField firstnameRegisterStudentEmployee;

    @FXML
    private ComboBox<Gender> genderChooserRegisterStudentEmployee;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField lastnameRegisterStudentEmployee;

    @FXML
    private ComboBox<String> majorChooserRegisterStudentEmployee;

    @FXML
    private TextField nationalidRegisterStudentEmployee;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TextField phoneNumberRegisterStudentEmployee;

    @FXML
    private ComboBox<String> degreeChooser;

    @FXML
    void RegisterNewProfessorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterProfessor.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Register New Professor");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Employee Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void addDegreeEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddDegreeEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Degree");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addCourseEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddCourseEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Course");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void professorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfessorsEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Professors");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void UpdateProfessorEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateProfessorEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Professor");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void UpdateStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateStudentEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Student");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Report");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void studentsEmpoyeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Students");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void addCourseGroupEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddCourseGroupEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Course Group");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public Date getDateOfBirth(ActionEvent event) {
        Date dateOfBirth = new Date();
        dateOfBirth.setYear(dateOfBirthRegisterStudentEmployee.getValue().getYear());
        dateOfBirth.setMonth(dateOfBirthRegisterStudentEmployee.getValue().getMonthValue());
        dateOfBirth.setDay(dateOfBirthRegisterStudentEmployee.getValue().getDayOfMonth());
        return dateOfBirth;
    }

    public Date getDateOfRegistration(){
        Date date = new Date();
        date.setYear(LocalDate.now().getYear());
        date.setMonth(LocalDate.now().getMonthValue());
        date.setDay(LocalDate.now().getDayOfMonth());
        return date;
    }
    public void addNewStudent(ActionEvent event) throws IOException {
        Student.loadAllStudents();
        University.loadFaculties();

        Date dateOfBirth = getDateOfBirth(event);
        String firstName = firstnameRegisterStudentEmployee.getText().trim();
        String lastName = lastnameRegisterStudentEmployee.getText().trim();
        String phoneNumber = phoneNumberRegisterStudentEmployee.getText().trim();
        String nationalId = nationalidRegisterStudentEmployee.getText().trim();
        Gender gender = genderChooserRegisterStudentEmployee.getValue();
        String faculty = facultyChooserRegisterStudentEmployee.getValue();
        String department = departmentChooserRegisterStudentEmployee.getValue();
        String major = majorChooserRegisterStudentEmployee.getValue();
        Date dateOfRegistration = getDateOfRegistration();
        String studentId = generateStudentId();

        if (!firstName.isBlank() && !lastName.isBlank() && !phoneNumber.isBlank() && !nationalId.isBlank() && gender!=null && faculty!=null && department!=null && major!=null){
            Student student = new Student(firstName, lastName, dateOfBirth, nationalId, gender, phoneNumber, studentId, dateOfRegistration, faculty, department,major,Status.Active,degreeChooser.getValue());
            for (Faculty faculty1 : University.allFaculties) {
                if (faculty1.getFacultyName().equals(faculty) && faculty1.getStatus().equals(Status.Active)) {
                    for (Department department1 : faculty1.departments) {
                        if (department1.getName().equals(department) && department1.getStatus().equals(Status.Active)) {
                            for (Major major1 : department1.majors) {
                                if (!major1.students.contains(student) && major1.getStatus().equals(Status.Active)) {
                                    major1.students.add(student);
                                } else {
                                    System.out.println("This Student Has Registered Earlier!");
                                }
                                break;
                            }
                        }
                    }
                }
            }
            University.saveFaculties();

            University.allStudents.add(student);
            Student.saveAllStudent();

            System.out.println("successful\nID: "+ studentId);
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
            System.out.println(dateOfRegistration);

            Parent root = FXMLLoader.load(getClass().getResource("RegisterStudent.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Register New Student");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else {
            System.out.println("Please Fill All Field!");
        }
    }

    public String generateStudentId() {
        return "STU" + (University.allStudents.size() + 1);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        degreeChooser.getItems().addAll("Bachelor","Master","Phd");
        degreeChooser.setVisibleRowCount(3);
        for(Faculty faculty : University.allFaculties){
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserRegisterStudentEmployee.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserRegisterStudentEmployee.setVisibleRowCount(4);

        facultyChooserRegisterStudentEmployee.setOnAction(e -> {
            departmentChooserRegisterStudentEmployee.getItems().clear();
            departmentChooserRegisterStudentEmployee.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserRegisterStudentEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserRegisterStudentEmployee.getItems().add(department.getName());
                        }
                    }
                    departmentChooserRegisterStudentEmployee.setVisibleRowCount(4);
                    break;
                }
            }
        });


        departmentChooserRegisterStudentEmployee.setOnAction(actionEvent -> {
            majorChooserRegisterStudentEmployee.getItems().clear();
            majorChooserRegisterStudentEmployee.setPromptText("Major");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserRegisterStudentEmployee.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserRegisterStudentEmployee.getValue())){
                            for (Major major : department.majors){
                                majorChooserRegisterStudentEmployee.getItems().add(major.getName());
                            }
                            majorChooserRegisterStudentEmployee.setVisibleRowCount(4);
                            break;
                        }
                    }
                    break;
                }
            }
        });

        genderChooserRegisterStudentEmployee.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserRegisterStudentEmployee.setVisibleRowCount(2);
    }
}



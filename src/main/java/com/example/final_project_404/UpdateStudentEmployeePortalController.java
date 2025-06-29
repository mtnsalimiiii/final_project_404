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
import java.rmi.server.UID;
import java.util.ResourceBundle;

public class UpdateStudentEmployeePortalController implements Initializable {

    @FXML
    private VBox containerBarDeactiveVBox;

    @FXML
    private VBox containerBarEditVBox;

    @FXML
    private DatePicker dateOfBirthEdit;

    @FXML
    private Button deactiveButton;

    @FXML
    private ComboBox<String> departmentChooserDeactive;

    @FXML
    private ComboBox<String> departmentChooserEdit;

    @FXML
    private Button editButton;

    @FXML
    private ComboBox<String> facultyChooserDeactive;

    @FXML
    private ComboBox<String> facultyChooserEdit;

    @FXML
    private TextField firstNameEdit;

    @FXML
    private ComboBox<Gender> genderChooserEdit;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField lastNameEdit;

    @FXML
    private ComboBox<String> majorChooserDeactive;

    @FXML
    private ComboBox<String> majorChooserEdit;

    @FXML
    private TextField nationalIdEdit;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private ComboBox<String> operationChooserUpdateStudentEmployee;

    @FXML
    private TextField phoneNumberEdit;

    @FXML
    private ComboBox<String> studentChooserDeactive;

    @FXML
    private ComboBox<String> studentChooserEdit;

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
    void StudentsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Students");
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
    void deactiveStudent(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserDeactive.getValue())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(majorChooserDeactive.getValue())) {
                                major.students.removeIf(student -> student.getId().equals(studentChooserDeactive.getValue()));
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
        
        Student.loadAllStudents();
        University.allStudents.removeIf(student -> student.getId().equals(studentChooserDeactive.getValue()));
        Student.saveAllStudent();
        System.out.println("successful");

        Parent root = FXMLLoader.load(getClass().getResource("UpdateStudentEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 550);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Student");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
    }

    @FXML
    void editStudent(ActionEvent event) throws IOException {
        
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserDeactive.getValue())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(majorChooserDeactive.getValue())) {
                                for (Student student : major.students){
                                    if (student.getId().equals(studentChooserEdit.getValue())){
                                        if (!firstNameEdit.getText().isBlank()){
                                            student.setFirst_name(firstNameEdit.getText());
                                        }
                                        if (!lastNameEdit.getText().isBlank()){
                                            student.setLast_name(lastNameEdit.getText());
                                        }
                                        if (!nationalIdEdit.getText().isBlank()){
                                            student.setNationalId(nationalIdEdit.getText());
                                        }
                                        if (!phoneNumberEdit.getText().isBlank()){
                                            student.setPhoneNumber(phoneNumberEdit.getText());
                                        }
                                        if (dateOfBirthEdit.getValue() != null){
                                            Date date = new Date();
                                            date.setYear(dateOfBirthEdit.getValue().getYear());
                                            date.setMonth(dateOfBirthEdit.getValue().getMonthValue());
                                            date.setDay(dateOfBirthEdit.getValue().getDayOfMonth());
                                            student.setDateOfBirth(date);
                                        }
                                        if (genderChooserEdit.getValue()!= null){
                                            student.setGender(genderChooserEdit.getValue());
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
                break;
            }
        }
        University.saveFaculties();
        
        Student.loadAllStudents();
        for (Student student : University.allStudents){
            if (student.getId().equals(studentChooserEdit.getValue())){
                if (!firstNameEdit.getText().isBlank()){
                    student.setFirst_name(firstNameEdit.getText());
                }
                if (!lastNameEdit.getText().isBlank()){
                    student.setLast_name(lastNameEdit.getText());
                }
                if (!nationalIdEdit.getText().isBlank()){
                    student.setNationalId(nationalIdEdit.getText());
                }
                if (!phoneNumberEdit.getText().isBlank()){
                    student.setPhoneNumber(phoneNumberEdit.getText());
                }
                if (dateOfBirthEdit.getValue() != null){
                    Date date = new Date();
                    date.setYear(dateOfBirthEdit.getValue().getYear());
                    date.setMonth(dateOfBirthEdit.getValue().getMonthValue());
                    date.setDay(dateOfBirthEdit.getValue().getDayOfMonth());
                    student.setDateOfBirth(date);
                }
                if (genderChooserEdit.getValue()!= null){
                    student.setGender(genderChooserEdit.getValue());
                }
                System.out.println("successful");
                System.out.println(student.getFirst_name()+" "+student.getLast_name());
                System.out.println(student.getDateOfBirth());
                System.out.println(student.getPhoneNumber());
                System.out.println(student.getNationalId());
                System.out.println(student.getGender());
                break;
            }
        }
        Student.saveAllStudent();

        Parent root = FXMLLoader.load(getClass().getResource("UpdateStudentEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 550);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Student");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void professorsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfessorsEmployeePortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Professors");
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
        stage.setTitle("Report");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void setEmployeeChooserEditUpdateEmployee(ActionEvent event) {

    }

    @FXML
    void setOperationChooserUpdateStudentEmployee(ActionEvent event) {
        if(operationChooserUpdateStudentEmployee.getValue().equals("EDIT")){
            containerBarDeactiveVBox.setDisable(true);
            containerBarEditVBox.setDisable(false);
        } else if(operationChooserUpdateStudentEmployee.getValue().equals("DEACTIVE")){
            containerBarEditVBox.setDisable(true);
            containerBarDeactiveVBox.setDisable(false);
        }
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        operationChooserUpdateStudentEmployee.getItems().addAll("EDIT", "DEACTIVE");
        operationChooserUpdateStudentEmployee.setVisibleRowCount(2);

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            facultyChooserDeactive.getItems().add(faculty.getFacultyName());
            facultyChooserEdit.getItems().add(faculty.getFacultyName());
        }
        facultyChooserDeactive.setVisibleRowCount(4);
        facultyChooserEdit.setVisibleRowCount(4);

        facultyChooserEdit.setOnAction(event -> {
            departmentChooserEdit.getItems().clear();
            departmentChooserEdit.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEdit.getValue())){
                    for (Department department : faculty.departments){
                        departmentChooserEdit.getItems().add(department.getName());
                    }
                    departmentChooserEdit.setVisibleRowCount(4);
                    break;
                }
            }
        });

        facultyChooserDeactive.setOnAction(event -> {
            departmentChooserDeactive.getItems().clear();
            departmentChooserDeactive.setPromptText("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())){
                    for (Department department : faculty.departments){
                        departmentChooserDeactive.getItems().add(department.getName());
                    }
                    departmentChooserDeactive.setVisibleRowCount(4);
                    break;
                }
            }
        });

        departmentChooserEdit.setOnAction(event -> {
            majorChooserEdit.getItems().clear();
            majorChooserEdit.setPromptText("Major");


            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEdit.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEdit.getValue())){
                            for (Major major : department.majors){
                                majorChooserEdit.getItems().add(major.getName());
                            }
                            majorChooserEdit.setVisibleRowCount(4);
                            break;
                        }
                    }
                    break;
                }
            }
        });

        departmentChooserDeactive.setOnAction(event -> {
            majorChooserDeactive.getItems().clear();
            majorChooserDeactive.setPromptText("Major");


            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactive.getValue())){
                            for (Major major : department.majors){
                                majorChooserDeactive.getItems().add(major.getName());
                            }
                            majorChooserDeactive.setVisibleRowCount(4);
                            break;
                        }
                    }
                    break;
                }
            }
        });

        majorChooserEdit.setOnAction(event -> {
            studentChooserEdit.getItems().clear();
            studentChooserEdit.setPromptText("Student");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEdit.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEdit.getValue())){
                            for (Major major : department.majors){
                                if (major.getName().equals(majorChooserEdit.getValue())){
                                    for (Student student : major.students){
                                        studentChooserEdit.getItems().add(student.getId());
                                    }
                                    studentChooserEdit.setVisibleRowCount(4);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        });

        majorChooserDeactive.setOnAction(event -> {
            studentChooserDeactive.getItems().clear();
            studentChooserDeactive.setPromptText("Student");


            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactive.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactive.getValue())){
                            for (Major major : department.majors){
                                if (major.getName().equals(majorChooserDeactive.getValue())){
                                    for (Student student : major.students){
                                        studentChooserDeactive.getItems().add(student.getId());
                                    }
                                    studentChooserDeactive.setVisibleRowCount(4);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        });
    }

    public void setStudentChooserDeactiveStudentEmployee(ActionEvent event) {
    }

    public void setStudentChooserEditStudentEmployee(ActionEvent event) {

    }
}

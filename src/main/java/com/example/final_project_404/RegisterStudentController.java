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
        stage.setTitle("Report");
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
    void signOutEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root, 350, 480);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public String getDateOfBirth(ActionEvent event){
        return dateOfBirthRegisterStudentEmployee.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
    }
    public String getDateOfRegistration(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public void addNewStudent(ActionEvent event) throws IOException {
        String dateOfBirth = getDateOfBirth(event);
        String firstName = firstnameRegisterStudentEmployee.getText().trim();
        String lastName = lastnameRegisterStudentEmployee.getText().trim();
        String phoneNumber = phoneNumberRegisterStudentEmployee.getText().trim();
        String nationalId = nationalidRegisterStudentEmployee.getText().trim();
        Gender gender = genderChooserRegisterStudentEmployee.getValue();
        String faculty = facultyChooserRegisterStudentEmployee.getValue();
        String department = departmentChooserRegisterStudentEmployee.getValue();
        String major = majorChooserRegisterStudentEmployee.getValue();
        String dateOfRegistration = getDateOfRegistration();

        String studentId = generateStudentId();
        Student student = new Student(firstName, lastName, dateOfBirth, nationalId, gender, phoneNumber, studentId, dateOfRegistration);
        Student.loadAllStudents();
        University.allStudents.add(student);
        Student.saveAllStudent();
//        Major.addStudentToMajor(department,major,student);
    }
    public String generateStudentId() {
        return "STD" + (University.allStudents.size() + 1);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        University.loadFaculties();
        for(Faculty f : University.allFaculties){
            facultyChooserRegisterStudentEmployee.getItems().add(f.getFacultyName());
        }
        facultyChooserRegisterStudentEmployee.setVisibleRowCount(4);

        facultyChooserRegisterStudentEmployee.setOnAction(e -> {
            String selectedFaculty = facultyChooserRegisterStudentEmployee.getValue();
            departmentChooserRegisterStudentEmployee.getItems().clear();
            Faculty faculty = null;
//            try {
//                faculty = Faculty.loadFromFile(selectedFaculty);
//            } catch (FileNotFoundException ex) {
//                throw new RuntimeException(ex);
//            }
            if (faculty != null) {
                departmentChooserRegisterStudentEmployee.getItems().addAll(faculty.getDepartmentNames());
                departmentChooserRegisterStudentEmployee.setVisibleRowCount(4);
            }
        });


        departmentChooserRegisterStudentEmployee.setOnAction(actionEvent -> {
            String departmentNAme = departmentChooserRegisterStudentEmployee.getValue();
            majorChooserRegisterStudentEmployee.getItems().clear();
            Department department = null;
            try {
//                department = Department.loadFromFile(departmentNAme);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            if (department != null) {
                for (Major major:department.majors){
                    majorChooserRegisterStudentEmployee.getItems().addAll(major.getName());
                }
                majorChooserRegisterStudentEmployee.setVisibleRowCount(4);
            }
        });

        genderChooserRegisterStudentEmployee.getItems().addAll(Gender.Male, Gender.Female);
        genderChooserRegisterStudentEmployee.setVisibleRowCount(2);
    }
}



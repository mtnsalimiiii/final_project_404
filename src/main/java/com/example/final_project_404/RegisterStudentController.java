package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
    void RegisterNewProfessorEmployeePortal(ActionEvent event) {

    }

    @FXML
    void RegisterNewStudentEmployeePortal(ActionEvent event) {

    }

    @FXML
    void dashboardEmployeePortal(ActionEvent event) {

    }

    @FXML
    void professorEmployeePortal(ActionEvent event) {

    }

    @FXML
    void profileEmployeePortal(ActionEvent event) {

    }

    @FXML
    void reportsEmployeePortal(ActionEvent event) {

    }

    @FXML
    void settingsEmployeePortal(ActionEvent event) {

    }

    @FXML
    void studentsEmpoyeePortal(ActionEvent event) {

    }
    private String fullName;
    private String nationalId;
    private String dateOfBirth;
    private String facultyOfStudent;
    private String departmentOfStudent;
    private String majorOfStudent;

    public void getDateOfBirth(ActionEvent event){
        LocalDate dateOfBirth = dateOfBirthRegisterStudentEmployee.getValue();
        String formattedDate = dateOfBirth.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.dateOfBirth = formattedDate;
    }
    public void addNewStudent(ActionEvent event) throws IOException {
        getDateOfBirth(event);

        String firstName = firstnameRegisterStudentEmployee.getText().trim();
        String lastName = lastnameRegisterStudentEmployee.getText().trim();
        String nationalId = nationalidRegisterStudentEmployee.getText().trim();
        String faculty = facultyChooserRegisterStudentEmployee.getValue();
        String department = departmentChooserRegisterStudentEmployee.getValue();
        String major = majorChooserRegisterStudentEmployee.getValue();

        String phoneNumber = "N/A";
        String studentId = generateStudentId();
        Student student = new Student(firstName, lastName, dateOfBirth, nationalId, phoneNumber, studentId);
        Student.loadAllStudents();
        University.allStudents.add(student);
        Student.saveStudent();
        Major.addStudentToMajor(department,major,student);
        try {
            Student.saveStudent();
            System.out.println("Student saved successfully!");
        } catch (IOException e) {
            System.out.println("Failed to save student: " + e.getMessage());
        }
    }
    public String generateStudentId() {
        return "STD" + (University.allStudents.size() + 1);
    }


    /*public void addNewStudent(ActionEvent event){
        this.fullName = firstnameRegisterStudentEmployee.getText().trim()+' '+lastnameRegisterStudentEmployee.getText().trim();
        this.nationalId = nationalidRegisterStudentEmployee.getText().trim();
        this.facultyOfStudent = facultyChooserRegisterStudentEmployee.getValue();
        this.departmentOfStudent = departmentChooserRegisterStudentEmployee.getValue();
        this.majorOfStudent = majorChooserRegisterStudentEmployee.getValue();

        System.out.println(fullName);
        System.out.println(nationalId);
        System.out.println(dateOfBirth);
        System.out.println(facultyOfStudent);
        System.out.println(departmentOfStudent);
        System.out.println(majorOfStudent);
    }*/


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        departmentChooserRegisterStudentEmployee.getItems().addAll("Computer", "Electrical Engineering", "Civil Engineering", "Mechanical Engineering", "Mining engineering");
        departmentChooserRegisterStudentEmployee.setVisibleRowCount(5);

        facultyChooserRegisterStudentEmployee.getItems().addAll("Fani","Faculty of Technology and Engineering", "Faculty of Basic Sciences", "Faculty of Social Sciences", "Faculty of Literature and Humanities", "Faculty of Architecture and Urban Planning", "Faculty of Agriculture", "Faculty of Islamic Sciences and Research");
        facultyChooserRegisterStudentEmployee.setVisibleRowCount(5);

        majorChooserRegisterStudentEmployee.getItems().addAll("Software","Faculty of Technology and Engineering", "Faculty of Basic Sciences", "Faculty of Social Sciences", "Faculty of Literature and Humanities", "Faculty of Architecture and Urban Planning", "Faculty of Agriculture", "Faculty of Islamic Sciences and Research");
        majorChooserRegisterStudentEmployee.setVisibleRowCount(5);


    }
}



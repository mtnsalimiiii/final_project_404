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
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ProfileStudentPortalController implements Initializable {

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
    void dashboardStudentPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Student Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsStudentPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportsStudentPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutStudentPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();    }

    public void changeProfile(ActionEvent event) throws IOException {

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(LoginPanelController.studentPerson.getFaculty())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(LoginPanelController.studentPerson.getDepartment())){
                        for (Major major : department.majors){
                            if (major.getName().equals(LoginPanelController.studentPerson.getMajor())){
                                for (Student student : major.students){
                                    if (student.equals(LoginPanelController.studentPerson)){
                                        if (!newFirstName.getText().isBlank()){
                                            student.setFirst_name(newFirstName.getText());
                                        }
                                        if (!newLastName.getText().isBlank()){
                                            student.setLast_name(newLastName.getText());
                                        }
                                        if (!newPhoneNumber.getText().isBlank()){
                                            student.setPhoneNumber(newPhoneNumber.getText());
                                        }
                                        if (!newNationalId.getText().isBlank()){
                                            student.setNationalId(newNationalId.getText());
                                        }
                                        if (newGender.getValue() != null){
                                            student.setGender(newGender.getValue());
                                        }
                                        if (newDateOfBirth.getValue() != null){
                                            com.example.final_project_404.Date date = new Date();

                                            date.setYear(newDateOfBirth.getValue().getYear());
                                            date.setMonth(newDateOfBirth.getValue().getMonthValue());
                                            date.setDay(newDateOfBirth.getValue().getDayOfMonth());

                                            LoginPanelController.studentPerson.setDateOfBirth(date);                                         }
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
            if (student.equals(LoginPanelController.studentPerson)){
                if (!newFirstName.getText().isBlank()){
                    student.setFirst_name(newFirstName.getText());
                }
                if (!newLastName.getText().isBlank()){
                    student.setLast_name(newLastName.getText());
                }
                if (!newPhoneNumber.getText().isBlank()){
                    student.setPhoneNumber(newPhoneNumber.getText());
                }
                if (!newNationalId.getText().isBlank()){
                    student.setNationalId(newNationalId.getText());
                }
                if (newGender.getValue() != null){
                    student.setGender(newGender.getValue());
                }
                if (newDateOfBirth.getValue() != null){
                    com.example.final_project_404.Date date = new Date();

                    date.setYear(newDateOfBirth.getValue().getYear());
                    date.setMonth(newDateOfBirth.getValue().getMonthValue());
                    date.setDay(newDateOfBirth.getValue().getDayOfMonth());

                    LoginPanelController.studentPerson.setDateOfBirth(date);
                }
                break;
            }
        }
        Student.saveAllStudent();

        if (!newFirstName.getText().isBlank()){
            LoginPanelController.studentPerson.setFirst_name(newFirstName.getText());
        }
        if (!newLastName.getText().isBlank()){
            LoginPanelController.studentPerson.setLast_name(newLastName.getText());
        }
        if (!newPhoneNumber.getText().isBlank()){
            LoginPanelController.studentPerson.setPhoneNumber(newPhoneNumber.getText());
        }
        if (!newNationalId.getText().isBlank()){
            LoginPanelController.studentPerson.setNationalId(newNationalId.getText());
        }
        if (newGender.getValue() != null){
            LoginPanelController.studentPerson.setGender(newGender.getValue());
        }
        if (newDateOfBirth.getValue() != null){
            com.example.final_project_404.Date date = new Date();

            date.setYear(newDateOfBirth.getValue().getYear());
            date.setMonth(newDateOfBirth.getValue().getMonthValue());
            date.setDay(newDateOfBirth.getValue().getDayOfMonth());

            LoginPanelController.studentPerson.setDateOfBirth(date);
        }

        System.out.println("Successful");
        System.out.println();
        System.out.println(LoginPanelController.studentPerson.getFirst_name());
        System.out.println(LoginPanelController.studentPerson.getLast_name());
        System.out.println(LoginPanelController.studentPerson.getGender());
        System.out.println(LoginPanelController.studentPerson.getPhoneNumber());
        System.out.println(LoginPanelController.studentPerson.getNationalId());
        System.out.println(LoginPanelController.studentPerson.getDateOfBirth().getDay() + " " + Month.of(LoginPanelController.studentPerson.getDateOfBirth().getMonth()) + " " + LoginPanelController.studentPerson.getDateOfBirth().getYear()); // must work on dates of Date
        System.out.println(LoginPanelController.studentPerson.getDateOfJoin().getDay() + " " + Month.of(LoginPanelController.studentPerson.getDateOfJoin().getMonth()) + " " + LoginPanelController.studentPerson.getDateOfJoin().getYear()); // must work on dates of Date

        Parent root = FXMLLoader.load(getClass().getResource("ProfileStudentPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Student student = LoginPanelController.studentPerson;
        newFirstName.setPromptText(student.getFirst_name());
        newLastName.setPromptText(student.getLast_name());
        newGender.setPromptText(student.getGender().toString());
        newNationalId.setPromptText(student.getNationalId());
        newPhoneNumber.setPromptText(student.getPhoneNumber());
        newDateOfBirth.setPromptText(student.getDateOfBirth().getDay() + " " + Month.of(student.getDateOfBirth().getMonth()) + " " + student.getDateOfBirth().getYear()); // must work on dates of Date

        newGender.getItems().addAll(Gender.Male, Gender.Female);
    }
}

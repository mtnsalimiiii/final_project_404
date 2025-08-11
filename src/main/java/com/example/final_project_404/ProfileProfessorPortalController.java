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
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ProfileProfessorPortalController implements Initializable {

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
    void dashboardProfessorPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfessorPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Professor Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsProfessorPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportsProfessorPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutProfessorPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void changeProfile(ActionEvent event) throws Exception {

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(LoginPanelController.professorPerson.getFaculty())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(LoginPanelController.professorPerson.getDepartment())){
                        for (Major major : department.majors){
                            if (major.getName().equals(LoginPanelController.professorPerson.getMajor())){
                                for (Professor professor : major.professors){
                                    if (professor.equals(LoginPanelController.professorPerson)){
                                        if (!newFirstName.getText().isBlank()){
                                            professor.setFirst_name(newFirstName.getText());
                                        }
                                        if (!newLastName.getText().isBlank()){
                                            professor.setLast_name(newLastName.getText());
                                        }
                                        if (!newPhoneNumber.getText().isBlank()){
                                            professor.setPhoneNumber(newPhoneNumber.getText());
                                        }
                                        if (!newNationalId.getText().isBlank()){
                                            professor.setNationalId(newNationalId.getText());
                                        }
                                        if (newGender.getValue() != null){
                                            professor.setGender(newGender.getValue());
                                        }
                                        if (newDateOfBirth.getValue() != null){
                                            LocalDate date = newDateOfBirth.getValue();
                                            LoginPanelController.professorPerson.setDateOfBirth(date);                                        }
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

        Professor.loadAllProfessor();
        for (Professor professor : University.allProfessors){
            if (professor.equals(LoginPanelController.professorPerson)){
                if (!newFirstName.getText().isBlank()){
                    professor.setFirst_name(newFirstName.getText());
                }
                if (!newLastName.getText().isBlank()){
                    professor.setLast_name(newLastName.getText());
                }
                if (!newPhoneNumber.getText().isBlank()){
                    professor.setPhoneNumber(newPhoneNumber.getText());
                }
                if (!newNationalId.getText().isBlank()){
                    professor.setNationalId(newNationalId.getText());
                }
                if (newGender.getValue() != null){
                    professor.setGender(newGender.getValue());
                }
                if (newDateOfBirth.getValue() != null){
                    LocalDate date = newDateOfBirth.getValue();
                    LoginPanelController.professorPerson.setDateOfBirth(date);                }
                break;
            }
        }
        Professor.saveAllProfessor();

        if (!newFirstName.getText().isBlank()){
            LoginPanelController.professorPerson.setFirst_name(newFirstName.getText());
        }
        if (!newLastName.getText().isBlank()){
            LoginPanelController.professorPerson.setLast_name(newLastName.getText());
        }
        if (!newPhoneNumber.getText().isBlank()){
            LoginPanelController.professorPerson.setPhoneNumber(newPhoneNumber.getText());
        }
        if (!newNationalId.getText().isBlank()){
            LoginPanelController.professorPerson.setNationalId(newNationalId.getText());
        }
        if (newGender.getValue() != null){
            LoginPanelController.professorPerson.setGender(newGender.getValue());
        }
        if (newDateOfBirth.getValue() != null){
            LocalDate date = newDateOfBirth.getValue();
            LoginPanelController.professorPerson.setDateOfBirth(date);
        }

        System.out.println("Successful");
        System.out.println();
        System.out.println(LoginPanelController.professorPerson.getFirst_name());
        System.out.println(LoginPanelController.professorPerson.getLast_name());
        System.out.println(LoginPanelController.professorPerson.getGender());
        System.out.println(LoginPanelController.professorPerson.getPhoneNumber());
        System.out.println(LoginPanelController.professorPerson.getNationalId());
        System.out.println(LoginPanelController.professorPerson.getDateOfBirth().getDayOfMonth() + " " + Month.of(LoginPanelController.professorPerson.getDateOfBirth().getMonthValue()) + " " + LoginPanelController.professorPerson.getDateOfBirth().getYear()); // must work on dates of Date
        System.out.println(LoginPanelController.professorPerson.getDateOfJoin().getDayOfMonth() + " " + Month.of(LoginPanelController.professorPerson.getDateOfJoin().getMonthValue()) + " " + LoginPanelController.professorPerson.getDateOfJoin().getYear()); // must work on dates of Date

        Parent root = FXMLLoader.load(getClass().getResource("ProfileProfessorPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Professor professor = LoginPanelController.professorPerson;
        newFirstName.setPromptText(professor.getFirst_name());
        newLastName.setPromptText(professor.getLast_name());
        newGender.setPromptText(professor.getGender().toString());
        newNationalId.setPromptText(professor.getNationalId());
        newPhoneNumber.setPromptText(professor.getPhoneNumber());
        newDateOfBirth.setPromptText(professor.getDateOfBirth().getDayOfMonth() + " " + Month.of(professor.getDateOfBirth().getMonthValue()) + " " + professor.getDateOfBirth().getYear()); // must work on dates of Date

        newGender.getItems().addAll(Gender.Male, Gender.Female);
    }
}

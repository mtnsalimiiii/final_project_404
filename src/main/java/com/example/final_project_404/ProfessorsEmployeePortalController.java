package com.example.final_project_404;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProfessorsEmployeePortalController implements Initializable {

    @FXML
    private TableView<Professor> professorsTableview;

    @FXML
    private TableColumn<Professor, String> ageTableview;

    @FXML
    private VBox containerBarVBox;

    @FXML
    private TableColumn<Professor, String> departmentTableview;


    @FXML
    private TableColumn<Professor, String> dateOfJoinTableview;

    @FXML
    private TableColumn<Professor, String> facultyTableview;

    @FXML
    private TableColumn<Professor, String> firstNameTableview;

    @FXML
    private TableColumn<Professor, String> genderTableview;


    @FXML
    private ComboBox<String> itemChooser;

    @FXML
    private HBox headerHBox;

    @FXML
    private TableColumn<Professor, String> lastNameTableview;

    @FXML
    private TableColumn<Professor, String> majorTableview;

    @FXML
    private TableColumn<Professor, String> nameTableview;

    @FXML
    private TableColumn<Professor, String> nationalIdTableview;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private DatePicker primaryDate;

    @FXML
    private DatePicker secondaryDate;

    @FXML
    private TableColumn<Professor, String> phoneTableview;

    @FXML
    private TableColumn<Professor, String> professorIdTableview;

    @FXML
    private TableColumn<Professor, String> rowNumberTableview;

    @FXML
    private TextField searchBox;

    @FXML
    private ComboBox<String> topicChooser;

    private ObservableList<Professor> data = FXCollections.observableArrayList();

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
    void RegisterNewStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterStudent.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Register New Student");
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
    void addDegreeEmployeePortal(ActionEvent event) throws IOException {
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
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();    }

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
    void addCourseGroupEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddCourseGroupEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Course Group");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void studentsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Students");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        try {
            Professor.loadAllProfessor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        topicChooser.getItems().clear();
        topicChooser.getItems().addAll("First Name", "Last Name", "Age", "Gender", "Phone Number", "National ID", "Professor ID", "Date of Registration", "Faculty", "Department", "Major");
        topicChooser.setVisibleRowCount(5);

        topicChooser.setOnAction(event -> {
            if (topicChooser.getValue().equals("First Name") || topicChooser.getValue().equals("Last Name") || topicChooser.getValue().equals("Age") || topicChooser.getValue().equals("Phone Number") || topicChooser.getValue().equals("National ID")) {
                searchBox.setVisible(true);
                searchBox.setDisable(false);
                primaryDate.setVisible(false);
                primaryDate.setDisable(true);
                secondaryDate.setVisible(false);
                secondaryDate.setDisable(true);
                itemChooser.setVisible(false);
                itemChooser.setDisable(true);

                searchBox.setPromptText("Enter " + topicChooser.getValue());

            } else if (topicChooser.getValue().equals("Gender") || topicChooser.getValue().equals("Professor ID") || topicChooser.getValue().equals("Faculty") || topicChooser.getValue().equals("Department") || topicChooser.getValue().equals("Major")) {
                itemChooser.setVisible(true);
                itemChooser.setDisable(false);
                searchBox.setVisible(false);
                searchBox.setDisable(true);
                primaryDate.setVisible(false);
                primaryDate.setDisable(true);
                secondaryDate.setVisible(false);
                secondaryDate.setDisable(true);

                itemChooser.setPromptText("Choose " + topicChooser.getValue());

                if (topicChooser.getValue().equals("Gender")){
                    itemChooser.getItems().clear();
                    itemChooser.getItems().addAll("Male", "Female");
                    itemChooser.setVisibleRowCount(2);
                } else if (topicChooser.getValue().equals("Professor ID")){
                    itemChooser.getItems().clear();
                    for (Professor professor : University.allProfessors){
                        if (professor.getStatus().equals(Status.Active)){
                            itemChooser.getItems().add(professor.getId());
                        }
                    }
                    itemChooser.setVisibleRowCount(5);
                } else if (topicChooser.getValue().equals("Faculty")){
                    itemChooser.getItems().clear();
                    for (Faculty faculty : University.allFaculties){
                        if (faculty.getStatus().equals(Status.Active)){
                            itemChooser.getItems().add(faculty.getFacultyName());
                        }
                    }
                    itemChooser.setVisibleRowCount(5);
                } else if (topicChooser.getValue().equals("Department")){
                    itemChooser.getItems().clear();
                    for (Faculty faculty : University.allFaculties){
                        if (faculty.getStatus().equals(Status.Active)){
                            for (Department department : faculty.departments){
                                if (department.getStatus().equals(Status.Active)){
                                    itemChooser.getItems().add(department.getName());
                                }
                            }
                        }
                    }
                    itemChooser.setVisibleRowCount(5);
                } else if (topicChooser.getValue().equals("Major")){
                    itemChooser.getItems().clear();
                    for (Faculty faculty : University.allFaculties){
                        if (faculty.getStatus().equals(Status.Active)){
                            for (Department department : faculty.departments){
                                if (department.getStatus().equals(Status.Active)){
                                    for (Major major : department.majors){
                                        itemChooser.getItems().add(major.getName());
                                    }
                                }
                            }
                        }
                    }
                    itemChooser.setVisibleRowCount(5);
                }
            } else if (topicChooser.getValue().equals("Date of Registration")) {
                primaryDate.setVisible(true);
                primaryDate.setDisable(false);
                secondaryDate.setVisible(true);
                secondaryDate.setDisable(true);
                itemChooser.setVisible(false);
                itemChooser.setDisable(true);
                searchBox.setVisible(false);
                searchBox.setDisable(true);

                primaryDate.setPromptText("FROM");
                secondaryDate.setPromptText("TO");
            }
        });

        searchBox.setOnAction(event -> {

            if (topicChooser.getValue().equals("First Name")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getFirst_name().contains(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("Last Name")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getLast_name().contains(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("Age")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getDateOfBirth().getAge() == Integer.parseInt(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("Phone Number")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getPhoneNumber().contains(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("National ID")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getNationalId().contains(searchBox.getText())){

                    }
                }
            }


        });

        itemChooser.setOnAction(event -> {

            if (topicChooser.getValue().equals("Gender")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getGender().equals(itemChooser.getValue())){
                    }
                }
            } else if (topicChooser.getValue().equals("Professor ID")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getId().equals(itemChooser.getValue())){

                    }
                }
            } else if (topicChooser.getValue().equals("Faculty")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getFaculty().equals(itemChooser.getValue())){

                    }
                }
            } else if (topicChooser.getValue().equals("Department")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getDepartment().equals(itemChooser.getValue())){

                    }
                }
            } else if (topicChooser.getValue().equals("Major")){
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active) && professor.getMajor().equals(itemChooser.getValue())){

                    }
                }
            }
        });

        primaryDate.setOnAction(event -> {
            if (primaryDate.getValue() != null){
                secondaryDate.setDisable(false);
                secondaryDate.setPromptText("TO");
            }
        });

        secondaryDate.setOnAction(event -> {
            Date primaryDate1 = new Date();
            primaryDate1.setYear(primaryDate.getValue().getYear());
            primaryDate1.setMonth(primaryDate.getValue().getMonthValue());
            primaryDate1.setDay(primaryDate.getValue().getDayOfMonth());

            Date secondaryDate1 = new Date();
            secondaryDate1.setYear(secondaryDate.getValue().getYear());
            secondaryDate1.setMonth(secondaryDate.getValue().getMonthValue());
            secondaryDate1.setDay(secondaryDate.getValue().getDayOfMonth());

            for (Professor professor : University.allProfessors){
                if (professor.getDateOfJoin().getYear() > primaryDate1.getYear() && professor.getDateOfJoin().getYear() < secondaryDate1.getYear()){

                } else if (professor.getDateOfJoin().getMonth() == primaryDate1.getMonth()) {
                    if (professor.getDateOfJoin().getMonth() > primaryDate1.getMonth()){

                    } else if (professor.getDateOfJoin().getMonth() == primaryDate1.getMonth()) {
                        if (professor.getDateOfJoin().getDay() == primaryDate1.getDay()){

                        }
                    }
                } else if (professor.getDateOfJoin().getYear() == secondaryDate1.getYear()) {
                    if (professor.getDateOfJoin().getMonth() < secondaryDate1.getMonth()) {

                    } else if (professor.getDateOfJoin().getMonth() == secondaryDate1.getMonth()) {
                        if (professor.getDateOfJoin().getDay() <= secondaryDate1.getDay()) {

                        }
                    }
                }
            }
        });
    }
}

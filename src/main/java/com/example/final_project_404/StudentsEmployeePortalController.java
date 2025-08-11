package com.example.final_project_404;

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
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.ResourceBundle;

public class StudentsEmployeePortalController implements Initializable {

    @FXML
    private TableColumn<?, ?> ageTableview;

    @FXML
    private TableColumn<?, ?> dateOfJoinTableview;

    @FXML
    private TableColumn<?, ?> departmentTableview;

    @FXML
    private TableColumn<?, ?> facultyTableview;

    @FXML
    private TableColumn<?, ?> firstNameTableview;

    @FXML
    private TableColumn<?, ?> genderTableview;

    @FXML
    private HBox headerHBox;

    @FXML
    private ComboBox<String> itemChooser;

    @FXML
    private TableColumn<?, ?> lastNameTableview;

    @FXML
    private TableColumn<?, ?> majorTableview;

    @FXML
    private TableColumn<?, ?> nameTableview;

    @FXML
    private TableColumn<?, ?> nationalIdTableview;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TableColumn<?, ?> phoneTableview;

    @FXML
    private DatePicker primaryDate;

    @FXML
    private TableView<?> professorsTableview;

    @FXML
    private TableColumn<?, ?> rowNumberTableview;

    @FXML
    private TextField searchBox;

    @FXML
    private DatePicker secondaryDate;

    @FXML
    private TableColumn<?, ?> studentIdTableview;

    @FXML
    private ComboBox<String> topicChooser;


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
    void professorsEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Students");
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

    public boolean isDateInRange(LocalDate date, LocalDate dateStart, LocalDate dateEnd) {
        return (date.isAfter(dateStart) || date.isEqual(dateStart)) && (date.isBefore(dateEnd) || date.isEqual(dateEnd));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        try {
            Student.loadAllStudents();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        topicChooser.getItems().clear();
        topicChooser.getItems().addAll("First Name", "Last Name", "Age", "Gender", "Phone Number", "National ID", "Student ID", "Date of Registration", "Faculty", "Department", "Major");
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

            } else if (topicChooser.getValue().equals("Gender") || topicChooser.getValue().equals("Student ID") || topicChooser.getValue().equals("Faculty") || topicChooser.getValue().equals("Department") || topicChooser.getValue().equals("Major")) {
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
                } else if (topicChooser.getValue().equals("Student ID")){
                    itemChooser.getItems().clear();
                    for (Student student : University.allStudents){
                        if (student.getStatus().equals(Status.Active)){
                            itemChooser.getItems().add(student.getId());
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
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getFirst_name().contains(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("Last Name")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getLast_name().contains(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("Age")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && Period.between(student.getDateOfBirth(), LocalDate.now()).getYears() == Integer.parseInt(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("Phone Number")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getPhoneNumber().contains(searchBox.getText())){

                    }
                }
            } else if (topicChooser.getValue().equals("National ID")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getNationalId().contains(searchBox.getText())){

                    }
                }
            }


        });

        itemChooser.setOnAction(event -> {

            if (topicChooser.getValue().equals("Gender")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getGender().equals(itemChooser.getValue())){

                    }
                }
            } else if (topicChooser.getValue().equals("Student ID")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getId().equals(itemChooser.getValue())){

                    }
                }
            } else if (topicChooser.getValue().equals("Faculty")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getFaculty().equals(itemChooser.getValue())){

                    }
                }
            } else if (topicChooser.getValue().equals("Department")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getDepartment().equals(itemChooser.getValue())){

                    }
                }
            } else if (topicChooser.getValue().equals("Major")){
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active) && student.getMajor().equals(itemChooser.getValue())){

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

            LocalDate primaryDate1 = primaryDate.getValue();
            LocalDate secondaryDate1 = secondaryDate.getValue();

            for (Student student : University.allStudents) {
                if (isDateInRange(student.getDateOfJoin(), primaryDate1, secondaryDate1)){

                } else  {

                }
            }

//            for (Student student : University.allStudents){
//                if (student.getDateOfJoin().getYear() > primaryDate1.getYear() && student.getDateOfJoin().getYear() < secondaryDate1.getYear()){
//
//                } else if (student.getDateOfJoin().getMonthValue() == primaryDate1.getMonthValue()) {
//                    if (student.getDateOfJoin().getMonthValue() > primaryDate1.getMonthValue()){
//
//                    } else if (student.getDateOfJoin().getMonth() == primaryDate1.getMonth()) {
//                        if (student.getDateOfJoin().getDayOfMonth() == primaryDate1.getDayOfMonth()){
//
//                        }
//                    }
//                } else if (student.getDateOfJoin().getYear() == secondaryDate1.getYear()) {
//                    if (student.getDateOfJoin().getMonthValue() < secondaryDate1.getMonthValue()) {
//
//                    } else if (student.getDateOfJoin().getMonth() == secondaryDate1.getMonth()) {
//                        if (student.getDateOfJoin().getDayOfMonth() <= secondaryDate1.getDayOfMonth()) {
//
//                        }
//                    }
//                }
//            }
        });

    }

}

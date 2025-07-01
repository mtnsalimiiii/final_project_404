package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AddCourseController implements Initializable{

    @FXML
    private VBox containerBarVBox;

    @FXML
    private TextField courseCredit;

    @FXML
    private TextField courseName;

    @FXML
    private ComboBox<String> degreeChooser;

    @FXML
    private ComboBox<String> facultyChooser;

    @FXML
    private HBox headerHBox;

    @FXML
    private ComboBox<String> majorChooser;

    @FXML
    private VBox navigationBarVBox;

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
    @FXML
    void addStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterStudent.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Register new student");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

//    public String idMakerCourse(String majorName){
//        University.loadFaculties();
//        for (Faculty fac:University.allFaculties) {
//            if (fac.getFacultyName() == LoginPanelController.employeePerson.getFacultyEmployee()) {
//                for (Department department:fac.departments){
//                    if(department.getName()==LoginPanelController.employeePerson.getDepartmentEmployee()){
//                        for(Major major:department.majors){
//                            if (major.getName()==majorName){
//                                return major.getId() + major.courses.size() +1;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }

//    @FXML
//    void addCourse(ActionEvent event)throws IOException{
//
//
//        String majorName = majorChooser.getValue();
//        int creditCourse = Integer.parseInt(courseCredit.getText().trim());
//        String nameCourse = courseName.getText().trim();
//        String id="01";
//
//        if (!facultyChooser.getValue().isBlank() && !departmentChooser.getValue().isBlank() && !majorChooser.getValue().isBlank() && !courseCredit.getText().isBlank() && !nameCourse.isBlank()){
//            University.loadFaculties();
//            Course newCourse = new Course(nameCourse, creditCourse, id);
//            for (Faculty faculty : University.allFaculties) {
//                if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFacultyEmployee())) {
//                    for (Department department : faculty.departments){
//                        if(department.getName().equals(LoginPanelController.employeePerson.getDepartmentEmployee())){
//                            for(Major major : department.majors){
//                                if (!major.courses.contains(newCourse)){
//                                    if (major.getName().equals(majorName)){
//                                        major.courses.add(newCourse);
//                                        break;
//                                    }
//                                } else {
//                                    System.out.println("This Course has Regitered earlier!!");
//                                }
//                            }
//                            break;
//                        }
//                    }
//                    break;
//                }
//            }
//            University.saveFaculties();
//
//        } else {
//            System.out.println("Please Fill All Fields!!");
//        }
//    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        if (LoginPanelController.employeePerson == null) return;

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName() != null && faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFacultyEmployee())) {
                for (Department department : faculty.departments) {
                    if (department.getName() != null && department.getName().equals(LoginPanelController.employeePerson.getDepartmentEmployee())) {
                        for (Major major : department.majors) {
                            if (major.getName() != null) {
                                majorChooser.getItems().add(major.getName());
                            }
                        }
                        majorChooser.setVisibleRowCount(4);
                        break;
                    }
                }
                break;
            }
        }
    }


    public void addCourse(ActionEvent event) {

    }
}

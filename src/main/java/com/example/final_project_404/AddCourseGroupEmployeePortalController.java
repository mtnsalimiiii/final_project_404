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

public class AddCourseGroupEmployeePortalController implements Initializable{

    @FXML
    private VBox containerBarVBox;

    @FXML TextField capacity;


    @FXML
    private ComboBox<String> degreeChooser;

    @FXML
    private ComboBox<String> course;;

    @FXML
    private ComboBox<String> professor;

    @FXML
    private HBox headerHBox;

    @FXML
    private ComboBox<String> majorChooser;

    @FXML
    private VBox navigationBarVBox;

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
    void addStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterStudent.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Register new student");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        if (LoginPanelController.employeePerson == null) return;

        String facultyName = LoginPanelController.employeePerson.getFacultyEmployee();
        String departmentName = LoginPanelController.employeePerson.getDepartmentEmployee();

        for (Faculty faculty : University.allFaculties) {
            if (facultyName.equals(faculty.getFacultyName())) {
                for (Department department : faculty.departments) {
                    if (departmentName.equals(department.getName())) {
                        for (Major major : department.majors) {
                            if (major.getName() != null) {
                                majorChooser.getItems().add(major.getName());

                                for (Degree degree : major.degrees) {
                                    if (degree != null) {
                                        degreeChooser.getItems().add(degree.getClass().getSimpleName());
                                    }
                                }
                            }
                        }

                        majorChooser.setVisibleRowCount(4);
                        degreeChooser.setVisibleRowCount(4);
                        break;
                    }
                }
                break;
            }
        }
    }

    @FXML
    public void addCourse(ActionEvent event) {
       /* String majorName = majorChooser.getValue();
        String selectedDegree = degreeChooser.getValue();
        /String name = courseName.getText().trim();
        String creditStr = courseCredit.getText().trim();

        if (majorName == null || selectedDegree == null || name.isEmpty() || creditStr.isEmpty()) {
            System.out.println("Please fill in all the fields!");
            return;
        }

        int credit;
        try {
            credit = Integer.parseInt(creditStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid credit value.");
            return;
        }

        University.loadFaculties();

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFacultyEmployee())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(LoginPanelController.employeePerson.getDepartmentEmployee())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(majorName)) {

                                String degreeCode;
                                if (selectedDegree.equalsIgnoreCase("Bachelor")) {
                                    degreeCode = "0";
                                } else if (selectedDegree.equalsIgnoreCase("Master")) {
                                    degreeCode = "1";
                                } else if (selectedDegree.equalsIgnoreCase("Phd")) {
                                    degreeCode = "2";
                                } else {
                                    System.out.println("Unknown degree selected");
                                    return;
                                }


                                Degree targetDegree = null;
                                for (Degree degree : major.degrees) {
                                    if (degree.getClass().getSimpleName().equalsIgnoreCase(selectedDegree)) {
                                        targetDegree = degree;
                                        break;
                                    }
                                }

                                if (targetDegree == null) {
                                    System.out.println("Degree not found in major.");
                                    return;
                                }

                                int courseCount = targetDegree.courses.size();  // تعداد درس های موجود
                                String id = major.getId() + degreeCode + (courseCount + 1);

                                Course newCourse = new Course(name, credit, id);
                                targetDegree.courses.add(newCourse);

                                University.saveFaculties();
                                System.out.println("Course added with ID: " + id);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Major not found!");*/
    }

}

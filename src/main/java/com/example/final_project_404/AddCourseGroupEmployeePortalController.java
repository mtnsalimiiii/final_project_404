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
    private ComboBox<String> courseChooser;;

    @FXML
    private ComboBox<String> professor;

    @FXML
    private HBox headerHBox;

    @FXML
    private ComboBox<String> majorChooser;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private ComboBox<String> semesterChooser;

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
    public void addCourseEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddCourseEmployeePortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Course");
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

    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        University.loadAllSemester();
        for (Semester semester:University.allSemesters){
            if(semester.getStatus()==Status.Active){
                semesterChooser.getItems().add(semester.getName());
            }
        }
        if (LoginPanelController.employeePerson == null) return;

        String facultyName = LoginPanelController.employeePerson.getFaculty();
        String departmentName = LoginPanelController.employeePerson.getDepartment();

        for (Faculty faculty : University.allFaculties) {
            if (facultyName.equals(faculty.getFacultyName()) && faculty.getStatus() == Status.Active) {
                for (Department department : faculty.departments) {
                    if (departmentName.equals(department.getName()) && department.getStatus() == Status.Active) {

                        for (Major major : department.majors) {
                            if (major.getName() != null && major.getStatus() == Status.Active) {
                                majorChooser.getItems().add(major.getName());
                            }
                        }

                        majorChooser.setOnAction(e -> {
                            String selectedMajorName = majorChooser.getValue();
                            degreeChooser.getItems().clear();
                            professor.getItems().clear();
                            courseChooser.getItems().clear();

                            for (Major major : department.majors) {
                                if (major.getName().equals(selectedMajorName) && major.getStatus() == Status.Active) {

                                    for (Degree degree : major.degrees) {
                                        if (degree != null) {
                                            degreeChooser.getItems().add(degree.getClass().getSimpleName());
                                        }
                                    }

                                    for (Professor prof : major.professors) {
                                        professor.getItems().add(prof.getFirst_name() + " " + prof.getLast_name());
                                    }
                                    degreeChooser.setOnAction(ev -> {
                                        String selectedDegree = degreeChooser.getValue();
                                        courseChooser.getItems().clear();

                                        for (Degree degree : major.degrees) {
                                            if (degree.getClass().getSimpleName().equalsIgnoreCase(selectedDegree)) {
                                                for (Course course : degree.courses) {
                                                    if (course.getStatus() == Status.Active) {
                                                        courseChooser.getItems().add(course.getName());
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    });

                                    break;
                                }
                            }
                        });

                        majorChooser.setVisibleRowCount(4);
                        degreeChooser.setVisibleRowCount(4);
                        professor.setVisibleRowCount(4);
                        courseChooser.setVisibleRowCount(4);
                        break;
                    }
                }
                break;
            }
        }
    }

    @FXML
    public void addCourseGroup(ActionEvent event) {
        String majorName = majorChooser.getValue();
        String selectedDegree = degreeChooser.getValue();
        String capacityGroupStr = capacity.getText().trim();
        String courseTarget=courseChooser.getValue();

        if (majorName == null || selectedDegree == null || capacityGroupStr.isEmpty()
                || courseChooser.getValue() == null || professor.getValue() == null) {
            System.out.println("Please fill in all the fields!");
            return;
        }

        int capacityGroup;
        try {
            capacityGroup = Integer.parseInt(capacityGroupStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid credit value.");
            return;
        }

        University.loadFaculties();

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(LoginPanelController.employeePerson.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(majorName) && major.getStatus().equals(Status.Active)) {

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
                                try {
                                    for (Degree degree : major.degrees) {
                                        if (degree.getClass().getSimpleName().equalsIgnoreCase(selectedDegree)) {
                                            try {
                                                for(Course course1:degree.courses){
                                                    if(courseTarget==course1.getName()){
                                                        String id=course1.getId()+(course1.courseGroups.size()+1);
                                                        course1.courseGroups.add(new CourseGroup(professor.getValue(),semesterChooser.getValue(),capacityGroup,id,Status.Active));
                                                        University.saveFaculties();
                                                        System.out.println("coursegroup add successful");
                                                    }
                                                }
                                            }catch (Exception e){
                                                System.out.println("Course not found in degree.");
                                            }

                                        }
                                }

                                }catch (Exception exception){
                                    System.out.println("Degree not found in major.");
                                }


                            }
                        }
                    }
                }
            }
        }
        System.out.println("Major not found!");
    }
}

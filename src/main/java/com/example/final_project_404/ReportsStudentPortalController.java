package com.example.final_project_404;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportsStudentPortalController {

    @FXML
    private ComboBox<String> semesterComboBox;
    @FXML
    private TableView<CourseGroupRow> reportsTable;
    @FXML
    private TableColumn<CourseGroupRow, String> column1; // Course
    @FXML
    private TableColumn<CourseGroupRow, Integer> column2; // Credit
    @FXML
    private TableColumn<CourseGroupRow, String> column3; // Professor
    @FXML
    private TableColumn<CourseGroupRow, String> column4; // Score
    @FXML
    private TableColumn<CourseGroupRow, String> column5; // Status

    @FXML
    private AnchorPane buttonsAnchorPane;
    @FXML
    private AnchorPane contentPane;

    private ObservableList<CourseGroupRow> reportData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        University.loadAllSemester();

        // پر کردن ترم‌ها
        for (Semester semester : University.allSemesters) {
            if (semester.getStatus() == Status.Active) {
                semesterComboBox.getItems().add(semester.getName());
            }
        }

        semesterComboBox.setVisibleRowCount(4);

        // اتصال ستون‌ها
        column1.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCourseName()));
        column2.setCellValueFactory(data -> new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getCredits()));
        column3.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(getProfessorName(data.getValue().getCourseGroup())));
        column4.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(getScore(data.getValue().getCourseGroup())));
        column5.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(getCourseStatus(data.getValue().getCourseGroup())));

        reportsTable.setItems(reportData);

        // پیش‌فرض: مخفی بودن بخش جدول
        contentPane.setVisible(false);
    }

    @FXML
    private void showCourseReport() {
        buttonsAnchorPane.setVisible(false);
        contentPane.setVisible(true);
    }

    @FXML
    private void handleSearch() {
        reportData.clear();

        String selectedSemester = semesterComboBox.getValue();
        if (selectedSemester == null) {
            showAlert("لطفاً یک ترم را انتخاب کنید");
            return;
        }

        // پیدا کردن دانشجو واقعی در University
        Student student = findStudentInUniversity(LoginPanelController.studentPerson);
        if (student == null) {
            showAlert("دانشجو پیدا نشد");
            return;
        }

        Semester semester = student.getSemesterByName(selectedSemester);
        if (semester == null) {
            showAlert("این دانشجو در این ترم درسی ندارد");
            return;
        }

        for (CourseGroup group : semester.getCourseGroups()) {
            reportData.add(new CourseGroupRow(group));
        }
    }

    private String getProfessorName(CourseGroup group) {
        return group.getProfessor() != null ? group.getProfessor() : "-";
    }

    private String getScore(CourseGroup group) {
        Student student = LoginPanelController.studentPerson;
        Double score = group.getScore(student);
        return (score != null) ? String.valueOf(score) : "-";
    }


    private String getCourseStatus(CourseGroup group) {
        return group.getStatus() == Status.Active ? "Active" : "Inactive";
    }

    private Student findStudentInUniversity(Student loginStudent) {
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(loginStudent.getFaculty())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(loginStudent.getDepartment())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(loginStudent.getMajor())) {
                                for (Student s : major.students) {
                                    if (s.getId().equals(loginStudent.getId())) {
                                        return s;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("پیام");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // ناوبری بین صفحات
    @FXML
    public void dashboardStudentPortal(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentPortal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Student Portal");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void profileStudentPortal(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileStudentPortal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Profile");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void signOutStudentPortal(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.setResizable(false);
        stage.show();
    }

}

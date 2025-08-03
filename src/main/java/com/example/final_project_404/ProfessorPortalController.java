package com.example.final_project_404;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;

import java.io.IOException;

public class ProfessorPortalController {

    @FXML private TableView<StudentGradeRow> studentsTable;
    @FXML private TableColumn<StudentGradeRow, String> studentIdCol;
    @FXML private TableColumn<StudentGradeRow, String> studentNameCol;
    @FXML private TableColumn<StudentGradeRow, Double> scoreCol;
    @FXML private TableColumn<StudentGradeRow, String> statusCol;

    @FXML private ComboBox<String> semesterComboBox;
    @FXML private ComboBox<String> courseGroupComboBox;

    @FXML private Node mainMenuPane;
    @FXML private Node gradeSubmissionPane;

    private final ObservableList<StudentGradeRow> gradeRows = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // پر کردن لیست ترم‌ها
        University.loadAllSemester();
        semesterComboBox.getItems().clear();
        for (Semester sem : University.allSemesters) {
            semesterComboBox.getItems().add(sem.getName());
        }

        // وقتی ترم انتخاب شد، لیست درس‌ها آپدیت شود
        semesterComboBox.setOnAction(e -> loadCourseGroupsForSemester());

        // ستون‌ها
        studentIdCol.setCellValueFactory(data -> data.getValue().studentIdProperty());
        studentNameCol.setCellValueFactory(data -> data.getValue().studentNameProperty());
        scoreCol.setCellValueFactory(data -> data.getValue().scoreProperty().asObject());
        statusCol.setCellValueFactory(data -> data.getValue().statusProperty());

        studentsTable.setItems(gradeRows);
        studentsTable.setEditable(true);

        // ستون نمره قابل ویرایش
        scoreCol.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
        scoreCol.setOnEditCommit(event -> {
            StudentGradeRow row = event.getRowValue();
            row.setScore(event.getNewValue());
        });
    }

    private void loadCourseGroupsForSemester() {
        courseGroupComboBox.getItems().clear();
        String selectedSemester = semesterComboBox.getValue();
        University.loadFaculties();
        if (selectedSemester == null) return;

        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                if (group.getProfessor().equals(LoginPanelController.professorPerson.getFullName()) &&
                                        group.getSemasterCode().equals(selectedSemester)) {
                                    courseGroupComboBox.getItems().add(group.getCourse().getName());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @FXML
    void showGradeSubmissionPanel(ActionEvent event) {
        mainMenuPane.setVisible(false);
        mainMenuPane.setManaged(false);
        gradeSubmissionPane.setVisible(true);
        gradeSubmissionPane.setManaged(true);
    }

    @FXML
    void loadStudents(ActionEvent event) {
        gradeRows.clear();
        String selectedSemester = semesterComboBox.getValue();
        String selectedCourse = courseGroupComboBox.getValue();

        if (selectedSemester == null || selectedCourse == null) {
            showAlert("Please select semester and course.");
            return;
        }

        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                if (group.getProfessor().equals(LoginPanelController.professorPerson.getFullName()) &&
                                        group.getCourse().getName().equals(selectedCourse) &&
                                        group.getSemasterCode().equals(selectedSemester)) {
                                    for (Student s : group.getRegisteredStudents()) {
                                        Double score = group.getScores().get(s);
                                        gradeRows.add(new StudentGradeRow(s.getId(), s.getFullName(), score, "Registered"));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @FXML
    void saveGrades(ActionEvent event) {
        String selectedSemester = semesterComboBox.getValue();
        String selectedCourse = courseGroupComboBox.getValue();

        if (selectedSemester == null || selectedCourse == null) {
            showAlert("Please select semester and course first.");
            return;
        }

        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                if (group.getProfessor().equals(LoginPanelController.professorPerson.getFullName()) &&
                                        group.getCourse().getName().equals(selectedCourse) &&
                                        group.getSemasterCode().equals(selectedSemester)) {
                                    for (StudentGradeRow row : gradeRows) {
                                        Student student = findStudentById(row.getStudentId());
                                        if (student != null) {
                                            group.getScores().put(student, row.getScore());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        University.saveFaculties();
        showAlert("Grades saved successfully!");
    }

    private Student findStudentById(String id) {
        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                for (Student s : group.getRegisteredStudents()) {
                                    if (s.getId().equals(id)) {
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

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    // Navigation buttons
    @FXML
    void profileProfessorPortal(ActionEvent event) throws IOException {
        loadPage("ProfileProfessorPortal.fxml", event, "Profile");
    }

    @FXML
    void reportsProfessorPortal(ActionEvent event) throws IOException {
        loadPage("ReportsProfessorPortal.fxml", event, "Reports");
    }

    @FXML
    void signOutProfessorPortal(ActionEvent event) throws IOException {
        loadPage("LoginPanel.fxml", event, "Login");
    }

    private void loadPage(String fxml, ActionEvent event, String title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle(title);
        stage.setResizable(false);
        stage.show();
    }
}

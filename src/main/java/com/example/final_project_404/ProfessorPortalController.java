package com.example.final_project_404;

import javafx.beans.property.ReadOnlyStringWrapper;
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
import java.util.Map;

public class ProfessorPortalController {

    @FXML private TableView<Student> studentsTable;
    @FXML private TableColumn<Student, String> studentIdCol;
    @FXML private TableColumn<Student, String> studentNameCol;
    @FXML private TableColumn<Student, Double> scoreCol;

    @FXML private ComboBox<String> semesterComboBox;
    @FXML private ComboBox<String> courseGroupComboBox;

    @FXML private Node mainMenuPane;
    @FXML private Node gradeSubmissionPane;

    private final ObservableList<Student> studentRows = FXCollections.observableArrayList();
    private CourseGroup currentGroup; // گروه فعلی انتخاب شده

    @FXML
    public void initialize() {
        // پر کردن لیست ترم‌ها
        University.loadAllSemester();
        semesterComboBox.getItems().clear();
        for (Semester sem : University.allSemesters) {
            semesterComboBox.getItems().add(sem.getName());
        }

        semesterComboBox.setOnAction(e -> loadCourseGroupsForSemester());

        // تنظیم ستون‌ها
        studentIdCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getId()));
        studentNameCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getFirst_name() + " " + cellData.getValue().getLast_name()));


        // ستون نمره قابل ویرایش
        scoreCol.setCellValueFactory(data -> {
            if (currentGroup != null) {
                Double score = currentGroup.getGrades().get(data.getValue());
                return new javafx.beans.property.SimpleDoubleProperty(score != null ? score : 0.0).asObject();
            }
            return new javafx.beans.property.SimpleDoubleProperty(0.0).asObject();
        });

        studentsTable.setItems(studentRows);
        studentsTable.setEditable(true);

        // وقتی استاد نمره رو تغییر میده → مستقیم تو HashMap میره
        scoreCol.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
        scoreCol.setOnEditCommit(event -> {
            Student student = event.getRowValue();
            Double newScore = event.getNewValue();
            if (currentGroup != null) {
                currentGroup.getGrades().put(student, newScore); // آپدیت مستقیم
            }
            studentsTable.refresh();
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
        studentRows.clear();
        String selectedSemester = semesterComboBox.getValue();
        String selectedCourse = courseGroupComboBox.getValue();

        if (selectedSemester == null || selectedCourse == null) {
            showAlert("Please select semester and course.");
            return;
        }

        currentGroup = null;

        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                if (group.getProfessor().equals(LoginPanelController.professorPerson.getFullName()) &&
                                        group.getCourse().getName().equals(selectedCourse) &&
                                        group.getSemasterCode().equals(selectedSemester)) {

                                    currentGroup = group;
                                    // اضافه کردن دانشجوها از روی grades
                                    for (Map.Entry<Student, Double> entry : group.getGrades().entrySet()) {
                                        studentRows.add(entry.getKey());
                                        studentsTable.refresh();                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (currentGroup == null) {
            showAlert("No course group found.");
        }
    }

    @FXML
    void saveGrades(ActionEvent event) {
        if (currentGroup == null) {
            showAlert("Please load a course first.");
            return;
        }

        University.saveFaculties();
        showAlert("Grades saved successfully!");
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

package com.example.final_project_404;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class EnrollStudentController {

    @FXML
    private ComboBox<String> semesterComboBox;

    @FXML
    private TableView<CourseGroupRow> coursesTableView;

    @FXML
    private TableColumn<CourseGroupRow, Boolean> selectCol;
    @FXML
    private TableColumn<CourseGroupRow, String> courseCodeCol;
    @FXML
    private TableColumn<CourseGroupRow, String> courseNameCol;
    @FXML
    private TableColumn<CourseGroupRow, Integer> creditsCol;
    @FXML
    private TableColumn<CourseGroupRow, String> scheduleCol;

    @FXML
    private Label totalCreditsLabel;
    @FXML
    private Label messageLabel;

    private ObservableList<CourseGroupRow> availableCourses = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        University.loadAllSemester();
        University.loadFaculties();

        for (Semester semester : University.allSemesters) {
            if (semester.getStatus() == Status.Active) {
                semesterComboBox.getItems().add(semester.getName());
            }
        }
        semesterComboBox.setVisibleRowCount(4);
        University.saveAllSemester();
        setupCoursesTable();
    }

    private void setupCoursesTable() {
        selectCol.setCellValueFactory(cellData -> cellData.getValue().selectedProperty());
        selectCol.setCellFactory(CheckBoxTableCell.forTableColumn(selectCol));

        courseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        courseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        creditsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        scheduleCol.setCellValueFactory(new PropertyValueFactory<>("schedule"));

        coursesTableView.setItems(availableCourses);
    }

    @FXML
    private void searchCourses() {
        University.loadFaculties();
        availableCourses.clear();

        String selectedSemesterName = semesterComboBox.getValue();
        if (selectedSemesterName == null) {
            showMessage("لطفاً یک ترم را انتخاب کنید", "error");
            return;
        }

        Student student = LoginPanelController.studentPerson;

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(student.getFaculty())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(student.getDepartment())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(student.getMajor())) {
                                for (Degree degree : major.degrees) {
                                    if (degree.getClass().getSimpleName().equals(student.getDegree())) {
                                        for (Course course : degree.courses) {
                                            for (CourseGroup group : course.courseGroups) {
                                                if (group.getStatus() == Status.Active) {
                                                    availableCourses.add(new CourseGroupRow(group));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        showMessage(availableCourses.size() + " درس یافت شد", "success");
        updateTotalCredits();
    }


    @FXML
    private void registerCourses() {
        Student student = LoginPanelController.studentPerson;
        String selectedSemesterName = semesterComboBox.getValue();

        if (selectedSemesterName == null) {
            showMessage("لطفاً یک ترم را انتخاب کنید", "error");
            return;
        }

        Semester studentSemester = student.getSemesterByName(selectedSemesterName);
        if (studentSemester == null) {
            studentSemester = new Semester(selectedSemesterName);
            student.getSemesters().add(studentSemester);
        }

        int selectedCount = 0;

        for (CourseGroupRow row : availableCourses) {
            if (row.isSelected()) {
                CourseGroup group = row.getCourseGroup();

                // چک ظرفیت
                if (group.getRegisteredStudents().size() >= group.getCapacity()) {
                    showMessage("ظرفیت کلاس " + group.getCourse().getName() + " پر شده است.", "error");
                    return;
                }

                // جلوگیری از ثبت تکراری
                if (!studentSemester.getCourseGroups().contains(group)) {
                    studentSemester.getCourseGroups().add(group);
                    group.getRegisteredStudents().add(student);
                    selectedCount++;
                }
            }
        }

        if (selectedCount == 0) {
            showMessage("هیچ درسی برای ثبت انتخاب نشده است", "error");
        } else {
            University.saveFaculties();
            showMessage(selectedCount + " درس با موفقیت ثبت شد", "success");
        }

        updateTotalCredits();
    }

    private void updateTotalCredits() {
        int total = availableCourses.stream()
                .filter(CourseGroupRow::isSelected)
                .mapToInt(CourseGroupRow::getCredits)
                .sum();

        totalCreditsLabel.setText("مجموع واحدها: " + total);
    }

    private void showMessage(String message, String type) {
        messageLabel.setText(message);
        if ("error".equals(type)) {
            messageLabel.setStyle("-fx-text-fill: red;");
        } else {
            messageLabel.setStyle("-fx-text-fill: green;");
        }
    }


    public void dashboardStudentPortal(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

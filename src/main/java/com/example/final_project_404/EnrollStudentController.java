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

import java.io.IOException;
import java.util.ArrayList;

public class EnrollStudentController {

    @FXML private ComboBox<String> semesterComboBox;
    @FXML private TableView<CourseGroupRow> coursesTableView, enrolledCoursesTableView;
    @FXML private TableColumn<CourseGroupRow, Boolean> selectCol;
    @FXML private TableColumn<CourseGroupRow, Void> dropCol;

    // ستون‌های Available Courses
    @FXML private TableColumn<CourseGroupRow, String> courseCodeCol, courseNameCol, professorCol;
    @FXML private TableColumn<CourseGroupRow, Integer> creditsCol;

    // ستون‌های Enrolled Courses
    @FXML private TableColumn<CourseGroupRow, String> enrolledCourseCodeCol, enrolledCourseNameCol, enrolledProfessorCol;
    @FXML private TableColumn<CourseGroupRow, Integer> enrolledCreditsCol;

    @FXML private Label totalCreditsLabel, messageLabel;

    private ObservableList<CourseGroupRow> availableCourses = FXCollections.observableArrayList();
    private ObservableList<CourseGroupRow> enrolledCourses = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        System.out.println("EnrollStudentController initialized ✅");

        try {
            University.loadAllSemester();
            University.loadFaculties();

            if (University.allSemesters == null) {
                University.allSemesters = new ArrayList<>();
            }

            for (Semester semester : University.allSemesters) {
                if (semester.getStatus() == Status.Active) {
                    semesterComboBox.getItems().add(semester.getName());
                }
            }

            if (semesterComboBox.getItems().isEmpty()) {
                showMessage("No active semesters found", "error");
            }

            semesterComboBox.setVisibleRowCount(4);
            setupCoursesTable();
            setupEnrolledCoursesTable();

        } catch (Exception e) {
            showMessage("Error loading data: " + e.getMessage(), "error");
            System.out.println("Exception in initialize: " + e.getMessage());
        }
    }

    private void setupCoursesTable() {
        selectCol.setCellValueFactory(cellData -> cellData.getValue().selectedProperty());
        selectCol.setCellFactory(CheckBoxTableCell.forTableColumn(selectCol));
        selectCol.setEditable(true);

        courseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        courseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        creditsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        professorCol.setCellValueFactory(new PropertyValueFactory<>("professor"));

        coursesTableView.setEditable(true);
        coursesTableView.setItems(availableCourses);
    }

    private void setupEnrolledCoursesTable() {
        dropCol.setCellFactory(param -> new TableCell<CourseGroupRow, Void>() {
            private final Button dropButton = new Button("Drop");

            {
                dropButton.setStyle("-fx-background-color: #ff4444; -fx-text-fill: white;");
                dropButton.setOnAction(event -> {
                    CourseGroupRow row = getTableView().getItems().get(getIndex());
                    dropCourse(row);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : dropButton);
            }
        });

        enrolledCourseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        enrolledCourseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        enrolledCreditsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        enrolledProfessorCol.setCellValueFactory(new PropertyValueFactory<>("professor"));

        enrolledCoursesTableView.setEditable(true);
        enrolledCoursesTableView.setItems(enrolledCourses);
    }

    @FXML
    private void searchCourses() {
        availableCourses.clear();
        enrolledCourses.clear();

        String selectedSemesterName = semesterComboBox.getValue();
        if (selectedSemesterName == null) {
            showMessage("Please select a semester", "error");
            return;
        }

        Student student = LoginPanelController.studentPerson;
        if (student == null) {
            showMessage("Student not found", "error");
            return;
        }

        Student realStudent = findStudentInUniversity(student);
        if (realStudent == null) {
            showMessage("Student not found in the system", "error");
            return;
        }

        // Load enrolled courses
        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        System.out.println("Loading courses for semester: " + selectedSemesterName);
        if (studentSemester != null) {
            if (studentSemester.courseGroups == null) {
                System.out.println("courseGroups is null for " + selectedSemesterName + ", initializing...");
                studentSemester.courseGroups = new ArrayList<>();
            }
            System.out.println("courseGroups size: " + studentSemester.courseGroups.size());
            if (studentSemester.courseGroups.isEmpty()) {
                showMessage("No courses enrolled for this semester", "error");
            } else {
                for (CourseGroup group : studentSemester.courseGroups) {
                    System.out.println("Adding enrolled course: " + group.getCourse().getName());
                    enrolledCourses.add(new CourseGroupRow(group));
                }
            }
        } else {
            System.out.println("No semester found for " + selectedSemesterName);
            showMessage("No semester found for this student", "error");
        }

        // Load available courses
        boolean foundCourses = false;
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
                                                if (group.getStatus() == Status.Active && group.getSemesterCode().equals(selectedSemesterName)) {
                                                    if (studentSemester == null || studentSemester.courseGroups == null || !studentSemester.courseGroups.contains(group)) {
                                                        availableCourses.add(new CourseGroupRow(group));
                                                        foundCourses = true;
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
        }

        if (!foundCourses && (studentSemester == null || studentSemester.courseGroups == null || studentSemester.courseGroups.isEmpty())) {
            showMessage("No courses found for this semester", "error");
        } else {
            showMessage(availableCourses.size() + " courses found", "success");
        }
        updateTotalCredits();
    }

    @FXML
    private void registerCourses() {
        String selectedSemesterName = semesterComboBox.getValue();

        if (selectedSemesterName == null) {
            showMessage("Please select a semester", "error");
            return;
        }

        Student realStudent = findStudentInUniversity(LoginPanelController.studentPerson);
        if (realStudent == null) {
            showMessage("Student not found in the system", "error");
            return;
        }

        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        if (studentSemester == null) {
            studentSemester = new Semester(selectedSemesterName, Status.Active);
            studentSemester.courseGroups = new ArrayList<>();
            realStudent.getSemesters().add(studentSemester);
            System.out.println("Created new semester: " + selectedSemesterName);
        }

        int selectedCount = 0;

        for (CourseGroupRow row : availableCourses) {
            if (row.isSelected()) {
                CourseGroup group = row.getCourseGroup();

                if (group.getRegisteredStudents().size() >= group.getCapacity()) {
                    showMessage("Course " + group.getCourse().getName() + " is full", "error");
                    return;
                }

                if (studentSemester.courseGroups == null) {
                    studentSemester.courseGroups = new ArrayList<>();
                    System.out.println("Initialized courseGroups for " + selectedSemesterName);
                }

                if (!studentSemester.courseGroups.contains(group)) {
                    studentSemester.courseGroups.add(group);
                    group.getRegisteredStudents().add(realStudent);
                    group.getGrades().put(realStudent.getId(), 0.0);
                    selectedCount++;
                    System.out.println("Registered course: " + group.getCourse().getName());
                }
            }
        }

        if (selectedCount == 0) {
            showMessage("No courses selected for registration", "error");
        } else {
            try {
                University.saveFaculties();
                System.out.println("Saved faculties after registering " + selectedCount + " courses");
                enrolledCourses.clear();
                if (studentSemester.courseGroups != null) {
                    for (CourseGroup group : studentSemester.courseGroups) {
                        enrolledCourses.add(new CourseGroupRow(group));
                        System.out.println("Added to enrolledCourses: " + group.getCourse().getName());
                    }
                }
                availableCourses.removeIf(CourseGroupRow::isSelected);
                showMessage(selectedCount + " courses registered successfully", "success");
            } catch (Exception e) {
                showMessage("Error registering courses: " + e.getMessage(), "error");
                System.out.println("Error in saveFaculties: " + e.getMessage());
            }
        }

        updateTotalCredits();
    }

    private void dropCourse(CourseGroupRow row) {
        String selectedSemesterName = semesterComboBox.getValue();
        if (selectedSemesterName == null) {
            showMessage("Please select a semester", "error");
            return;
        }

        Student realStudent = findStudentInUniversity(LoginPanelController.studentPerson);
        if (realStudent == null) {
            showMessage("Student not found in the system", "error");
            return;
        }

        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        if (studentSemester == null) {
            showMessage("Selected semester not found for student", "error");
            return;
        }

        CourseGroup group = row.getCourseGroup();
        try {
            if (studentSemester.courseGroups != null) {
                studentSemester.courseGroups.remove(group);
                group.getRegisteredStudents().remove(realStudent);
                group.getGrades().remove(realStudent.getId());
                University.saveFaculties();
                System.out.println("Saved faculties after dropping course: " + group.getCourse().getName());

                enrolledCourses.remove(row);
                if (group.getStatus() == Status.Active && group.getSemesterCode().equals(selectedSemesterName)) {
                    availableCourses.add(new CourseGroupRow(group));
                }

                showMessage("Course " + group.getCourse().getName() + " dropped successfully", "success");
            } else {
                showMessage("No courses enrolled for this semester", "error");
            }
        } catch (Exception e) {
            showMessage("Error dropping course: " + e.getMessage(), "error");
            System.out.println("Error in saveFaculties: " + e.getMessage());
        }
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

    private void updateTotalCredits() {
        int total = availableCourses.stream()
                .filter(CourseGroupRow::isSelected)
                .mapToInt(CourseGroupRow::getCredits)
                .sum();
        totalCreditsLabel.setText("Total Credits: " + total);
    }

    private void showMessage(String message, String type) {
        messageLabel.setText(message);
        if ("error".equals(type)) {
            messageLabel.setStyle("-fx-text-fill: red;");
        } else {
            messageLabel.setStyle("-fx-text-fill: green;");
        }
    }

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
    private void goBack(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentPortal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Student Portal");
        stage.setResizable(false);
        stage.show();
    }

}

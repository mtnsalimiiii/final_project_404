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

public class EnrollStudentController {

    @FXML
    private ComboBox<String> semesterComboBox;

    @FXML
    private TableView<CourseGroupRow> coursesTableView, enrolledCoursesTableView;

    @FXML
    private TableColumn<CourseGroupRow, Boolean> selectCol;

    @FXML
    private TableColumn<CourseGroupRow, Void> dropCol;

    @FXML
    private TableColumn<CourseGroupRow, String> courseCodeCol, courseNameCol, scheduleCol, enrolledCourseCodeCol, enrolledCourseNameCol, enrolledScheduleCol;

    @FXML
    private TableColumn<CourseGroupRow, Integer> creditsCol, enrolledCreditsCol;

    @FXML
    private Label totalCreditsLabel, messageLabel;

    private ObservableList<CourseGroupRow> availableCourses = FXCollections.observableArrayList();
    private ObservableList<CourseGroupRow> enrolledCourses = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        System.out.println("EnrollStudentController initialized ✅");

        try {
            University.loadAllSemester();
            University.loadFaculties();

            for (Semester semester : University.allSemesters) {
                if (semester.getStatus() == Status.Active) {
                    semesterComboBox.getItems().add(semester.getName());
                }
            }

            semesterComboBox.setVisibleRowCount(4);
            setupCoursesTable();
            setupEnrolledCoursesTable();

        } catch (Exception e) {
            System.out.println("خطا در initialize: " + e.getMessage());
            showMessage("خطا در بارگذاری: " + e.getMessage(), "error");
        }
    }

    private void setupCoursesTable() {
        selectCol.setCellValueFactory(cellData -> cellData.getValue().selectedProperty());
        selectCol.setCellFactory(CheckBoxTableCell.forTableColumn(selectCol));
        selectCol.setEditable(true);

        courseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        courseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        creditsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        scheduleCol.setCellValueFactory(new PropertyValueFactory<>("schedule"));

        coursesTableView.setEditable(true);
        coursesTableView.setItems(availableCourses);
    }

    private void setupEnrolledCoursesTable() {
        dropCol.setCellFactory(param -> new TableCell<CourseGroupRow, Void>() {
            private final Button dropButton = new Button("حذف");

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
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(dropButton);
                }
            }
        });

        enrolledCourseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        enrolledCourseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        enrolledCreditsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        enrolledScheduleCol.setCellValueFactory(new PropertyValueFactory<>("schedule"));

        enrolledCoursesTableView.setEditable(true);
        enrolledCoursesTableView.setItems(enrolledCourses);
    }

    @FXML
    private void searchCourses() {
        availableCourses.clear();
        enrolledCourses.clear();

        String selectedSemesterName = semesterComboBox.getValue();
        if (selectedSemesterName == null) {
            showMessage("لطفاً یک ترم را انتخاب کنید", "error");
            return;
        }

        Student student = LoginPanelController.studentPerson;
        if (student == null) {
            showMessage("دانشجو یافت نشد", "error");
            return;
        }

        Student realStudent = findStudentInUniversity(student);
        if (realStudent == null) {
            showMessage("دانشجو در سیستم یافت نشد", "error");
            return;
        }

        // بارگذاری درس‌های ثبت‌نام‌شده
        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        if (studentSemester != null) {
            for (CourseGroup group : studentSemester.getCourseGroups()) {
                enrolledCourses.add(new CourseGroupRow(group));
            }
        }

        // بارگذاری درس‌های موجود
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
                                                    if (studentSemester == null || !studentSemester.getCourseGroups().contains(group)) {
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
        }

        showMessage(availableCourses.size() + " درس یافت شد", "success");
        updateTotalCredits();
    }

    @FXML
    private void registerCourses() {
        String selectedSemesterName = semesterComboBox.getValue();

        if (selectedSemesterName == null) {
            showMessage("لطفاً یک ترم را انتخاب کنید", "error");
            return;
        }

        Student realStudent = findStudentInUniversity(LoginPanelController.studentPerson);
        if (realStudent == null) {
            showMessage("دانشجو در سیستم یافت نشد", "error");
            return;
        }

        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        if (studentSemester == null) {
            studentSemester = new Semester(selectedSemesterName);
            realStudent.getSemesters().add(studentSemester);
        }

        int selectedCount = 0;

        for (CourseGroupRow row : availableCourses) {
            if (row.isSelected()) {
                CourseGroup group = row.getCourseGroup();

                if (group.getRegisteredStudents().size() >= group.getCapacity()) {
                    showMessage("ظرفیت کلاس " + group.getCourse().getName() + " پر شده است.", "error");
                    return;
                }

                if (!studentSemester.getCourseGroups().contains(group)) {
                    studentSemester.getCourseGroups().add(group);
                    group.getRegisteredStudents().add(realStudent);
                    group.getGrades().put(realStudent.getId(), 0.0);
                    selectedCount++;
                }
            }
        }

        if (selectedCount == 0) {
            showMessage("هیچ درسی برای ثبت انتخاب نشده است", "error");
        } else {
            try {
                University.saveFaculties();
                enrolledCourses.clear();
                for (CourseGroup group : studentSemester.getCourseGroups()) {
                    enrolledCourses.add(new CourseGroupRow(group));
                }
                availableCourses.removeIf(CourseGroupRow::isSelected);
                showMessage(selectedCount + " درس با موفقیت ثبت شد", "success");
            } catch (Exception e) {
                showMessage("خطا در ثبت درس‌ها: " + e.getMessage(), "error");
            }
        }

        updateTotalCredits();
    }

    private void dropCourse(CourseGroupRow row) {
        String selectedSemesterName = semesterComboBox.getValue();
        if (selectedSemesterName == null) {
            showMessage("لطفاً یک ترم را انتخاب کنید", "error");
            return;
        }

        Student realStudent = findStudentInUniversity(LoginPanelController.studentPerson);
        if (realStudent == null) {
            showMessage("دانشجو در سیستم یافت نشد", "error");
            return;
        }

        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        if (studentSemester == null) {
            showMessage("ترم انتخاب‌شده برای دانشجو وجود ندارد", "error");
            return;
        }

        CourseGroup group = row.getCourseGroup();
        try {
            studentSemester.getCourseGroups().remove(group);
            group.getRegisteredStudents().remove(realStudent);
            group.getGrades().remove(realStudent.getId());
            University.saveFaculties();

            enrolledCourses.remove(row);
            if (group.getStatus() == Status.Active && group.getSemesterCode().equals(selectedSemesterName)) {
                availableCourses.add(new CourseGroupRow(group));
            }

            showMessage("درس " + group.getCourse().getName() + " با موفقیت حذف شد", "success");
        } catch (Exception e) {
            showMessage("خطا در حذف درس: " + e.getMessage(), "error");
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
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Student Portal");
        stage.setResizable(false);
        stage.show();
    }
}
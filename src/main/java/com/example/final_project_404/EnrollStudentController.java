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

        } catch (Exception e) {
            System.out.println("خطا در initialize: " + e.getMessage());
        }
    }

    private void setupCoursesTable() {
        selectCol.setCellValueFactory(cellData -> cellData.getValue().selectedProperty());
        selectCol.setCellFactory(CheckBoxTableCell.forTableColumn(selectCol));

        courseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        courseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        creditsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        scheduleCol.setCellValueFactory(new PropertyValueFactory<>("schedule"));
        coursesTableView.setEditable(true); // کل جدول قابل ویرایش باشه
        selectCol.setEditable(true);        // ستون CheckBox هم همین‌طور
        coursesTableView.setEditable(true); // کل جدول قابل ویرایش باشه
        selectCol.setEditable(true);        // ستون CheckBox هم همین‌طور


        coursesTableView.setItems(availableCourses);
    }

    @FXML
    private void searchCourses() {
        availableCourses.clear();

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

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(student.getFaculty())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(student.getDepartment())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(student.getMajor())) {
                                for (Degree degree : major.degrees) {
                                    if (degree.getClass().getSimpleName().equals(student.getDegree())) {
                                        for (Course course : degree.courses) {
                                            System.out.println(course.getName());
                                            for (CourseGroup group : course.courseGroups) {
                                                if (group.getStatus() == Status.Active) {
                                                    availableCourses.add(new CourseGroupRow(group));
                                                    System.out.println(group.getCourse().getName());
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

        // پیدا کردن دانشجو در ساختار اصلی
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

                // ظرفیت کلاس چک شود
                if (group.getRegisteredStudents().size() >= group.getCapacity()) {
                    showMessage("ظرفیت کلاس " + group.getCourse().getName() + " پر شده است.", "error");
                    return;
                }

                // اگر قبلاً انتخاب نشده
                if (!studentSemester.getCourseGroups().contains(group)) {
                    studentSemester.getCourseGroups().add(group);
                    group.getRegisteredStudents().add(realStudent); // اضافه کردن دانشجو به گروه
                    selectedCount++;
                }
            }
        }

        if (selectedCount == 0) {
            showMessage("هیچ درسی برای ثبت انتخاب نشده است", "error");
        } else {
            University.saveFaculties(); // حالا ذخیره روی ساختار اصلی انجام میشه
            showMessage(selectedCount + " درس با موفقیت ثبت شد", "success");
        }

        updateTotalCredits();
    }

    /**
     * پیدا کردن دانشجو داخل ساختار اصلی University
     */
    private Student findStudentInUniversity(Student loginStudent) {
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(loginStudent.getFaculty())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(loginStudent.getDepartment())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(loginStudent.getMajor())) {
                                for (Student s : major.students) {
                                    if (s.getId().equals(loginStudent.getId())) {
                                        return s; // همین دانشجو پیدا شد
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null; // پیدا نشد
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

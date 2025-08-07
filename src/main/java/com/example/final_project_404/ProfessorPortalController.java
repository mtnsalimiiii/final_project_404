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
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class ProfessorPortalController {

    @FXML private TableView<Student> studentsTable;
    @FXML private TableColumn<Student, String> studentIdCol;
    @FXML private TableColumn<Student, String> studentNameCol;
    @FXML private TableColumn<Student, Double> scoreCol;
    @FXML private TableColumn<Student, String> statusCol;
    @FXML private TableColumn<Student, Void> editCol;

    @FXML private ComboBox<String> semesterComboBox;
    @FXML private ComboBox<String> courseGroupComboBox;

    @FXML private Node mainMenuPane;
    @FXML private Node gradeSubmissionPane;

    private final ObservableList<Student> studentRows = FXCollections.observableArrayList();
    private CourseGroup currentGroup;

    @FXML
    public void initialize() {
        loadSemestersForProfessor();
        semesterComboBox.setOnAction(e -> loadCourseGroupsForSemester());

        studentIdCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getId()));
        studentNameCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getFirst_name() + " " + cellData.getValue().getLast_name()
        ));

        scoreCol.setCellValueFactory(data -> {
            if (currentGroup != null) {
                Double score = currentGroup.getGrades().get(data.getValue().getId());
                return new javafx.beans.property.SimpleDoubleProperty(score != null ? score : 0.0).asObject();
            }
            return new javafx.beans.property.SimpleDoubleProperty(0.0).asObject();
        });

        statusCol.setCellValueFactory(data -> {
            if (currentGroup == null) {
                System.out.println("currentGroup is null");
                return new ReadOnlyStringWrapper(CourseStatus.Fail.name());
            }
            Double score = currentGroup.getGrades().get(data.getValue().getId());
            if (score == null) {
                System.out.println("No score for student: " + data.getValue().getId());
                return new ReadOnlyStringWrapper(CourseStatus.Fail.name());
            }
            Degree degree = findDegreeForCourseGroup(currentGroup);
            if (degree == null) {
                System.out.println("No Degree found for CourseGroup: " + currentGroup.getCourse().getName());
                return new ReadOnlyStringWrapper(CourseStatus.Fail.name());
            }
            CourseStatus status = degree.getPassStatus(score);
            System.out.println("Student: " + data.getValue().getId() + ", Score: " + score + ", Status: " + status);
            return new ReadOnlyStringWrapper(status.name());
        });

        statusCol.setCellFactory(col -> new TableCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(item);
                    setStyle(item.equals("Pass") ? "-fx-text-fill: green;" : "-fx-text-fill: red;");
                    // برای متن فارسی:
                    // setStyle(item.equals("قبول") ? "-fx-text-fill: green;" : "-fx-text-fill: red;");
                }
            }
        });

        editCol.setCellFactory(col -> new TableCell<>() {
            private final Button editButton = new Button("ویرایش");

            {
                editButton.setOnAction(event -> {
                    Student student = getTableView().getItems().get(getIndex());
                    editGrade(student);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(editButton);
                }
            }
        });

        studentsTable.setItems(studentRows);
    }

    private Degree findDegreeForCourseGroup(CourseGroup group) {
        if (group == null || group.getCourse() == null || group.getCourse().getName() == null) {
            System.out.println("CourseGroup, Course, or Course name is null: group=" + group + ", course=" + (group != null ? group.getCourse() : null));
            return null;
        }
        String targetCourseName = group.getCourse().getName();
        System.out.println("Searching for Course by name: " + targetCourseName);
        System.out.println("Total Faculties: " + University.allFaculties.size());

        for (Faculty faculty : University.allFaculties) {
            System.out.println("Faculty: " + faculty.getFacultyName() + ", Departments: " + faculty.departments.size());
            for (Department dept : faculty.departments) {
                System.out.println("Department: " + dept.getName() + ", Majors: " + dept.majors.size());
                for (Major major : dept.majors) {
                    System.out.println("Major: " + major.getName() + ", Degrees: " + major.degrees.size());
                    for (Degree degree : major.degrees) {
                        System.out.println("Degree: " + degree.getClass().getSimpleName() + ", Courses: " + degree.courses.size());
                        for (Course course : degree.courses) {
                            System.out.println("Course in Degree: " + course.getName());
                            if (course.getName() != null && course.getName().equals(targetCourseName)) {
                                System.out.println("Found Degree: " + degree.getClass().getSimpleName() + " for Course: " + targetCourseName);
                                return degree;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No Degree found for CourseGroup with course name: " + targetCourseName);
        return null;
    }
    private void editGrade(Student student) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("ویرایش نمره");
        dialog.setHeaderText("وارد کردن نمره جدید برای " + student.getFirst_name() + " " + student.getLast_name());
        dialog.setContentText("نمره:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(grade -> {
            try {
                double newScore = Double.parseDouble(grade);
                if (newScore < 0 || newScore > 20) {
                    showAlert("نمره باید بین 0 تا 20 باشد.");
                    return;
                }
                if (currentGroup != null) {
                    currentGroup.getGrades().put(student.getId(), newScore);
                    // به‌روزرسانی وضعیت
                    studentsTable.refresh(); // این خط باعث می‌شود CellValueFactory دوباره اجرا شود
                }
            } catch (NumberFormatException e) {
                showAlert("لطفاً یک عدد معتبر وارد کنید.");
            }
        });
    }

    private void loadSemestersForProfessor() {
        semesterComboBox.getItems().clear();
        University.loadFaculties();

        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                if (group.getProfessor().equals(LoginPanelController.professorPerson.getFullName())) {
                                    String semCode = group.getSemasterCode();
                                    if (!semesterComboBox.getItems().contains(semCode)) {
                                        semesterComboBox.getItems().add(semCode);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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
                                    if (!courseGroupComboBox.getItems().contains(group.getCourse().getName())) {
                                        courseGroupComboBox.getItems().add(group.getCourse().getName());
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
            showAlert("لطفاً ترم و درس را انتخاب کنید.");
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
                                    studentRows.addAll(group.getRegisteredStudents());
                                }
                            }
                        }
                    }
                }
            }
        }

        if (currentGroup == null) {
            showAlert("گروه درسی یافت نشد.");
        }
    }

    @FXML
    void saveGrades(ActionEvent event) {
        if (currentGroup == null) {
            showAlert("لطفاً ابتدا یک درس را بارگذاری کنید.");
            return;
        }

        University.saveFaculties();
        showAlert("نمرات با موفقیت ذخیره شدند!");
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.showAndWait();
    }

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
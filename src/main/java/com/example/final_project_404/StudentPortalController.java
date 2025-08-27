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
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

public class StudentPortalController {

    @FXML private VBox containerBarVBox;
    @FXML private HBox headerHBox;
    @FXML private GridPane mainMenuPane;
    @FXML private AnchorPane reportCardPane;
    @FXML private ComboBox<String> semesterComboBox;
    @FXML private TableView<ReportCardEntry> reportCardTable;
    @FXML private TableColumn<ReportCardEntry, String> courseNameCol;
    @FXML private TableColumn<ReportCardEntry, Double> scoreCol;
    @FXML private TableColumn<ReportCardEntry, String> statusCol;
    @FXML private Label messageLabel;
    @FXML private Label studentNameLabel;
    @FXML private Label semesterLabel;
    @FXML private Label gpaLabel;
    @FXML private Label probationStatusLabel;
    @FXML private Label passedUnitsLabel;
    @FXML private Label failedUnitsLabel;
    // Overall Report Card Components
    @FXML private AnchorPane overallReportCardPane;
    @FXML private TableView<OverallReportCardEntry> overallReportTable;
    @FXML private TableColumn<OverallReportCardEntry, String> overallSemesterCol;
    @FXML private TableColumn<OverallReportCardEntry, String> overallCourseCol;
    @FXML private TableColumn<OverallReportCardEntry, Double> overallScoreCol;
    @FXML private TableColumn<OverallReportCardEntry, String> overallStatusCol;
    @FXML private Label overallStudentNameLabel;
    @FXML private Label overallGpaLabel;
    @FXML private Label overallProbationCountLabel;
    @FXML private Label overallTotalTermsLabel;
    @FXML private Label overallPassedUnitsLabel;
    @FXML private Label overallFailedUnitsLabel;
    @FXML private Label overallMessageLabel;

    private final ObservableList<ReportCardEntry> reportCardRows = FXCollections.observableArrayList();
    private final ObservableList<OverallReportCardEntry> overallReportRows = FXCollections.observableArrayList();
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    @FXML
    public void initialize() {
        if (semesterComboBox != null && reportCardTable != null) {
            loadSemestersForStudent();
            setupReportCardTable();
        } else {
            System.out.println("Initialization error: semesterComboBox or reportCardTable is null");
        }
        if (overallReportTable != null) {
            setupOverallReportTable();
        } else {
            System.out.println("Initialization error: overallReportTable is null");
        }
    }

    private void loadSemestersForStudent() {
        semesterComboBox.getItems().clear();
        University.loadFaculties();

        if (LoginPanelController.studentPerson == null) {
            System.out.println("StudentPerson is null");
            messageLabel.setText("Error: Student information not found.");
            return;
        }

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(LoginPanelController.studentPerson.getFaculty())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(LoginPanelController.studentPerson.getDepartment())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(LoginPanelController.studentPerson.getMajor())) {
                                for (Student student : major.students) {
                                    if (student.getId().equals(LoginPanelController.studentPerson.getId())) {
                                        for (Semester semester : student.getSemesters()) {
                                            String semesterName = semester.getName();
                                            if (!semesterComboBox.getItems().contains(semesterName)) {
                                                semesterComboBox.getItems().add(semesterName);
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

        if (semesterComboBox.getItems().isEmpty()) {
            messageLabel.setText("No semesters found for this student.");
        } else {
            System.out.println("Semesters loaded: " + semesterComboBox.getItems());
        }
    }

    private void setupReportCardTable() {
        courseNameCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getCourseName()));
        scoreCol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleDoubleProperty(cellData.getValue().getScore()).asObject());
        statusCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getStatus()));
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
                }
            }
        });
        reportCardTable.setItems(reportCardRows);
    }

    private void setupOverallReportTable() {
        overallSemesterCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getSemester()));
        overallCourseCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getCourseName()));
        overallScoreCol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleDoubleProperty(cellData.getValue().getScore()).asObject());
        overallStatusCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getStatus()));
        overallStatusCol.setCellFactory(col -> new TableCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(item);
                    setStyle(item.equals("Pass") ? "-fx-text-fill: green;" : "-fx-text-fill: red;");
                }
            }
        });
        overallReportTable.setItems(overallReportRows);
    }

    @FXML
    void showReportCardPane(ActionEvent event) {
        mainMenuPane.setVisible(false);
        mainMenuPane.setManaged(false);
        reportCardPane.setVisible(true);
        reportCardPane.setManaged(true);
        overallReportCardPane.setVisible(false);
        overallReportCardPane.setManaged(false);
        loadSemestersForStudent();
        clearStudentInfoLabels();
        messageLabel.setText("");
    }

    @FXML
    void showOverallReportCardPane(ActionEvent event) {
        mainMenuPane.setVisible(false);
        mainMenuPane.setManaged(false);
        reportCardPane.setVisible(false);
        reportCardPane.setManaged(false);
        overallReportCardPane.setVisible(true);
        overallReportCardPane.setManaged(true);
        loadOverallReportCard();
        //clearOverallStudentInfoLabels();
        overallMessageLabel.setText("");
    }

    @FXML
    void showMainMenuPane(ActionEvent event) {
        reportCardPane.setVisible(false);
        reportCardPane.setManaged(false);
        overallReportCardPane.setVisible(false);
        overallReportCardPane.setManaged(false);
        mainMenuPane.setVisible(true);
        mainMenuPane.setManaged(true);
        clearStudentInfoLabels();
        //clearOverallStudentInfoLabels();
        messageLabel.setText("");
        overallMessageLabel.setText("");
    }

    @FXML
    void loadReportCard(ActionEvent event) {
        reportCardRows.clear();
        clearStudentInfoLabels();
        String selectedSemester = semesterComboBox.getValue();

        if (selectedSemester == null) {
            messageLabel.setText("Please select a semester.");
            return;
        }

        University.loadFaculties();
        boolean foundData = false;
        double totalScore = 0.0;
        int totalUnits = 0;
        int passedUnits = 0;
        int failedUnits = 0;

        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                if (group.getSemesterCode().equals(selectedSemester) &&
                                        group.getRegisteredStudents().contains(LoginPanelController.studentPerson)) {
                                    Double score = group.getGrades().get(LoginPanelController.studentPerson.getId());
                                    if (score != null) {
                                        Degree degreeForStatus = findDegreeForCourseGroup(group);
                                        CourseStatus status = (degreeForStatus != null) ? degreeForStatus.getPassStatus(score) : CourseStatus.Fail;
                                        reportCardRows.add(new ReportCardEntry(course.getName(), score, status.name()));
                                        foundData = true;

                                        int units = course.getCredit();
                                        totalScore += score * units;
                                        totalUnits += units;
                                        if (status == CourseStatus.Pass) {
                                            passedUnits += units;
                                        } else {
                                            failedUnits += units;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!foundData) {
            messageLabel.setText("No data found for this semester.");
        } else {
            double gpa = (totalUnits > 0) ? totalScore / totalUnits : 0.0;
            studentNameLabel.setText(LoginPanelController.studentPerson.getFullName());
            semesterLabel.setText(selectedSemester);
            gpaLabel.setText(DECIMAL_FORMAT.format(gpa));
            probationStatusLabel.setText(gpa < 12.0 ? "On Probation" : "Normal");
            passedUnitsLabel.setText(String.valueOf(passedUnits));
            failedUnitsLabel.setText(String.valueOf(failedUnits));
            messageLabel.setText("");
            System.out.println("Student info set: Name=" + LoginPanelController.studentPerson.getFullName() +
                    ", Semester=" + selectedSemester + ", GPA=" + gpa +
                    ", Probation=" + (gpa < 12.0 ? "On Probation" : "Normal") +
                    ", Passed Units=" + passedUnits + ", Failed Units=" + failedUnits);
        }
    }

    @FXML
    void loadOverallReportCard() {
        overallReportRows.clear();
        //clearOverallStudentInfoLabels();
        University.loadFaculties();

        if (LoginPanelController.studentPerson == null) {
            overallMessageLabel.setText("Error: Student information not found.");
            System.out.println("StudentPerson is null in loadOverallReportCard");
            return;
        }

        boolean foundData = false;
        double totalScore = 0.0;
        int totalUnits = 0;
        int passedUnits = 0;
        int failedUnits = 0;
        Set<String> semesters = new HashSet<>();
        int probationCount = 0;

        // Calculate GPA per semester to count probation terms
        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup group : course.courseGroups) {
                                if (group.getRegisteredStudents().contains(LoginPanelController.studentPerson)) {
                                    Double score = group.getGrades().get(LoginPanelController.studentPerson.getId());
                                    if (score != null) {
                                        String semester = group.getSemesterCode();
                                        semesters.add(semester);
                                        Degree degreeForStatus = findDegreeForCourseGroup(group);
                                        CourseStatus status = (degreeForStatus != null) ? degreeForStatus.getPassStatus(score) : CourseStatus.Fail;
                                        overallReportRows.add(new OverallReportCardEntry(semester, course.getName(), score, status.name()));
                                        foundData = true;

                                        int units = course.getCredit();
                                        totalScore += score * units;
                                        totalUnits += units;
                                        if (status == CourseStatus.Pass) {
                                            passedUnits += units;
                                        } else {
                                            failedUnits += units;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Calculate probation terms
        for (String semester : semesters) {
            double semesterScore = 0.0;
            int semesterUnits = 0;
            for (Faculty faculty : University.allFaculties) {
                for (Department dept : faculty.departments) {
                    for (Major major : dept.majors) {
                        for (Degree degree : major.degrees) {
                            for (Course course : degree.courses) {
                                for (CourseGroup group : course.courseGroups) {
                                    if (group.getSemesterCode().equals(semester) &&
                                            group.getRegisteredStudents().contains(LoginPanelController.studentPerson)) {
                                        Double score = group.getGrades().get(LoginPanelController.studentPerson.getId());
                                        if (score != null) {
                                            int units = course.getCredit();
                                            semesterScore += score * units;
                                            semesterUnits += units;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (semesterUnits > 0) {
                double semesterGpa = semesterScore / semesterUnits;
                if (semesterGpa < 12.0) {
                    probationCount++;
                }
            }
        }

        if (!foundData) {
            overallMessageLabel.setText("No data found for this student.");
        } else {
            double gpa = (totalUnits > 0) ? totalScore / totalUnits : 0.0;
            overallStudentNameLabel.setText("Student name:"+LoginPanelController.studentPerson.getFullName());
            overallGpaLabel.setText("GPA:"+DECIMAL_FORMAT.format(gpa));
            overallProbationCountLabel.setText("Probation Terms:"+String.valueOf(probationCount));
            overallTotalTermsLabel.setText("Total Terms:"+String.valueOf(semesters.size()));
            overallPassedUnitsLabel.setText("Passed Units:"+String.valueOf(passedUnits));
            overallFailedUnitsLabel.setText("Failed Units:"+String.valueOf(failedUnits));
            overallMessageLabel.setText("");
            System.out.println("Overall info set: Name=" + LoginPanelController.studentPerson.getFullName() +
                    ", GPA=" + gpa + ", Probation Terms=" + probationCount +
                    ", Total Terms=" + semesters.size() +
                    ", Passed Units=" + passedUnits + ", Failed Units=" + failedUnits);
        }
    }

    private void clearStudentInfoLabels() {
        studentNameLabel.setText("");
        semesterLabel.setText("");
        gpaLabel.setText("");
        probationStatusLabel.setText("");
        passedUnitsLabel.setText("");
        failedUnitsLabel.setText("");
    }

    /*private void clearOverallStudentInfoLabels() {
        overallStudentNameLabel.setText("");
        overallGpaLabel.setText("");
        overallProbationCountLabel.setText("");
        overallTotalTermsLabel.setText("");
        overallPassedUnitsLabel.setText("");
        overallFailedUnitsLabel.setText("");
    }*/

    private Degree findDegreeForCourseGroup(CourseGroup group) {
        if (group == null || group.getCourse() == null || group.getCourse().getName() == null) {
            System.out.println("CourseGroup, Course, or Course name is null");
            return null;
        }
        String targetCourseName = group.getCourse().getName();
        System.out.println("Searching for Degree with course name: " + targetCourseName);
        for (Faculty faculty : University.allFaculties) {
            for (Department dept : faculty.departments) {
                for (Major major : dept.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            if (course.getName() != null && course.getName().equals(targetCourseName)) {
                                System.out.println("Found Degree: " + degree.getClass().getSimpleName());
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

    @FXML
    void profileStudentPortal(ActionEvent event) throws IOException {
        loadPage("ProfileStudentPortal.fxml", event, "Profile");
    }

    @FXML
    void reportsStudentPortal(ActionEvent event) throws IOException {
        loadPage("ReportsStudentPortal.fxml", event, "Reports");
    }

    @FXML
    void EnrollmentStudentPortal(ActionEvent event) throws IOException {
        File file = new File("Enrollment.txt");

        if (file.exists()) {
            String content = java.nio.file.Files.readString(file.toPath()).trim();
            if ("Deactive".equalsIgnoreCase(content)) {
                System.out.println("Enrollment is disabled.");
                showAlert("Enrollment is disabled.");
                return;
            }
        }
        loadPage("EnrollStudent.fxml", event, "Enrollment Panel");
    }

    @FXML
    void signOutStudentPortal(ActionEvent event) throws IOException {
        loadPage("LoginPanel.fxml", event, "Login Panel");
    }

    private void loadPage(String fxml, ActionEvent event, String title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }



    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public static class ReportCardEntry {
        private final String courseName;
        private final double score;
        private final String status;

        public ReportCardEntry(String courseName, double score, String status) {
            this.courseName = courseName;
            this.score = score;
            this.status = status;
        }

        public String getCourseName() {
            return courseName;
        }

        public double getScore() {
            return score;
        }

        public String getStatus() {
            return status;
        }
    }

    public static class OverallReportCardEntry {
        private final String semester;
        private final String courseName;
        private final double score;
        private final String status;

        public OverallReportCardEntry(String semester, String courseName, double score, String status) {
            this.semester = semester;
            this.courseName = courseName;
            this.score = score;
            this.status = status;
        }

        public String getSemester() {
            return semester;
        }

        public String getCourseName() {
            return courseName;
        }

        public double getScore() {
            return score;
        }

        public String getStatus() {
            return status;
        }
    }

}

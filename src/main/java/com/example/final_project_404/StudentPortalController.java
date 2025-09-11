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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.print.attribute.standard.NumberUp;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.IllegalFormatCodePointException;
import java.util.Set;

public class StudentPortalController {
    @FXML private Label headerTitle;

    @FXML private AnchorPane dashboardAnchorPane;
    // Report Card
    @FXML private AnchorPane reportCardAnchorPane;
    @FXML private Label studentNameReportCard;
    @FXML private Label semesterReportCard;
    @FXML private Label gpaReportCard;
    @FXML private Label probationStatusReportCard;
    @FXML private Label passedUnitsReportCard;
    @FXML private Label failedUnitsReportCard;
    @FXML private ComboBox<String> semesterChooserReportCard;
    @FXML private ComboBox<String> gradeShowReportCard;
    @FXML private TableView<ReportCardEntry> gradeTableReportCard;
    @FXML private TableColumn<ReportCardEntry, String> courseNameColReportCard;
    @FXML private TableColumn<ReportCardEntry, Double> scoreColReportCard;
    @FXML private TableColumn<ReportCardEntry, String> statusColReportCard;
    @FXML private BarChart<String, Number> gradeChartReportCard;
    @FXML private NumberAxis gradeAxisReportCard;
    @FXML private CategoryAxis lessonsAxisReportCard;
    @FXML private Label messageLabelReportCard;
    // Overall Report Card Components
    @FXML private AnchorPane overallReportCardAnchorPane;
    @FXML private ComboBox<String> gradeShowOverallReportCard;
    @FXML private TableView<OverallReportCardEntry> gradesTableOverallReportCard;
    @FXML private TableColumn<OverallReportCardEntry, String> semesterColOverallReportCard;
    @FXML private TableColumn<OverallReportCardEntry, String> courseColOverallReportCard;
    @FXML private TableColumn<OverallReportCardEntry, Double> scoreColOverallReportCard;
    @FXML private TableColumn<OverallReportCardEntry, String> statusColOverallReportCard;
    @FXML private BarChart<String, Number> gradeChartOverallReportCard;
    @FXML private NumberAxis gradeAxisOverallReportCard;
    @FXML private CategoryAxis termsAxisOverallReportCard;
    @FXML private Label studentNameOverallReportCard;
    @FXML private Label gpaOverallReportCard;
    @FXML private Label probationTermsOverallReportCard;
    @FXML private Label totalTermsOverallReportCard;
    @FXML private Label passedUnitsOverallReportCard;
    @FXML private Label failedUnitsOverallReportCard;
    @FXML private Label messageLabelOverallReportCard;
    // Emergency Drop
    @FXML private AnchorPane emergencyDropPane;
    @FXML private ComboBox<String> emergencyDropSemesterComboBox;
    @FXML private TableView<CourseGroupRow> emergencyDropTable;
    @FXML private TableColumn<CourseGroupRow, String> emergencyDropCourseNameCol;
    @FXML private TableColumn<CourseGroupRow, String> emergencyDropCourseCodeCol;
    @FXML private TableColumn<CourseGroupRow, String> emergencyDropProfessorNameCol;
    @FXML private TableColumn<CourseGroupRow, Integer> emergencyDropUnitsCol;
    @FXML private TableColumn<CourseGroupRow, Void> emergencyDropActionCol;
    @FXML private Label emergencyDropMessageLabel;


    private final ObservableList<ReportCardEntry> reportCardRows = FXCollections.observableArrayList();

    private final ObservableList<OverallReportCardEntry> overallReportRows = FXCollections.observableArrayList();
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    @FXML
    void enrollmentDashboard(ActionEvent event) throws IOException {
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
    void emergencyDropDashboard(ActionEvent event) {
        headerTitle.setText(" --> Emergency Drop");
        dashboardAnchorPane.setVisible(false);
        emergencyDropPane.setVisible(true);

        emergencyDropSemesterComboBox.getItems().clear();
        University.loadAllSemester();
        if (LoginPanelController.studentPerson == null) {
            emergencyDropMessageLabel.setText("Error: Student information not found.");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }
        for (Semester semester : University.allSemesters) {
            if (semester.getStatus() == Status.Active) {
                emergencyDropSemesterComboBox.getItems().add(semester.getName());
            }
        }
        if (emergencyDropSemesterComboBox.getItems().isEmpty()) {
            emergencyDropMessageLabel.setText("No active semesters found.");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
        } else {
            System.out.println("Active semesters for emergency drop: " + emergencyDropSemesterComboBox.getItems());
        }

        emergencyDropCourseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        emergencyDropCourseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        emergencyDropProfessorNameCol.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getCourseGroup().getProfessor() != null
                        ? cellData.getValue().getCourseGroup().getProfessor()
                        : "Unknown"));
        emergencyDropUnitsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        emergencyDropActionCol.setCellFactory(param -> new TableCell<CourseGroupRow, Void>() {
            private final Button dropButton = new Button("Drop");

            {
                dropButton.setStyle("-fx-background-color: #ff4444; -fx-text-fill: white;");
                dropButton.setOnAction(e -> {
                    CourseGroupRow row = getTableView().getItems().get(getIndex());
                    dropEmergencyCourse(row);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : dropButton);
            }
        });

        emergencyDropMessageLabel.setText(null);
    }

    @FXML
    void loadCoursesForSemester() {
        emergencyDropTable.getItems().clear();
        String selectedSemesterName = emergencyDropSemesterComboBox.getValue();

        if (selectedSemesterName == null) {
            emergencyDropMessageLabel.setText("Please select a semester");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        Student realStudent = findStudentInUniversity(LoginPanelController.studentPerson);
        if (realStudent == null) {
            emergencyDropMessageLabel.setText("Student not found in the system");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        if (studentSemester == null) {
            emergencyDropMessageLabel.setText("Selected semester not found for student");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        if (studentSemester.getCourseGroups() == null || studentSemester.getCourseGroups().isEmpty()) {
            emergencyDropMessageLabel.setText("No courses found for this semester");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        boolean foundData = false;
        for (CourseGroup group : studentSemester.getCourseGroups()) {
            if (group.getStatus() == Status.Active) {
                emergencyDropTable.getItems().add(new CourseGroupRow(group));
                foundData = true;
            }
        }

        if (!foundData) {
            emergencyDropMessageLabel.setText("No active courses found for this semester");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
        } else {
            emergencyDropMessageLabel.setText(emergencyDropTable.getItems().size() + " courses found");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: green;");
        }
    }

    @FXML
    void onBackEmergencyDrop(ActionEvent event) {
        headerTitle.setText(null);
        reportCardAnchorPane.setVisible(false);
        overallReportCardAnchorPane.setVisible(false);
        emergencyDropPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);
        clearStudentInfoLabels();
        //clearOverallStudentInfoLabels();
        messageLabelReportCard.setText(null);
        messageLabelOverallReportCard.setText(null);
        emergencyDropMessageLabel.setText(null);
    }

    @FXML
    void reportCardDashboard(ActionEvent event) {
        gradesTableOverallReportCard.getItems().clear();
        dashboardAnchorPane.setVisible(false);
        reportCardAnchorPane.setVisible(true);
        loadSemestersForStudent();
        clearStudentInfoLabels();
        messageLabelReportCard.setText(null);
        gradeTableReportCard.setItems(null);

        gradeShowReportCard.getItems().clear();
        gradeShowReportCard.getItems().addAll("Table View", "Bar Chart");
        gradeShowReportCard.getSelectionModel().select("Table View");



        if (semesterChooserReportCard != null && gradeTableReportCard != null) {
            loadSemestersForStudent();
            setupReportCardTable();
        } else {
            System.out.println("Initialization error: semesterChooserReportCard or gradeTableReportCard is null");
        }

    }

    private void setupReportCardTable() {
        courseNameColReportCard.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getCourseName()));
        scoreColReportCard.setCellValueFactory(cellData -> new javafx.beans.property.SimpleDoubleProperty(cellData.getValue().getScore()).asObject());
        statusColReportCard.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getStatus()));
        statusColReportCard.setCellFactory(col -> new TableCell<>() {
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
        gradeTableReportCard.setItems(reportCardRows);
    }

    @FXML
    void loadReportCard() {
        Student student = LoginPanelController.studentPerson;
        // Table View
        reportCardRows.clear();
        clearStudentInfoLabels();
        String selectedSemester = semesterChooserReportCard.getValue();

        if (selectedSemester == null) {
            messageLabelReportCard.setText("Please select a semester.");
            return;
        }

        University.loadFaculties();
        boolean foundData = false;
        double totalScore = 0.0;
        int totalUnits = 0;
        int passedUnits = 0;
        int failedUnits = 0;

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(student.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department dept : faculty.departments) {
                    if (dept.getName().equals(student.getDepartment()) && dept.getStatus().equals(Status.Active)) {
                        for (Major major : dept.majors) {
                            if (major.getName().equals(student.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getSemesterCode().equals(selectedSemester) &&
                                                    group.getRegisteredStudents().contains(student)) {
                                                Double score = group.getGrades().get(student.getId());
                                                if (score != null) {
                                                    Degree degreeForStatus = findDegreeForCourseGroup(group);
                                                    CourseStatus status = (degreeForStatus != null) ? degreeForStatus.getPassStatus(score) : CourseStatus.Fail;
                                                    reportCardRows.add(new ReportCardEntry(course.getName()+":"+group.getId(), score, status.name()));
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
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }

        if (!foundData) {
            messageLabelReportCard.setText("No data found for this semester.");
        } else {
            double gpa = (totalUnits > 0) ? totalScore / totalUnits : 0.0;
            studentNameReportCard.setText(LoginPanelController.studentPerson.getFullName());
            semesterReportCard.setText(selectedSemester);
            gpaReportCard.setText(DECIMAL_FORMAT.format(gpa));
            probationStatusReportCard.setText(gpa < 12.0 ? "On Probation" : "Normal");
            passedUnitsReportCard.setText(String.valueOf(passedUnits));
            failedUnitsReportCard.setText(String.valueOf(failedUnits));
            messageLabelReportCard.setText(null);
        }

        // Bar Chart
        gradeChartReportCard.getData().clear();
        XYChart.Series<String, Number> grades = new XYChart.Series<>();
//        grades.setName("Semester Grades");

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(student.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department dept : faculty.departments) {
                    if (dept.getName().equals(student.getDepartment()) && dept.getStatus().equals(Status.Active)) {
                        for (Major major : dept.majors) {
                            if (major.getName().equals(student.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getSemesterCode().equals(selectedSemester) &&
                                                    group.getRegisteredStudents().contains(student)) {
                                                Double score = group.getGrades().get(student.getId());
                                                if (score != null) {
                                                    grades.getData().add(new XYChart.Data<>(course.getName()+":"+group.getId(), score));
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        gradeChartReportCard.getData().add(grades);

    }

    private void loadSemestersForStudent() {
        semesterChooserReportCard.getItems().clear();
        University.loadFaculties();

        if (LoginPanelController.studentPerson == null) {
            System.out.println("StudentPerson is null");
            messageLabelReportCard.setText("Error: Student information not found.");
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
                                            if (!semesterChooserReportCard.getItems().contains(semesterName)) {
                                                semesterChooserReportCard.getItems().add(semesterName);
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

        if (semesterChooserReportCard.getItems().isEmpty()) {
            messageLabelReportCard.setText("No semesters found for this student.");
        } else {
            System.out.println("Semesters loaded: " + semesterChooserReportCard.getItems());
        }
    }

    @FXML
    void gradeShowReportCard(ActionEvent event) {
        if (gradeShowReportCard.getValue().equals("Table View")) {
            gradeTableReportCard.setVisible(true);
            gradeChartReportCard.setVisible(false);
        } else if (gradeShowReportCard.getValue().equals("Bar Chart")) {
            gradeTableReportCard.setVisible(false);
            gradeChartReportCard.setVisible(true);

        }
    }

    @FXML
    void onBackReportCard(ActionEvent event) {
        reportCardAnchorPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);
    }

    @FXML
    void overallReportCardDashboard(ActionEvent event) {
        dashboardAnchorPane.setVisible(false);
        overallReportCardAnchorPane.setVisible(true);
        loadOverallReportCard();
        //clearOverallStudentInfoLabels();
        messageLabelOverallReportCard.setText(null);


        if (gradesTableOverallReportCard != null) {
            setupOverallReportTable();
        } else {
            System.out.println("Initialization error: gradesTableOverallReportCard is null");
        }

    }

    private void setupOverallReportTable() {
        semesterColOverallReportCard.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getSemester()));
        courseColOverallReportCard.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getCourseName()));
        scoreColOverallReportCard.setCellValueFactory(cellData -> new javafx.beans.property.SimpleDoubleProperty(cellData.getValue().getScore()).asObject());
        statusColOverallReportCard.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getStatus()));
        statusColOverallReportCard.setCellFactory(col -> new TableCell<>() {
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
        gradesTableOverallReportCard.setItems(overallReportRows);
    }

    @FXML
    void loadOverallReportCard() {
        overallReportRows.clear();
        //clearOverallStudentInfoLabels();
        University.loadFaculties();

        if (LoginPanelController.studentPerson == null) {
            messageLabelOverallReportCard.setText("Error: Student information not found.");
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
            messageLabelOverallReportCard.setText("No data found for this student.");
        } else {
            double gpa = (totalUnits > 0) ? totalScore / totalUnits : 0.0;
            studentNameOverallReportCard.setText(LoginPanelController.studentPerson.getFullName());
            gpaOverallReportCard.setText(DECIMAL_FORMAT.format(gpa));
            probationTermsOverallReportCard.setText(String.valueOf(probationCount));
            totalTermsOverallReportCard.setText(String.valueOf(semesters.size()));
            passedUnitsOverallReportCard.setText(String.valueOf(passedUnits));
            failedUnitsOverallReportCard.setText(String.valueOf(failedUnits));
            messageLabelOverallReportCard.setText(null);
        }


        // Bar Chart
    }

    @FXML
    void gradeShowOverallReportCard(ActionEvent event) {
        if (gradeShowOverallReportCard.getValue() != null) {
            if (gradeShowOverallReportCard.getValue().equals("Table View")) {
                gradesTableOverallReportCard.setVisible(true);
                gradeChartOverallReportCard.setVisible(false);
            } else if (gradeShowOverallReportCard.getValue().equals("Bar Chart")) {
                gradeChartOverallReportCard.setVisible(true);
                gradesTableOverallReportCard.setVisible(false);
            }
        }
    }

    @FXML
    void onBackOverallReportCard(ActionEvent event) {
        overallReportCardAnchorPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);
    }

    @FXML
    void profileDashboard(ActionEvent event) {
        dashboardAnchorPane.setVisible(false);
//        profileAnchorPane.setVisible(true);

    }

    @FXML
    void reportsDashboard(ActionEvent event) {
        dashboardAnchorPane.setVisible(false);
//        reportsAnchorPane.setVisible(true);
    }

    @FXML
    void signOutDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void clearStudentInfoLabels() {
        studentNameReportCard.setText(null);
        semesterReportCard.setText(null);
        gpaReportCard.setText(null);
        probationStatusReportCard.setText(null);
        passedUnitsReportCard.setText(null);
        failedUnitsReportCard.setText(null);
    }

    private void clearOverallStudentInfoLabels() {
        studentNameOverallReportCard.setText(null);
        gpaOverallReportCard.setText(null);
        probationTermsOverallReportCard.setText(null);
        totalTermsOverallReportCard.setText(null);
        passedUnitsOverallReportCard.setText(null);
        failedUnitsOverallReportCard.setText(null);
    }

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
    void loadPage(String fxml, ActionEvent event, String title) throws IOException {
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

    private void dropEmergencyCourse(CourseGroupRow row) {
        String selectedSemesterName = emergencyDropSemesterComboBox.getValue();
        if (selectedSemesterName == null) {
            emergencyDropMessageLabel.setText("Please select a semester");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        Student realStudent = findStudentInUniversity(LoginPanelController.studentPerson);
        if (realStudent == null) {
            emergencyDropMessageLabel.setText("Student not found in the system");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        Semester studentSemester = realStudent.getSemesterByName(selectedSemesterName);
        if (studentSemester == null) {
            emergencyDropMessageLabel.setText("Selected semester not found for student");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        CourseGroup group = row.getCourseGroup();
        try {
            studentSemester.getCourseGroups().remove(group);
            group.getRegisteredStudents().remove(realStudent);
            group.getGrades().remove(realStudent.getId());
            University.saveFaculties();

            emergencyDropTable.getItems().remove(row);
            emergencyDropMessageLabel.setText("Course " + group.getCourse().getName() + " dropped successfully");
            emergencyDropMessageLabel.setStyle("-fx-text-fill: green;");
        } catch (Exception e) {
            emergencyDropMessageLabel.setText("Error dropping course: " + e.getMessage());
            emergencyDropMessageLabel.setStyle("-fx-text-fill: red;");
        }
    }
    private Student findStudentInUniversity(Student loginStudent) {
        University.loadFaculties();
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

}

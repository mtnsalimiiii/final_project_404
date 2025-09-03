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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class ProfessorPortalController {

    @FXML private ScrollPane buttonsScrollPane;
    @FXML private ComboBox<String> courseGroupComboBoxGradeSubmission;
    @FXML private ComboBox<String> courseGroupComboBoxRemoveStudent;
    @FXML private ComboBox<String> courseGroupComboBoxStudentList;
    @FXML private TableColumn<CourseGroup, String> courseNameColCoursesList;
    @FXML private TableView<CourseGroup> coursesTableCoursesList;
    @FXML private Button coursesListScrollPane;
    @FXML private AnchorPane coursesListAnchorPane;
    @FXML private AnchorPane dashboardAnchorPane;
    @FXML private Label dashboardTitle;
    @FXML private DatePicker dateOfBirthProfile;
    @FXML private TableColumn<CourseGroup, String> groupIdColCoursesList;
    @FXML private AnchorPane gradeSubmissionAnchorPane;
    @FXML private Button gradeSubmissionScrollPane;
    @FXML private HBox headerHBox;
    @FXML private Label headerTitle;
    @FXML private TextField lastNameProfile;
    @FXML private Label messageLabelCoursesList;
    @FXML private Label messageLabelRemoveStudent;
    @FXML private Label messageLabelStudentList;
    @FXML private TextField nationalIdProfile;
    @FXML private TextField phoneNumberProfile;
    @FXML private AnchorPane profileAnchorPane;
    @FXML private Button profileScrollPane;
    @FXML private AnchorPane removeStudentAnchorPane;
    @FXML private Button removeStudentScrollPane;
    @FXML private TableColumn<CourseGroup, String> rowNumberColCoursesList;
    @FXML private AnchorPane studentsGradeChartAnchorPane;
    @FXML private Button studentsGradeChartScrollPane;
    @FXML private ComboBox<String> semesterComboBoxCoursesList;
    @FXML private ComboBox<String> semesterComboBoxGradeSubmission;
    @FXML private ComboBox<String> semesterComboBoxRemoveStudent;
    @FXML private ComboBox<String> semesterComboBoxStudentList;
    @FXML private ComboBox<String> semesterChooserGradeChart;
    @FXML private ComboBox<String> courseGroupChooserGradeChart;

    @FXML private TableColumn<CourseGroup, String> semesterColCoursesList;
    @FXML private TableColumn<Student, Void> dropColRemoveStudent;
    @FXML private TableColumn<Student, Void> editColGradeSubmission;
    @FXML private TableColumn<CourseGroup, String> studentCountColCoursesList;
    @FXML private TableColumn<Student, String> studentIdColGradeSubmission;
    @FXML private TableColumn<Student, String> studentIdColRemoveStudent;
    @FXML private TableColumn<Student, String> studentIdColStudentList;
    @FXML private TableColumn<Student, String> studentNameColGradeSubmission;
    @FXML private TableColumn<Student, String> studentNameColRemoveStudent;
    @FXML private TableColumn<Student, String> studentNameColStudentList;
    @FXML private TableView<Student> studentsTableGradeSubmission;
    @FXML private TableView<Student> studentsTableRemoveStudent;
    @FXML private TableView<Student> studentsTableStudentList;
    @FXML private TableColumn<Student, String> scoreColGradeSubmission;
    @FXML private TableColumn<Student, String> statusColGradeSubmission;
    @FXML private TableColumn<Student, String> nationalIdColStudentList;
    @FXML private TableColumn<Student, String> rowNumberColStudentList;
    @FXML private Label errorLabelDateOfBirthProfile;
    @FXML private Label errorLabelFirstNameProfile;
    @FXML private Label errorLabelGenderProfile;
    @FXML private Label errorLabelGradeSubmission;
    @FXML private Label errorLabelLastNameProfile;
    @FXML private Label errorLabelNationalIdProfile;
    @FXML private Label errorLabelPhoneNumberProfile;
    @FXML private Label errorLabelProfile;
    @FXML private TextField firstNameProfile;
    @FXML private ComboBox<Gender> genderProfile;
    @FXML private Label successLabelProfile;
    @FXML private AnchorPane studentListAnchorPane;
    @FXML private Button studentListScrollPane;
    @FXML private Label studentCountLabelStudentList;
    @FXML private BarChart<String, Number> studentsGradeChart;

    private ObservableList<Student> studentListGradeSubmission = FXCollections.observableArrayList();
    private ObservableList<Student> studentListRemoveStudent = FXCollections.observableArrayList();
    private ObservableList<Student> studentListStudentList = FXCollections.observableArrayList();
    private ObservableList<CourseGroup> courseGroupListCoursesList = FXCollections.observableArrayList();
    private CourseGroup currentCourseGroup;
    private String selectedGroupNumber;

    @FXML
    public void initialize() {
    }

    @FXML
    private void changeProfile() throws Exception {
        successLabelProfile.setText(null);
        University.loadFaculties();
        Professor.loadAllProfessor();

        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Professor professor1 : major.professors) {
                                    if (professor1.equals(professor)) {
                                        boolean edited = false;
                                        boolean problem = false;
                                        if (!nationalIdProfile.getText().isEmpty()) {
                                            try {
                                                Long nationalId = Long.parseLong(nationalIdProfile.getText());
                                                if (nationalIdProfile.getText().length() != 10) {
                                                    errorLabelNationalIdProfile.setText("Enter 10 Digit");
                                                    errorLabelNationalIdProfile.setStyle("-fx-text-fill: red;");
                                                    problem = true;
                                                } else {
                                                    errorLabelNationalIdProfile.setText(null);
                                                }
                                            } catch (NumberFormatException e) {
                                                errorLabelNationalIdProfile.setText("Enter Just Number");
                                                errorLabelNationalIdProfile.setStyle("-fx-text-fill: red;");
                                                problem = true;
                                            }
                                        }
                                        if (!phoneNumberProfile.getText().isEmpty()) {
                                            try {
                                                Long phone = Long.parseLong(phoneNumberProfile.getText());
                                                if (phoneNumberProfile.getText().length() != 11) {
                                                    errorLabelPhoneNumberProfile.setText("Enter 11 Digit");
                                                    errorLabelPhoneNumberProfile.setStyle("-fx-text-fill: red;");
                                                    problem = true;
                                                } else if (!phoneNumberProfile.getText().startsWith("09")) {
                                                    errorLabelPhoneNumberProfile.setText("Wrong Format(09...)");
                                                    errorLabelPhoneNumberProfile.setStyle("-fx-text-fill: red;");
                                                    problem = true;
                                                } else {
                                                    errorLabelPhoneNumberProfile.setText(null);
                                                }
                                            } catch (NumberFormatException e) {
                                                errorLabelPhoneNumberProfile.setText("Enter Just Number");
                                                errorLabelPhoneNumberProfile.setStyle("-fx-text-fill: red;");
                                                problem = true;
                                            }
                                        }
                                        if (!problem) {
                                            if (!firstNameProfile.getText().isEmpty()) {
                                                professor1.setFirst_name(firstNameProfile.getText());
                                                edited = true;
                                            }
                                            if (!lastNameProfile.getText().isEmpty()) {
                                                professor1.setLast_name(lastNameProfile.getText());
                                                edited = true;
                                            }
                                            if (!genderProfile.getValue().equals(String.valueOf(professor1.getGender()))) {
                                                professor1.setGender(genderProfile.getValue());
                                                edited = true;
                                            }
                                            if (dateOfBirthProfile.getValue() != null) {
                                                professor1.setDateOfBirth(dateOfBirthProfile.getValue());
                                                edited = true;
                                            }
                                            if (!phoneNumberProfile.getText().isEmpty()) {
                                                professor1.setPhoneNumber(phoneNumberProfile.getText());
                                                edited = true;
                                            }
                                            if (!nationalIdProfile.getText().isEmpty()) {
                                                professor1.setNationalId(nationalIdProfile.getText());
                                                edited = true;
                                            }
                                            University.saveFaculties();
                                            for (Professor professor2 : University.allProfessors) {
                                                if (professor2.equals(professor)) {
                                                    if (!firstNameProfile.getText().isEmpty()) {
                                                        professor2.setFirst_name(firstNameProfile.getText());
                                                    }
                                                    if (!lastNameProfile.getText().isEmpty()) {
                                                        professor2.setLast_name(lastNameProfile.getText());
                                                    }
                                                    if (!genderProfile.getValue().equals(String.valueOf(professor2.getGender()))) {
                                                        professor2.setGender(genderProfile.getValue());
                                                    }
                                                    if (dateOfBirthProfile.getValue() != null) {
                                                        professor2.setDateOfBirth(dateOfBirthProfile.getValue());
                                                    }
                                                    if (!phoneNumberProfile.getText().isEmpty()) {
                                                        professor2.setPhoneNumber(phoneNumberProfile.getText());
                                                    }
                                                    if (!nationalIdProfile.getText().isEmpty()) {
                                                        professor2.setNationalId(nationalIdProfile.getText());
                                                    }
                                                    Professor.saveAllProfessor();
                                                    break;
                                                }
                                            }
                                            if (edited) {
                                                errorLabelProfile.setText(null);
                                                LoginPanelController.professorPerson = professor1;
                                                successLabelProfile.setText("The Profile Edited Successfully");
                                                successLabelProfile.setStyle("-fx-text-fill: green;");

                                                firstNameProfile.clear();
                                                firstNameProfile.setPromptText(professor1.getFirst_name());
                                                lastNameProfile.clear();
                                                lastNameProfile.setPromptText(professor1.getLast_name());
                                                nationalIdProfile.clear();
                                                nationalIdProfile.setPromptText(professor1.getNationalId());
                                                phoneNumberProfile.clear();
                                                phoneNumberProfile.setPromptText(professor1.getPhoneNumber());
                                                dateOfBirthProfile.setValue(null);
                                                dateOfBirthProfile.setPromptText(professor1.getDateOfBirth().getDayOfMonth() + " " + Month.of(professor1.getDateOfBirth().getMonthValue()) + " " + professor1.getDateOfBirth().getYear());
                                                genderProfile.getSelectionModel().select(professor1.getGender());
                                            } else {
                                                errorLabelProfile.setText("There Isn't Any Changes");
                                                errorLabelProfile.setStyle("-fx-text-fill: red;");
                                            }
                                        } else {
                                            errorLabelProfile.setText("Check The Fields");
                                            errorLabelProfile.setStyle("-fx-text-fill: red;");
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
                break;
            }
        }
    }

    private void courseGroupGradeSubmission() {
        String selectedSemester = semesterComboBoxGradeSubmission.getValue();
        Professor professor = LoginPanelController.professorPerson;
        courseGroupComboBoxGradeSubmission.getItems().clear();
        courseGroupComboBoxGradeSubmission.getItems().add("Course Group");
        if (selectedSemester == null || selectedSemester.equals("Semester")) {
            errorLabelGradeSubmission.setText("Select Semester");
            return;
        }
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getProfessor().equals(professor.getFullName()) &&
                                                    group.getSemesterCode().equals(selectedSemester) &&
                                                    group.getStatus().equals(Status.Active)) {
                                                String groupId = group.getId();
                                                if (groupId != null && !groupId.isEmpty()) {
                                                    String groupName = course.getName() + " - Group " + groupId;
                                                    if (!courseGroupComboBoxGradeSubmission.getItems().contains(groupName)) {
                                                        courseGroupComboBoxGradeSubmission.getItems().add(groupName);
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
        courseGroupComboBoxGradeSubmission.setVisibleRowCount(5);
        courseGroupComboBoxGradeSubmission.getSelectionModel().selectFirst();
        if (courseGroupComboBoxGradeSubmission.getItems().size() == 1) {
            errorLabelGradeSubmission.setText("No Course Groups Found for Selected Semester");
        } else {
            errorLabelGradeSubmission.setText(null);
        }
    }

    private void courseGroupRemoveStudent() {
        String selectedSemester = semesterComboBoxRemoveStudent.getValue();
        Professor professor = LoginPanelController.professorPerson;
        if (selectedSemester == null || selectedSemester.equals("Semester")) {
            messageLabelRemoveStudent.setText("Select Semester");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            return;
        }
        courseGroupComboBoxRemoveStudent.getItems().clear();
        courseGroupComboBoxRemoveStudent.getItems().add("Course Group");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getProfessor().equals(professor.getFullName()) &&
                                                    group.getSemesterCode().equals(selectedSemester) &&
                                                    group.getStatus().equals(Status.Active)) {
                                                String groupId = group.getId();
                                                if (groupId != null && !groupId.isEmpty()) {
                                                    String groupName = course.getName() + " - Group " + groupId;
                                                    if (!courseGroupComboBoxRemoveStudent.getItems().contains(groupName)) {
                                                        courseGroupComboBoxRemoveStudent.getItems().add(groupName);
                                                        System.out.println("Added course group: " + groupName);
                                                    }
                                                } else {
                                                    System.out.println("Skipping group with null or empty ID for course: " + course.getName());
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
        courseGroupComboBoxRemoveStudent.setVisibleRowCount(5);
        courseGroupComboBoxRemoveStudent.getSelectionModel().selectFirst();
        if (courseGroupComboBoxRemoveStudent.getItems().size() == 1) {
            messageLabelRemoveStudent.setText("No Course Groups Found for Selected Semester");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
        } else {
            messageLabelRemoveStudent.setText(null);
        }
    }

    private void courseGroupStudentList() {
        String selectedSemester = semesterComboBoxStudentList.getValue();
        Professor professor = LoginPanelController.professorPerson;
        if (selectedSemester == null || selectedSemester.equals("Semester")) {
            messageLabelStudentList.setText("Select Semester");
            messageLabelStudentList.setStyle("-fx-text-fill: red;");
            return;
        }
        courseGroupComboBoxStudentList.getItems().clear();
        courseGroupComboBoxStudentList.getItems().add("Course Group");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getProfessor().equals(professor.getFullName()) &&
                                                    group.getSemesterCode().equals(selectedSemester) &&
                                                    group.getStatus().equals(Status.Active)) {
                                                String groupId = group.getId();
                                                if (groupId != null && !groupId.isEmpty()) {
                                                    String groupName = course.getName() + " - Group " + groupId;
                                                    if (!courseGroupComboBoxStudentList.getItems().contains(groupName)) {
                                                        courseGroupComboBoxStudentList.getItems().add(groupName);
                                                        System.out.println("Added course group: " + groupName);
                                                    }
                                                } else {
                                                    System.out.println("Skipping group with null or empty ID for course: " + course.getName());
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
        courseGroupComboBoxStudentList.setVisibleRowCount(5);
        courseGroupComboBoxStudentList.getSelectionModel().selectFirst();
        if (courseGroupComboBoxStudentList.getItems().size() == 1) {
            messageLabelStudentList.setText("No Course Groups Found for Selected Semester");
            messageLabelStudentList.setStyle("-fx-text-fill: red;");
        } else {
            messageLabelStudentList.setText(null);
        }
    }

    @FXML
    private void coursesListDashboard(ActionEvent event) {
        headerTitle.setText(" --> Courses List");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        coursesListAnchorPane.setVisible(true);
        coursesListScrollPane.getStyleClass().add("pressed");
        semestersCoursesList();
    }

    @FXML
    private void coursesListScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Courses List");
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        } else if (studentsGradeChartAnchorPane.isVisible()) {
            studentsGradeChartAnchorPane.setVisible(false);
            studentsGradeChartScrollPane.getStyleClass().remove("pressed");
        } else if (studentListAnchorPane.isVisible()) {
            studentListAnchorPane.setVisible(false);
            studentListScrollPane.getStyleClass().remove("pressed");
        }
        if (!coursesListAnchorPane.isVisible()) {
            coursesListAnchorPane.setVisible(true);
            coursesListScrollPane.getStyleClass().add("pressed");
            semestersCoursesList();
        }
    }

    @FXML
    private void dashboardScrollPane() {
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (coursesListAnchorPane.isVisible()) {
            coursesListAnchorPane.setVisible(false);
            coursesListScrollPane.getStyleClass().remove("pressed");
        } else if (studentsGradeChartAnchorPane.isVisible()) {
            studentsGradeChartAnchorPane.setVisible(false);
            studentsGradeChartScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        } else if (studentListAnchorPane.isVisible()) {
            studentListAnchorPane.setVisible(false);
            studentListScrollPane.getStyleClass().remove("pressed");
        }
        buttonsScrollPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);
        headerTitle.setText("");
    }

    @FXML
    private void gradeSubmissionDashboard(ActionEvent event) {
        headerTitle.setText(" --> Grade Submission");
        dashboardAnchorPane.setVisible(false);
        gradeSubmissionAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(true);
        gradeSubmissionScrollPane.getStyleClass().add("pressed");
        semestersGradeSubmission();
        errorLabelGradeSubmission.setText(null);
    }

    @FXML
    private void gradeSubmissionScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Grade Submission");
        if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (coursesListAnchorPane.isVisible()) {
            coursesListAnchorPane.setVisible(false);
            coursesListScrollPane.getStyleClass().remove("pressed");
        } else if (studentsGradeChartAnchorPane.isVisible()) {
            studentsGradeChartAnchorPane.setVisible(false);
            studentsGradeChartScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        } else if (studentListAnchorPane.isVisible()) {
            studentListAnchorPane.setVisible(false);
            studentListScrollPane.getStyleClass().remove("pressed");
        }
        if (!gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(true);
            gradeSubmissionScrollPane.getStyleClass().add("pressed");
            semestersGradeSubmission();
            errorLabelGradeSubmission.setText(null);

        }
    }

    @FXML
    private void profileDashboard(ActionEvent event) {
        headerTitle.setText(" --> Profile");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        profileAnchorPane.setVisible(true);
        profileScrollPane.getStyleClass().add("pressed");
        Professor professor = LoginPanelController.professorPerson;
        firstNameProfile.clear();
        firstNameProfile.setPromptText(professor.getFirst_name());
        lastNameProfile.clear();
        lastNameProfile.setPromptText(professor.getLast_name());
        nationalIdProfile.clear();
        nationalIdProfile.setPromptText(professor.getNationalId());
        phoneNumberProfile.clear();
        phoneNumberProfile.setPromptText(professor.getPhoneNumber());
        dateOfBirthProfile.setValue(null);
        dateOfBirthProfile.setPromptText(professor.getDateOfBirth().getDayOfMonth() + " " + Month.of(professor.getDateOfBirth().getMonthValue()) + " " + professor.getDateOfBirth().getYear());
        genderProfile.getItems().clear();
        genderProfile.getItems().addAll(Gender.Male, Gender.Female);
        genderProfile.getSelectionModel().select(professor.getGender());

    }

    @FXML
    private void profileScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Profile");
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (coursesListAnchorPane.isVisible()) {
            coursesListAnchorPane.setVisible(false);
            coursesListScrollPane.getStyleClass().remove("pressed");
        } else if (studentsGradeChartAnchorPane.isVisible()) {
            studentsGradeChartAnchorPane.setVisible(false);
            studentsGradeChartScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        } else if (studentListAnchorPane.isVisible()) {
            studentListAnchorPane.setVisible(false);
            studentListScrollPane.getStyleClass().remove("pressed");
        }
        if (!profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(true);
            profileScrollPane.getStyleClass().add("pressed");

            Professor professor = LoginPanelController.professorPerson;
            firstNameProfile.clear();
            firstNameProfile.setPromptText(professor.getFirst_name());
            lastNameProfile.clear();
            lastNameProfile.setPromptText(professor.getLast_name());
            nationalIdProfile.clear();
            nationalIdProfile.setPromptText(professor.getNationalId());
            phoneNumberProfile.clear();
            phoneNumberProfile.setPromptText(professor.getPhoneNumber());
            dateOfBirthProfile.setValue(null);
            dateOfBirthProfile.setPromptText(professor.getDateOfBirth().getDayOfMonth() + " " + Month.of(professor.getDateOfBirth().getMonthValue()) + " " + professor.getDateOfBirth().getYear());
            genderProfile.getItems().clear();
            genderProfile.getItems().addAll(Gender.Male, Gender.Female);
            genderProfile.getSelectionModel().select(professor.getGender());
        }
    }

    @FXML
    private void removeStudentDashboard(ActionEvent event) {
        headerTitle.setText(" --> Remove Student");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        removeStudentAnchorPane.setVisible(true);
        removeStudentScrollPane.getStyleClass().add("pressed");
        semestersRemoveStudent();
    }

    @FXML
    private void removeStudentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Remove Student");
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (coursesListAnchorPane.isVisible()) {
            coursesListAnchorPane.setVisible(false);
            coursesListScrollPane.getStyleClass().remove("pressed");
        } else if (studentsGradeChartAnchorPane.isVisible()) {
            studentsGradeChartAnchorPane.setVisible(false);
            studentsGradeChartScrollPane.getStyleClass().remove("pressed");
        } else if (studentListAnchorPane.isVisible()) {
            studentListAnchorPane.setVisible(false);
            studentListScrollPane.getStyleClass().remove("pressed");
        }
        if (!removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(true);
            removeStudentScrollPane.getStyleClass().add("pressed");
            semestersRemoveStudent();
        }
    }

    @FXML
    private void studentsGradeChartDashboard(ActionEvent event) {
        headerTitle.setText(" --> Students Grade Chart");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        studentsGradeChartAnchorPane.setVisible(true);
        studentsGradeChartScrollPane.getStyleClass().add("pressed");

        studentsGradeChart.getData().clear();

        University.loadFaculties();
        Professor professor = LoginPanelController.professorPerson;
        semesterChooserGradeChart.getItems().clear();
        semesterChooserGradeChart.getItems().add("Semester");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active)) {
                                            for (CourseGroup courseGroup : course.courseGroups) {
                                                if (courseGroup.getProfessor().equals(professor.getFullName())) {
                                                    if (!semesterChooserGradeChart.getItems().contains(courseGroup.getSemesterCode())) {
                                                        semesterChooserGradeChart.getItems().add(courseGroup.getSemesterCode());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                semesterChooserGradeChart.setOnAction(event1 -> {
                                    courseGroupChooserGradeChart.getItems().clear();
                                    courseGroupChooserGradeChart.getItems().add("CourseGroup");
                                    for (Degree degree : major.degrees) {
                                        for (Course course : degree.courses) {
                                            if (course.getStatus().equals(Status.Active)) {
                                                for (CourseGroup courseGroup : course.courseGroups) {
                                                    if (courseGroup.getProfessor().equals(professor.getFullName()) && courseGroup.getSemesterCode().equals(semesterChooserGradeChart.getValue())) {
                                                        courseGroupChooserGradeChart.getItems().add(courseGroup.getCourseName() + " : " + courseGroup.getId());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    courseGroupChooserGradeChart.setVisibleRowCount(5);
                                    courseGroupChooserGradeChart.getSelectionModel().selectFirst();
                                });
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        semesterChooserGradeChart.setVisibleRowCount(5);
        semesterChooserGradeChart.getSelectionModel().selectFirst();
    }

    @FXML
    private void studentsGradeChartScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Students Grade Chart");
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (coursesListAnchorPane.isVisible()) {
            coursesListAnchorPane.setVisible(false);
            coursesListScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        }
        if (!studentsGradeChartAnchorPane.isVisible()) {
            studentsGradeChartAnchorPane.setVisible(true);
            studentsGradeChartScrollPane.getStyleClass().add("pressed");

            studentsGradeChart.getData().clear();

            University.loadFaculties();
            Professor professor = LoginPanelController.professorPerson;
            semesterChooserGradeChart.getItems().clear();
            semesterChooserGradeChart.getItems().add("Semester");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                    for (Degree degree : major.degrees) {
                                        for (Course course : degree.courses) {
                                            if (course.getStatus().equals(Status.Active)) {
                                                for (CourseGroup courseGroup : course.courseGroups) {
                                                    if (courseGroup.getProfessor().equals(professor.getFullName())) {
                                                        if (!semesterChooserGradeChart.getItems().contains(courseGroup.getSemesterCode())) {
                                                            semesterChooserGradeChart.getItems().add(courseGroup.getSemesterCode());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    semesterChooserGradeChart.setOnAction(event1 -> {
                                        courseGroupChooserGradeChart.getItems().clear();
                                        courseGroupChooserGradeChart.getItems().add("CourseGroup");
                                        for (Degree degree : major.degrees) {
                                            for (Course course : degree.courses) {
                                                if (course.getStatus().equals(Status.Active)) {
                                                    for (CourseGroup courseGroup : course.courseGroups) {
                                                        if (courseGroup.getProfessor().equals(professor.getFullName()) && courseGroup.getSemesterCode().equals(semesterChooserGradeChart.getValue())) {
                                                            courseGroupChooserGradeChart.getItems().add(courseGroup.getCourseName() + " : " + courseGroup.getId());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        courseGroupChooserGradeChart.setVisibleRowCount(5);
                                        courseGroupChooserGradeChart.getSelectionModel().selectFirst();
                                    });
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            semesterChooserGradeChart.setVisibleRowCount(5);
            semesterChooserGradeChart.getSelectionModel().selectFirst();

        }
    }

    @FXML
    void loadStudentsGradeChart(ActionEvent event) {
        studentsGradeChart.getData().clear();
        University.loadFaculties();
        Professor professor = LoginPanelController.professorPerson;
        XYChart.Series<String, Number> grades = new XYChart.Series<>();
//        grades.setName("Students Grade Chart");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active)) {
                                            for (CourseGroup courseGroup : course.courseGroups) {
                                                if (courseGroup.getProfessor().equals(professor.getFullName()) && courseGroup.getSemesterCode().equals(semesterChooserGradeChart.getValue())) {
                                                    if (courseGroupChooserGradeChart.getValue().equals(courseGroup.getCourseName() + " : " + courseGroup.getId())) {
                                                        for (Student student : courseGroup.getRegisteredStudents()) {
                                                            if (student.getStatus().equals(Status.Active)) {
                                                                grades.getData().add(new XYChart.Data<>(student.getFullName(), courseGroup.getScore(student)));
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
                        break;
                    }
                }
                break;
            }
        }
        studentsGradeChart.getData().add(grades);
    }

    @FXML
    private void studentListDashboard(ActionEvent event) {
        headerTitle.setText(" --> Student List");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        studentListAnchorPane.setVisible(true);
        studentListScrollPane.getStyleClass().add("pressed");
        semestersStudentList();
    }

    @FXML
    private void studentListScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Student List");
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (coursesListAnchorPane.isVisible()) {
            coursesListAnchorPane.setVisible(false);
            coursesListScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        } else if (studentsGradeChartAnchorPane.isVisible()) {
            studentsGradeChartAnchorPane.setVisible(false);
            studentsGradeChartScrollPane.getStyleClass().remove("pressed");
        }
        if (!studentListAnchorPane.isVisible()) {
            studentListAnchorPane.setVisible(true);
            studentListScrollPane.getStyleClass().add("pressed");
            semestersStudentList();
        }
    }

    @FXML
    private void loadStudentsStudentList() {
        if (semesterComboBoxStudentList.getValue() == null || semesterComboBoxStudentList.getValue().equals("Semester")) {
            messageLabelStudentList.setText("Choose Semester");
            messageLabelStudentList.setStyle("-fx-text-fill: red;");
            studentCountLabelStudentList.setText("Total: 0");
            return;
        } else if (courseGroupComboBoxStudentList.getValue() == null || courseGroupComboBoxStudentList.getValue().equals("Course Group")) {
            messageLabelStudentList.setText("Choose Course Group");
            messageLabelStudentList.setStyle("-fx-text-fill: red;");
            studentCountLabelStudentList.setText("Total: 0");
            return;
        } else {
            messageLabelStudentList.setText(null);
        }

        rowNumberColStudentList.setCellValueFactory(cellData -> {
            int rowIndex = studentsTableStudentList.getItems().indexOf(cellData.getValue()) + 1;
            return new ReadOnlyStringWrapper(String.valueOf(rowIndex));
        });
        studentNameColStudentList.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getFirst_name() + " " + cellData.getValue().getLast_name()
        ));
        studentIdColStudentList.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getId()));
        nationalIdColStudentList.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getNationalId()));

        studentsTableStudentList.setItems(studentListStudentList);

        studentListStudentList.clear();
        String selectedSemester = semesterComboBoxStudentList.getValue();
        String selectedCourseGroup = courseGroupComboBoxStudentList.getValue();
        String[] parts = selectedCourseGroup.split(" - Group ");
        if (parts.length < 2) {
            messageLabelStudentList.setText("Invalid Course Group Format");
            messageLabelStudentList.setStyle("-fx-text-fill: red;");
            studentCountLabelStudentList.setText("Total: 0");
            System.out.println("Invalid course group format: " + selectedCourseGroup);
            return;
        }
        String selectedCourse = parts[0];
        selectedGroupNumber = parts[1];

        CourseGroup selectedGroup = null;
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active)) {
                                            for (CourseGroup group : course.courseGroups) {
                                                if (group.getProfessor().equals(professor.getFullName()) &&
                                                        group.getCourse().getName().equals(selectedCourse) &&
                                                        group.getSemesterCode().equals(selectedSemester) &&
                                                        group.getStatus().equals(Status.Active) &&
                                                        group.getId() != null && group.getId().equals(selectedGroupNumber)) {
                                                    selectedGroup = group;
                                                    studentListStudentList.addAll(group.getRegisteredStudents());
                                                    System.out.println("Found course group: " + selectedCourseGroup + ", Students: " + group.getRegisteredStudents().size());
                                                    break;
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

        if (selectedGroup == null) {
            messageLabelStudentList.setText("Course Group Not Found");
            messageLabelStudentList.setStyle("-fx-text-fill: red;");
            studentCountLabelStudentList.setText("Total: 0");
            System.out.println("Course group not found for: Semester=" + selectedSemester + ", Course=" + selectedCourse + ", GroupID=" + selectedGroupNumber);
            return;
        }

        if (selectedGroup.getRegisteredStudents() == null) {
            selectedGroup.setRegisteredStudents(new ArrayList<>());
            System.out.println("Initialized registeredStudents for course group: " + selectedCourseGroup);
        }

        if (selectedGroup.getRegisteredStudents().isEmpty()) {
            messageLabelStudentList.setText("No Students Enrolled in This Course Group");
            messageLabelStudentList.setStyle("-fx-text-fill: red;");
            studentCountLabelStudentList.setText("Total: 0");
        } else {
            messageLabelStudentList.setText(studentListStudentList.size() + " Students Found");
            messageLabelStudentList.setStyle("-fx-text-fill: green;");
            studentCountLabelStudentList.setText("Total: " + studentListStudentList.size());
        }
    }

    private void semestersCoursesList() {
        semesterComboBoxCoursesList.getItems().clear();
        semesterComboBoxCoursesList.getItems().add("Semester");
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getProfessor().equals(professor.getFullName()) &&
                                                    group.getStatus().equals(Status.Active)) {
                                                String semesterCode = group.getSemesterCode();
                                                if (!semesterComboBoxCoursesList.getItems().contains(semesterCode)) {
                                                    semesterComboBoxCoursesList.getItems().add(semesterCode);
                                                    System.out.println("Added semester: " + semesterCode);
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
        semesterComboBoxCoursesList.setVisibleRowCount(5);
        semesterComboBoxCoursesList.getSelectionModel().selectFirst();
    }

    private void semestersGradeSubmission() {
        semesterComboBoxGradeSubmission.getItems().clear();
        semesterComboBoxGradeSubmission.getItems().add("Semester");
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getProfessor().equals(professor.getFullName()) &&
                                                    group.getStatus().equals(Status.Active)) {
                                                String semesterCode = group.getSemesterCode();
                                                if (!semesterComboBoxGradeSubmission.getItems().contains(semesterCode)) {
                                                    semesterComboBoxGradeSubmission.getItems().add(semesterCode);
                                                    System.out.println("Added semester: " + semesterCode);
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
        semesterComboBoxGradeSubmission.setVisibleRowCount(5);
        semesterComboBoxGradeSubmission.getSelectionModel().selectFirst();
        semesterComboBoxGradeSubmission.setOnAction(event -> courseGroupGradeSubmission());
    }

    private void semestersRemoveStudent() {
        semesterComboBoxRemoveStudent.getItems().clear();
        semesterComboBoxRemoveStudent.getItems().add("Semester");
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getProfessor().equals(professor.getFullName()) &&
                                                    group.getStatus().equals(Status.Active)) {
                                                String semesterCode = group.getSemesterCode();
                                                if (!semesterComboBoxRemoveStudent.getItems().contains(semesterCode)) {
                                                    semesterComboBoxRemoveStudent.getItems().add(semesterCode);
                                                    System.out.println("Added semester: " + semesterCode);
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
        semesterComboBoxRemoveStudent.setVisibleRowCount(5);
        semesterComboBoxRemoveStudent.getSelectionModel().selectFirst();
        semesterComboBoxRemoveStudent.setOnAction(event -> courseGroupRemoveStudent());
    }

    private void semestersStudentList() {
        semesterComboBoxStudentList.getItems().clear();
        semesterComboBoxStudentList.getItems().add("Semester");
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        for (CourseGroup group : course.courseGroups) {
                                            if (group.getProfessor().equals(professor.getFullName()) &&
                                                    group.getStatus().equals(Status.Active)) {
                                                String semesterCode = group.getSemesterCode();
                                                if (!semesterComboBoxStudentList.getItems().contains(semesterCode)) {
                                                    semesterComboBoxStudentList.getItems().add(semesterCode);
                                                    System.out.println("Added semester: " + semesterCode);
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
        semesterComboBoxStudentList.setVisibleRowCount(5);
        semesterComboBoxStudentList.getSelectionModel().selectFirst();
        semesterComboBoxStudentList.setOnAction(event -> courseGroupStudentList());
    }

    private void dropStudent(Student student) {
        String selectedSemester = semesterComboBoxRemoveStudent.getValue();
        String selectedCourseGroup = courseGroupComboBoxRemoveStudent.getValue();

        if (selectedSemester == null || selectedCourseGroup == null) {
            messageLabelRemoveStudent.setText("Please Select a Semester and Course Group");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            return;
        }

        String[] parts = selectedCourseGroup.split(" - Group ");
        if (parts.length < 2) {
            messageLabelRemoveStudent.setText("Invalid Course Group Format");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            System.out.println("Invalid course group format: " + selectedCourseGroup);
            return;
        }
        String selectedCourse = parts[0];
        selectedGroupNumber = parts[1];

        CourseGroup selectedGroup = null;
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active)) {
                                            for (CourseGroup group : course.courseGroups) {
                                                if (group.getProfessor().equals(professor.getFullName()) &&
                                                        group.getCourse().getName().equals(selectedCourse) &&
                                                        group.getSemesterCode().equals(selectedSemester) &&
                                                        group.getStatus().equals(Status.Active) &&
                                                        group.getId() != null && group.getId().equals(selectedGroupNumber)) {
                                                    selectedGroup = group;
                                                    break;
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

        if (selectedGroup == null) {
            messageLabelRemoveStudent.setText("Course Group Not Found");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            System.out.println("Course group not found for: Semester=" + selectedSemester + ", Course=" + selectedCourse + ", GroupID=" + selectedGroupNumber);
            return;
        }

        if (!selectedGroup.getRegisteredStudents().contains(student)) {
            messageLabelRemoveStudent.setText("Student Not Found in Course Group");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            return;
        }

        try {
            selectedGroup.getRegisteredStudents().remove(student);
            selectedGroup.getGrades().remove(student.getId());
            System.out.println("Removed student " + student.getId() + " from course group: " + selectedCourseGroup);

            for (Faculty faculty : University.allFaculties) {
                for (Department department : faculty.departments) {
                    for (Major major : department.majors) {
                        for (Student s : major.students) {
                            if (s.getId().equals(student.getId())) {
                                Semester studentSemester = s.getSemesterByName(selectedSemester);
                                if (studentSemester != null && studentSemester.courseGroups != null) {
                                    studentSemester.courseGroups.remove(selectedGroup);
                                    System.out.println("Removed course group " + selectedCourseGroup + " from student " + s.getId() + "'s semester");
                                }
                            }
                        }
                    }
                }
            }

            University.saveFaculties();
            System.out.println("Saved faculties after dropping student: " + student.getId());

            studentListRemoveStudent.remove(student);
            messageLabelRemoveStudent.setText("Student " + student.getFirst_name() + " " + student.getLast_name() + " Dropped Successfully");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: green;");
        } catch (Exception e) {
            messageLabelRemoveStudent.setText("Error Dropping Student: " + e.getMessage());
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            System.out.println("Error in dropStudent: " + e.getMessage());
        }
    }

    private void editGrade(Student student) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Edit Grade");
        dialog.setHeaderText("Enter New Number For " + student.getFullName());
        dialog.setContentText("Grade: ");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(grade -> {
            try {
                double newScore = Double.parseDouble(grade);
                if (newScore < 0 || newScore > 20) {
                    showAlert("Grade Out Of Range(0 - 20)");
                    return;
                }
                if (currentCourseGroup != null) {
                    currentCourseGroup.getGrades().put(student.getId(), newScore);
                    studentsTableGradeSubmission.refresh();
                    System.out.println("Grade updated for student: " + student.getId() + ", New score: " + newScore);
                } else {
                    showAlert("No Course Group Selected");
                }
            } catch (NumberFormatException e) {
                showAlert("Enter Just Number");
            }
        });
    }

    private Degree findDegreeForCourseGroup(CourseGroup group) {
        if (group == null || group.getCourse() == null || group.getCourse().getName() == null) {
            System.out.println("CourseGroup, Course, or Course name is null: group=" + group + ", course=" + (group != null ? group.getCourse() : null));
            return null;
        }
        Professor professor = LoginPanelController.professorPerson;
        String targetCourseName = group.getCourse().getName();
        System.out.println("Searching for Course by name: " + targetCourseName);
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department dept : faculty.departments) {
                    if (dept.getName().equals(professor.getDepartment()) && dept.getStatus().equals(Status.Active)) {
                        for (Major major : dept.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active) && course.getName().equals(targetCourseName)) {
                                            System.out.println("Found Degree: " + degree.getClass().getSimpleName() + " for Course: " + targetCourseName);
                                            return degree;
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
        System.out.println("No Degree found for CourseGroup with course name: " + targetCourseName);
        return null;
    }

    @FXML
    private void loadCoursesList(ActionEvent event) {
        if (semesterComboBoxCoursesList.getValue() == null || semesterComboBoxCoursesList.getValue().equals("Semester")) {
            messageLabelCoursesList.setText("Choose Semester");
            messageLabelCoursesList.setStyle("-fx-text-fill: red;");
            return;
        } else {
            messageLabelCoursesList.setText(null);
        }

        rowNumberColCoursesList.setCellValueFactory(cellData -> {
            int rowIndex = coursesTableCoursesList.getItems().indexOf(cellData.getValue()) + 1;
            return new ReadOnlyStringWrapper(String.valueOf(rowIndex));
        });
        courseNameColCoursesList.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getCourse().getName()
        ));
        groupIdColCoursesList.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getId()
        ));
        semesterColCoursesList.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getSemesterCode()
        ));
        studentCountColCoursesList.setCellValueFactory(cellData -> {
            List<Student> students = cellData.getValue().getRegisteredStudents();
            int count = (students != null) ? students.size() : 0;
            return new ReadOnlyStringWrapper(String.valueOf(count));
        });

        coursesTableCoursesList.setItems(courseGroupListCoursesList);

        courseGroupListCoursesList.clear();
        String selectedSemester = semesterComboBoxCoursesList.getValue();
        Professor professor = LoginPanelController.professorPerson;

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active)) {
                                            for (CourseGroup group : course.courseGroups) {
                                                if (group.getProfessor().equals(professor.getFullName()) &&
                                                        group.getSemesterCode().equals(selectedSemester)) {
                                                    courseGroupListCoursesList.add(group);
                                                    System.out.println("Added course group to courses list: " + course.getName() + " - Group " + group.getId());
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

        if (courseGroupListCoursesList.isEmpty()) {
            messageLabelCoursesList.setText("No Courses Found for Selected Semester");
            messageLabelCoursesList.setStyle("-fx-text-fill: red;");
        } else {
            messageLabelCoursesList.setText(courseGroupListCoursesList.size() + " Courses Found");
            messageLabelCoursesList.setStyle("-fx-text-fill: green;");
        }
    }

    @FXML
    private void loadStudentsGradeSubmission(ActionEvent event) {
        if (semesterComboBoxGradeSubmission.getValue() == null || semesterComboBoxGradeSubmission.getValue().equals("Semester")) {
            errorLabelGradeSubmission.setText("Choose Semester");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            return;
        } else if (courseGroupComboBoxGradeSubmission.getValue() == null || courseGroupComboBoxGradeSubmission.getValue().equals("Course Group")) {
            errorLabelGradeSubmission.setText("Choose Course Group");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            return;
        } else {
            errorLabelGradeSubmission.setText(null);
        }

        studentIdColGradeSubmission.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getId()));
        studentNameColGradeSubmission.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getFirst_name() + " " + cellData.getValue().getLast_name()
        ));

        scoreColGradeSubmission.setCellValueFactory(data -> {
            if (currentCourseGroup != null) {
                Double score = currentCourseGroup.getGrades().get(data.getValue().getId());
                return new ReadOnlyStringWrapper(score != null ? score.toString() : "0.0");
            }
            return new ReadOnlyStringWrapper("0.0");
        });

        statusColGradeSubmission.setCellValueFactory(data -> {
            if (currentCourseGroup == null) {
                System.out.println("currentCourseGroup is null");
                return new ReadOnlyStringWrapper(CourseStatus.Fail.name());
            }
            Double score = currentCourseGroup.getGrades().get(data.getValue().getId());
            if (score == null) {
                System.out.println("No score for student: " + data.getValue().getId());
                return new ReadOnlyStringWrapper(CourseStatus.Fail.name());
            }
            Degree degree = findDegreeForCourseGroup(currentCourseGroup);
            if (degree == null) {
                System.out.println("No Degree found for CourseGroup: " + currentCourseGroup.getCourse().getName());
                return new ReadOnlyStringWrapper(CourseStatus.Fail.name());
            }
            CourseStatus status = degree.getPassStatus(score);
            System.out.println("Student: " + data.getValue().getId() + ", Score: " + score + ", Status: " + status);
            return new ReadOnlyStringWrapper(status.name());
        });

        statusColGradeSubmission.setCellFactory(col -> new TableCell<>() {
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

        editColGradeSubmission.setCellFactory(col -> new TableCell<>() {
            private final Button editButton = new Button("Edit");

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

        studentsTableGradeSubmission.setItems(studentListGradeSubmission);

        studentListGradeSubmission.clear();
        String selectedSemester = semesterComboBoxGradeSubmission.getValue();
        String selectedCourseGroup = courseGroupComboBoxGradeSubmission.getValue();
        String[] parts = selectedCourseGroup.split(" - Group ");
        if (parts.length < 2) {
            errorLabelGradeSubmission.setText("Invalid Course Group Format");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            System.out.println("Invalid course group format: " + selectedCourseGroup);
            return;
        }
        String selectedCourse = parts[0];
        selectedGroupNumber = parts[1];

        currentCourseGroup = null;
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department dept : faculty.departments) {
                    if (dept.getName().equals(professor.getDepartment()) && dept.getStatus().equals(Status.Active)) {
                        for (Major major : dept.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active)) {
                                            for (CourseGroup group : course.courseGroups) {
                                                if (group.getProfessor().equals(professor.getFullName()) &&
                                                        group.getCourse().getName().equals(selectedCourse) &&
                                                        group.getSemesterCode().equals(selectedSemester) &&
                                                        group.getStatus().equals(Status.Active) &&
                                                        group.getId() != null && group.getId().equals(selectedGroupNumber)) {
                                                    currentCourseGroup = group;
                                                    studentListGradeSubmission.addAll(group.getRegisteredStudents());
                                                    System.out.println("Found course group: " + selectedCourseGroup + ", Students: " + group.getRegisteredStudents().size());
                                                    break;
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

        if (currentCourseGroup == null) {
            errorLabelGradeSubmission.setText("Course Group Not Found");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            System.out.println("Course group not found for: Semester=" + selectedSemester + ", Course=" + selectedCourse + ", GroupID=" + selectedGroupNumber);
        } else if (currentCourseGroup.getRegisteredStudents() == null || currentCourseGroup.getRegisteredStudents().isEmpty()) {
            errorLabelGradeSubmission.setText("No Students Enrolled in This Course Group");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
        } else {
            errorLabelGradeSubmission.setText(studentListGradeSubmission.size() + " Students Found");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: green;");
        }
    }

    @FXML
    private void loadStudentsRemoveStudent() {
        if (semesterComboBoxRemoveStudent.getValue() == null || semesterComboBoxRemoveStudent.getValue().equals("Semester")) {
            messageLabelRemoveStudent.setText("Choose Semester");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            return;
        } else if (courseGroupComboBoxRemoveStudent.getValue() == null || courseGroupComboBoxRemoveStudent.getValue().equals("Course Group")) {
            messageLabelRemoveStudent.setText("Choose Course Group");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            return;
        } else {
            messageLabelRemoveStudent.setText(null);
        }

        studentListRemoveStudent.clear();
        String selectedSemester = semesterComboBoxRemoveStudent.getValue();
        String selectedCourseGroup = courseGroupComboBoxRemoveStudent.getValue();
        String[] parts = selectedCourseGroup.split(" - Group ");
        if (parts.length < 2) {
            messageLabelRemoveStudent.setText("Invalid Course Group Format");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            System.out.println("Invalid course group format: " + selectedCourseGroup);
            return;
        }
        String selectedCourse = parts[0];
        selectedGroupNumber = parts[1];

        CourseGroup selectedGroup = null;
        Professor professor = LoginPanelController.professorPerson;
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(professor.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(professor.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(professor.getMajor()) && major.getStatus().equals(Status.Active)) {
                                for (Degree degree : major.degrees) {
                                    for (Course course : degree.courses) {
                                        if (course.getStatus().equals(Status.Active)) {
                                            for (CourseGroup group : course.courseGroups) {
                                                if (group.getProfessor().equals(professor.getFullName()) &&
                                                        group.getCourse().getName().equals(selectedCourse) &&
                                                        group.getSemesterCode().equals(selectedSemester) &&
                                                        group.getStatus().equals(Status.Active) &&
                                                        group.getId() != null && group.getId().equals(selectedGroupNumber)) {
                                                    selectedGroup = group;
                                                    studentListRemoveStudent.addAll(group.getRegisteredStudents());
                                                    System.out.println("Found course group: " + selectedCourseGroup + ", Students: " + group.getRegisteredStudents().size());
                                                    break;
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

        if (selectedGroup == null) {
            messageLabelRemoveStudent.setText("Course Group Not Found");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            System.out.println("Course group not found for: Semester=" + selectedSemester + ", Course=" + selectedCourse + ", GroupID=" + selectedGroupNumber);
            return;
        }

        if (selectedGroup.getRegisteredStudents() == null) {
            selectedGroup.setRegisteredStudents(new ArrayList<>());
            System.out.println("Initialized registeredStudents for course group: " + selectedCourseGroup);
        }

        if (selectedGroup.getRegisteredStudents().isEmpty()) {
            messageLabelRemoveStudent.setText("No Students Enrolled in This Course Group");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
        } else {
            messageLabelRemoveStudent.setText(studentListRemoveStudent.size() + " Students Found");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: green;");
        }

        setupStudentsTableRemoveStudent();
    }

    private void setupStudentsTableRemoveStudent() {
        studentIdColRemoveStudent.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getId()));
        studentNameColRemoveStudent.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getFirst_name() + " " + cellData.getValue().getLast_name()
        ));

        dropColRemoveStudent.setCellFactory(col -> new TableCell<>() {
            private final Button dropButton = new Button("Drop");

            {
                dropButton.setOnAction(event -> {
                    Student student = getTableView().getItems().get(getIndex());
                    dropStudent(student);
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

        studentsTableRemoveStudent.setItems(studentListRemoveStudent);
    }

    @FXML
    private void saveGradesGradeSubmission() {
        if (currentCourseGroup == null) {
            errorLabelGradeSubmission.setText("No Course Group Selected");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            return;
        }

        try {
            University.saveFaculties();
            errorLabelGradeSubmission.setText("Grades Saved Successfully");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: green;");
            System.out.println("Grades saved for course group: " + currentCourseGroup.getCourse().getName() + " - Group " + currentCourseGroup.getId());
        } catch (Exception e) {
            errorLabelGradeSubmission.setText("Error Saving Grades: " + e.getMessage());
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            System.out.println("Error saving grades: " + e.getMessage());
        }
    }

    @FXML
    private void signOutDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void signOutScrollPane(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
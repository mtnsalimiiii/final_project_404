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

import java.io.IOException;
import java.time.Month;
import java.util.ArrayList;
import java.util.Optional;

public class ProfessorPortalController {

    @FXML private ScrollPane buttonsScrollPane;
    @FXML private ComboBox<String> courseGroupComboBoxGradeSubmission;
    @FXML private ComboBox<String> semesterComboBoxGradeSubmission;

    @FXML private ComboBox<String> courseGroupComboBoxRemoveStudent;
    @FXML private AnchorPane dashboardAnchorPane;
    @FXML private Label dashboardTitle;
    @FXML private DatePicker dateOfBirthProfile;
    @FXML private Label errorLabelDateOfBirthProfile;
    @FXML private Label errorLabelFirstNameProfile;
    @FXML private Label errorLabelGenderProfile;
    @FXML private Label errorLabelGradeSubmission;
    @FXML private Label errorLabelLastNameProfile;
    @FXML private Label errorLabelNationalIdProfile;
    @FXML private Label errorLabelPhoneNumberProfile;
    @FXML private Label errorLabelProfile;
    @FXML private TextField firstNameProfile;
    @FXML private ComboBox<String> genderProfile;
    @FXML private AnchorPane gradeSubmissionAnchorPane;
    @FXML private Button gradeSubmissionScrollPane;
    @FXML private HBox headerHBox;
    @FXML private Label headerTitle;
    @FXML private Label messageLabelRemoveStudent;
    @FXML private TextField lastNameProfile;
    @FXML private TextField nationalIdProfile;
    @FXML private TextField phoneNumberProfile;
    @FXML private AnchorPane profileAnchorPane;
    @FXML private Button profileScrollPane;
    @FXML private AnchorPane removeStudentAnchorPane;
    @FXML private Button removeStudentScrollPane;
    @FXML private AnchorPane reportsAnchorPane;
    @FXML private Button reportsScrollPane;
    @FXML private ComboBox<String> semesterComboBoxRemoveStudent;
    @FXML private Label successLabelProfile;
    @FXML private TableView<Student> studentsTableGradeSubmission;
    @FXML private TableColumn<Student, String> statusColGradeSubmission;
    @FXML private TableColumn<Student, Void> editColGradeSubmission;
    @FXML private TableColumn<Student, String> scoreColGradeSubmission;
    @FXML private TableColumn<Student, String> studentIdColGradeSubmission;
    @FXML private TableColumn<Student, String> studentNameColGradeSubmission;
    @FXML private TableView<Student> studentsTableRemoveStudent;
    @FXML private TableColumn<Student, String> studentNameColRemoveStudent;
    @FXML private TableColumn<Student, String> studentIdColRemoveStudent;
    @FXML private TableColumn<Student, Void> dropColRemoveStudent;

    private ObservableList<Student> studentListGradeSubmission = FXCollections.observableArrayList();
    private ObservableList<Student> studentListRemoveStudent = FXCollections.observableArrayList();
    private CourseGroup currentCourseGroup;
    private String selectedGroupNumber; // To store the group ID for the selected course group (String)

    @FXML
    public void initialize() {
        // Empty as requested
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
                                                professor1.setGender(Gender.valueOf(genderProfile.getValue()));
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
                                                        professor2.setGender(Gender.valueOf(genderProfile.getValue()));
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
                                                genderProfile.getSelectionModel().select(String.valueOf(professor1.getGender()));
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

    @FXML
    private void dashboardScrollPane() {
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        }
        buttonsScrollPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);
        headerTitle.setText("");
    }

    private void semestersGradeSubmission() {
        University.loadFaculties();
        Professor professor = LoginPanelController.professorPerson;
        semesterComboBoxGradeSubmission.getItems().clear();
        semesterComboBoxGradeSubmission.getItems().add("Semester");
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
                                                if (group.getProfessor().equals(professor.getFullName()) && group.getStatus().equals(Status.Active)) {
                                                    String semesterCode = group.getSemesterCode();
                                                    if (!semesterComboBoxGradeSubmission.getItems().contains(semesterCode)) {
                                                        semesterComboBoxGradeSubmission.getItems().add(semesterCode);
                                                        System.out.println("Added semester: " + semesterCode);
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
        semesterComboBoxGradeSubmission.setVisibleRowCount(5);
        semesterComboBoxGradeSubmission.getSelectionModel().selectFirst();
        semesterComboBoxGradeSubmission.setOnAction(event -> courseGroupGradeSubmission());
    }

    private void courseGroupGradeSubmission() {
        String selectedSemester = semesterComboBoxGradeSubmission.getValue();
        Professor professor = LoginPanelController.professorPerson;
        if (selectedSemester == null || selectedSemester.equals("Semester")) {
            errorLabelGradeSubmission.setText("Select Semester");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            return;
        }
        courseGroupComboBoxGradeSubmission.getItems().clear();
        courseGroupComboBoxGradeSubmission.getItems().add("Course Group");
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
        courseGroupComboBoxGradeSubmission.setVisibleRowCount(5);
        courseGroupComboBoxGradeSubmission.getSelectionModel().selectFirst();
        if (courseGroupComboBoxGradeSubmission.getItems().size() == 1) {
            errorLabelGradeSubmission.setText("No Course Groups Found for Selected Semester");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
        } else {
            errorLabelGradeSubmission.setText(null);
        }
    }

    @FXML
    void gradeSubmissionDashboard(ActionEvent event) {
        headerTitle.setText(" --> Grade Submission");
        dashboardAnchorPane.setVisible(false);
        gradeSubmissionAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(true);
        gradeSubmissionScrollPane.getStyleClass().add("pressed");
        semestersGradeSubmission();
    }

    @FXML
    void gradeSubmissionScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Grade Submission");
        if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        }
        if (!gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(true);
            gradeSubmissionScrollPane.getStyleClass().add("pressed");
            semestersGradeSubmission();
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
    void loadStudentsGradeSubmission(ActionEvent event) {
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
        // Extract course name and group ID from selection (e.g., "Math - Group ABC123")
        String[] parts = selectedCourseGroup.split(" - Group ");
        if (parts.length < 2) {
            errorLabelGradeSubmission.setText("Invalid Course Group Format");
            errorLabelGradeSubmission.setStyle("-fx-text-fill: red;");
            System.out.println("Invalid course group format: " + selectedCourseGroup);
            return;
        }
        String selectedCourse = parts[0];
        selectedGroupNumber = parts[1]; // String ID

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

    private void semestersRemoveStudent() {
        University.loadFaculties();
        Professor professor = LoginPanelController.professorPerson;
        semesterComboBoxRemoveStudent.getItems().clear();
        semesterComboBoxRemoveStudent.getItems().add("Semester");
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
                                                if (group.getProfessor().equals(professor.getFullName()) && group.getStatus().equals(Status.Active)) {
                                                    String semesterCode = group.getSemesterCode();
                                                    if (!semesterComboBoxRemoveStudent.getItems().contains(semesterCode)) {
                                                        semesterComboBoxRemoveStudent.getItems().add(semesterCode);
                                                        System.out.println("Added semester: " + semesterCode);
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
        semesterComboBoxRemoveStudent.setVisibleRowCount(5);
        semesterComboBoxRemoveStudent.getSelectionModel().selectFirst();
        semesterComboBoxRemoveStudent.setOnAction(event -> courseGroupRemoveStudent());
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

    private void setupStudentsTableRemoveStudent() {
        studentNameColRemoveStudent.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(
                cellData.getValue().getFirst_name() + " " + cellData.getValue().getLast_name()
        ));
        studentIdColRemoveStudent.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getId()));

        dropColRemoveStudent.setCellFactory(col -> new TableCell<>() {
            private final Button dropButton = new Button("Drop");

            {
                dropButton.setStyle("-fx-background-color: #ff4444; -fx-text-fill: white;");
                dropButton.setOnAction(event -> {
                    Student student = getTableView().getItems().get(getIndex());
                    dropStudent(student);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : dropButton);
            }
        });

        studentsTableRemoveStudent.setEditable(true);
        studentsTableRemoveStudent.setItems(studentListRemoveStudent);
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
        // Extract course name and group ID from selection (e.g., "Math - Group ABC123")
        String[] parts = selectedCourseGroup.split(" - Group ");
        if (parts.length < 2) {
            messageLabelRemoveStudent.setText("Invalid Course Group Format");
            messageLabelRemoveStudent.setStyle("-fx-text-fill: red;");
            System.out.println("Invalid course group format: " + selectedCourseGroup);
            return;
        }
        String selectedCourse = parts[0];
        selectedGroupNumber = parts[1]; // String ID

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
        selectedGroupNumber = parts[1]; // String ID

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
            // Remove student from CourseGroup
            selectedGroup.getRegisteredStudents().remove(student);
            selectedGroup.getGrades().remove(student.getId());
            System.out.println("Removed student " + student.getId() + " from course group: " + selectedCourseGroup);

            // Remove CourseGroup from student's Semester
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

    @FXML
    void profileDashboard(ActionEvent event) {
        headerTitle.setText(" --> Profile");
        Professor professor = LoginPanelController.professorPerson;
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        profileAnchorPane.setVisible(true);
        profileScrollPane.getStyleClass().add("pressed");

        firstNameProfile.clear();
        firstNameProfile.setPromptText(professor.getFirst_name());
        lastNameProfile.clear();
        lastNameProfile.setPromptText(professor.getLast_name());
        nationalIdProfile.clear();
        nationalIdProfile.setPromptText(professor.getNationalId());
        phoneNumberProfile.clear();
        phoneNumberProfile.setPromptText(professor.getPhoneNumber());
        genderProfile.getItems().clear();
        genderProfile.getItems().addAll(String.valueOf(Gender.Male), String.valueOf(Gender.Female));
        genderProfile.getSelectionModel().select(String.valueOf(professor.getGender()));
        dateOfBirthProfile.setValue(null);
        dateOfBirthProfile.setPromptText(professor.getDateOfBirth().getDayOfMonth() + " " + Month.of(professor.getDateOfBirth().getMonthValue()) + " " + professor.getDateOfBirth().getYear());

        errorLabelFirstNameProfile.setText(null);
        errorLabelLastNameProfile.setText(null);
        errorLabelGenderProfile.setText(null);
        errorLabelDateOfBirthProfile.setText(null);
        errorLabelPhoneNumberProfile.setText(null);
        errorLabelNationalIdProfile.setText(null);
        errorLabelProfile.setText(null);
        successLabelProfile.setText(null);
    }

    @FXML
    void profileScrollPane(ActionEvent event) {
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        }
        if (!profileAnchorPane.isVisible()) {
            headerTitle.setText(" --> Profile");
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
            genderProfile.getItems().clear();
            genderProfile.getItems().addAll(String.valueOf(Gender.Male), String.valueOf(Gender.Female));
            genderProfile.getSelectionModel().select(String.valueOf(professor.getGender()));
            dateOfBirthProfile.setValue(null);
            dateOfBirthProfile.setPromptText(professor.getDateOfBirth().getDayOfMonth() + " " + Month.of(professor.getDateOfBirth().getMonthValue()) + " " + professor.getDateOfBirth().getYear());

            errorLabelFirstNameProfile.setText(null);
            errorLabelLastNameProfile.setText(null);
            errorLabelGenderProfile.setText(null);
            errorLabelDateOfBirthProfile.setText(null);
            errorLabelPhoneNumberProfile.setText(null);
            errorLabelNationalIdProfile.setText(null);
            errorLabelProfile.setText(null);
            successLabelProfile.setText(null);
        }
    }

    @FXML
    void removeStudentDashboard(ActionEvent event) {
        headerTitle.setText(" --> Remove Student");
        dashboardAnchorPane.setVisible(false);
        removeStudentAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(true);
        removeStudentScrollPane.getStyleClass().add("pressed");
        semestersRemoveStudent();
        setupStudentsTableRemoveStudent();
    }

    @FXML
    void removeStudentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Remove Student");
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(true);
            removeStudentScrollPane.getStyleClass().add("pressed");
            semestersRemoveStudent();
            setupStudentsTableRemoveStudent();
        }
    }

    @FXML
    void reportsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Reports");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        reportsAnchorPane.setVisible(true);
        reportsScrollPane.getStyleClass().add("pressed");
    }

    @FXML
    void reportsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Reports");
        if (gradeSubmissionAnchorPane.isVisible()) {
            gradeSubmissionAnchorPane.setVisible(false);
            gradeSubmissionScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (removeStudentAnchorPane.isVisible()) {
            removeStudentAnchorPane.setVisible(false);
            removeStudentScrollPane.getStyleClass().remove("pressed");
        }
        if (!reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(true);
            reportsScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void saveGradesGradeSubmission(ActionEvent event) {
        if (currentCourseGroup == null) {
            showAlert("Choose Course Group");
            return;
        }
        University.saveFaculties();
        showAlert("The Grades Saved Successfully");
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

    @FXML
    void signOutScrollPane(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
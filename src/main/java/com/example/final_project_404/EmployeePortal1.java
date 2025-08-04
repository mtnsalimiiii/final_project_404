package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.xml.sax.helpers.LocatorImpl;

import javax.lang.model.type.UnionType;
import java.awt.*;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.rmi.server.UID;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

public class EmployeePortal1 {

    @FXML
    private Button AddCourseGroupButton;

    @FXML
    private AnchorPane StudentsAnchorPane;

    @FXML
    private AnchorPane addCourseAnchorPane;

    @FXML
    private Button addCourseButton;

    @FXML
    private AnchorPane addCourseGroupAnchorPane;

    @FXML
    private Button addCourseGroupScrollPane;

    @FXML
    private Button addCourseScrollPane;

    @FXML
    private VBox addDegree;

    @FXML
    private AnchorPane addDegreeAnchorPane;

    @FXML
    private Button addDegreeButton;

    @FXML
    private Button addDegreeScrollPane;

    @FXML
    private Button addProfessorButton;

    @FXML
    private Button addStudentButton;

    @FXML
    private TableColumn<?, ?> ageTableviewProfessors;

    @FXML
    private TableColumn<?, ?> ageTableviewStudents;

    @FXML
    private ScrollPane buttonsScrollPane;

    @FXML
    private TextField capacityAddCourseGroup;

    @FXML
    private ComboBox<String> courseChooserAddCourseGroup;

    @FXML
    private TextField courseCreditAddCourse;

    @FXML
    private TextField courseNameAddCourse;

    @FXML
    private AnchorPane dashboardAnchorPane;

    @FXML
    private Button dashboardScrollPane;

    @FXML
    private Label dashboardText;

    @FXML
    private DatePicker dateOfBirthEditProfessor;

    @FXML
    private DatePicker dateOfBirthEditStudents;

    @FXML
    private DatePicker dateOfBirthRegisterProfessor;

    @FXML
    private DatePicker dateOfBirthRegisterStudent;

    @FXML
    private TableColumn<?, ?> dateOfJoinTableviewProfessors;

    @FXML
    private TableColumn<?, ?> dateOfJoinTableviewStudents;

    @FXML
    private Button deactiveProfessorButton;

    @FXML
    private VBox deactiveProfessorVbox;

    @FXML
    private Button deactiveStudentsButton;

    @FXML
    private VBox deactiveStudentsVbox;

    @FXML
    private ComboBox<String> degreeChooserAddCourse;

    @FXML
    private ComboBox<String> degreeChooserAddCourseGroup;

    @FXML
    private ComboBox<String> degreeChooserAddDegree;

    @FXML
    private ComboBox<String> degreeChooserRegisterStudent;

    @FXML
    private ComboBox<String> departmentChooserDeactiveProfessor;

    @FXML
    private ComboBox<String> departmentChooserDeactiveStudents;

    @FXML
    private ComboBox<String> departmentChooserEditProfessor;

    @FXML
    private ComboBox<String> departmentChooserEditStudents;

    @FXML
    private ComboBox<String> departmentChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> departmentTableviewProfessors;

    @FXML
    private TableColumn<?, ?> departmentTableviewStudents;

    @FXML
    private Button editProfessorButton;

    @FXML
    private VBox editProfessorVbox;

    @FXML
    private VBox editStudentVbox;

    @FXML
    private Button editStudentsButton;

    @FXML
    private Label errorLabelAddCourse;

    @FXML
    private Label errorLabelAddCourseGroup;

    @FXML
    private Label errorLabelAddDegree;

    @FXML
    private Label errorLabelBirthDateProfile;

    @FXML
    private Label errorLabelCapacityAddCourseGroup;

    @FXML
    private Label errorLabelCourseAddCourseGroup;

    @FXML
    private Label errorLabelCreditAddCourse;

    @FXML
    private Label errorLabelDateOfBirthRegisterProfessor;

    @FXML
    private Label errorLabelDeactiveProfessor;

    @FXML
    private Label errorLabelDeactiveStudent;

    @FXML
    private Label errorLabelDegreeAddCourse;

    @FXML
    private Label errorLabelDegreeAddCourseGroup;

    @FXML
    private Label errorLabelDegreeAddDegree;

    @FXML
    private Label errorLabelEditProfessor;

    @FXML
    private Label errorLabelEditStudent;

    @FXML
    private Label errorLabelFirstNameRegisterProfessor;

    @FXML
    private Label errorLabelFirstnameProfile;

    @FXML
    private Label errorLabelGenderProfile;

    @FXML
    private Label errorLabelGenderRegisterProfessor;

    @FXML
    private Label errorLabelLastNameRegisterProfessor;

    @FXML
    private Label errorLabelLastnameProfile;

    @FXML
    private Label errorLabelMajorAddCourse;

    @FXML
    private Label errorLabelMajorAddCourseGroup;

    @FXML
    private Label errorLabelMajorAddDegree;

    @FXML
    private Label errorLabelMajorRegisterProfessor;

    @FXML
    private Label errorLabelNameAddCourse;

    @FXML
    private Label errorLabelNationalIdProfile;

    @FXML
    private Label errorLabelNationalIdRegisterProfessor;

    @FXML
    private Label errorLabelPhoneProfile;

    @FXML
    private Label errorLabelPhoneRegisterProfessor;

    @FXML
    private Label errorLabelProfessorAddCourseGroup;

    @FXML
    private Label errorLabelRegisterProfessor;

    @FXML
    private Label errorLabelRegisterStudent;

    @FXML
    private Label errorLabelSemasterAddCourseGroup;

    @FXML
    private ComboBox<String> facultyChooserDeactiveProfessor;

    @FXML
    private ComboBox<String> facultyChooserDeactiveStudents;

    @FXML
    private ComboBox<String> facultyChooserEditProfessor;

    @FXML
    private ComboBox<String> facultyChooserEditStudents;

    @FXML
    private ComboBox<String> facultyChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> facultyTableviewProfessors;

    @FXML
    private TableColumn<?, ?> facultyTableviewStudents;

    @FXML
    private TextField firstNameEditProfessor;

    @FXML
    private TextField firstNameEditStudents;

    @FXML
    private TextField firstNameRegisterProfessor;

    @FXML
    private TextField firstNameRegisterStudent;

    @FXML
    private TableColumn<?, ?> firstNameTableviewProfessors;

    @FXML
    private TableColumn<?, ?> firstNameTableviewStudents;

    @FXML
    private ComboBox<String> genderChooserEditProfessor;

    @FXML
    private ComboBox<String> genderChooserEditStudents;

    @FXML
    private ComboBox<String> genderChooserRegisterProfessor;

    @FXML
    private ComboBox<String> genderChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> genderTableviewProfessors;

    @FXML
    private TableColumn<?, ?> genderTableviewStudents;

    @FXML
    private HBox headerHBox;

    @FXML
    private Label headerTitle;

    @FXML
    private ComboBox<String> itemChooserProfessors;

    @FXML
    private ComboBox<String> itemChooserStudents;

    @FXML
    private TextField lastNameEditProfessor;

    @FXML
    private TextField lastNameEditStudents;

    @FXML
    private TextField lastNameRegisterProfessor;

    @FXML
    private TextField lastNameRegisterStudent;

    @FXML
    private TableColumn<?, ?> lastNameTableviewProfessors;

    @FXML
    private TableColumn<?, ?> lastNameTableviewStudents;

    @FXML
    private ComboBox<String> majorChooserAddCourse;

    @FXML
    private ComboBox<String> majorChooserAddCourseGroup;

    @FXML
    private ComboBox<String> majorChooserAddDegree;

    @FXML
    private ComboBox<String> majorChooserDeactiveProfessor;

    @FXML
    private ComboBox<String> majorChooserDeactiveStudents;

    @FXML
    private ComboBox<String> majorChooserEditProfessor;

    @FXML
    private ComboBox<String> majorChooserEditStudents;

    @FXML
    private ComboBox<String> majorChooserRegisterProfessor;

    @FXML
    private ComboBox<String> majorChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> majorTableviewProfessors;

    @FXML
    private TableColumn<?, ?> majorTableviewStudents;

    @FXML
    private TableColumn<?, ?> nameTableviewProfessors;

    @FXML
    private TableColumn<?, ?> nameTableviewStudents;

    @FXML
    private TextField nationalIdEditProfessor;

    @FXML
    private TextField nationalIdEditStudents;

    @FXML
    private TextField nationalIdRegisterProfessor;

    @FXML
    private TextField nationalIdRegisterStudent;

    @FXML
    private TableColumn<?, ?> nationalIdTableviewProfessors;

    @FXML
    private TableColumn<?, ?> nationalIdTableviewStudents;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private DatePicker newDateOfBirthProfile;

    @FXML
    private TextField newFirstNameProfile;

    @FXML
    private ComboBox<Gender> newGenderProfile;

    @FXML
    private TextField newLastNameProfile;

    @FXML
    private TextField newNationalIdProfile;

    @FXML
    private TextField newPhoneNumberProfile;

    @FXML
    private ComboBox<String> operationChooserUpdateProfessor;

    @FXML
    private ComboBox<String> operationChooserUpdateStudent;

    @FXML
    private TextField phoneNumberEditProfessor;

    @FXML
    private TextField phoneNumberEditStudents;

    @FXML
    private TextField phoneNumberRegisterProfessor;

    @FXML
    private TextField phoneNumberRegisterStudent;

    @FXML
    private TableColumn<?, ?> phoneTableviewProfessors;

    @FXML
    private TableColumn<?, ?> phoneTableviewStudents;

    @FXML
    private DatePicker primaryDateProfessors;

    @FXML
    private DatePicker primaryDateStudents;

    @FXML
    private ComboBox<String> professorChooserAddCourseGroup;

    @FXML
    private ComboBox<String> professorChooserDeactiveProfessor;

    @FXML
    private ComboBox<String> professorChooserEditProfessor;

    @FXML
    private TableColumn<?, ?> professorIdTableviewProfessors;

    @FXML
    private AnchorPane professorsAnchorPane;

    @FXML
    private Button professorsScrollPane;

    @FXML
    private TableView<?> professorsTableview;

    @FXML
    private AnchorPane profileAnchorPane;

    @FXML
    private Button profileScrollPane;

    @FXML
    private AnchorPane registerProfessorAnchorPane;

    @FXML
    private Button registerProfessorScrollPane;

    @FXML
    private AnchorPane registerStudentAnchorPane;

    @FXML
    private Button registerStudentScrollPane;

    @FXML
    private AnchorPane reportsAnchorPane;

    @FXML
    private Button reportsScrollPane;

    @FXML
    private TableColumn<?, ?> rowNumberTableviewProfessors;

    @FXML
    private TableColumn<?, ?> rowNumberTableviewStudents;

    @FXML
    private TextField searchBoxProfessors;

    @FXML
    private TextField searchBoxStudents;

    @FXML
    private DatePicker secondaryDateProfessors;

    @FXML
    private DatePicker secondaryDateStudents;

    @FXML
    private ComboBox<String> semasterChooserAddCourseGroup;

    @FXML
    private ComboBox<String> studentChooserDeactiveStudents;

    @FXML
    private ComboBox<String> studentChooserEditStudents;

    @FXML
    private TableColumn<?, ?> studentIdTableviewStudents;

    @FXML
    private AnchorPane studentsAnchorPane;

    @FXML
    private Button studentsScrollPane;

    @FXML
    private TableView<?> studetnsTableview;

    @FXML
    private Label successLabelAddCourseGroup;

    @FXML
    private Label successLabelAddDegree;

    @FXML
    private Label successLabelRegisterProfessor;

    @FXML
    private Label successfulLabelAddCourse;

    @FXML
    private ComboBox<String> topicChooserProfessors;

    @FXML
    private ComboBox<String> topicChooserStudents;

    @FXML
    private AnchorPane updateProfessorAnchorPane;

    @FXML
    private Button updateProfessorScrollPane;

    @FXML
    private AnchorPane updateStudentAnchorPane;

    @FXML
    private Button updateStudentScrollPane;

    @FXML
    void addCourse(ActionEvent event) {
        String majorName = majorChooserAddCourse.getValue();
        String selectedDegree = degreeChooserAddCourse.getValue();
        String name = courseNameAddCourse.getText().trim();
        String creditStr = courseCreditAddCourse.getText().trim();
        if (majorName.equals("Major")) {
            errorLabelMajorAddCourse.setText("Choose Major");
            errorLabelAddCourse.setText("The Course Wasn't Added");
        } else {
            errorLabelMajorAddCourse.setText(null);
        }
        if (selectedDegree.equals("Degree")) {
            errorLabelDegreeAddCourse.setText("Choose Degree");
            errorLabelAddCourse.setText("The Course Wasn't Added");
        } else {
            errorLabelDegreeAddCourse.setText(null);
        }
        if (name.isEmpty()) {
            errorLabelNameAddCourse.setText("Enter Name");
            errorLabelAddCourse.setText("The Course Wasn't Added");
        } else {
            errorLabelNameAddCourse.setText(null);
        }
        if (creditStr.isEmpty()) {
            errorLabelCreditAddCourse.setText("Enter Credit");
            errorLabelAddCourse.setText("The Course Wasn't Added");
        } else {
            errorLabelCreditAddCourse.setText(null);
        }
        if (majorName != "Major" && selectedDegree != "Degree" && !name.isEmpty() && !creditStr.isEmpty()) {
            int credit;
            try {
                credit = Integer.parseInt(creditStr);
            } catch (NumberFormatException e) {
                errorLabelCreditAddCourse.setText("Just Enter Number");
                return;
            }

            University.loadFaculties();

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(LoginPanelController.employeePerson.getDepartment()) && department.getStatus().equals(Status.Active)) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorName) && major.getStatus().equals(Status.Active)) {

                                    String degreeCode = "";
                                    if (selectedDegree.equalsIgnoreCase("Bachelor")) {
                                        degreeCode = "0";
                                    } else if (selectedDegree.equalsIgnoreCase("Master")) {
                                        degreeCode = "1";
                                    } else if (selectedDegree.equalsIgnoreCase("Phd")) {
                                        degreeCode = "2";
                                    }
                                    try {
                                        for (Degree degree : major.degrees) {
                                            if (degree.getClass().getSimpleName().equalsIgnoreCase(selectedDegree)) {
                                                String id = major.getId() + degreeCode + (degree.courses.size() + 1);
                                                Course course = new Course(name, credit, id, Status.Active);
                                                if (!degree.courses.contains(course)) {
                                                    degree.courses.add(course);
                                                    University.saveFaculties();
                                                    System.out.println("Course add successful");
                                                    successfulLabelAddCourse.setText("Course Added Successfully");
                                                }
                                            }
                                        }
                                    }catch (Exception exception){
                                        errorLabelDegreeAddCourse.setText("The Selected Degree Not Found In Major");
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
    void addCourseDashboard(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Add New Course");

        addCourseAnchorPane.setVisible(true);
        addCourseScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

//        Initialize the Degree and Major combobox for Add Course

        Employee employee = LoginPanelController.employeePerson;
        for (Faculty faculty : University.allFaculties) {
            if (employee.getFaculty().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (employee.getDepartment().equals(department.getName()) && department.getStatus().equals(Status.Active)) {

                        majorChooserAddCourse.getItems().clear();
                        majorChooserAddCourse.getItems().add("Major");
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)) {
                                majorChooserAddCourse.getItems().add(major.getName());
                            }
                        }
                        majorChooserAddCourse.setVisibleRowCount(4);
                        majorChooserAddCourse.getSelectionModel().selectFirst();

                        majorChooserAddCourse.setOnAction(e -> {
                            degreeChooserAddCourse.getItems().clear();
                            degreeChooserAddCourse.getItems().add("Degree");
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserAddCourse.getValue()) && major.getStatus().equals(Status.Active)) {
                                    for (Degree degree : major.degrees) {
                                        if (degree != null) {
                                            degreeChooserAddCourse.getItems().add(degree.getClass().getSimpleName());
                                        }
                                    }
                                    break;
                                }
                            }
                            degreeChooserAddCourse.setVisibleRowCount(4);
                            degreeChooserAddCourse.getSelectionModel().selectFirst();
                        });

                        break;
                    }
                }
                break;
            }
        }
        courseNameAddCourse.clear();
        courseCreditAddCourse.clear();

        errorLabelMajorAddCourse.setText(null);
        errorLabelDegreeAddCourse.setText(null);
        errorLabelNameAddCourse.setText(null);
        errorLabelCreditAddCourse.setText(null);
        errorLabelAddCourse.setText(null);
    }

    @FXML
    void addCourseScrollPane(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Add New Course");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(true);
            addCourseScrollPane.getStyleClass().add("pressed");
        }

//        Initialize the Degree and Major combobox for Add Course

        Employee employee = LoginPanelController.employeePerson;
        for (Faculty faculty : University.allFaculties) {
            if (employee.getFaculty().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (employee.getDepartment().equals(department.getName()) && department.getStatus().equals(Status.Active)) {

                        majorChooserAddCourse.getItems().clear();
                        majorChooserAddCourse.getItems().add("Major");
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)) {
                                majorChooserAddCourse.getItems().add(major.getName());
                            }
                        }
                        majorChooserAddCourse.setVisibleRowCount(4);
                        majorChooserAddCourse.getSelectionModel().selectFirst();

                        majorChooserAddCourse.setOnAction(e -> {
                            degreeChooserAddCourse.getItems().clear();
                            degreeChooserAddCourse.getItems().add("Degree");
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserAddCourse.getValue()) && major.getStatus().equals(Status.Active)) {
                                    for (Degree degree : major.degrees) {
                                        if (degree != null) {
                                            degreeChooserAddCourse.getItems().add(degree.getClass().getSimpleName());
                                        }
                                    }
                                    break;
                                }
                            }
                            degreeChooserAddCourse.setVisibleRowCount(4);
                            degreeChooserAddCourse.getSelectionModel().selectFirst();
                        });

                        break;
                    }
                }
                break;
            }
        }
        courseNameAddCourse.clear();
        courseCreditAddCourse.clear();

        errorLabelMajorAddCourse.setText(null);
        errorLabelDegreeAddCourse.setText(null);
        errorLabelNameAddCourse.setText(null);
        errorLabelCreditAddCourse.setText(null);
        errorLabelAddCourse.setText(null); }

    @FXML
    void addCourseGroup(ActionEvent event) {
        String majorName = majorChooserAddCourseGroup.getValue();
        String selectedDegree = degreeChooserAddCourseGroup.getValue();
        String capacityGroupStr = capacityAddCourseGroup.getText().trim();
        String courseTarget = courseChooserAddCourseGroup.getValue();

        if (majorName.equals("Major")) {
            errorLabelMajorAddCourseGroup.setText("Choose Major");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        } else {
            errorLabelMajorAddCourseGroup.setText(null);
        }
        if (selectedDegree.equals("Degree")) {
            errorLabelDegreeAddCourseGroup.setText("Choose Degree");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        } else {
            errorLabelDegreeAddCourseGroup.setText(null);
        }
        if (courseTarget == null) {
            errorLabelCourseAddCourseGroup.setText("Choose Course");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        } else if (courseTarget.equals("Course")) {
            errorLabelCourseAddCourseGroup.setText("Choose Course");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        }else {
            errorLabelCourseAddCourseGroup.setText(null);
        }
        if (semasterChooserAddCourseGroup.getValue().equals("Semaster") || semasterChooserAddCourseGroup.getValue() == null) {
            errorLabelSemasterAddCourseGroup.setText("Choose Semaster");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        } else {
            errorLabelAddCourseGroup.setText(null);
        }
        if (professorChooserAddCourseGroup.getValue() == null) {
            errorLabelProfessorAddCourseGroup.setText("Choose Professsor");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        } else if (professorChooserAddCourseGroup.getValue().equals("Professor")) {
            errorLabelProfessorAddCourseGroup.setText("Choose Professsor");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        }else {
            errorLabelAddCourseGroup.setText(null);
        }
        if (capacityGroupStr.isEmpty()) {
            errorLabelCapacityAddCourseGroup.setText("Enter Capacity");
            errorLabelAddCourseGroup.setText("The CourseGroup Wasn't Added");
        } else {
            errorLabelCapacityAddCourseGroup.setText(null);
            try {
                Integer.parseInt(capacityGroupStr);
            } catch (NumberFormatException e) {
                errorLabelCapacityAddCourseGroup.setText("Just Enter Number");
                return;
            }
        }
        if (majorName != "Major" && selectedDegree != "Degree" && courseChooserAddCourseGroup.getValue() != "Course" && professorChooserAddCourseGroup.getValue() != "Professor" && semasterChooserAddCourseGroup.getValue().equals("Semaster") && !capacityGroupStr.isEmpty()) {
            int capacityGroup;
            try {
                capacityGroup = Integer.parseInt(capacityGroupStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid credit value.");
                errorLabelCapacityAddCourseGroup.setText("Just Enter Number");
                return;
            }

            University.loadFaculties();

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(LoginPanelController.employeePerson.getDepartment()) && department.getStatus().equals(Status.Active)) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorName) && major.getStatus().equals(Status.Active)) {

                                    String degreeCode;
                                    if (selectedDegree.equalsIgnoreCase("Bachelor")) {
                                        degreeCode = "0";
                                    } else if (selectedDegree.equalsIgnoreCase("Master")) {
                                        degreeCode = "1";
                                    } else if (selectedDegree.equalsIgnoreCase("Phd")) {
                                        degreeCode = "2";
                                    }
                                    try {
                                        for (Degree degree : major.degrees) {
                                            if (degree.getClass().getSimpleName().equalsIgnoreCase(selectedDegree)) {
                                                try {
                                                    for(Course course1:degree.courses){
                                                        if(courseTarget.equals(course1.getName())){
                                                            String id=course1.getId()+(course1.courseGroups.size()+1);
                                                            CourseGroup newGroup = new CourseGroup(
                                                                    professorChooserAddCourseGroup.getValue(),
                                                                    semasterChooserAddCourseGroup.getValue(),
                                                                    capacityGroup,
                                                                    id,
                                                                    Status.Active,
                                                                    new Course(course1.getName(), course1.getCredit(), course1.getId(), Status.Active)
                                                            );
                                                            course1.courseGroups.add(newGroup);
                                                            University.saveFaculties();
                                                            successLabelAddCourseGroup.setText("The CourseGroup Added Successfully");
                                                            return;
                                                        }
                                                    }
                                                }catch (Exception e){
                                                    errorLabelCourseAddCourseGroup.setText("The Selected Course Not Found In Degree");
                                                }

                                            }
                                        }

                                    }catch (Exception exception){
                                        errorLabelDegreeAddCourseGroup.setText("The Selected Degree Not Found In Major");
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
    void addCourseGroupDashboard(ActionEvent event) throws Exception {
        University.loadFaculties();
        University.loadAllSemester();
        Professor.loadAllProfessor();
        headerTitle.setText(" --> Add New Course Group");

        addCourseGroupAnchorPane.setVisible(true);
        addCourseGroupScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);


//        Initialize the Degree and Major combobox for Add Course
        capacityAddCourseGroup.clear();

        semasterChooserAddCourseGroup.getItems().clear();
        semasterChooserAddCourseGroup.getItems().add("Semaster");
        for (Semester semester : University.allSemesters){
            if(semester.getStatus()==Status.Active){
                semasterChooserAddCourseGroup.getItems().add(semester.getName());
            }
        }
        semasterChooserAddCourseGroup.setVisibleRowCount(5);
        semasterChooserAddCourseGroup.getSelectionModel().selectFirst();
        University.saveAllSemester();

        Employee employee = LoginPanelController.employeePerson;

        for (Faculty faculty : University.allFaculties) {
            if (employee.getFaculty().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (employee.getDepartment().equals(department.getName()) && department.getStatus().equals(Status.Active)) {

                        majorChooserAddCourseGroup.getItems().clear();
                        majorChooserAddCourseGroup.getItems().add("Major");
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)) {
                                majorChooserAddCourseGroup.getItems().add(major.getName());
                            }
                        }
                        majorChooserAddCourseGroup.setVisibleRowCount(5);
                        majorChooserAddCourseGroup.getSelectionModel().selectFirst();

                        majorChooserAddCourseGroup.setOnAction(e -> {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserAddCourseGroup.getValue()) && major.getStatus().equals(Status.Active)) {

                                    degreeChooserAddCourseGroup.getItems().clear();
                                    degreeChooserAddCourseGroup.getItems().add("Degree");
                                    for (Degree degree : major.degrees) {
                                        if (degree != null) {
                                            degreeChooserAddCourseGroup.getItems().add(degree.getClass().getSimpleName());
                                        }
                                    }
                                    degreeChooserAddCourseGroup.setVisibleRowCount(5);
                                    degreeChooserAddCourseGroup.getSelectionModel().selectFirst();

                                    professorChooserAddCourseGroup.getItems().clear();
                                    professorChooserAddCourseGroup.getItems().add("Professor");
                                    for (Professor prof : major.professors) {
                                        professorChooserAddCourseGroup.getItems().add(prof.getFullName());
                                    }
                                    professorChooserAddCourseGroup.setVisibleRowCount(5);
                                    professorChooserAddCourseGroup.getSelectionModel().selectFirst();

                                    degreeChooserAddCourseGroup.setOnAction(ev -> {
                                        courseChooserAddCourseGroup.getItems().clear();
                                        courseChooserAddCourseGroup.getItems().add("Course");
                                        for (Degree degree : major.degrees) {
                                            if (degree.getClass().getSimpleName().equalsIgnoreCase(degreeChooserAddCourseGroup.getValue())) {
                                                for (Course course : degree.courses) {
                                                    if (course.getStatus().equals(Status.Active)) {
                                                        courseChooserAddCourseGroup.getItems().add(course.getName());
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        courseChooserAddCourseGroup.setVisibleRowCount(5);
                                        courseChooserAddCourseGroup.getSelectionModel().selectFirst();
                                    });

                                    break;
                                }
                            }
                        });

                        break;
                    }
                }
                break;
            }
        }
        errorLabelMajorAddCourseGroup.setText(null);
        errorLabelDegreeAddCourseGroup.setText(null);
        errorLabelCourseAddCourseGroup.setText(null);
        errorLabelProfessorAddCourseGroup.setText(null);
        errorLabelSemasterAddCourseGroup.setText(null);
        errorLabelCapacityAddCourseGroup.setText(null);
        errorLabelAddCourseGroup.setText(null);
    }

    @FXML
    void addCourseGroupScrollPane(ActionEvent event) throws Exception {
        University.loadFaculties();
        University.loadAllSemester();
        Professor.loadAllProfessor();
        headerTitle.setText(" --> Add New Course Group");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(true);
            addCourseGroupScrollPane.getStyleClass().add("pressed");
        }

//        Initialize the Degree and Major combobox for Add Course
        capacityAddCourseGroup.clear();

        semasterChooserAddCourseGroup.getItems().clear();
        semasterChooserAddCourseGroup.getItems().add("Semaster");
        for (Semester semester : University.allSemesters){
            if(semester.getStatus()==Status.Active){
                semasterChooserAddCourseGroup.getItems().add(semester.getName());
            }
        }
        semasterChooserAddCourseGroup.setVisibleRowCount(5);
        semasterChooserAddCourseGroup.getSelectionModel().selectFirst();
        University.saveAllSemester();

        Employee employee = LoginPanelController.employeePerson;

        for (Faculty faculty : University.allFaculties) {
            if (employee.getFaculty().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (employee.getDepartment().equals(department.getName()) && department.getStatus().equals(Status.Active)) {

                        majorChooserAddCourseGroup.getItems().clear();
                        majorChooserAddCourseGroup.getItems().add("Major");
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)) {
                                majorChooserAddCourseGroup.getItems().add(major.getName());
                            }
                        }
                        majorChooserAddCourseGroup.setVisibleRowCount(5);
                        majorChooserAddCourseGroup.getSelectionModel().selectFirst();

                        majorChooserAddCourseGroup.setOnAction(e -> {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserAddCourseGroup.getValue()) && major.getStatus().equals(Status.Active)) {

                                    degreeChooserAddCourseGroup.getItems().clear();
                                    degreeChooserAddCourseGroup.getItems().add("Degree");
                                    for (Degree degree : major.degrees) {
                                        if (degree != null) {
                                            degreeChooserAddCourseGroup.getItems().add(degree.getClass().getSimpleName());
                                        }
                                    }
                                    degreeChooserAddCourseGroup.setVisibleRowCount(5);
                                    degreeChooserAddCourseGroup.getSelectionModel().selectFirst();

                                    professorChooserAddCourseGroup.getItems().clear();
                                    professorChooserAddCourseGroup.getItems().add("Professor");
                                    for (Professor prof : major.professors) {
                                        professorChooserAddCourseGroup.getItems().add(prof.getFullName());
                                    }
                                    professorChooserAddCourseGroup.setVisibleRowCount(5);
                                    professorChooserAddCourseGroup.getSelectionModel().selectFirst();

                                    degreeChooserAddCourseGroup.setOnAction(ev -> {
                                        courseChooserAddCourseGroup.getItems().clear();
                                        courseChooserAddCourseGroup.getItems().add("Course");
                                        for (Degree degree : major.degrees) {
                                            if (degree.getClass().getSimpleName().equalsIgnoreCase(degreeChooserAddCourseGroup.getValue())) {
                                                for (Course course : degree.courses) {
                                                    if (course.getStatus().equals(Status.Active)) {
                                                        courseChooserAddCourseGroup.getItems().add(course.getName());
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        courseChooserAddCourseGroup.setVisibleRowCount(5);
                                        courseChooserAddCourseGroup.getSelectionModel().selectFirst();
                                    });

                                    break;
                                }
                            }
                        });

                        break;
                    }
                }
                break;
            }
        }
        errorLabelMajorAddCourseGroup.setText(null);
        errorLabelDegreeAddCourseGroup.setText(null);
        errorLabelCourseAddCourseGroup.setText(null);
        errorLabelProfessorAddCourseGroup.setText(null);
        errorLabelSemasterAddCourseGroup.setText(null);
        errorLabelCapacityAddCourseGroup.setText(null);
        errorLabelAddCourseGroup.setText(null);
    }

    @FXML
    void addDegree(ActionEvent event) {
        Degree degree = null;
        University.loadFaculties();
        Employee employee = LoginPanelController.employeePerson;

        if (majorChooserAddDegree.getValue().equals("Major") || majorChooserAddDegree.getValue().isEmpty()) {
            errorLabelMajorAddDegree.setText("Choose Major");
            errorLabelAddDegree.setText("The Degree Wasn't Added");
        } else {
            errorLabelMajorAddDegree.setText(null);
        }
        if (degreeChooserAddDegree.getValue().equals("Degree") || degreeChooserAddDegree.getValue().isEmpty()) {
            errorLabelDegreeAddDegree.setText("Choose Degree");
            errorLabelAddDegree.setText("The Degree Wasn't Added");
        } else {
            errorLabelDegreeAddDegree.setText(null);
        }

        if (!degreeChooserAddDegree.getValue().isEmpty() && !majorChooserAddDegree.getValue().isEmpty()) {
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserAddDegree.getValue()) && major.getStatus().equals(Status.Active)) {
                                    String selectedDegree = degreeChooserAddDegree.getValue();
                                    if ("Bachelor".equals(selectedDegree)) {
                                        degree = new Bachelor();
                                    } else if ("Master".equals(selectedDegree)) {
                                        degree = new Master();
                                    } else if ("Phd".equals(selectedDegree)) {
                                        degree = new Phd();
                                    }
                                    if (major.degrees.contains(degree)){
                                        major.degrees.add(degree);
                                        University.saveFaculties();
                                        successLabelAddDegree.setText("The Selected Degree Added Successfully");
                                    } else {
                                        errorLabelAddDegree.setText("The Selected Degree Has Already Been Added");
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
    void addDegreeDashboard(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Add New Degree");

        addDegreeAnchorPane.setVisible(true);
        addDegreeScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
//        Initialize the Major and Degree combobox for Add Degree
        Employee employee = LoginPanelController.employeePerson;

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        majorChooserAddDegree.getItems().clear();
                        majorChooserAddDegree.getItems().add("Major");
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)){
                                majorChooserAddDegree.getItems().add(major.getName());
                            }
                        }
                        majorChooserAddDegree.setVisibleRowCount(4);
                        majorChooserAddDegree.getSelectionModel().selectFirst();
                        break;
                    }
                }
                break;
            }
        }
        degreeChooserAddDegree.getItems().clear();
        degreeChooserAddDegree.getItems().addAll("Degree", "Bachelor", "Master", "Phd");
        degreeChooserAddDegree.setVisibleRowCount(4);
        degreeChooserAddDegree.getSelectionModel().selectFirst();

        errorLabelMajorAddDegree.setText(null);
        errorLabelDegreeAddDegree.setText(null);
        errorLabelAddDegree.setText(null);
    }

    @FXML
    void addDegreeScrollPane(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Add New Degree");

        if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(true);
            addDegreeScrollPane.getStyleClass().add("pressed");
        }
//        Initialize the Major and Degree combobox for Add Degree
        Employee employee = LoginPanelController.employeePerson;

        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        majorChooserAddDegree.getItems().clear();
                        majorChooserAddDegree.getItems().add("Major");
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)){
                                majorChooserAddDegree.getItems().add(major.getName());
                            }
                        }
                        majorChooserAddDegree.setVisibleRowCount(4);
                        majorChooserAddDegree.getSelectionModel().selectFirst();
                        break;
                    }
                }
                break;
            }
        }
        degreeChooserAddDegree.getItems().clear();
        degreeChooserAddDegree.getItems().addAll("Degree", "Bachelor", "Master", "Phd");
        degreeChooserAddDegree.setVisibleRowCount(4);
        degreeChooserAddDegree.getSelectionModel().selectFirst();

        errorLabelMajorAddDegree.setText(null);
        errorLabelDegreeAddDegree.setText(null);
        errorLabelAddDegree.setText(null);
    }

    @FXML
    void addProfessor(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();
        boolean confirmation = true;


        if (firstNameRegisterProfessor.getText().isEmpty()) {
            errorLabelFirstNameRegisterProfessor.setText("Enter First Name");
            errorLabelRegisterProfessor.setText("The Professor Wasn't Registered");
            confirmation = false;
        } else {
            errorLabelFirstNameRegisterProfessor.setText(null);
        }
        if (lastNameRegisterProfessor.getText().isEmpty()) {
            errorLabelLastNameRegisterProfessor.setText("Enter Last Name");
            errorLabelRegisterProfessor.setText("The Professor Wasn't Registered");
            confirmation = false;
        } else {
            errorLabelLastNameRegisterProfessor.setText(null);
        }
        if (phoneNumberRegisterProfessor.getText().isEmpty()) {
            errorLabelPhoneRegisterProfessor.setText("Enter Phone Number");
            errorLabelRegisterProfessor.setText("The Professor Wasn't Registered");
            confirmation = false;
        } else {
            errorLabelPhoneRegisterProfessor.setText(null);
            try{
                long phone = Long.parseLong(phoneNumberRegisterProfessor.getText());
                if (phoneNumberRegisterProfessor.getText().length() != 11) {
                    errorLabelPhoneRegisterProfessor.setText("Enter 11 digit");
                    confirmation = false;
                } else if (!phoneNumberRegisterProfessor.getText().startsWith("09")) {
                    errorLabelPhoneRegisterProfessor.setText("Wrong Format (09....)");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelPhoneRegisterProfessor.setText("Enter Just Number");
                confirmation = false;
            }
        }
        if (nationalIdRegisterProfessor.getText().isEmpty()) {
            errorLabelNationalIdRegisterProfessor.setText("Enter National ID");
            errorLabelRegisterProfessor.setText("The Professor Wasn't Registered");
            confirmation = false;
        } else {
            errorLabelNationalIdRegisterProfessor.setText(null);
            try {
                long nationalid = Integer.parseInt(nationalIdRegisterProfessor.getText());
                if (nationalIdRegisterProfessor.getText().length() != 10) {
                    errorLabelNationalIdRegisterProfessor.setText("Enter 10 digit");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelNationalIdRegisterProfessor.setText("Enter Just Number");
                confirmation = false;
            }
        }
        if (genderChooserRegisterProfessor.getValue().equals("Gender") || genderChooserRegisterProfessor.getValue().isEmpty()) {
            errorLabelGenderRegisterProfessor.setText("Choose Gender");
            errorLabelRegisterProfessor.setText("The Professor Wasn't Registered");
            confirmation = false;
        } else {
            errorLabelGenderRegisterProfessor.setText(null);
        }
        if (majorChooserRegisterProfessor.getValue().equals("Major") || majorChooserRegisterProfessor.getValue().isEmpty()) {
            errorLabelMajorRegisterProfessor.setText("Choose Major");
            errorLabelRegisterProfessor.setText("The Professor Wasn't Registered");
            confirmation = false;
        } else {
            errorLabelMajorRegisterProfessor.setText(null);
        }
        if (dateOfBirthRegisterProfessor == null) {
            errorLabelDateOfBirthRegisterProfessor.setText("Choose Date Of Birth");
            errorLabelRegisterProfessor.setText("The Professor Wasn't Registered");
            confirmation = false;
        } else {
            errorLabelDateOfBirthRegisterProfessor.setText(null);
        }
        if (confirmation) {
            Date dateOfBirth = getDateOfBirthRegisterProfessor();
            String firstName = firstNameRegisterProfessor.getText().trim();
            String lastName = lastNameRegisterProfessor.getText().trim();
            String phoneNumber = phoneNumberRegisterProfessor.getText().trim();
            String nationalId = nationalIdRegisterProfessor.getText().trim();
            String gender = genderChooserRegisterProfessor.getValue();
            String major = majorChooserRegisterProfessor.getValue();
            Date dateOfHire = getDateOfHireRegisterProfessor();
            String professorId = "PRO"+(University.allProfessors.size()+1);
            if (!firstName.isBlank() && !lastName.isBlank() && !phoneNumber.isBlank() && !nationalId.isBlank() && gender!=null && major!=null) {
                Employee employee = LoginPanelController.employeePerson;
                Professor professor = new Professor(firstName, lastName, dateOfBirth, nationalId, Gender.valueOf(gender), phoneNumber, professorId, dateOfHire, employee.getFaculty(), employee.getDepartment(), major, Status.Active);

                for (Faculty faculty1 : University.allFaculties) {
                    if (faculty1.getFacultyName().equals(employee.getFaculty()) && faculty1.getStatus().equals(Status.Active)) {
                        for (Department department1 : faculty1.departments) {
                            if (department1.getName().equals(employee.getDepartment()) && department1.getStatus().equals(Status.Active)) {
                                for (Major major1 : department1.majors) {
                                    if (!major1.professors.contains(professor) && major1.getStatus().equals(Status.Active)) {
                                        major1.professors.add(professor);
                                        University.saveFaculties();
                                        University.allProfessors.add(professor);
                                        Professor.saveAllProfessor();
                                        errorLabelRegisterProfessor.setText(null);
                                        successLabelRegisterProfessor.setText("The Professor Registered Successfully");
                                    } else {
                                        System.out.println("The Professor Has Registered Earlier.");
                                        errorLabelRegisterProfessor.setText("The Professor Has Been Registered");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }

                System.out.println("successful\nID: " + professorId);
                System.out.println("password: " + nationalId);
                System.out.println();
                System.out.println(firstName + " " + lastName);
                System.out.println(phoneNumber);
                System.out.println(nationalId);
                System.out.println(gender);
                System.out.println(employee.getFaculty());
                System.out.println(employee.getDepartment());
                System.out.println(major);
            }
        } else {
            System.out.println("Please Fill All Fields!");
            errorLabelRegisterProfessor.setText("Fill All Fields");
        }
    }

    private Date getDateOfHireRegisterProfessor(){
        Date date = new Date();
        date.setYear(LocalDate.now().getYear());
        date.setMonth(LocalDate.now().getMonthValue());
        date.setDay(LocalDate.now().getDayOfMonth());
        return date;
    }
    private Date getDateOfBirthRegisterProfessor() {
        Date dateOfBirth = new Date();
        dateOfBirth.setYear(dateOfBirthRegisterProfessor.getValue().getYear());
        dateOfBirth.setMonth(dateOfBirthRegisterProfessor.getValue().getMonthValue());
        dateOfBirth.setDay(dateOfBirthRegisterProfessor.getValue().getDayOfMonth());
        return dateOfBirth;
    }

    @FXML
    void addStudent(ActionEvent event) {

    }

    @FXML
    void changeProfile(ActionEvent event) {

    }

    @FXML
    void dashboardScrollPane(ActionEvent event) {
        dashboardAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(false);
        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
    }

    @FXML
    void deactiveProfessor(ActionEvent event) {

    }

    @FXML
    void deactiveStudent(ActionEvent event) {

    }

    @FXML
    void editProfessor(ActionEvent event) {

    }

    @FXML
    void editStudent(ActionEvent event) {

    }

    @FXML
    void professorsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Professors");

        professorsAnchorPane.setVisible(true);
        professorsScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

        topicChooserProfessors.getItems().clear();
        topicChooserProfessors.getItems().addAll("what topic do you want search:", "First Name", "Last Name", "Age", "Gender", "Phone Number", "National ID", "Professor ID", "Date of Registration", "Faculty", "Department", "Major");
        topicChooserProfessors.setVisibleRowCount(5);
        topicChooserProfessors.getSelectionModel().selectFirst();

        searchBoxProfessors.clear();
        searchBoxProfessors.setVisible(false);

        itemChooserProfessors.setVisible(false);

        primaryDateProfessors.setVisible(false);
        secondaryDateProfessors.setVisible(false);
    }

    @FXML
    void professorsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Professors");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(true);
            professorsScrollPane.getStyleClass().add("pressed");
        }

        topicChooserProfessors.getItems().clear();
        topicChooserProfessors.getItems().addAll("what topic do you want search:", "First Name", "Last Name", "Age", "Gender", "Phone Number", "National ID", "Professor ID", "Date of Registration", "Faculty", "Department", "Major");
        topicChooserProfessors.setVisibleRowCount(5);
        topicChooserProfessors.getSelectionModel().selectFirst();

        searchBoxProfessors.clear();
        searchBoxProfessors.setVisible(false);

        itemChooserProfessors.setVisible(false);

        primaryDateProfessors.setVisible(false);
        secondaryDateProfessors.setVisible(false);

    }

    @FXML
    void profileDashboard(ActionEvent event) {
        University.loadFaculties();
        Employee.loadAllEmployee();
        Employee employee = LoginPanelController.employeePerson;
        headerTitle.setText(" --> Profile");

        profileAnchorPane.setVisible(true);
        profileScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

        newFirstNameProfile.clear();
        newFirstNameProfile.setPromptText(employee.getFirst_name());

        newLastNameProfile.clear();
        newLastNameProfile.setPromptText(employee.getLast_name());

        newGenderProfile.getItems().clear();
        newGenderProfile.getItems().addAll(Gender.Male, Gender.Female);
        newGenderProfile.setPromptText(employee.getGender().toString());

        newPhoneNumberProfile.clear();
        newPhoneNumberProfile.setPromptText(employee.getPhoneNumber());

        newNationalIdProfile.clear();
        newNationalIdProfile.setPromptText(employee.getNationalId());

        newDateOfBirthProfile.setPromptText(employee.getDateOfBirth().getDay() + " " + Month.of(employee.getDateOfBirth().getMonth()) + " " + employee.getDateOfBirth().getYear()); // must work on dates of Date

    }

    @FXML
    void profileScrollPane(ActionEvent event) {
        University.loadFaculties();
        Employee.loadAllEmployee();
        Employee employee = LoginPanelController.employeePerson;
        headerTitle.setText(" --> Profile");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(true);
            profileScrollPane.getStyleClass().add("pressed");
        }

        newFirstNameProfile.clear();
        newFirstNameProfile.setPromptText(employee.getFirst_name());

        newLastNameProfile.clear();
        newLastNameProfile.setPromptText(employee.getLast_name());

        newGenderProfile.getItems().clear();
        newGenderProfile.getItems().addAll(Gender.Male, Gender.Female);
        newGenderProfile.setPromptText(employee.getGender().toString());

        newPhoneNumberProfile.clear();
        newPhoneNumberProfile.setPromptText(employee.getPhoneNumber());

        newNationalIdProfile.clear();
        newNationalIdProfile.setPromptText(employee.getNationalId());

        newDateOfBirthProfile.setPromptText(employee.getDateOfBirth().getDay() + " " + Month.of(employee.getDateOfBirth().getMonth()) + " " + employee.getDateOfBirth().getYear()); // must work on dates of Date
    }

    @FXML
    void registerProfessorDashboard(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Register New Professor");

        registerProfessorAnchorPane.setVisible(true);
        registerProfessorScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

//        Initialize
        firstNameRegisterProfessor.clear();
        lastNameRegisterProfessor.clear();
        phoneNumberRegisterProfessor.clear();
        nationalIdRegisterProfessor.clear();
        dateOfBirthRegisterProfessor.setValue(null);
        dateOfBirthRegisterProfessor.setPromptText("Date of Birth");

        genderChooserRegisterProfessor.getItems().clear();
        genderChooserRegisterProfessor.getItems().addAll("Gender", String.valueOf(Gender.Male), String.valueOf(Gender.Female));
        genderChooserRegisterProfessor.setVisibleRowCount(3);
        genderChooserRegisterProfessor.getSelectionModel().selectFirst();


        majorChooserRegisterProfessor.getItems().clear();
        majorChooserRegisterProfessor.getItems().add("Major");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(LoginPanelController.employeePerson.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)) {
                                majorChooserRegisterProfessor.getItems().add(major.getName());
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        majorChooserRegisterProfessor.setVisibleRowCount(5);
        majorChooserRegisterProfessor.getSelectionModel().selectFirst();
    }

    @FXML
    void registerProfessorScrollPane(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Register New Professor");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(true);
            registerProfessorScrollPane.getStyleClass().add("pressed");
        }

//        Initialize
        firstNameRegisterProfessor.clear();
        lastNameRegisterProfessor.clear();
        phoneNumberRegisterProfessor.clear();
        nationalIdRegisterProfessor.clear();
        dateOfBirthRegisterProfessor.setValue(null);
        dateOfBirthRegisterProfessor.setPromptText("Date of Birth");

        genderChooserRegisterProfessor.getItems().clear();
        genderChooserRegisterProfessor.getItems().addAll("Gender", String.valueOf(Gender.Male), String.valueOf(Gender.Female));
        genderChooserRegisterProfessor.setVisibleRowCount(3);
        genderChooserRegisterProfessor.getSelectionModel().selectFirst();

        majorChooserRegisterProfessor.getItems().clear();
        majorChooserRegisterProfessor.getItems().add("Major");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(LoginPanelController.employeePerson.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(LoginPanelController.employeePerson.getDepartment()) && department.getStatus().equals(Status.Active)) {
                        for (Major major : department.majors) {
                            if (major.getStatus().equals(Status.Active)) {
                                majorChooserRegisterProfessor.getItems().add(major.getName());
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        majorChooserRegisterProfessor.setVisibleRowCount(5);
        majorChooserRegisterProfessor.getSelectionModel().selectFirst();
    }

    @FXML
    void registerStudentDashboard(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Register New Student");

        registerStudentAnchorPane.setVisible(true);
        registerStudentScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
//        Initialize

        firstNameRegisterStudent.clear();
        lastNameRegisterStudent.clear();
        phoneNumberRegisterStudent.clear();
        nationalIdRegisterStudent.clear();
        dateOfBirthRegisterStudent.setValue(null);
        dateOfBirthRegisterStudent.setPromptText("Date of Birth");

        genderChooserRegisterStudent.getItems().clear();
        genderChooserRegisterStudent.getItems().addAll("Gender", String.valueOf(Gender.Male), String.valueOf(Gender.Female));

        facultyChooserRegisterStudent.getItems().clear();
        facultyChooserRegisterStudent.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)) {
                facultyChooserRegisterStudent.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserRegisterStudent.setVisibleRowCount(5);
        facultyChooserRegisterStudent.getSelectionModel().selectFirst();

        facultyChooserRegisterStudent.setOnAction(event1 -> {
            departmentChooserRegisterStudent.getItems().clear();
            departmentChooserRegisterStudent.getItems().add("Department");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserRegisterStudent.getValue())) {
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active)) {
                            departmentChooserRegisterStudent.getItems().add(department.getName());
                        }
                    }
                    break;
                }
            }
            departmentChooserRegisterStudent.setVisibleRowCount(5);
            departmentChooserRegisterStudent.getSelectionModel().selectFirst();
        });

        departmentChooserRegisterStudent.setOnAction(event1 -> {
            majorChooserRegisterStudent.getItems().clear();
            majorChooserRegisterStudent.getItems().add("Major");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserRegisterStudent.getValue())) {
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserRegisterStudent.getValue())) {
                            for (Major major : department.majors) {
                                if (major.getStatus().equals(Status.Active)) {
                                    majorChooserRegisterStudent.getItems().add(major.getName());
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            majorChooserRegisterStudent.setVisibleRowCount(5);
            majorChooserRegisterStudent.getSelectionModel().selectFirst();
        });

        majorChooserRegisterStudent.setOnAction(event1 -> {
            degreeChooserRegisterStudent.getItems().clear();
            degreeChooserRegisterStudent.getItems().addAll("Degree", "Bachelor", "Master", "PHD");
            degreeChooserRegisterStudent.setVisibleRowCount(4);
            degreeChooserRegisterStudent.getSelectionModel().selectFirst();
        });
    }

    @FXML
    void registerStudentScrollPane(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Register New Student");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(true);
            registerStudentScrollPane.getStyleClass().add("pressed");
        }

//        Initialize

        firstNameRegisterStudent.clear();
        lastNameRegisterStudent.clear();
        phoneNumberRegisterStudent.clear();
        nationalIdRegisterStudent.clear();
        dateOfBirthRegisterStudent.setValue(null);
        dateOfBirthRegisterStudent.setPromptText("Date of Birth");

        genderChooserRegisterStudent.getItems().clear();
        genderChooserRegisterStudent.getItems().addAll("Gender", String.valueOf(Gender.Male), String.valueOf(Gender.Female));

        facultyChooserRegisterStudent.getItems().clear();
        facultyChooserRegisterStudent.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)) {
                facultyChooserRegisterStudent.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserRegisterStudent.setVisibleRowCount(5);
        facultyChooserRegisterStudent.getSelectionModel().selectFirst();

        facultyChooserRegisterStudent.setOnAction(event1 -> {
            departmentChooserRegisterStudent.getItems().clear();
            departmentChooserRegisterStudent.getItems().add("Department");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserRegisterStudent.getValue())) {
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active)) {
                            departmentChooserRegisterStudent.getItems().add(department.getName());
                        }
                    }
                    break;
                }
            }
            departmentChooserRegisterStudent.setVisibleRowCount(5);
            departmentChooserRegisterStudent.getSelectionModel().selectFirst();
        });

        departmentChooserRegisterStudent.setOnAction(event1 -> {
            majorChooserRegisterStudent.getItems().clear();
            majorChooserRegisterStudent.getItems().add("Major");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserRegisterStudent.getValue())) {
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserRegisterStudent.getValue())) {
                            for (Major major : department.majors) {
                                if (major.getStatus().equals(Status.Active)) {
                                    majorChooserRegisterStudent.getItems().add(major.getName());
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            majorChooserRegisterStudent.setVisibleRowCount(5);
            majorChooserRegisterStudent.getSelectionModel().selectFirst();
        });

        majorChooserRegisterStudent.setOnAction(event1 -> {
            degreeChooserRegisterStudent.getItems().clear();
            degreeChooserRegisterStudent.getItems().addAll("Degree", "Bachelor", "Master", "PHD");
            degreeChooserRegisterStudent.setVisibleRowCount(4);
            degreeChooserRegisterStudent.getSelectionModel().selectFirst();
        });
    }

    @FXML
    void reportsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Reports");

        reportsAnchorPane.setVisible(true);
        reportsScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void reportsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Reports");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        }
        if (!reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(true);
            reportsScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void setOperationChooserUpdateProfessor(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();
        if (operationChooserUpdateProfessor.getValue() != null) {
            if (operationChooserUpdateProfessor.getValue().equals("Edit")) {
                editProfessorVbox.setVisible(true);
                deactiveProfessorVbox.setVisible(false);

                firstNameEditProfessor.clear();
                lastNameEditProfessor.clear();
                phoneNumberEditProfessor.clear();
                nationalIdEditProfessor.clear();
                dateOfBirthEditProfessor.setValue(null);

                facultyChooserEditProfessor.getItems().clear();
                facultyChooserEditProfessor.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserEditProfessor.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserEditProfessor.setVisibleRowCount(5);
                facultyChooserEditProfessor.getSelectionModel().selectFirst();

                facultyChooserEditProfessor.setOnAction(event1 -> {
                    departmentChooserEditProfessor.getItems().clear();
                    departmentChooserEditProfessor.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserEditProfessor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserEditProfessor.getItems().add(department.getName());
                                }
                            }
                            break;
                        }
                    }
                    departmentChooserEditProfessor.setVisibleRowCount(5);
                    departmentChooserEditProfessor.getSelectionModel().selectFirst();
                });

                departmentChooserEditProfessor.setOnAction(event1 -> {
                    majorChooserEditProfessor.getItems().clear();
                    majorChooserEditProfessor.getItems().add("Major");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserEditProfessor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserEditProfessor.getValue())) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserEditProfessor.getItems().add(major.getName());
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    majorChooserEditProfessor.setVisibleRowCount(5);
                    majorChooserEditProfessor.getSelectionModel().selectFirst();
                });

                majorChooserEditProfessor.setOnAction(event1 -> {
                    professorChooserEditProfessor.getItems().clear();
                    professorChooserEditProfessor.getItems().add("Professor");
                    for (Professor professor : University.allProfessors) {
                        if (professor.getStatus().equals(Status.Active) && majorChooserEditProfessor.getValue().equals(professor.getMajor())) {
                            professorChooserEditProfessor.getItems().add(professor.getFullName());
                        }
                    }
                    professorChooserEditProfessor.setVisibleRowCount(5);
                    professorChooserEditProfessor.getSelectionModel().selectFirst();
                });

                genderChooserEditProfessor.getItems().clear();
                genderChooserEditProfessor.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
                genderChooserEditProfessor.setVisibleRowCount(3);
                genderChooserEditProfessor.getSelectionModel().selectFirst();


            } else if (operationChooserUpdateProfessor.getValue().equals("Deactive")) {


                editProfessorVbox.setVisible(false);
                deactiveProfessorVbox.setVisible(true);


                facultyChooserDeactiveProfessor.getItems().clear();
                facultyChooserDeactiveProfessor.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserDeactiveProfessor.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserDeactiveProfessor.setVisibleRowCount(5);
                facultyChooserDeactiveProfessor.getSelectionModel().selectFirst();

                facultyChooserDeactiveProfessor.setOnAction(event1 -> {
                    departmentChooserDeactiveProfessor.getItems().clear();
                    departmentChooserDeactiveProfessor.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserDeactiveProfessor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserDeactiveProfessor.getItems().add(department.getName());
                                }
                            }
                            break;
                        }
                    }
                    departmentChooserDeactiveProfessor.setVisibleRowCount(5);
                    departmentChooserDeactiveProfessor.getSelectionModel().selectFirst();
                });

                departmentChooserDeactiveProfessor.setOnAction(event1 -> {
                    majorChooserDeactiveProfessor.getItems().clear();
                    majorChooserDeactiveProfessor.getItems().add("Major");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserDeactiveProfessor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserDeactiveProfessor.getValue())) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserDeactiveProfessor.getItems().add(major.getName());
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    majorChooserDeactiveProfessor.setVisibleRowCount(5);
                    majorChooserDeactiveProfessor.getSelectionModel().selectFirst();
                });

                majorChooserDeactiveProfessor.setOnAction(event1 -> {
                    professorChooserDeactiveProfessor.getItems().clear();
                    professorChooserDeactiveProfessor.getItems().add("Professor");
                    for (Professor professor : University.allProfessors) {
                        if (professor.getStatus().equals(Status.Active) && majorChooserDeactiveProfessor.getValue().equals(professor.getMajor())) {
                            professorChooserDeactiveProfessor.getItems().add(professor.getFullName());
                        }
                    }
                    professorChooserDeactiveProfessor.setVisibleRowCount(5);
                    professorChooserDeactiveProfessor.getSelectionModel().selectFirst();
                });

            }
        }
    }

    @FXML
    void setOperationChooserUpdateStudent(ActionEvent event) {
        University.loadFaculties();
        Student.loadAllStudents();
        if (operationChooserUpdateStudent.getValue() != null) {
            if (operationChooserUpdateStudent.getValue().equals("Edit")) {
                editStudentVbox.setVisible(true);
                deactiveStudentsVbox.setVisible(false);

                firstNameEditStudents.clear();
                lastNameEditStudents.clear();
                phoneNumberEditStudents.clear();
                nationalIdEditStudents.clear();
                dateOfBirthEditStudents.setValue(null);

                facultyChooserEditStudents.getItems().clear();
                facultyChooserEditStudents.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserEditStudents.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserEditStudents.setVisibleRowCount(5);
                facultyChooserEditStudents.getSelectionModel().selectFirst();

                facultyChooserEditStudents.setOnAction(event1 -> {
                    departmentChooserEditStudents.getItems().clear();
                    departmentChooserEditStudents.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserEditStudents.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserEditStudents.getItems().add(department.getName());
                                }
                            }
                            break;
                        }
                    }
                    departmentChooserEditStudents.setVisibleRowCount(5);
                    departmentChooserEditStudents.getSelectionModel().selectFirst();
                });

                departmentChooserEditStudents.setOnAction(event1 -> {
                    majorChooserEditStudents.getItems().clear();
                    majorChooserEditStudents.getItems().add("Major");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserEditStudents.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserEditStudents.getValue())) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserEditStudents.getItems().add(major.getName());
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    majorChooserEditStudents.setVisibleRowCount(5);
                    majorChooserEditStudents.getSelectionModel().selectFirst();
                });

                majorChooserEditStudents.setOnAction(event1 -> {
                    studentChooserEditStudents.getItems().clear();
                    studentChooserEditStudents.getItems().add("Professor");
                    for (Student student : University.allStudents) {
                        if (student.getStatus().equals(Status.Active) && majorChooserEditStudents.getValue().equals(student.getMajor())) {
                            studentChooserEditStudents.getItems().add(student.getFullName());
                        }
                    }
                    studentChooserEditStudents.setVisibleRowCount(5);
                    studentChooserEditStudents.getSelectionModel().selectFirst();
                });

                genderChooserEditStudents.getItems().clear();
                genderChooserEditStudents.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
                genderChooserEditStudents.setVisibleRowCount(3);
                genderChooserEditStudents.getSelectionModel().selectFirst();


            } else if (operationChooserUpdateStudent.getValue().equals("Deactive")) {


                editStudentVbox.setVisible(false);
                deactiveStudentsVbox.setVisible(true);


                facultyChooserDeactiveStudents.getItems().clear();
                facultyChooserDeactiveStudents.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserDeactiveStudents.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserDeactiveStudents.setVisibleRowCount(5);
                facultyChooserDeactiveStudents.getSelectionModel().selectFirst();

                facultyChooserDeactiveStudents.setOnAction(event1 -> {
                    departmentChooserDeactiveStudents.getItems().clear();
                    departmentChooserDeactiveStudents.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserDeactiveStudents.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserDeactiveStudents.getItems().add(department.getName());
                                }
                            }
                            break;
                        }
                    }
                    departmentChooserDeactiveStudents.setVisibleRowCount(5);
                    departmentChooserDeactiveStudents.getSelectionModel().selectFirst();
                });

                departmentChooserDeactiveStudents.setOnAction(event1 -> {
                    majorChooserDeactiveStudents.getItems().clear();
                    majorChooserDeactiveStudents.getItems().add("Major");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserDeactiveStudents.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserDeactiveStudents.getValue())) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserDeactiveStudents.getItems().add(major.getName());
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    majorChooserDeactiveStudents.setVisibleRowCount(5);
                    majorChooserDeactiveStudents.getSelectionModel().selectFirst();
                });

                majorChooserDeactiveStudents.setOnAction(event1 -> {
                    studentChooserDeactiveStudents.getItems().clear();
                    studentChooserDeactiveStudents.getItems().add("Professor");
                    for (Student student : University.allStudents) {
                        if (student.getStatus().equals(Status.Active) && majorChooserDeactiveStudents.getValue().equals(student.getMajor())) {
                            studentChooserDeactiveStudents.getItems().add(student.getFullName());
                        }
                    }
                    studentChooserDeactiveStudents.setVisibleRowCount(5);
                    studentChooserDeactiveStudents.getSelectionModel().selectFirst();
                });

            }
        }
    }

    @FXML
    void setProfessorChooserDeactive(ActionEvent event) {

    }

    @FXML
    void setProfessorEdit(ActionEvent event) {

    }

    @FXML
    void setStudentChooserDeactive(ActionEvent event) {

    }

    @FXML
    void setStudentEdit(ActionEvent event) {

    }

    @FXML
    void setTopicChooserProfessors(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();

        if (topicChooserProfessors.getValue().equals("First Name") || topicChooserProfessors.getValue().equals("Last Name") || topicChooserProfessors.getValue().equals("Age") || topicChooserProfessors.getValue().equals("Phone Number") || topicChooserProfessors.getValue().equals("National ID")) {
            searchBoxProfessors.setVisible(true);
            primaryDateProfessors.setVisible(false);
            secondaryDateProfessors.setVisible(false);
            itemChooserProfessors.setVisible(false);

            searchBoxProfessors.setPromptText("Enter " + topicChooserProfessors.getValue());

        } else if (topicChooserProfessors.getValue().equals("Gender") || topicChooserProfessors.getValue().equals("Professor ID") || topicChooserProfessors.getValue().equals("Faculty") || topicChooserProfessors.getValue().equals("Department") || topicChooserProfessors.getValue().equals("Major")) {
            itemChooserProfessors.setVisible(true);
            searchBoxProfessors.setVisible(false);
            primaryDateProfessors.setVisible(false);
            secondaryDateProfessors.setVisible(false);

            itemChooserProfessors.setPromptText("Choose " + topicChooserProfessors.getValue());

            if (topicChooserProfessors.getValue().equals("Gender")){
                itemChooserProfessors.getItems().clear();
                itemChooserProfessors.getItems().addAll("Male", "Female");
                itemChooserProfessors.setPromptText("Gender");
                itemChooserProfessors.setVisibleRowCount(2);
            } else if (topicChooserProfessors.getValue().equals("Professor ID")){
                itemChooserProfessors.getItems().clear();
                for (Professor professor : University.allProfessors){
                    if (professor.getStatus().equals(Status.Active)){
                        itemChooserProfessors.getItems().add(professor.getId());
                    }
                }
                itemChooserProfessors.setVisibleRowCount(5);
            } else if (topicChooserProfessors.getValue().equals("Faculty")){
                itemChooserProfessors.getItems().clear();
                for (Faculty faculty : University.allFaculties){
                    if (faculty.getStatus().equals(Status.Active)){
                        itemChooserProfessors.getItems().add(faculty.getFacultyName());
                    }
                }
                itemChooserProfessors.setVisibleRowCount(5);
            } else if (topicChooserProfessors.getValue().equals("Department")){
                itemChooserProfessors.getItems().clear();
                for (Faculty faculty : University.allFaculties){
                    if (faculty.getStatus().equals(Status.Active)){
                        for (Department department : faculty.departments){
                            if (department.getStatus().equals(Status.Active)){
                                itemChooserProfessors.getItems().add(department.getName());
                            }
                        }
                    }
                }
                itemChooserProfessors.setVisibleRowCount(5);
            } else if (topicChooserProfessors.getValue().equals("Major")){
                itemChooserProfessors.getItems().clear();
                for (Faculty faculty : University.allFaculties){
                    if (faculty.getStatus().equals(Status.Active)){
                        for (Department department : faculty.departments){
                            if (department.getStatus().equals(Status.Active)){
                                for (Major major : department.majors){
                                    itemChooserProfessors.getItems().add(major.getName());
                                }
                            }
                        }
                    }
                }
                itemChooserProfessors.setVisibleRowCount(5);
            }
        } else if (topicChooserProfessors.getValue().equals("Date of Registration")) {
            primaryDateProfessors.setVisible(true);
            secondaryDateProfessors.setVisible(true);
            itemChooserProfessors.setVisible(false);
            searchBoxProfessors.setVisible(false);

            primaryDateProfessors.setValue(null);
            secondaryDateProfessors.setValue(null);
            primaryDateProfessors.setPromptText("FROM");
            secondaryDateProfessors.setPromptText("TO");
        }

    }

    @FXML
    void setTopicChooserStudents(ActionEvent event) {
        University.loadFaculties();
        Student.loadAllStudents();

        if (topicChooserStudents.getValue().equals("First Name") || topicChooserStudents.getValue().equals("Last Name") || topicChooserStudents.getValue().equals("Age") || topicChooserStudents.getValue().equals("Phone Number") || topicChooserStudents.getValue().equals("National ID")) {
            searchBoxStudents.setVisible(true);
            searchBoxStudents.clear();
            primaryDateStudents.setVisible(false);
            secondaryDateStudents.setVisible(false);
            itemChooserStudents.setVisible(false);

            searchBoxStudents.setPromptText("Enter " + topicChooserStudents.getValue());
        } else if (topicChooserStudents.getValue().equals("Gender") || topicChooserStudents.getValue().equals("Student ID") || topicChooserStudents.getValue().equals("Faculty") || topicChooserStudents.getValue().equals("Department") || topicChooserStudents.getValue().equals("Major")) {
            itemChooserStudents.setVisible(true);
            searchBoxStudents.setVisible(false);
            primaryDateStudents.setVisible(false);
            secondaryDateStudents.setVisible(false);

            itemChooserStudents.setPromptText("Choose " + topicChooserStudents.getValue());

            if (topicChooserStudents.getValue().equals("Gender")){
                itemChooserStudents.getItems().clear();
                itemChooserStudents.getItems().addAll(Gender.Male.toString(), Gender.Female.toString());
                itemChooserStudents.setPromptText("Gender");
                itemChooserStudents.setVisibleRowCount(2);
            } else if (topicChooserStudents.getValue().equals("Student ID")){
                itemChooserStudents.getItems().clear();
                for (Student student : University.allStudents){
                    if (student.getStatus().equals(Status.Active)){
                        itemChooserStudents.getItems().add(student.getId());
                    }
                }
                itemChooserStudents.setVisibleRowCount(5);
            } else if (topicChooserStudents.getValue().equals("Faculty")){
                itemChooserStudents.getItems().clear();
                for (Faculty faculty : University.allFaculties){
                    if (faculty.getStatus().equals(Status.Active)){
                        itemChooserStudents.getItems().add(faculty.getFacultyName());
                    }
                }
                itemChooserStudents.setVisibleRowCount(5);
            } else if (topicChooserStudents.getValue().equals("Department")){
                itemChooserStudents.getItems().clear();
                for (Faculty faculty : University.allFaculties){
                    if (faculty.getStatus().equals(Status.Active)){
                        for (Department department : faculty.departments){
                            if (department.getStatus().equals(Status.Active)){
                                itemChooserStudents.getItems().add(department.getName());
                            }
                        }
                    }
                }
                itemChooserStudents.setVisibleRowCount(5);
            } else if (topicChooserStudents.getValue().equals("Major")){
                itemChooserStudents.getItems().clear();
                for (Faculty faculty : University.allFaculties){
                    if (faculty.getStatus().equals(Status.Active)){
                        for (Department department : faculty.departments){
                            if (department.getStatus().equals(Status.Active)){
                                for (Major major : department.majors){
                                    itemChooserStudents.getItems().add(major.getName());
                                }
                            }
                        }
                    }
                }
                itemChooserStudents.setVisibleRowCount(5);
            }
        } else if (topicChooserStudents.getValue().equals("Date of Registration")) {
            primaryDateStudents.setVisible(true);
            secondaryDateStudents.setVisible(true);
            itemChooserStudents.setVisible(false);
            searchBoxStudents.setVisible(false);
            secondaryDateStudents.setDisable(true);

            primaryDateStudents.setValue(null);
            secondaryDateStudents.setValue(null);
            primaryDateStudents.setPromptText("FROM");
            secondaryDateStudents.setPromptText("TO");
        }
    }

    @FXML
    void setItemChooserProfessors(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();

        if (topicChooserProfessors.getValue().equals("Gender")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getGender().equals(Gender.valueOf(itemChooserProfessors.getValue()))){
                }
            }
        } else if (topicChooserProfessors.getValue().equals("Professor ID")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getId().equals(itemChooserProfessors.getValue())){

                }
            }
        } else if (topicChooserProfessors.getValue().equals("Faculty")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getFaculty().equals(itemChooserProfessors.getValue())){

                }
            }
        } else if (topicChooserProfessors.getValue().equals("Department")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getDepartment().equals(itemChooserProfessors.getValue())){

                }
            }
        } else if (topicChooserProfessors.getValue().equals("Major")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getMajor().equals(itemChooserProfessors.getValue())){

                }
            }
        }
    }

    @FXML
    void setItemChooserStudents(ActionEvent event) {
        University.loadFaculties();
        Student.loadAllStudents();

        if (topicChooserStudents.getValue().equals("Gender")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getGender().equals(Gender.valueOf(itemChooserStudents.getValue()))){
                }
            }
        } else if (topicChooserStudents.getValue().equals("Student ID")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getId().equals(itemChooserStudents.getValue())){

                }
            }
        } else if (topicChooserStudents.getValue().equals("Faculty")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getFaculty().equals(itemChooserStudents.getValue())){

                }
            }
        } else if (topicChooserStudents.getValue().equals("Department")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getDepartment().equals(itemChooserStudents.getValue())){

                }
            }
        } else if (topicChooserStudents.getValue().equals("Major")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getMajor().equals(itemChooserStudents.getValue())){

                }
            }
        }
    }

    @FXML
    void setSearchBoxProfessors(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();

        if (topicChooserProfessors.getValue().equals("First Name")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getFirst_name().contains(searchBoxProfessors.getText())){

                }
            }
        } else if (topicChooserProfessors.getValue().equals("Last Name")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getLast_name().contains(searchBoxProfessors.getText())){

                }
            }
        } else if (topicChooserProfessors.getValue().equals("Age")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getDateOfBirth().getAge() == Integer.parseInt(searchBoxProfessors.getText())){

                }
            }
        } else if (topicChooserProfessors.getValue().equals("Phone Number")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getPhoneNumber().contains(searchBoxProfessors.getText())){

                }
            }
        } else if (topicChooserProfessors.getValue().equals("National ID")){
            for (Professor professor : University.allProfessors){
                if (professor.getStatus().equals(Status.Active) && professor.getNationalId().contains(searchBoxProfessors.getText())){

                }
            }
        }
    }

    @FXML
    void setSearchBoxStudents(ActionEvent event) {
        University.loadFaculties();
        Student.loadAllStudents();

        if (topicChooserStudents.getValue().equals("First Name")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getFirst_name().contains(searchBoxStudents.getText())){

                }
            }
        } else if (topicChooserStudents.getValue().equals("Last Name")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getLast_name().contains(searchBoxStudents.getText())){

                }
            }
        } else if (topicChooserStudents.getValue().equals("Age")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getDateOfBirth().getAge() == Integer.parseInt(searchBoxStudents.getText())){

                }
            }
        } else if (topicChooserStudents.getValue().equals("Phone Number")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getPhoneNumber().contains(searchBoxStudents.getText())){

                }
            }
        } else if (topicChooserStudents.getValue().equals("National ID")){
            for (Student student : University.allStudents){
                if (student.getStatus().equals(Status.Active) && student.getNationalId().contains(searchBoxStudents.getText())){

                }
            }
        }
    }

    @FXML
    void setPrimaryDateProfessors(ActionEvent event) {
        if (primaryDateProfessors.getValue() != null){
            secondaryDateProfessors.setDisable(false);
            secondaryDateProfessors.setPromptText("TO");
        }
    }

    @FXML
    void setPrimaryDateStudents(ActionEvent event) {
        if (primaryDateStudents.getValue() != null){
            secondaryDateStudents.setDisable(false);
            secondaryDateStudents.setPromptText("TO");
        }
    }

    @FXML
    void setSecondaryDateProfessors(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();

        Date primaryDate1 = new Date();
        primaryDate1.setYear(primaryDateProfessors.getValue().getYear());
        primaryDate1.setMonth(primaryDateProfessors.getValue().getMonthValue());
        primaryDate1.setDay(primaryDateProfessors.getValue().getDayOfMonth());

        Date secondaryDate1 = new Date();
        secondaryDate1.setYear(secondaryDateProfessors.getValue().getYear());
        secondaryDate1.setMonth(secondaryDateProfessors.getValue().getMonthValue());
        secondaryDate1.setDay(secondaryDateProfessors.getValue().getDayOfMonth());

        for (Professor professor : University.allProfessors){
            if (professor.getDateOfJoin().getYear() > primaryDate1.getYear() && professor.getDateOfJoin().getYear() < secondaryDate1.getYear()){

            } else if (professor.getDateOfJoin().getMonth() == primaryDate1.getMonth()) {
                if (professor.getDateOfJoin().getMonth() > primaryDate1.getMonth()){

                } else if (professor.getDateOfJoin().getMonth() == primaryDate1.getMonth()) {
                    if (professor.getDateOfJoin().getDay() == primaryDate1.getDay()){

                    }
                }
            } else if (professor.getDateOfJoin().getYear() == secondaryDate1.getYear()) {
                if (professor.getDateOfJoin().getMonth() < secondaryDate1.getMonth()) {

                } else if (professor.getDateOfJoin().getMonth() == secondaryDate1.getMonth()) {
                    if (professor.getDateOfJoin().getDay() <= secondaryDate1.getDay()) {

                    }
                }
            }
        }
    }

    @FXML
    void setSecondaryDateStudents(ActionEvent event) {
        University.loadFaculties();
        Student.loadAllStudents();

        Date primaryDate1 = new Date();
        primaryDate1.setYear(primaryDateStudents.getValue().getYear());
        primaryDate1.setMonth(primaryDateStudents.getValue().getMonthValue());
        primaryDate1.setDay(primaryDateStudents.getValue().getDayOfMonth());

        Date secondaryDate1 = new Date();
        secondaryDate1.setYear(secondaryDateStudents.getValue().getYear());
        secondaryDate1.setMonth(secondaryDateStudents.getValue().getMonthValue());
        secondaryDate1.setDay(secondaryDateStudents.getValue().getDayOfMonth());

        for (Student student : University.allStudents){
            if (student.getDateOfJoin().getYear() > primaryDate1.getYear() && student.getDateOfJoin().getYear() < secondaryDate1.getYear()){

            } else if (student.getDateOfJoin().getMonth() == primaryDate1.getMonth()) {
                if (student.getDateOfJoin().getMonth() > primaryDate1.getMonth()){

                } else if (student.getDateOfJoin().getMonth() == primaryDate1.getMonth()) {
                    if (student.getDateOfJoin().getDay() == primaryDate1.getDay()){

                    }
                }
            } else if (student.getDateOfJoin().getYear() == secondaryDate1.getYear()) {
                if (student.getDateOfJoin().getMonth() < secondaryDate1.getMonth()) {

                } else if (student.getDateOfJoin().getMonth() == secondaryDate1.getMonth()) {
                    if (student.getDateOfJoin().getDay() <= secondaryDate1.getDay()) {

                    }
                }
            }
        }
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

    @FXML
    void studentsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Students");

        studentsAnchorPane.setVisible(true);
        studentsScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

        topicChooserStudents.getItems().clear();
        topicChooserStudents.getItems().addAll("what topic do you want search:", "First Name", "Last Name", "Age", "Gender", "Phone Number", "National ID", "Student ID", "Date of Registration", "Faculty", "Department", "Major");
        topicChooserStudents.setVisibleRowCount(5);
        topicChooserStudents.getSelectionModel().selectFirst();

        searchBoxStudents.clear();
        searchBoxStudents.setVisible(false);

        itemChooserStudents.setVisible(false);

        primaryDateStudents.setVisible(false);
        secondaryDateStudents.setVisible(false);
        
    }

    @FXML
    void studentsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Students");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(true);
            studentsScrollPane.getStyleClass().add("pressed");
        }

        topicChooserStudents.getItems().clear();
        topicChooserStudents.getItems().addAll("what topic do you want search:", "First Name", "Last Name", "Age", "Gender", "Phone Number", "National ID", "Professor ID", "Date of Registration", "Faculty", "Department", "Major");
        topicChooserStudents.setVisibleRowCount(5);
        topicChooserStudents.getSelectionModel().selectFirst();

        searchBoxStudents.clear();
        searchBoxStudents.setVisible(false);

        itemChooserStudents.setVisible(false);

        primaryDateStudents.setVisible(false);
        secondaryDateStudents.setVisible(false);
    }

    @FXML
    void updateProfessorDashboard(ActionEvent event) {
        headerTitle.setText(" --> Update Professor");

        updateProfessorAnchorPane.setVisible(true);
        updateProfessorScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

        editProfessorVbox.setVisible(false);
        deactiveProfessorVbox.setVisible(false);

        operationChooserUpdateProfessor.getItems().clear();
        operationChooserUpdateProfessor.getItems().addAll("Choose Your Operation :", "Edit", "Deactive");
        operationChooserUpdateProfessor.setVisibleRowCount(3);
        operationChooserUpdateProfessor.getSelectionModel().selectFirst();

    }

    @FXML
    void updateProfessorScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Professor");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(true);
            updateProfessorScrollPane.getStyleClass().add("pressed");
        }


        editProfessorVbox.setVisible(false);
        deactiveProfessorVbox.setVisible(false);

        operationChooserUpdateProfessor.getItems().clear();
        operationChooserUpdateProfessor.getItems().addAll("Choose Your Operation :", "Edit", "Deactive");
        operationChooserUpdateProfessor.setVisibleRowCount(3);
        operationChooserUpdateProfessor.getSelectionModel().selectFirst();
    }

    @FXML
    void updateStudentDashboard(ActionEvent event) {
        headerTitle.setText(" --> Update Student");

        updateStudentAnchorPane.setVisible(true);
        updateStudentScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);


        editStudentVbox.setVisible(false);
        deactiveStudentsVbox.setVisible(false);

        operationChooserUpdateStudent.getItems().clear();
        operationChooserUpdateStudent.getItems().addAll("Choose Your Operation :", "Edit", "Deactive");
        operationChooserUpdateStudent.setVisibleRowCount(3);
        operationChooserUpdateStudent.getSelectionModel().selectFirst();
    }

    @FXML
    void updateStudentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Student");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(true);
            updateStudentScrollPane.getStyleClass().add("pressed");
        }

        editStudentVbox.setVisible(false);
        deactiveStudentsVbox.setVisible(false);

        operationChooserUpdateStudent.getItems().clear();
        operationChooserUpdateStudent.getItems().addAll("Choose Your Operation :", "Edit", "Deactive");
        operationChooserUpdateStudent.setVisibleRowCount(3);
        operationChooserUpdateStudent.getSelectionModel().selectFirst();
    }

}

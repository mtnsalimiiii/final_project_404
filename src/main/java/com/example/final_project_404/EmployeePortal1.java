package com.example.final_project_404;

import com.sun.jdi.LocalVariable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.xml.sax.helpers.LocatorImpl;

import javax.lang.model.type.UnionType;
import java.awt.*;

import javafx.scene.control.MenuItem;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.rmi.server.UID;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.*;
import java.util.List;

public class EmployeePortal1 {

    @FXML
    private AnchorPane courseGroupReportAnchorPane;

    @FXML
    private AnchorPane courseReportAnchorPane;

    @FXML
    private AnchorPane degreeReportAnchorPane;

    @FXML
    private AnchorPane majorReportAnchorPane;

    @FXML
    private AnchorPane peopleReportAnchorPane;

    @FXML
    private Button AddCourseGroupButton;

    @FXML
    private AnchorPane addCourseAnchorPane;

    @FXML
    private Button addCourseButton;

    @FXML
    private AnchorPane addCourseGroupAnchorPane;


    @FXML
    private AnchorPane addRandomStudentsAnchorPane;

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
    private Button addRandomStudentsScrollPane;

    @FXML
    private Button addStudentButton;

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
    private Label errorLabelNumberOfRandomStudents;

    @FXML
    private Label errorLabelAddRandomStudents;

    @FXML
    private Label errorLabelBirthDateProfile;

    @FXML
    private Label errorLabelCapacityAddCourseGroup;

    @FXML
    private Label errorLabelCourseAddCourseGroup;

    @FXML
    private Label errorLabelCreditAddCourse;

    @FXML
    private Label errorLabelDateOfBirthEditProfessor;

    @FXML
    private Label errorLabelDateOfBirthEditStudent;

    @FXML
    private Label errorLabelDateOfBirthRegisterProfessor;

    @FXML
    private Label errorLabelDateOfBirthRegisterStudent;

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
    private Label errorLabelDegreeRegisterStudent;

    @FXML
    private Label errorLabelDegreeRegisterProfessor;

    @FXML
    private Label errorLabelEditProfessor;

    @FXML
    private Label errorLabelEditStudent;

    @FXML
    private Label errorLabelFirstNameEditProfessor;

    @FXML
    private Label errorLabelFirstNameEditStudent;

    @FXML
    private Label errorLabelFirstNameRegisterProfessor;

    @FXML
    private Label errorLabelFirstNameRegisterStudent;

    @FXML
    private Label errorLabelFirstnameProfile;

    @FXML
    private Label errorLabelGenderEditProfessor;

    @FXML
    private Label errorLabelGenderEditStudent;

    @FXML
    private Label errorLabelGenderProfile;

    @FXML
    private Label errorLabelGenderRegisterProfessor;

    @FXML
    private Label errorLabelGenderRegisterStudent;

    @FXML
    private Label errorLabelLastNameEditProfessor;

    @FXML
    private Label errorLabelLastNameEditStudent;

    @FXML
    private Label errorLabelLastNameRegisterProfessor;

    @FXML
    private Label errorLabelLastNameRegisterStudent;

    @FXML
    private Label errorLabelLastnameProfile;

    @FXML
    private Label errorLabelMajorAddCourse;

    @FXML
    private Label errorLabelMajorAddCourseGroup;

    @FXML
    private Label errorLabelMajorAddDegree;

    @FXML
    private Label errorLabelMajorDeactiveProfessor;

    @FXML
    private Label errorLabelMajorDeactiveStudent;

    @FXML
    private Label errorLabelMajorEditProfessor;

    @FXML
    private Label errorLabelMajorEditStudent;

    @FXML
    private Label errorLabelMajorRegisterProfessor;

    @FXML
    private Label errorLabelMajorRegisterStudent;

    @FXML
    private Label errorLabelNameAddCourse;

    @FXML
    private Label errorLabelNationalIdEditProfessor;

    @FXML
    private Label errorLabelNationalIdEditStudent;

    @FXML
    private Label errorLabelNationalIdProfile;

    @FXML
    private Label errorLabelNationalIdRegisterProfessor;

    @FXML
    private Label errorLabelNationalIdRegisterStudent;

    @FXML
    private Label errorLabelPhoneEditProfessor;

    @FXML
    private Label errorLabelPhoneEditStudent;

    @FXML
    private Label errorLabelPhoneProfile;

    @FXML
    private Label errorLabelPhoneRegisterProfessor;

    @FXML
    private Label errorLabelPhoneRegisterStudent;

    @FXML
    private Label errorLabelProfessorAddCourseGroup;

    @FXML
    private Label errorLabelProfessorDeactiveProfessor;

    @FXML
    private Label errorLabelProfessorEditProfessor;

    @FXML
    private Label errorLabelProfile;

    @FXML
    private Label errorLabelRegisterProfessor;

    @FXML
    private Label errorLabelRegisterStudent;

    @FXML
    private Label errorLabelSemesterAddCourseGroup;

    @FXML
    private Label errorLabelStudentDeactiveStudent;

    @FXML
    private Label errorLabelStudentEditStudent;

    @FXML
    private Label errorLabelNumberOfStudents;

    @FXML
    private TextField firstNameEditProfessor;

    @FXML
    private TextField firstNameEditStudents;

    @FXML
    private TextField firstNameRegisterProfessor;

    @FXML
    private TextField firstNameRegisterStudent;

    @FXML
    private ComboBox<String> genderChooserEditProfessor;

    @FXML
    private ComboBox<String> genderChooserEditStudents;

    @FXML
    private ComboBox<String> genderChooserRegisterProfessor;

    @FXML
    private ComboBox<String> genderChooserRegisterStudent;

    @FXML
    private HBox headerHBox;

    @FXML
    private Label headerTitle;

    @FXML
    private TextField lastNameEditProfessor;

    @FXML
    private TextField lastNameEditStudents;

    @FXML
    private TextField lastNameRegisterProfessor;

    @FXML
    private TextField lastNameRegisterStudent;

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
    private TextField nationalIdEditProfessor;

    @FXML
    private TextField nationalIdEditStudents;

    @FXML
    private TextField nationalIdRegisterProfessor;

    @FXML
    private TextField nationalIdRegisterStudent;

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
    private TextField numberOfRandomStudents;

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
    private DatePicker primaryDateProfessors;

    @FXML
    private ComboBox<String> professorChooserAddCourseGroup;

    @FXML
    private ComboBox<String> professorChooserDeactiveProfessor;

    @FXML
    private ComboBox<String> professorChooserEditProfessor;

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
    private ComboBox<String> semesterChooserAddCourseGroup;

    @FXML
    private ComboBox<String> studentChooserDeactiveStudents;

    @FXML
    private ComboBox<String> studentChooserEditStudents;

    @FXML
    private TableColumn<?, ?> studentIdTableviewStudents;

    @FXML
    private TableView<?> studetnsTableview;

    @FXML
    private Label successLabelAddCourseGroup;

    @FXML
    private Label successLabelAddDegree;

    @FXML
    private Label successLabelAddRandomStudents;

    @FXML
    private Label successLabelDeactiveProfessor;

    @FXML
    private Label successLabelDeactiveStudent;

    @FXML
    private Label successLabelEditProfessor;

    @FXML
    private Label successLabelEditStudent;

    @FXML
    private Label successLabelProfile;

    @FXML
    private Label successLabelRegisterProfessor;

    @FXML
    private Label successLabelRegisterStudent;

    @FXML
    private Label successfulLabelAddCourse;

    @FXML
    private ComboBox<String> topicChooserProfessors;

    @FXML
    private AnchorPane updateProfessorAnchorPane;

    @FXML
    private Button updateProfessorScrollPane;

    @FXML
    private AnchorPane updateStudentAnchorPane;

    @FXML
    private Button updateStudentScrollPane;

    private static final java.util.List<String> FIRST_NAMES_MALE = java.util.List.of("Ali", "Hossein ", "Nima ", "Farhad ", "Parsa ");
    private static final java.util.List<String> FIRST_NAMES_FEMALE = java.util.List.of("Maryam", "Elena", "Zahra", "Kiana", "Sarina");
    private static final java.util.List<String> LAST_NAMES = List.of("Rezaei", "Ahmadi", "Yousefi", "Kamrani", "Tavakoli");

    @FXML
    private VBox reportsVbox;

    //    REPORTS
    // Major Report
    @FXML private TableView<MajorReport> tableViewReportMajor;
    @FXML private TableColumn<MajorReport, String> colNameReportMajor;
    @FXML private TableColumn<MajorReport, String> colIdReportMajor;
    @FXML private TableColumn<MajorReport, String> colFacultyReportMajor;
    @FXML private TableColumn<MajorReport, String> colDepartmentReportMajor;
    @FXML private TableColumn<MajorReport, Integer> colEstYearReportMajor;
    @FXML private TableColumn<MajorReport, String> colStatusReportMajor;
    @FXML private TextField searchFieldReportMajor;

    private ObservableList<MajorReport> majorList;
    private FilteredList<MajorReport> filteredListReportMajor;

    //People Report
    @FXML private TableView<People> tableViewReportPeople;
    @FXML private TableColumn<People, String> colNameReportPeople;
    @FXML private TableColumn<People, Integer> colAgeReportPeople;
    @FXML private TableColumn<People, String> colGenderReportPeople;
    @FXML private TableColumn<People, String> colPhoneReportPeople;
    @FXML private TableColumn<People, String> colNationalIDReportPeople;
    @FXML private TableColumn<People, String> colRoleReportPeople;
    @FXML private TableColumn<People, String> colIDReportPeople;
    @FXML private TableColumn<People, String> colDateOfRegisterReportPeople;
    @FXML private TableColumn<People, String> colFacultyReportPeople;
    @FXML private TableColumn<People, String> colDepartmentReportPeople;
    @FXML private TableColumn<People, String> colMajorReportPeople;
    @FXML private TableColumn<People, String> colDegreeReportPeople;
    @FXML private TableColumn<People, String> colStatusReportPeople;
    @FXML private TextField searchFieldPeople;

    private ObservableList<People> peopleList;
    private FilteredList<People> filteredListReportPeople;

    //
//    Reports

    @FXML
    private AnchorPane semesterReportAnchorPane;

    @FXML
    void addCourse(ActionEvent event) {
        successfulLabelAddCourse.setText(null);
        University.loadFaculties();
        boolean confirmation = true;

        String majorName = majorChooserAddCourse.getValue();
        String selectedDegree = degreeChooserAddCourse.getValue();
        String name = courseNameAddCourse.getText().trim();
        String creditStr = courseCreditAddCourse.getText().trim();
        if (majorName.equals("Major")) {
            errorLabelMajorAddCourse.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorAddCourse.setText(null);
        }
        if (selectedDegree.equals("Degree")) {
            errorLabelDegreeAddCourse.setText("Choose Degree");
            confirmation = false;
        } else {
            errorLabelDegreeAddCourse.setText(null);
        }
        if (name.isEmpty()) {
            errorLabelNameAddCourse.setText("Enter Name");
            confirmation = false;
        } else {
            errorLabelNameAddCourse.setText(null);
        }
        if (creditStr.isEmpty()) {
            errorLabelCreditAddCourse.setText("Enter Credit");
            confirmation = false;
        } else {
            errorLabelCreditAddCourse.setText(null);
            try {
                int credit = Integer.parseInt(creditStr);
            } catch (NumberFormatException e) {
                errorLabelCreditAddCourse.setText("Just Enter Number");
                confirmation = false;
            }
        }
        if (confirmation) {
            Employee employee = LoginPanelController.employeePerson;
            int credit = Integer.parseInt(creditStr);

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
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
                                                    if (degree.courses.stream().noneMatch(course1 -> course1.getName().equals(name))) {
                                                        degree.courses.add(course);
                                                        University.saveFaculties();
                                                        errorLabelAddCourse.setText(null);
                                                        successfulLabelAddCourse.setText("The Course Added Successfully\nCourse Name : " + name + " | Course Credit : " + creditStr);

                                                        majorChooserAddCourse.getSelectionModel().selectFirst();
                                                        majorChooserAddCourse.setOnAction(event1 -> {
                                                            degreeChooserAddCourse.getItems().clear();
                                                            degreeChooserAddCourse.getItems().add("Degree");
                                                            for (Degree degree1 : major.degrees) {
                                                               if (degree1 != null) {
                                                                    degreeChooserAddCourse.getItems().add(degree1.getClass().getSimpleName());
                                                                }
                                                            }
                                                            degreeChooserAddCourse.setVisibleRowCount(4);
                                                            degreeChooserAddCourse.getSelectionModel().selectFirst();
                                                        });
                                                        courseNameAddCourse.clear();
                                                        courseCreditAddCourse.clear();
                                                    } else {
                                                        errorLabelAddCourse.setText("The Selected Course Has Been Added Earlier");
                                                    }
                                                } else {
                                                    errorLabelAddCourse.setText("The Selected Course Has Been Added Earlier");

                                                }
                                            }
                                        }
                                    }catch (Exception exception){
                                        errorLabelDegreeAddCourse.setText("Choose another Degree");
                                        errorLabelAddCourse.setText("The Selected Degree Has not Been Created Yet");
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        } else {
            errorLabelAddCourse.setText("Fill In All Fields");
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
        successfulLabelAddCourse.setText(null);
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
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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
        errorLabelAddCourse.setText(null); 
        successfulLabelAddCourse.setText(null);
    }

    @FXML
    void addCourseGroup(ActionEvent event) {
        successLabelAddCourseGroup.setText(null);
        String majorName = majorChooserAddCourseGroup.getValue();
        String selectedDegree = degreeChooserAddCourseGroup.getValue();
        String capacityGroupStr = capacityAddCourseGroup.getText().trim();
        String courseTarget = courseChooserAddCourseGroup.getValue();
        boolean confirmation = true;

        if (majorName.equals("Major")) {
            errorLabelMajorAddCourseGroup.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorAddCourseGroup.setText(null);
        }
        if (selectedDegree.equals("Degree")) {
            errorLabelDegreeAddCourseGroup.setText("Choose Degree");
            confirmation = false;
        } else {
            errorLabelDegreeAddCourseGroup.setText(null);
        }
        if (courseTarget == null) {
            errorLabelCourseAddCourseGroup.setText("Choose Course");
            confirmation = false;
        } else if (courseTarget.equals("Course")) {
            errorLabelCourseAddCourseGroup.setText("Choose Course");
            confirmation = false;
        } else {
            errorLabelCourseAddCourseGroup.setText(null);
        }
        if (semesterChooserAddCourseGroup.getValue().equals("Semaster") || semesterChooserAddCourseGroup.getValue() == null) {
            errorLabelSemesterAddCourseGroup.setText("Choose Semaster");
            confirmation = false;
        } else {
            errorLabelAddCourseGroup.setText(null);
        }
        if (professorChooserAddCourseGroup.getValue() == null) {
            errorLabelProfessorAddCourseGroup.setText("Choose Professor");
            confirmation = false;
        } else if (professorChooserAddCourseGroup.getValue().equals("Professor")) {
            errorLabelProfessorAddCourseGroup.setText("Choose Professor");
            confirmation = false;
        } else {
            errorLabelAddCourseGroup.setText(null);
        }
        if (capacityGroupStr.isEmpty()) {
            errorLabelCapacityAddCourseGroup.setText("Enter Capacity");
            confirmation = false;
        } else {
            errorLabelCapacityAddCourseGroup.setText(null);
            try {
                Integer.parseInt(capacityGroupStr);
            } catch (NumberFormatException e) {
                errorLabelCapacityAddCourseGroup.setText("Just Enter Number");
                confirmation = false;
            }
        }
        if (confirmation) {
            if (!courseChooserAddCourseGroup.getValue().equals("Course") && !professorChooserAddCourseGroup.getValue().equals("Professor") && !semesterChooserAddCourseGroup.getValue().equals("Semaster")) {
                int capacityGroup = Integer.parseInt(capacityGroupStr);
                University.loadFaculties();
                Employee employee = LoginPanelController.employeePerson;

                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                        for (Department department : faculty.departments) {
                            if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
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
                                                                        semesterChooserAddCourseGroup.getValue(),
                                                                        capacityGroup,
                                                                        id,
                                                                        Status.Active,
                                                                        new Course(course1.getName(), course1.getCredit(), course1.getId(), Status.Active)
                                                                );
                                                                course1.courseGroups.add(newGroup);
                                                                University.saveFaculties();
                                                                errorLabelAddCourseGroup.setText(null);
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
            } else {
                errorLabelAddCourseGroup.setText("Fill In All Fields");
            }
        } else {
            errorLabelAddCourseGroup.setText("Fill In All Fields");
        }
    }

    @FXML
    void addCourseGroupDashboard(ActionEvent event) throws Exception {
        headerTitle.setText(" --> Add New Course Group");
        University.loadFaculties();
        University.loadAllSemester();
        Professor.loadAllProfessor();

        addCourseGroupAnchorPane.setVisible(true);
        addCourseGroupScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);


//        Initialize the Degree and Major combobox for Add Course
        capacityAddCourseGroup.clear();

        semesterChooserAddCourseGroup.getItems().clear();
        semesterChooserAddCourseGroup.getItems().add("Semester");
        for (Semester semester : University.allSemesters){
            if(semester.getStatus()==Status.Active){
                semesterChooserAddCourseGroup.getItems().add(semester.getName());
            }
        }
        semesterChooserAddCourseGroup.setVisibleRowCount(5);
        semesterChooserAddCourseGroup.getSelectionModel().selectFirst();
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
                                    for (Professor professor : major.professors) {
                                        professorChooserAddCourseGroup.getItems().add(professor.getFullName());
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
        errorLabelSemesterAddCourseGroup.setText(null);
        errorLabelCapacityAddCourseGroup.setText(null);
        errorLabelAddCourseGroup.setText(null);
        successLabelAddCourseGroup.setText(null);
    }

    @FXML
    void addCourseGroupScrollPane(ActionEvent event) throws Exception {
        headerTitle.setText(" --> Add New Course Group");
        University.loadFaculties();
        University.loadAllSemester();
        Professor.loadAllProfessor();

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
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
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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

        semesterChooserAddCourseGroup.getItems().clear();
        semesterChooserAddCourseGroup.getItems().add("Semester");
        for (Semester semester : University.allSemesters){
            if(semester.getStatus()==Status.Active){
                semesterChooserAddCourseGroup.getItems().add(semester.getName());
            }
        }
        semesterChooserAddCourseGroup.setVisibleRowCount(5);
        semesterChooserAddCourseGroup.getSelectionModel().selectFirst();
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
        errorLabelSemesterAddCourseGroup.setText(null);
        errorLabelCapacityAddCourseGroup.setText(null);
        errorLabelAddCourseGroup.setText(null);
        successLabelAddCourseGroup.setText(null);
    }

    @FXML
    void addDegree(ActionEvent event) {
        successLabelAddDegree.setText(null);
        Degree degree = null;
        University.loadFaculties();
        boolean confirmation = true;
        Employee employee = LoginPanelController.employeePerson;

        if (majorChooserAddDegree.getValue().equals("Major") || majorChooserAddDegree.getValue().isEmpty()) {
            errorLabelMajorAddDegree.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorAddDegree.setText(null);
        }
        if (degreeChooserAddDegree.getValue().equals("Degree") || degreeChooserAddDegree.getValue().isEmpty()) {
            errorLabelDegreeAddDegree.setText("Choose Degree");
            confirmation = false;
        } else {
            errorLabelDegreeAddDegree.setText(null);
        }

        if (confirmation) {
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
                                    if (!major.degrees.contains(degree)){
                                        if (major.degrees.stream().noneMatch(degree1 -> degree1.getClass().getSimpleName().equals(selectedDegree))) {
                                            major.degrees.add(degree);
                                            University.saveFaculties();
                                            errorLabelAddDegree.setText(null);
                                            assert degree != null;
                                            successLabelAddDegree.setText("The Selected Degree Added Successfully\nMajor : " + major + " | Degree : " + degree.getClass().getSimpleName());

                                            majorChooserAddDegree.getItems().clear();
                                            majorChooserAddDegree.getItems().add("Major");
                                            for (Major major1 : department.majors) {
                                                if (major1.getStatus().equals(Status.Active)) {
                                                    majorChooserAddDegree.getItems().add(major1.getName());
                                                }
                                            }
                                            majorChooserAddDegree.setVisibleRowCount(5);
                                            majorChooserAddDegree.getSelectionModel().selectFirst();

                                            degreeChooserAddDegree.getItems().clear();
                                            degreeChooserAddDegree.getItems().addAll("Degree", "Bachelor", "Master", "Phd");
                                            degreeChooserAddDegree.setVisibleRowCount(4);
                                            degreeChooserAddDegree.getSelectionModel().selectFirst();
                                        } else {
                                            errorLabelAddDegree.setText("The Selected Degree Has Already Been Added");
                                        }
                                    } else {
                                        errorLabelAddDegree.setText("The Selected Degree Has Already Been Added");
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        } else {
            errorLabelAddDegree.setText("Fill In All Fields");
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
        successLabelAddDegree.setText(null);
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
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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
        successLabelRegisterProfessor.setText(null);
        University.loadFaculties();
        Professor.loadAllProfessor();
        boolean confirmation = true;

        if (firstNameRegisterProfessor.getText().isEmpty()) {
            errorLabelFirstNameRegisterProfessor.setText("Enter First Name");
            confirmation = false;
        } else {
            errorLabelFirstNameRegisterProfessor.setText(null);
        }
        if (lastNameRegisterProfessor.getText().isEmpty()) {
            errorLabelLastNameRegisterProfessor.setText("Enter Last Name");
            confirmation = false;
        } else {
            errorLabelLastNameRegisterProfessor.setText(null);
        }
        if (phoneNumberRegisterProfessor.getText().isEmpty()) {
            errorLabelPhoneRegisterProfessor.setText("Enter Phone Number");
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
            confirmation = false;
        } else {
            errorLabelNationalIdRegisterProfessor.setText(null);
            try {
                Long nationalId = Long.parseLong(nationalIdRegisterProfessor.getText());
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
            confirmation = false;
        } else {
            errorLabelGenderRegisterProfessor.setText(null);
        }
        if (majorChooserRegisterProfessor.getValue().equals("Major") || majorChooserRegisterProfessor.getValue().isEmpty()) {
            errorLabelMajorRegisterProfessor.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorRegisterProfessor.setText(null);
        }
        if (dateOfBirthRegisterProfessor.getValue() == null) {
            errorLabelDateOfBirthRegisterProfessor.setText("Choose Date Of Birth");
            confirmation = false;
        } else {
            errorLabelDateOfBirthRegisterProfessor.setText(null);
        }
        if (confirmation) {
            LocalDate dateOfBirth = dateOfBirthRegisterProfessor.getValue();
            String firstName = firstNameRegisterProfessor.getText().trim();
            String lastName = lastNameRegisterProfessor.getText().trim();
            String phoneNumber = phoneNumberRegisterProfessor.getText().trim();
            String nationalId = nationalIdRegisterProfessor.getText().trim();
            String gender = genderChooserRegisterProfessor.getValue();
            String majorName = majorChooserRegisterProfessor.getValue();
            LocalDate dateOfHire = LocalDate.now();
            String professorId = "PRO"+(University.allProfessors.size()+1);

            Employee employee = LoginPanelController.employeePerson;
            Professor professor = new Professor(firstName, lastName, dateOfBirth, nationalId, Gender.valueOf(gender), phoneNumber, professorId, dateOfHire, employee.getFaculty(), employee.getDepartment(), majorName, Status.Active);
            University.loadFaculties();
            Professor.loadAllProfessor();
            for (Faculty faculty : University.allFaculties) {
                System.out.println(employee.getFaculty());
                System.out.println(faculty.getFacultyName());
                if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserRegisterProfessor.getValue())&&!major.professors.contains(professor) && major.getStatus().equals(Status.Active)) {
                                    major.professors.add(professor);
                                    University.allProfessors.add(professor);
                                    University.saveFaculties();
                                    Professor.saveAllProfessor();
                                    errorLabelRegisterProfessor.setText(null);
                                    successLabelRegisterProfessor.setText("The Professor Registered Successfully\nProfessor ID : " + professorId + " | Password : National ID(" + nationalId + ")");

                                    firstNameRegisterProfessor.clear();
                                    lastNameRegisterProfessor.clear();
                                    phoneNumberRegisterProfessor.clear();
                                    nationalIdRegisterProfessor.clear();
                                    dateOfBirthRegisterProfessor.setValue(null);
                                    genderChooserRegisterProfessor.getSelectionModel().selectFirst();
                                    majorChooserRegisterProfessor.getSelectionModel().selectFirst();
                                } else {
                                    errorLabelRegisterProfessor.setText("The Professor Has Been Registered Earlier");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            errorLabelRegisterProfessor.setText("Fill All Fields");
        }
    }

    @FXML
    void addRandomStudents(ActionEvent event) throws IOException {
        successLabelAddRandomStudents.setText(null);

         if (!numberOfRandomStudents.getText().isEmpty()) {
             try {
                 int studentCount = Integer.parseInt(numberOfRandomStudents.getText());
                 if (studentCount > 0) {
                     for (int i = 0; i < studentCount; i++) {
                         University.loadFaculties();
                         Student.loadAllStudents();
                         Gender gender = RANDOM.nextBoolean() ? Gender.Male : Gender.Female;
                         String firstName;
                         if (gender.equals(Gender.Male)) {
                             firstName = FIRST_NAMES_MALE.get(RANDOM.nextInt(FIRST_NAMES_MALE.size()));
                         } else {
                             firstName = FIRST_NAMES_FEMALE.get(RANDOM.nextInt(FIRST_NAMES_FEMALE.size()));
                         }
                         String lastName = LAST_NAMES.get(RANDOM.nextInt(LAST_NAMES.size()));
                         int age = 18 + RANDOM.nextInt(10);
                         String nationalId = "";
                         for (int counter=0 ; counter<10 ; counter++) {
                             int number = RANDOM.nextInt(10);
                             nationalId.concat(String.valueOf(number));
                         }
                         String phoneNumber ="09";
                         for (int counter=0 ; counter<9 ; counter++) {
                             int number = RANDOM.nextInt(10);
                             phoneNumber.concat(String.valueOf(number));
                         }
                         Employee employee = LoginPanelController.employeePerson;
                         for (Faculty faculty : University.allFaculties) {
                             if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                                 for (Department department : faculty.departments) {
                                     if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
                                         if (!department.majors.isEmpty()) {
                                             for (;;) {
                                                 Major major = department.majors.get(RANDOM.nextInt(department.majors.size()));
                                                 if (major.getStatus().equals(Status.Active)) {
                                                     if (!major.degrees.isEmpty()) {
                                                         Degree degree =  major.degrees.get(RANDOM.nextInt(major.degrees.size()));

                                                         String studentId = "STU" + (University.allStudents.size() + 1);

                                                         Student student = new Student(
                                                                 firstName, lastName,
                                                                 LocalDate.of(LocalDate.now().getYear() - age, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth()), nationalId, gender, phoneNumber,
                                                                 studentId, LocalDate.now(),
                                                                 faculty.getFacultyName(),
                                                                 department.getName(),
                                                                 major.getName(),
                                                                 Status.Active,
                                                                 degree.getClass().getSimpleName()
                                                         );

                                                         major.students.add(student);
                                                         University.saveFaculties();
                                                         University.allStudents.add(student);
                                                         Student.saveAllStudent();
                                                         errorLabelAddRandomStudents.setText(null);
                                                         successLabelAddRandomStudents.setText(successLabelAddRandomStudents.getText() + "Student " + (i+1) + " : Student ID = " + studentId + " | Password = " + nationalId + "\n");
                                                         break;
                                                     } else {
                                                         errorLabelAddRandomStudents.setText("There Is No Degree In Major " + major.getName());
                                                     }
                                                 }
                                             }
                                             errorLabelAddRandomStudents.setText("There Is No Active Major In The Department");

                                         } else {
                                             errorLabelAddRandomStudents.setText("There Is No Major In The Department");
                                         }

                                     }
                                 }
                             }
                         }
                     }
                     successLabelAddRandomStudents.setText(successLabelAddRandomStudents.getText() + "Done");
                 } else {
                     errorLabelAddRandomStudents.setText("Entered Number Isn't In Range, Enter Positive Number");
                 }
             } catch (NumberFormatException e) {
                 errorLabelAddRandomStudents.setText("Enter Just Number");
             }
         } else {
             errorLabelAddRandomStudents.setText("Enter Number");
         }
    }

    private static final Random RANDOM = new Random();
    @FXML
    void addRandomStudentsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Register Random Students");
        addRandomStudentsAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
        addRandomStudentsScrollPane.getStyleClass().add("pressed");

        numberOfRandomStudents.clear();
        errorLabelAddRandomStudents.setText(null);
        errorLabelNumberOfRandomStudents.setText(null);
        successLabelAddRandomStudents.setText(null);

    }

    @FXML
    void addRandomStudentsScrollPane() {
        headerTitle.setText(" --> Register Random Students");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        }else if (addCourseAnchorPane.isVisible()) {
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
        if (!addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(true);
            addRandomStudentsScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void addStudent(ActionEvent event) throws IOException {
        University.loadFaculties();
        Student.loadAllStudents();
        boolean confirmation = true;

        if (firstNameRegisterStudent.getText().isEmpty()) {
            errorLabelFirstNameRegisterStudent.setText("Enter First Name");
            confirmation = false;
        } else {
            errorLabelFirstNameRegisterStudent.setText(null);
        }
        if (lastNameRegisterStudent.getText().isEmpty()) {
            errorLabelLastNameRegisterStudent.setText("Enter Last Name");
            confirmation = false;
        } else {
            errorLabelLastNameRegisterStudent.setText(null);
        }
        if (phoneNumberRegisterStudent.getText().isEmpty()) {
            errorLabelPhoneRegisterStudent.setText("Enter Phone Number");
            confirmation = false;
        } else {
            errorLabelPhoneRegisterStudent.setText(null);
            try {
                long phone = Long.parseLong(phoneNumberRegisterStudent.getText());
                if (phoneNumberRegisterStudent.getText().length() != 11) {
                    errorLabelPhoneRegisterStudent.setText("Enter 11 digit");
                    confirmation = false;
                } else if (!phoneNumberRegisterStudent.getText().startsWith("09")) {
                    errorLabelPhoneRegisterStudent.setText("Wrong Format (09....)");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelPhoneRegisterStudent.setText("Enter Just Number");
                confirmation = false;
            }
        }
        if (nationalIdRegisterStudent.getText().isEmpty()) {
            errorLabelNationalIdRegisterStudent.setText("Enter National ID");
            confirmation = false;
        } else {
            errorLabelNationalIdRegisterStudent.setText(null);
            try {
                long nationalId = Long.parseLong(nationalIdRegisterStudent.getText());
                if (nationalIdRegisterStudent.getText().length() != 10) {
                    errorLabelNationalIdRegisterStudent.setText("Enter 10 digit");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelNationalIdRegisterStudent.setText("Enter Just Number");
                confirmation = false;
            }
        }
        if (genderChooserRegisterStudent.getValue() == null || genderChooserRegisterStudent.getValue().equals("Gender")) {
            errorLabelGenderRegisterStudent.setText("Choose Gender");
            confirmation = false;
        } else {
            errorLabelGenderRegisterStudent.setText(null);
        }
        if (majorChooserRegisterStudent.getValue() == null || majorChooserRegisterStudent.getValue().equals("Major")) {
            errorLabelMajorRegisterStudent.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorRegisterStudent.setText(null);
        }
        if (degreeChooserRegisterStudent.getValue() == null || degreeChooserRegisterStudent.getValue().equals("Degree")) {
            errorLabelDegreeRegisterStudent.setText("Choose Degree");
            confirmation = false;
        } else {
            errorLabelDegreeRegisterStudent.setText(null);
        }
        if (dateOfBirthRegisterStudent.getValue() == null) {
            errorLabelDateOfBirthRegisterStudent.setText("Choose Date Of Birth");
            confirmation = false;
        } else {
            errorLabelDateOfBirthRegisterStudent.setText(null);
        }

        if (confirmation) {
            String firstName = firstNameRegisterStudent.getText().trim();
            String lastName = lastNameRegisterStudent.getText().trim();
            String phoneNumber = phoneNumberRegisterStudent.getText().trim();
            String nationalId = nationalIdRegisterStudent.getText().trim();
            String gender = genderChooserRegisterStudent.getValue();
            String majorName = majorChooserRegisterStudent.getValue();
            String selectedDegree = degreeChooserRegisterStudent.getValue();
            LocalDate dateOfBirth = dateOfBirthRegisterStudent.getValue();
            LocalDate dateOfJoin = LocalDate.now();
            String studentId = "STU" + (University.allStudents.size() + 1);
            Employee employee = LoginPanelController.employeePerson;
            // نگاشت مقطع
            Degree degree = null;
            String degreeClassName;
            if (selectedDegree.equalsIgnoreCase("Bachelor")) {
                degree = new Bachelor();
                degreeClassName = "BachelorDegree";
            } else if (selectedDegree.equalsIgnoreCase("Master")) {
                degree = new Master();
                degreeClassName = "MasterDegree";
            } else if (selectedDegree.equalsIgnoreCase("PHD")) {
                degree = new Phd();
                degreeClassName = "PhdDegree";
            } else {
                degreeClassName = "";
            }

            // ایجاد شیء دانشجو
            assert degree != null;
            Student student = new Student(firstName, lastName, dateOfBirth, nationalId, Gender.valueOf(gender),
                    phoneNumber, studentId, dateOfJoin, employee.getFaculty(), employee.getDepartment(), majorName, Status.Active,degree.getClass().getSimpleName());

            if (University.allStudents.stream().anyMatch(student1 -> student1.getNationalId().equals(student.getNationalId()) && student1.getStatus().equals(Status.Active))) {
                errorLabelRegisterStudent.setText("The Student Has Been Registered Earlier");
                return;
            }

            // یافتن Major و افزودن دانشجو و مقطع
            for (Faculty faculty1 : University.allFaculties) {
                if (faculty1.getFacultyName().equals(employee.getFaculty()) && faculty1.getStatus().equals(Status.Active)) {
                    for (Department department1 : faculty1.departments) {
                        if (department1.getName().equals(employee.getDepartment()) && department1.getStatus().equals(Status.Active)) {
                            for (Major major : department1.majors) {
                                if (major.getName().equals(majorName) && major.getStatus().equals(Status.Active)) {
                                    if (major.degrees.stream().noneMatch(degree1 -> degree1.getClass().getSimpleName().equals(degreeClassName))) {
                                        major.degrees.add(degree);
                                    }

                                    if (!major.students.contains(student)) {
                                        major.students.add(student);
                                        University.allStudents.add(student);
                                        University.saveFaculties();
                                        Student.saveAllStudent();
                                        errorLabelRegisterStudent.setText(null);
                                        successLabelRegisterStudent.setText("The Student Registered Successfully\nStudent ID : " + studentId + " | Password : National ID(" + nationalId + ")");

                                        firstNameRegisterStudent.setText(null);
                                        lastNameRegisterStudent.setText(null);
                                        phoneNumberRegisterStudent.setText(null);
                                        nationalIdRegisterStudent.setText(null);
                                        dateOfBirthRegisterStudent.setValue(null);
                                        genderChooserRegisterStudent.getSelectionModel().selectFirst();
                                        majorChooserRegisterStudent.getSelectionModel().selectFirst();
                                        degreeChooserRegisterStudent.getSelectionModel().selectFirst();

                                    } else {
                                        errorLabelRegisterStudent.setText("The Student Has Been Registered Earlier");
                                    }
                                   // break;
                                }
                            }
                            //break;
                        }
                    }
                    //break;
                }
            }
        } else {
            errorLabelRegisterStudent.setText("Fill In All Fields");
        }
    }

    @FXML
    void changeProfile(ActionEvent event) throws IOException {
        successLabelProfile.setText(null);
        University.loadFaculties();
        Employee.loadAllEmployee();
        Employee employee = LoginPanelController.employeePerson;
        boolean edited = false;
        boolean problem = false;
        if (!newFirstNameProfile.getText().isEmpty()) {
            edited = true;
        }
        if (!newLastNameProfile.getText().isEmpty()) {
            edited = true;
        }
        if (!newNationalIdProfile.getText().isEmpty()) {
            edited = true;
            errorLabelNationalIdProfile.setText(null);
            try {
                Long nationalId = Long.parseLong(newNationalIdProfile.getText());
                if (newNationalIdProfile.getText().length() != 10) {
                    errorLabelNationalIdProfile.setText("Enter 10 Digit");
                    problem = true;
                }
            } catch (NumberFormatException e) {
                errorLabelNationalIdProfile.setText("Enter Just Number");
                problem = true;
            }
        }
        if (!newPhoneNumberProfile.getText().isEmpty()) {
            edited = true;
            errorLabelPhoneProfile.setText(null);
            try {
                Long phone = Long.parseLong(newPhoneNumberProfile.getText());
                if (newPhoneNumberProfile.getText().length() != 11) {
                    errorLabelPhoneProfile.setText("Enter 11 Digit");
                    problem = true;
                } else if (!newPhoneNumberProfile.getText().startsWith("09")) {
                    errorLabelPhoneProfile.setText("Wrong Format(09...)");
                    problem = true;
                }
            } catch (NumberFormatException e) {
                errorLabelPhoneProfile.setText("Enter Just Number");
                problem = true;
            }
        }
        if (newGenderProfile.getValue() != null && !newGenderProfile.getValue().equals(employee.getGender())) {
            edited = true;
        }
        if (newDateOfBirthProfile.getValue() != null) {
            edited = true;
//            if (Period.between(newDateOfBirthProfile.getValue(), LocalDate.now()).getYears() < 18) {
//
//            }
        }
        if (edited) {
            if (!problem) {
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                        for (Department department : faculty.departments) {
                            if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
                                for (Employee employee1 : department.employees) {
                                    if (employee1.equals(employee)) {
                                        if (!newFirstNameProfile.getText().isEmpty()) {
                                            employee1.setFirst_name(newFirstNameProfile.getText());
                                        }
                                        if (!newLastNameProfile.getText().isEmpty()) {
                                            employee1.setLast_name(newLastNameProfile.getText());
                                        }
                                        if (!newNationalIdProfile.getText().isEmpty()) {
                                            employee1.setNationalId(newNationalIdProfile.getText());
                                        }
                                        if (!newPhoneNumberProfile.getText().isEmpty()) {
                                            employee1.setPhoneNumber(newPhoneNumberProfile.getText());
                                        }
                                        if (newGenderProfile.getValue() != null) {
                                            employee1.setGender(newGenderProfile.getValue());
                                        }
                                        if (newDateOfBirthProfile.getValue() != null) {
                                            employee1.setDateOfBirth(newDateOfBirthProfile.getValue());
                                        }
                                        LoginPanelController.employeePerson = employee1;
                                        University.saveFaculties();
                                        for (Employee employee2 : University.allEmployees) {
                                            if (employee2.equals(employee)) {
                                                if (!newFirstNameProfile.getText().isEmpty()) {
                                                    employee2.setFirst_name(newFirstNameProfile.getText());
                                                }
                                                if (!newLastNameProfile.getText().isEmpty()) {
                                                    employee2.setLast_name(newLastNameProfile.getText());
                                                }
                                                if (!newNationalIdProfile.getText().isEmpty()) {
                                                    employee2.setNationalId(newNationalIdProfile.getText());
                                                }
                                                if (!newPhoneNumberProfile.getText().isEmpty()) {
                                                    employee2.setPhoneNumber(newPhoneNumberProfile.getText());
                                                }
                                                if (newGenderProfile.getValue() != null) {
                                                    employee2.setGender(newGenderProfile.getValue());
                                                }
                                                if (newDateOfBirthProfile.getValue() != null) {
                                                    employee2.setDateOfBirth(newDateOfBirthProfile.getValue());
                                                }
                                                Employee.saveAllEmployee();
                                            }
                                        }
                                        errorLabelProfile.setText(null);
                                        successLabelProfile.setText("Profile Edited Successfully");

                                        newFirstNameProfile.clear();
                                        newFirstNameProfile.setPromptText(employee.getFirst_name());
                                        newLastNameProfile.clear();
                                        newLastNameProfile.setPromptText(employee.getLast_name());
                                        newNationalIdProfile.clear();
                                        newNationalIdProfile.setPromptText(employee.getNationalId());
                                        newPhoneNumberProfile.clear();
                                        newPhoneNumberProfile.setPromptText(employee.getPhoneNumber());
                                        newGenderProfile.getSelectionModel().select(employee.getGender());
                                        newDateOfBirthProfile.setValue(null);
                                        newDateOfBirthProfile.setPromptText(employee.getDateOfBirth().getDayOfMonth() + " " + Month.of(employee.getDateOfBirth().getMonthValue()) + " " + employee.getDateOfBirth().getYear());

                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            errorLabelProfile.setText("Fill In At Least One Field");
        }
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
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
    }

    @FXML
    void deactiveProfessor(ActionEvent event) throws Exception {
        successLabelDeactiveProfessor.setText(null);
        University.loadFaculties();
        Professor.loadAllProfessor();
        boolean confirmation = true;
        if (majorChooserDeactiveProfessor.getValue() == null || majorChooserDeactiveProfessor.getValue().equals("Major")) {
            errorLabelMajorDeactiveProfessor.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorDeactiveProfessor.setText(null);
        }
        if (professorChooserDeactiveProfessor.getValue() == null || professorChooserDeactiveProfessor.getValue().equals("Professor")) {
            errorLabelProfessorDeactiveProfessor.setText("Choose Professor");
            confirmation = false;
        } else {
            errorLabelProfessorDeactiveProfessor.setText(null);
        }


        if (confirmation) {
            Employee employee = LoginPanelController.employeePerson;

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserDeactiveProfessor.getValue()) && major.getStatus().equals(Status.Active)) {
                                    for (Professor professor : major.professors){
                                        if (professor.getFullName().equals(professorChooserDeactiveProfessor.getValue())){
                                            professor.setStatus(Status.Inactive);
                                            University.saveFaculties();
                                            for (Professor professor1 : University.allProfessors) {
                                                if (professor1.getFullName().equals(professorChooserDeactiveProfessor.getValue())) {
                                                    professor1.setStatus(Status.Inactive);
                                                    Professor.saveAllProfessor();
                                                    break;
                                                }
                                            }
                                            errorLabelDeactiveProfessor.setText(null);
                                            successLabelDeactiveProfessor.setText("The Professor Deactivated Successfully");
                                            Professor.loadAllProfessor();
                                            majorChooserDeactiveProfessor.getSelectionModel().selectFirst();
                                            majorChooserDeactiveProfessor.setOnAction(event1 -> {
                                                professorChooserDeactiveProfessor.getItems().clear();
                                                professorChooserDeactiveProfessor.getItems().add("Professor");
                                                for (Professor professor1 : University.allProfessors) {
                                                    if (professor1.getStatus().equals(Status.Active)) {
                                                        professorChooserDeactiveProfessor.getItems().add(professor1.getFullName());
                                                    }
                                                }
                                                professorChooserDeactiveProfessor.setVisibleRowCount(5);
                                                professorChooserDeactiveProfessor.getSelectionModel().selectFirst();
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
                    break;
                }
            }
        } else {
            errorLabelDeactiveProfessor.setText("Fill In All Fields");
        }
    }

    @FXML
    void deactiveStudent(ActionEvent event) throws IOException {
        successLabelDeactiveStudent.setText(null);
        University.loadFaculties();
        Student.loadAllStudents();
        boolean confirmation = true;
        if (majorChooserDeactiveStudents.getValue().isEmpty() || majorChooserDeactiveStudents.getValue().equals("Major")) {
            errorLabelMajorDeactiveStudent.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorDeactiveStudent.setText(null);
        }
        if (studentChooserDeactiveStudents.getValue().isEmpty() || studentChooserDeactiveStudents.getValue().equals("Student")) {
            errorLabelStudentDeactiveStudent.setText("Choose Studnet");
            confirmation = false;
        } else {
            errorLabelStudentDeactiveStudent.setText(null);
        }
        if (confirmation) {
            Employee employee = LoginPanelController.employeePerson;

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(employee.getFaculty()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(employee.getDepartment()) && department.getStatus().equals(Status.Active)) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserDeactiveStudents.getValue()) && major.getStatus().equals(Status.Active)) {
                                    for (Student student : major.students){
                                        if (student.getFullName().equals(studentChooserDeactiveStudents.getValue())){
                                            student.setStatus(Status.Inactive);
                                            University.saveFaculties();
                                            for (Student student1 : University.allStudents) {
                                                if (student1.getFullName().equals(studentChooserDeactiveStudents.getValue())) {
                                                    student1.setStatus(Status.Inactive);
                                                    Student.saveAllStudent();
                                                    break;
                                                }
                                            }
                                            errorLabelDeactiveStudent.setText(null);
                                            successLabelDeactiveStudent.setText("The Student Deactivated Successfully");
                                            Student.saveAllStudent();
                                            majorChooserDeactiveStudents.getSelectionModel().selectFirst();
                                            majorChooserDeactiveStudents.setOnAction(event1 -> {
                                                studentChooserDeactiveStudents.getItems().clear();
                                                studentChooserDeactiveStudents.getItems().add("Student");
                                                for (Student student1 : University.allStudents) {
                                                    if (student1.getStatus().equals(Status.Active)) {
                                                        studentChooserDeactiveStudents.getItems().add(student1.getFullName());
                                                    }
                                                }
                                                studentChooserDeactiveStudents.setVisibleRowCount(5);
                                                studentChooserDeactiveStudents.getSelectionModel().selectFirst();
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
                    break;
                }
            }
        } else {
            errorLabelDeactiveStudent.setText("Fill In All Fields");
        }
    }

    @FXML
    void editProfessor(ActionEvent event) throws Exception {
        successLabelEditProfessor.setText(null);
        Professor.loadAllProfessor();
        University.loadFaculties();
        boolean confirmation = true;

        if (!majorChooserEditProfessor.getValue().isEmpty() && !majorChooserEditProfessor.getValue().equals("Major")) {
            errorLabelMajorEditProfessor.setText(null);
            if (professorChooserEditProfessor.getValue().isEmpty() || professorChooserEditProfessor.getValue().equals("Professor")) {
                errorLabelProfessorEditProfessor.setText("Choose Professor");
                confirmation = false;
            } else {
                errorLabelProfessorEditProfessor.setText(null);
            }
        } else {
            errorLabelMajorEditProfessor.setText("Choose Major");
            confirmation = false;
        }
        if (confirmation) {
            Employee employee = LoginPanelController.employeePerson;
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(employee.getFaculty())) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(employee.getDepartment())) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserEditProfessor.getValue())) {
                                    for (Professor professor : major.professors) {
                                        if (professor.getFullName().equals(professorChooserEditProfessor.getValue())) {
                                            boolean edited = false;
                                            boolean problem = false;
                                            if (!nationalIdEditProfessor.getText().isEmpty()) {
                                                errorLabelNationalIdEditProfessor.setText(null);
                                                try {
                                                    long nationalid = Long.parseLong(nationalIdEditProfessor.getText());
                                                    if (nationalIdEditProfessor.getText().length() != 10) {
                                                        errorLabelNationalIdEditProfessor.setText("Enter 10 digit");
                                                        problem = true;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    errorLabelNationalIdEditProfessor.setText("Enter Number");
                                                    problem = true;
                                                }
                                            }
                                            if (!phoneNumberEditProfessor.getText().isEmpty()) {
                                                errorLabelPhoneEditProfessor.setText(null);
                                                try {
                                                    long phone = Long.parseLong(phoneNumberEditProfessor.getText());
                                                    if (phoneNumberEditProfessor.getText().length() != 11) {
                                                        errorLabelPhoneEditProfessor.setText("Enter 11 digit");
                                                        problem = true;
                                                    } else if (phoneNumberEditProfessor.getText().startsWith("09")) {
                                                        errorLabelPhoneEditProfessor.setText("Wrong Format(09..)");
                                                        problem = true;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    errorLabelPhoneEditProfessor.setText("Enter Just Number");
                                                    problem = true;
                                                }
                                            }
                                            if (!problem) {
                                                if (!firstNameEditProfessor.getText().isBlank()) {
                                                    professor.setFirst_name(firstNameEditProfessor.getText());
                                                    edited = true;
                                                }
                                                if (!lastNameEditProfessor.getText().isBlank()) {
                                                    professor.setLast_name(lastNameEditProfessor.getText());
                                                    edited = true;
                                                }
                                                if (!nationalIdEditProfessor.getText().isBlank()) {
                                                    professor.setNationalId(nationalIdEditProfessor.getText());
                                                    edited = true;
                                                }
                                                if (!phoneNumberEditProfessor.getText().isBlank()) {
                                                    professor.setPhoneNumber(phoneNumberEditProfessor.getText());
                                                    edited = true;
                                                }
                                                if (dateOfBirthEditProfessor.getValue() != null) {
                                                    professor.setDateOfBirth(dateOfBirthEditProfessor.getValue());
                                                    edited = true;
                                                }
                                                if (genderChooserEditProfessor.getValue() != null) {
                                                    professor.setGender(Gender.valueOf(genderChooserEditProfessor.getValue()));
                                                    edited = true;
                                                }
                                                if (edited) {
                                                    for (Professor professor1 : University.allProfessors) {
                                                        if (professor1.getFullName().equals(professor.getFullName())) {
                                                            if (!firstNameEditProfessor.getText().isBlank()) {
                                                                professor1.setFirst_name(firstNameEditProfessor.getText());
                                                            }
                                                            if (!lastNameEditProfessor.getText().isBlank()) {
                                                                professor1.setLast_name(lastNameEditProfessor.getText());
                                                            }
                                                            if (!nationalIdEditProfessor.getText().isBlank()) {
                                                                professor1.setNationalId(nationalIdEditProfessor.getText());
                                                            }
                                                            if (!phoneNumberEditProfessor.getText().isBlank()) {
                                                                professor1.setPhoneNumber(phoneNumberEditProfessor.getText());
                                                            }
                                                            if (dateOfBirthEditProfessor.getValue() != null) {
                                                                professor1.setDateOfBirth(dateOfBirthEditProfessor.getValue());
                                                            }
                                                            if (genderChooserEditProfessor.getValue() != null) {
                                                                professor1.setGender(Gender.valueOf(genderChooserEditProfessor.getValue()));
                                                            }
                                                            Professor.saveAllProfessor();
                                                            break;
                                                        }
                                                    }
                                                    University.saveFaculties();
                                                    errorLabelEditProfessor.setText(null);
                                                    successLabelEditProfessor.setText("The Professor Edited Successfully");

                                                    majorChooserEditProfessor.getSelectionModel().selectFirst();
                                                    majorChooserEditProfessor.setOnAction(event1 -> {
                                                        professorChooserEditProfessor.getItems().clear();
                                                        professorChooserEditProfessor.getItems().add("Professor");
                                                        for (Professor professor1 : University.allProfessors) {
                                                            if (professor1.getStatus().equals(Status.Active) && professor1.getMajor().equals(major.getName())) {
                                                                professorChooserEditProfessor.getItems().add(professor1.getFullName());
                                                            }
                                                        }
                                                        professorChooserEditProfessor.setVisibleRowCount(5);
                                                        professorChooserEditProfessor.getSelectionModel().selectFirst();
                                                    });

                                                    firstNameEditProfessor.setText(null);
                                                    lastNameEditProfessor.setText(null);
                                                    nationalIdEditProfessor.setText(null);
                                                    phoneNumberEditProfessor.setText(null);
                                                    dateOfBirthEditProfessor.setValue(null);
                                                    genderChooserEditProfessor.getSelectionModel().selectFirst();
                                                } else {
                                                    errorLabelEditProfessor.setText("Fill In At Least One Field");
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
                    break;
                }
            }
        } else {
            errorLabelEditProfessor.setText("Fill In Major and Professor");
        }
    }

    @FXML
    void editStudent(ActionEvent event) throws IOException {
        successLabelEditStudent.setText(null);
        Student.loadAllStudents();
        University.loadFaculties();
        boolean confirmation = true;

        if (!majorChooserEditStudents.getValue().isEmpty() && !majorChooserEditStudents.getValue().equals("Major")) {
            errorLabelMajorEditStudent.setText(null);
            if (studentChooserEditStudents.getValue().isEmpty() || studentChooserEditStudents.getValue().equals("Student")) {
                errorLabelStudentEditStudent.setText("Choose Student");
                confirmation = false;
            } else {
                errorLabelStudentEditStudent.setText(null);
            }
        } else {
            errorLabelMajorEditStudent.setText("Choose Major");
            confirmation = false;
        }
        if (confirmation) {
            Employee employee = LoginPanelController.employeePerson;
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(employee.getFaculty())) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(employee.getDepartment())) {
                            for (Major major : department.majors) {
                                if (major.getName().equals(majorChooserEditStudents.getValue())) {
                                    for (Student student : major.students) {
                                        if (student.getFullName().equals(studentChooserEditStudents.getValue())) {
                                            boolean edited = false;
                                            boolean problem = false;
                                            if (!nationalIdEditStudents.getText().isEmpty()) {
                                                errorLabelNationalIdEditStudent.setText(null);
                                                try {
                                                    long nationalid = Long.parseLong(nationalIdEditStudents.getText());
                                                    if (nationalIdEditStudents.getText().length() != 10) {
                                                        errorLabelNationalIdEditStudent.setText("Enter 10 digit");
                                                        problem = true;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    errorLabelNationalIdEditStudent.setText("Enter Just Number");
                                                    problem = true;
                                                }
                                            }
                                            if (!phoneNumberEditStudents.getText().isEmpty()) {
                                                errorLabelPhoneEditStudent.setText(null);
                                                try {
                                                    long phone = Long.parseLong(phoneNumberEditStudents.getText());
                                                    if (phoneNumberEditStudents.getText().length() != 11) {
                                                        errorLabelPhoneEditStudent.setText("Enter 11 digit");
                                                        problem = true;
                                                    } else if (phoneNumberEditStudents.getText().startsWith("09")) {
                                                        errorLabelPhoneEditStudent.setText("Wrong Format(09..)");
                                                        problem = true;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    errorLabelPhoneEditStudent.setText("Enter Just Number");
                                                    problem = true;
                                                }
                                            }
                                            if (!problem) {
                                                if (!firstNameEditStudents.getText().isBlank()) {
                                                    student.setFirst_name(firstNameEditStudents.getText());
                                                    edited = true;
                                                }
                                                if (!lastNameEditStudents.getText().isBlank()) {
                                                    student.setLast_name(lastNameEditStudents.getText());
                                                    edited = true;
                                                }
                                                if (!nationalIdEditStudents.getText().isBlank()) {
                                                    student.setNationalId(nationalIdEditStudents.getText());
                                                    edited = true;
                                                }
                                                if (!phoneNumberEditStudents.getText().isBlank()) {
                                                    student.setPhoneNumber(phoneNumberEditStudents.getText());
                                                    edited = true;
                                                }
                                                if (dateOfBirthEditStudents.getValue() != null) {
                                                    student.setDateOfBirth(dateOfBirthEditStudents.getValue());
                                                    edited = true;
                                                }
                                                if (genderChooserEditStudents.getValue() != null) {
                                                    student.setGender(Gender.valueOf(genderChooserEditStudents.getValue()));
                                                    edited = true;
                                                }
                                                if (edited) {
                                                    for (Student student1 : University.allStudents) {
                                                        if (student1.getFullName().equals(student.getFullName())) {
                                                            if (!firstNameEditStudents.getText().isBlank()) {
                                                                student1.setFirst_name(firstNameEditStudents.getText());
                                                            }
                                                            if (!lastNameEditStudents.getText().isBlank()) {
                                                                student1.setLast_name(lastNameEditStudents.getText());
                                                            }
                                                            if (!nationalIdEditStudents.getText().isBlank()) {
                                                                student1.setNationalId(nationalIdEditStudents.getText());
                                                            }
                                                            if (!phoneNumberEditStudents.getText().isBlank()) {
                                                                student1.setPhoneNumber(phoneNumberEditStudents.getText());
                                                            }
                                                            if (dateOfBirthEditStudents.getValue() != null) {
                                                                student1.setDateOfBirth(dateOfBirthEditStudents.getValue());
                                                            }
                                                            if (genderChooserEditStudents.getValue() != null) {
                                                                student1.setGender(Gender.valueOf(genderChooserEditStudents.getValue()));
                                                            }
                                                            Student.saveAllStudent();
                                                            break;
                                                        }
                                                    }
                                                    University.saveFaculties();
                                                    errorLabelEditStudent.setText(null);
                                                    successLabelEditStudent.setText("The Student Edited Successfully");

                                                    majorChooserEditStudents.getSelectionModel().selectFirst();
                                                    majorChooserEditStudents.setOnAction(event1 -> {
                                                        studentChooserEditStudents.getItems().clear();
                                                        studentChooserEditStudents.getItems().add("Professor");
                                                        for (Student student1 : University.allStudents) {
                                                            if (student1.getStatus().equals(Status.Active) && student1.getMajor().equals(major.getName())) {
                                                                studentChooserEditStudents.getItems().add(student1.getFullName());
                                                            }
                                                        }
                                                        studentChooserEditStudents.setVisibleRowCount(5);
                                                        studentChooserEditStudents.getSelectionModel().selectFirst();
                                                    });

                                                    firstNameEditStudents.setText(null);
                                                    lastNameEditStudents.setText(null);
                                                    nationalIdEditStudents.setText(null);
                                                    phoneNumberEditStudents.setText(null);
                                                    dateOfBirthEditStudents.setValue(null);
                                                    genderChooserEditStudents.getSelectionModel().selectFirst();
                                                } else {
                                                    errorLabelEditStudent.setText("Fill In At Least One Field");
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
                    break;
                }
            }
        } else {
            errorLabelEditStudent.setText("Fill In Major and Student");
        }
    }

    @FXML
    void profileDashboard(ActionEvent event) {
        University.loadFaculties();
        Employee.loadAllEmployee();
        Employee employee = LoginPanelController.employeePerson;
        headerTitle.setText(" --> Profile");

        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
        profileAnchorPane.setVisible(true);
        profileScrollPane.getStyleClass().add("pressed");

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

        newDateOfBirthProfile.setPromptText(employee.getDateOfBirth().getDayOfMonth() + " " + Month.of(employee.getDateOfBirth().getMonthValue()) + " " + employee.getDateOfBirth().getYear());
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
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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

        newDateOfBirthProfile.setPromptText(employee.getDateOfBirth().getDayOfMonth() + " " + Month.of(employee.getDateOfBirth().getMonthValue()) + " " + employee.getDateOfBirth().getYear()); // must work on dates of Date
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

        errorLabelFirstNameRegisterProfessor.setText(null);
        errorLabelLastNameRegisterProfessor.setText(null);
        errorLabelDateOfBirthRegisterProfessor.setText(null);
        errorLabelGenderRegisterProfessor.setText(null);
        errorLabelNationalIdRegisterProfessor.setText(null);
        errorLabelPhoneRegisterProfessor.setText(null);
        errorLabelMajorRegisterProfessor.setText(null);
        errorLabelRegisterProfessor.setText(null);
        successLabelRegisterProfessor.setText(null);
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
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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

        errorLabelFirstNameRegisterProfessor.setText(null);
        errorLabelLastNameRegisterProfessor.setText(null);
        errorLabelDateOfBirthRegisterProfessor.setText(null);
        errorLabelGenderRegisterProfessor.setText(null);
        errorLabelNationalIdRegisterProfessor.setText(null);
        errorLabelPhoneRegisterProfessor.setText(null);
        errorLabelMajorRegisterProfessor.setText(null);
        errorLabelRegisterProfessor.setText(null);
        successLabelRegisterProfessor.setText(null);
    }

    @FXML
    void registerStudentDashboard(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Register New Student");

        Employee employee = LoginPanelController.employeePerson;
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
        genderChooserRegisterStudent.setVisibleRowCount(3);
        genderChooserRegisterStudent.getSelectionModel().selectFirst();

        majorChooserRegisterStudent.getItems().clear();
        majorChooserRegisterStudent.getItems().add("Major");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                for (Department department : faculty.departments) {
                    if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
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

        majorChooserRegisterStudent.setOnAction(event1 -> {
            degreeChooserRegisterStudent.getItems().clear();
            degreeChooserRegisterStudent.getItems().add("Degree");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
                            for (Major major : department.majors) {
                                if (major.getStatus().equals(Status.Active) && major.getName().equals(majorChooserRegisterStudent.getValue())) {
                                    for (Degree degree : major.degrees) {
                                        String selectedValue = degreeChooserRegisterStudent.getValue();
                                        if (degree.getClass().getSimpleName().equals("Bachelor") &&
                                                (selectedValue == null || !selectedValue.contains("Bachelor"))) {
                                            degreeChooserRegisterStudent.getItems().add("Bachelor");
                                        } else if (degree.getClass().getSimpleName().equals("Master") &&
                                                (selectedValue == null || !selectedValue.contains("Master"))) {
                                            degreeChooserRegisterStudent.getItems().add("Master");
                                        } else if (degree.getClass().getSimpleName().equals("PHD") &&
                                                (selectedValue == null || !selectedValue.contains("PHD"))) {
                                            degreeChooserRegisterStudent.getItems().add("PHD");
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
            degreeChooserRegisterStudent.setVisibleRowCount(4);
            degreeChooserRegisterStudent.getSelectionModel().selectFirst();

        });

        errorLabelFirstNameRegisterStudent.setText(null);
        errorLabelLastNameRegisterStudent.setText(null);
        errorLabelNationalIdRegisterStudent.setText(null);
        errorLabelPhoneRegisterStudent.setText(null);
        errorLabelGenderRegisterStudent.setText(null);
        errorLabelDateOfBirthRegisterStudent.setText(null);
        errorLabelMajorRegisterStudent.setText(null);
        errorLabelDegreeRegisterStudent.setText(null);
        errorLabelRegisterStudent.setText(null);
        successLabelRegisterStudent.setText(null);
    }

    @FXML
    void registerStudentScrollPane(ActionEvent event) {
        University.loadFaculties();
        headerTitle.setText(" --> Register New Student");
        Employee employee = LoginPanelController.employeePerson;

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
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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

        majorChooserRegisterStudent.getItems().clear();
        majorChooserRegisterStudent.getItems().add("Major");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                for (Department department : faculty.departments) {
                    if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
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

        majorChooserRegisterStudent.setOnAction(event1 -> {
            degreeChooserRegisterStudent.getItems().clear();
            degreeChooserRegisterStudent.getItems().add("Degree");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
                            for (Major major : department.majors) {
                                if (major.getStatus().equals(Status.Active) && major.getName().equals(majorChooserRegisterStudent.getValue())) {
                                    for (Degree degree : major.degrees) {
                                        if (degree.getClass().getSimpleName().equals("Bachelor") && !degreeChooserRegisterStudent.getValue().contains("Bachelor")) {
                                            degreeChooserRegisterStudent.getItems().add("Bachelor");
                                        } else if (degree.getClass().getSimpleName().equals("Master") && !degreeChooserRegisterStudent.getValue().contains("Master")) {
                                            degreeChooserRegisterStudent.getItems().add("Master");
                                        } else if (degree.getClass().getSimpleName().equals("PHD") && !degreeChooserRegisterStudent.getValue().contains("PHD")) {
                                            degreeChooserRegisterStudent.getItems().add("PHD");
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
            degreeChooserRegisterStudent.setVisibleRowCount(4);
            degreeChooserRegisterStudent.getSelectionModel().selectFirst();

        });

        errorLabelFirstNameRegisterStudent.setText(null);
        errorLabelLastNameRegisterStudent.setText(null);
        errorLabelNationalIdRegisterStudent.setText(null);
        errorLabelPhoneRegisterStudent.setText(null);
        errorLabelGenderRegisterStudent.setText(null);
        errorLabelDateOfBirthRegisterStudent.setText(null);
        errorLabelMajorRegisterStudent.setText(null);
        errorLabelDegreeRegisterStudent.setText(null);
        errorLabelRegisterStudent.setText(null);
        successLabelRegisterStudent.setText(null);
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
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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
        Employee employee = LoginPanelController.employeePerson;

        if (operationChooserUpdateProfessor.getValue() != null) {
            if (operationChooserUpdateProfessor.getValue().equals("Edit")) {
                editProfessorVbox.setVisible(true);
                deactiveProfessorVbox.setVisible(false);

                firstNameEditProfessor.clear();
                lastNameEditProfessor.clear();
                phoneNumberEditProfessor.clear();
                nationalIdEditProfessor.clear();
                dateOfBirthEditProfessor.setValue(null);

                majorChooserEditProfessor.getItems().clear();
                majorChooserEditProfessor.getItems().add("Major");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                        for (Department department : faculty.departments) {
                            if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
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

                majorChooserDeactiveProfessor.getItems().clear();
                majorChooserDeactiveProfessor.getItems().add("Major");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                        for (Department department : faculty.departments) {
                            if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
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
            Employee employee = LoginPanelController.employeePerson;
            if (operationChooserUpdateStudent.getValue().equals("Edit")) {
                editStudentVbox.setVisible(true);
                deactiveStudentsVbox.setVisible(false);

                firstNameEditStudents.clear();
                lastNameEditStudents.clear();
                phoneNumberEditStudents.clear();
                nationalIdEditStudents.clear();
                dateOfBirthEditStudents.setValue(null);


                majorChooserEditStudents.getItems().clear();
                majorChooserEditStudents.getItems().add("Major");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                        for (Department department : faculty.departments) {
                            if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
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

                majorChooserEditStudents.setOnAction(event1 -> {
                    studentChooserEditStudents.getItems().clear();
                    studentChooserEditStudents.getItems().add("Professor");
                    for (Student student : University.allStudents) {
                        if (student.getStatus().equals(Status.Active) && majorChooserEditStudents.getValue().equals(student.getMajor())
                                && student.getFaculty().equals(employee.getFaculty()) && student.getDepartment().equals(employee.getDepartment())) {
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

                majorChooserDeactiveStudents.getItems().clear();
                majorChooserDeactiveStudents.getItems().add("Major");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(employee.getFaculty())) {
                        for (Department department : faculty.departments) {
                            if (department.getStatus().equals(Status.Active) && department.getName().equals(employee.getDepartment())) {
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

                majorChooserDeactiveStudents.setOnAction(event1 -> {
                    studentChooserDeactiveStudents.getItems().clear();
                    studentChooserDeactiveStudents.getItems().add("Professor");
                    for (Student student : University.allStudents) {
                        if (student.getStatus().equals(Status.Active) && majorChooserDeactiveStudents.getValue().equals(student.getMajor())
                                && student.getFaculty().equals(employee.getFaculty()) && student.getDepartment().equals(employee.getDepartment())) {
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
    void setProfessorChooserEdit(ActionEvent event) throws Exception {
        Professor.loadAllProfessor();
        for (Professor professor : University.allProfessors) {
            if (professor.getFullName().equals(professorChooserEditProfessor.getValue())) {
                firstNameEditProfessor.setPromptText(professor.getFirst_name());
                lastNameEditProfessor.setPromptText(professor.getLast_name());
                nationalIdEditProfessor.setPromptText(professor.getNationalId());
                phoneNumberEditProfessor.setPromptText(professor.getPhoneNumber());
                genderChooserEditProfessor.getSelectionModel().select("Male");
                dateOfBirthEditProfessor.setPromptText(professor.getDateOfBirth().getDayOfMonth() + " " + Month.of(professor.getDateOfBirth().getMonthValue()) + " " + professor.getDateOfBirth().getYear());
            }
        }
    }

    @FXML
    void setStudentChooserDeactive(ActionEvent event) {

    }

    @FXML
    void setStudentChooserEdit(ActionEvent event) {
        Student.loadAllStudents();
        for (Student student : University.allStudents) {
            if (student.getFullName().equals(studentChooserEditStudents.getValue())) {
                firstNameEditStudents.setPromptText(student.getFirst_name());
                lastNameEditStudents.setPromptText(student.getLast_name());
                phoneNumberEditStudents.setPromptText(student.getPhoneNumber());
                nationalIdEditStudents.setPromptText(student.getNationalId());
                dateOfBirthEditStudents.setPromptText(student.getDateOfBirth().getDayOfMonth() + " " + Month.of(student.getDateOfBirth().getMonthValue()) + " " + student.getDateOfBirth().getYear());
                genderChooserEditStudents.getSelectionModel().select("Male");
            }
        }
    }

    public boolean isDateInRange(LocalDate date, LocalDate dateStart, LocalDate dateEnd) {
        return (date.isAfter(dateStart) || date.isEqual(dateStart)) && (date.isBefore(dateEnd) || date.isEqual(dateEnd));
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
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (addRandomStudentsAnchorPane.isVisible()) {
            addRandomStudentsAnchorPane.setVisible(false);
            addRandomStudentsScrollPane.getStyleClass().remove("pressed");
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

    @FXML
    void courseGroupsReports() {
        courseGroupReportAnchorPane.setVisible(true);
        reportsVbox.setVisible(false);

    }

    @FXML
    void coursesReports() {
        courseReportAnchorPane.setVisible(true);
        reportsVbox.setVisible(false);
    }

    @FXML
    void degreesReports() {
        degreeReportAnchorPane.setVisible(true);
        reportsVbox.setVisible(false);
    }

    @FXML
    void majorsReports() {
        headerTitle.setText(" --> Reports --> Majors");
        majorReportAnchorPane.setVisible(true);
        reportsVbox.setVisible(false);

        searchFieldReportMajor.clear();
        searchFieldReportMajor.setPromptText("Search ...");

        colNameReportMajor.setCellValueFactory(cellData -> cellData.getValue().majorNameProperty());
        colIdReportMajor.setCellValueFactory(cellData -> cellData.getValue().majorIdProperty());
        colFacultyReportMajor.setCellValueFactory(cellData -> cellData.getValue().facultyProperty());
        colDepartmentReportMajor.setCellValueFactory(cellData -> cellData.getValue().departmentProperty());
        colEstYearReportMajor.setCellValueFactory(cellData -> cellData.getValue().establishmentYearProperty().asObject());
        colStatusReportMajor.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
        majorList = FXCollections.observableArrayList();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    majorList.add(new MajorReport(major.getName(), major.getId(), faculty.getFacultyName(), department.getName(), major.getEstablishmentYear(), major.getStatus().toString()));
                }
            }
        }
        filteredListReportMajor = new FilteredList<>(majorList, majorReport -> true);
        tableViewReportMajor.setItems(filteredListReportMajor);

        setupStatusContextMenuReportMajor();
    }

    @FXML
    void peopleReports() {
        headerTitle.setText(" --> Reports --> People");
        peopleReportAnchorPane.setVisible(true);
        reportsVbox.setVisible(false);

        searchFieldPeople.clear();
        searchFieldPeople.setPromptText("Search ...");

        // People
        colNameReportPeople.setCellValueFactory(data -> data.getValue().fullNameProperty());
        colAgeReportPeople.setCellValueFactory(data -> data.getValue().ageProperty().asObject());
        colGenderReportPeople.setCellValueFactory(data -> data.getValue().genderProperty());
        colPhoneReportPeople.setCellValueFactory(data -> data.getValue().phoneNumberProperty());
        colNationalIDReportPeople.setCellValueFactory(data -> data.getValue().nationalIdProperty());
        colRoleReportPeople.setCellValueFactory(data -> data.getValue().roleProperty());
        colIDReportPeople.setCellValueFactory(data -> data.getValue().idProperty());
        colDateOfRegisterReportPeople.setCellValueFactory(data -> data.getValue().dateOfRegistrationProperty());
        colFacultyReportPeople.setCellValueFactory(data -> data.getValue().facultyProperty());
        colDepartmentReportPeople.setCellValueFactory(data -> data.getValue().departmentProperty());
        colMajorReportPeople.setCellValueFactory(data -> data.getValue().majorProperty());
        colDegreeReportPeople.setCellValueFactory(data -> data.getValue().degreeProperty());
        colStatusReportPeople.setCellValueFactory(data -> data.getValue().statusProperty());


        try {
            Professor.loadAllProfessor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Student.loadAllStudents();


        peopleList = FXCollections.observableArrayList();

        for (Professor professor : University.allProfessors) {
            peopleList.add(new People(professor.getFirst_name(), professor.getLast_name(), professor.getDateOfBirth(), professor.getNationalId(),
                    professor.getGender(), professor.getPhoneNumber(), professor.getDateOfJoin(), "Professor", professor.getId(),
                    professor.getFaculty(), professor.getDepartment(), professor.getMajor(), "----", professor.getStatus()));
        }

        for (Student student : University.allStudents) {
            peopleList.add(new People(student.getFirst_name(), student.getLast_name(), student.getDateOfBirth(), student.getNationalId(),
                    student.getGender(), student.getPhoneNumber(), student.getDateOfJoin(), "Student", student.getId(),
                    student.getFaculty(), student.getDepartment(), student.getMajor(), "----", student.getStatus()));
        }



        filteredListReportPeople = new FilteredList<>(peopleList, people -> true);
        tableViewReportPeople.setItems(filteredListReportPeople);

        setupGenderContextMenuPeople();
        setupStatusContextMenuPeople();
        setupRoleContextMenuPeople();
    }

    //    Reports ----->>> Majors
    private void setupStatusContextMenuReportMajor() {
        ContextMenu statusMenu = new ContextMenu();
        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> filterStatus("Active"));
        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterStatus("Inactive"));
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportMajor.setItems(majorList));

        statusMenu.getItems().addAll(active, inactive, allItem);
        colStatusReportMajor.setContextMenu(statusMenu);
    }

    @FXML
    private void filterStatus(String status) {
        filteredListReportMajor.setPredicate(majorReport -> majorReport.getStatus().equalsIgnoreCase(status));
        tableViewReportMajor.setItems(filteredListReportMajor);
    }

    @FXML
    private void onSearchReportMajor() {
        String keyword = searchFieldReportMajor.getText().toLowerCase().trim();
        if (keyword.isEmpty()) {
            filteredListReportMajor.setPredicate(p -> true);
            return;
        }
        filteredListReportMajor.setPredicate(majorReport ->
                majorReport.getMajorName().toLowerCase().contains(keyword) ||
                        String.valueOf(majorReport.getEstablishmentYear()).contains(keyword) ||
                        majorReport.getFaculty().contains(keyword) ||
                        majorReport.getDepartment().contains(keyword) ||
                        majorReport.getMajorId().contains(keyword) ||
                        majorReport.getStatus().toLowerCase().contains(keyword)
        );
    }

    public void onBackReportMajor(ActionEvent event) {
        headerTitle.setText(" --> Reports");
        majorReportAnchorPane.setVisible(false);
        reportsVbox.setVisible(true);
    }
    //    Reports ----->>> People
    private void setupGenderContextMenuPeople() {
        ContextMenu genderMenu = new ContextMenu();

        MenuItem male = new MenuItem("Male");
        male.setOnAction(e -> filterByGenderPeople("Male"));

        MenuItem female = new MenuItem("Female");
        female.setOnAction(e -> filterByGenderPeople("Female"));

        MenuItem allGender = new MenuItem("All");
        allGender.setOnAction(e -> {
            filteredListReportPeople.setPredicate(p -> true);
            tableViewReportPeople.setItems(filteredListReportPeople);
        });

        genderMenu.getItems().addAll(male, female, allGender);
        colGenderReportPeople.setContextMenu(genderMenu);
    }
    private void filterByGenderPeople(String gender) {
        filteredListReportPeople.setPredicate(people -> people.getGender().equalsIgnoreCase(gender));
    }

    private void setupStatusContextMenuPeople() {
        ContextMenu statusMenu = new ContextMenu();

        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> filterByStatus("Active"));
        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterByStatus("Inactive"));

        MenuItem allStatus = new MenuItem("All");
        allStatus.setOnAction(e -> {
            filteredListReportPeople.setPredicate(p -> true);
            tableViewReportPeople.setItems(filteredListReportPeople);
        });

        statusMenu.getItems().addAll(active, inactive, allStatus);
        colStatusReportPeople.setContextMenu(statusMenu);
    }
    private void filterByStatus(String status) {
        filteredListReportPeople.setPredicate(people -> people.getStatus().equalsIgnoreCase(status));

    }

    private void setupRoleContextMenuPeople() {
        ContextMenu roleMenu = new ContextMenu();

        MenuItem professor = new MenuItem("Professor");
        professor.setOnAction(e -> filterByRolePeople("Professor"));
        MenuItem student = new MenuItem("Student");
        student.setOnAction(e -> filterByRolePeople("Student"));
        MenuItem allRole = new MenuItem("All");
        allRole.setOnAction(e -> {
            filteredListReportPeople.setPredicate(p -> true);
            tableViewReportPeople.setItems(filteredListReportPeople);
        });

        roleMenu.getItems().addAll(professor, student, allRole);
        colRoleReportPeople.setContextMenu(roleMenu);
    }

    private void filterByRolePeople(String role) {
        filteredListReportPeople.setPredicate(people -> people.getRole().equalsIgnoreCase(role));
    }

    @FXML
    private void onSearchPeople() {
        String keyword = searchFieldPeople.getText().toLowerCase().trim();
        if (keyword.isEmpty()) {
            filteredListReportPeople.setPredicate(p -> true);
            return;
        }
        filteredListReportPeople.setPredicate(people ->
                people.getFullName().toLowerCase().contains(keyword) ||
                        String.valueOf(people.getAge()).contains(keyword) ||
                        people.getGender().toLowerCase().contains(keyword) ||
                        people.getPhoneNumber().toLowerCase().contains(keyword) ||
                        people.getNationalId().toLowerCase().contains(keyword) ||
                        people.getId().toLowerCase().contains(keyword) ||
                        people.getDateOfJoin().toLowerCase().contains(keyword) ||
                        people.getFaculty().toLowerCase().contains(keyword) ||
                        people.getDepartment().toLowerCase().contains(keyword) ||
                        people.getMajor().toLowerCase().contains(keyword) ||
                        people.getDegree().toLowerCase().contains(keyword) ||
                        people.getStatus().toLowerCase().contains(keyword)
        );
    }

    @FXML
    private void onBackPeople() {
        headerTitle.setText(" --> Reports");
        peopleReportAnchorPane.setVisible(false);
        reportsVbox.setVisible(true);
    }

//    Reports ----->>> Done

    @FXML
    void semestersReports() {
        headerTitle.setText(" --> Reports --> Semesters");
        semesterReportAnchorPane.setVisible(true);
        reportsVbox.setVisible(false);
    }
}

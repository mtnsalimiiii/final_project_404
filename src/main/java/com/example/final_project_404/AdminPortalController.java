package com.example.final_project_404;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;

public class AdminPortalController {

    public Label errorLabelDeactiveSemester;

    @FXML
    private Button deactiveEmergencyDropButton;

    @FXML
    private Button activeEmergencyDropButton;

    @FXML
    private AnchorPane emergencyDropAnchorPane;

    @FXML
    private AnchorPane addDepartmentAnchorPane;

    @FXML
    private Button addDepartmentScrollPane;

    @FXML
    private AnchorPane addEmployeeAnchorPane;

    @FXML
    private Button addEmployeeScrollPane;

    @FXML
    private AnchorPane addFacultyAnchorPane;

    @FXML
    private Button addFacultyScrollPane;

    @FXML
    private AnchorPane addMajorAnchorPane;

    @FXML
    private Button addMajorScrollPane;

    @FXML
    private AnchorPane addSemesterAnchorPane;

    @FXML
    private Button addSemesterScrollPane;

    @FXML
    private ScrollPane buttonsScrollPane;

    @FXML
    private AnchorPane coursesReportsAnchorPane;

    @FXML
    private AnchorPane courseGroupsReportsAnchorPane;

    @FXML
    private AnchorPane dashboardAnchorPane;

    @FXML
    private Label dashboardText;

    @FXML
    private DatePicker dateOfBirthAddEmployee;

    @FXML
    private DatePicker dateOfBirthEditEmployee;

    @FXML
    private VBox deactiveDepartmentVbox;

    @FXML
    private VBox deactiveEmployeeVbox;

    @FXML
    private VBox deactiveFacultyVbox;

    @FXML
    private VBox deactiveMajorVbox;

    @FXML
    private AnchorPane departmentsReportsAnchorPane;

    @FXML
    private ComboBox<String> departmentChooserAddEmployee;

    @FXML
    private ComboBox<String> departmentChooserAddMajor;

    @FXML
    private ComboBox<String> departmentChooserDeactiveDepartment;

    @FXML
    private ComboBox<String> departmentChooserDeactiveEmployee;

    @FXML
    private ComboBox<String> departmentChooserDeactiveMajor;

    @FXML
    private ComboBox<String> departmentChooserEditDepartment;

    @FXML
    private ComboBox<String> departmentChooserEditEmployee;

    @FXML
    private ComboBox<String> departmentChooserEditMajor;

    @FXML
    private TextField departmentNameAddDepartment;

    @FXML
    private VBox editDepartmentVbox;

    @FXML
    private VBox editEmployeeVbox;

    @FXML
    private VBox editFacultyVbox;

    @FXML
    private VBox editMajorVbox;

    @FXML
    private AnchorPane enrollmentAnchorPane;

    @FXML
    private Button enrollmentScrollPane;

    @FXML
    private Button emergencyDropScrollPane;

    @FXML
    private ComboBox<String> employeeChooserDeactiveEmployee;

    @FXML
    private ComboBox<String> employeeChooserEditEmployee;

    @FXML
    private Label errorLabelAddDepartment;

    @FXML
    private Label errorLabelAddEmployee;

    @FXML
    private Label errorLabelAddFaculty;

    @FXML
    private Label errorLabelAddMajor;

    @FXML
    private Label errorLabelAddSemester;

    @FXML
    private Label errorLabelDateOfBirthAddEmployee;

    @FXML
    private Label errorLabelDateOfBirthEditEmployee;

    @FXML
    private Label errorLabelDeactiveDepartment;

    @FXML
    private Label errorLabelDeactiveEmployee;

    @FXML
    private Label errorLabelDeactiveFaculty;

    @FXML
    private Label errorLabelDeactiveMajor;

    @FXML
    private Label errorLabelDepartmentChooserAddEmployee;

    @FXML
    private Label errorLabelDepartmentChooserAddMajor;

    @FXML
    private Label errorLabelDepartmentChooserDeactiveDepartment;

    @FXML
    private Label errorLabelDepartmentChooserDeactiveEmployee;

    @FXML
    private Label errorLabelDepartmentChooserDeactiveMajor;

    @FXML
    private Label errorLabelDepartmentChooserEditDepartment;

    @FXML
    private Label errorLabelDepartmentChooserEditEmployee;

    @FXML
    private Label errorLabelDepartmentChooserEditMajor;

    @FXML
    private Label errorLabelDepartmentNameEditDepartment;

    @FXML
    private Label errorLabelEditDepartment;

    @FXML
    private Label errorLabelEditEmployee;

    @FXML
    private Label errorLabelEditFaculty;

    @FXML
    private Label errorLabelEditMajor;

    @FXML
    private Label errorLabelEmployeeChooserDeactiveEmployee;

    @FXML
    private Label errorLabelEmployeeChooserEditEmployee;

    @FXML
    private Label errorLabelEstYearAddDepartment;

    @FXML
    private Label errorLabelEstYearAddMajor;

    @FXML
    private Label errorLabelEstYearEditDepartment;

    @FXML
    private Label errorLabelEstYearEditMajor;

    @FXML
    private Label errorLabelEstablishmentEditFaculty;

    @FXML
    private Label errorLabelEstablishmentYearAddFaculty;

    @FXML
    private Label errorLabelFacultyChooserAddDepartment;

    @FXML
    private Label errorLabelFacultyChooserAddEmployee;

    @FXML
    private Label errorLabelFacultyChooserAddMajor;

    @FXML
    private Label errorLabelFacultyChooserDeactiveDepartment;

    @FXML
    private Label errorLabelFacultyChooserDeactiveEmployee;

    @FXML
    private Label errorLabelFacultyChooserDeactiveFaculty;

    @FXML
    private Label errorLabelFacultyChooserDeactiveMajor;

    @FXML
    private Label errorLabelFacultyChooserEditDepartment;

    @FXML
    private Label errorLabelFacultyChooserEditEmployee;

    @FXML
    private Label errorLabelFacultyChooserEditFaculty;

    @FXML
    private Label errorLabelFacultyChooserEditMajor;

    @FXML
    private Label errorLabelFacultyNameAddFaculty;

    @FXML
    private Label errorLabelFacultyNameEditFaculty;

    @FXML
    private Label errorLabelFirstNameAddEmployee;

    @FXML
    private Label errorLabelFirstNameEditEmployee;

    @FXML
    private Label errorLabelGenderChooserAddEmployee;

    @FXML
    private Label errorLabelGenderChooserEditEmployee;

    @FXML
    private Label errorLabelLastNameAddEmployee;

    @FXML
    private Label errorLabelLastNameEditEmployee;

    @FXML
    private Label errorLabelMajorChooserDeactiveMajor;

    @FXML
    private Label errorLabelMajorChooserEditMajor;

    @FXML
    private Label errorLabelMajorNameAddMajor;

    @FXML
    private Label errorLabelMajorNameEditMajor;

    @FXML
    private Label errorLabelNameAddDepartment;

    @FXML
    private Label errorLabelNationalIdAddEmployee;

    @FXML
    private Label errorLabelNationalIdEditEmployee;

    @FXML
    private Label errorLabelPhoneNumberAddEmployee;

    @FXML
    private Label errorLabelPhoneNumberEditEmployee;

    @FXML
    private Label errorLabelSemesterCodeAddSemester;

    @FXML
    private TextField establishmentYearAddDepartment;

    @FXML
    private TextField establishmentYearAddFaculty;

    @FXML
    private TextField establishmentYearAddMajor;

    @FXML
    private ComboBox<String> facultyChooserAddDepartment;

    @FXML
    private ComboBox<String> facultyChooserAddEmployee;

    @FXML
    private ComboBox<String> facultyChooserAddMajor;

    @FXML
    private ComboBox<String> facultyChooserDeactiveDepartment;

    @FXML
    private ComboBox<String> facultyChooserDeactiveEmployee;

    @FXML
    private ComboBox<String> facultyChooserDeactiveFaculty;

    @FXML
    private ComboBox<String> facultyChooserDeactiveMajor;

    @FXML
    private ComboBox<String> facultyChooserEditDepartment;

    @FXML
    private ComboBox<String> facultyChooserEditEmployee;

    @FXML
    private ComboBox<String> facultyChooserEditFaculty;

    @FXML
    private ComboBox<String> facultyChooserEditMajor;

    @FXML
    private AnchorPane facultiesReportsAnchorPane;

    @FXML
    private TextField facultyNameAddFaculty;

    @FXML
    private TextField firstNameAddEmployee;

    @FXML
    private ComboBox<String> genderChooserAddEmployee;

    @FXML
    private ComboBox<String> genderChooserEditEmployee;

    @FXML
    private HBox headerHBox;

    @FXML
    private Label headerTitle;

    @FXML
    private TextField lastNameAddEmployee;

    @FXML
    private ComboBox<String> majorChooserDeactiveMajor;

    @FXML
    private ComboBox<String> majorChooserEditMajor;

    @FXML
    private TextField majorNameAddMajor;

    @FXML
    private AnchorPane majorsReportsAnchorPane;

    @FXML
    private TextField nationalIdAddEmployee;

    @FXML
    private TextField nationalIdEditEmployee;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TextField newDepartmentNameEditDepartment;

    @FXML
    private TextField newEstablishmentYearEditDepartment;

    @FXML
    private TextField newEstablishmentYearEditFaculty;

    @FXML
    private TextField newEstablishmentYearEditMajor;

    @FXML
    private TextField newFacultyNameEditFaculty;

    @FXML
    private TextField newFirstNameEditEmployee;

    @FXML
    private TextField newLastNameEditEmployee;

    @FXML
    private TextField newMajorNameEditMajor;

    @FXML
    private ComboBox<String> operationChooserUpdateDepartment;

    @FXML
    private ComboBox<String> operationChooserUpdateEmployee;

    @FXML
    private ComboBox<String> operationChooserUpdateFaculty;

    @FXML
    private ComboBox<String> operationChooserUpdateMajor;

    @FXML
    private AnchorPane peopleReportsAnchorPane;

    @FXML
    private TextField phoneNumberAddEmployee;

    @FXML
    private TextField phoneNumberEditEmployee;

    @FXML
    private AnchorPane reportsAnchorPane;

    @FXML
    private Button reportsScrollPane;

    @FXML
    private Button deactiveSemesterScrollPane;
    //    Reports
    //Departments
    @FXML private TableView<DepartmentReport> tableViewReportDepartment;
    @FXML private TableColumn<DepartmentReport, String> colDepartmentNameReportDepartment;
    @FXML private TableColumn<DepartmentReport, String> colDepartmentIDReportDepartment;
    @FXML private TableColumn<DepartmentReport, String> colFacultyReportDepartment;
    @FXML private TableColumn<DepartmentReport, String> colEstYearReportDepartment;
    @FXML private TableColumn<DepartmentReport, String> colStatusReportDepartment;
    @FXML private TextField searchFieldReportDepartment;

    private ObservableList<DepartmentReport> departmentList;
    private FilteredList<DepartmentReport> filteredListReportDepartment;
    //Faculties
    @FXML private TableView<FacultyReport> tableViewReportFaculty;
    @FXML private TableColumn<FacultyReport, String> colNameReportFaculty;
    @FXML private TableColumn<FacultyReport, String> colIDReportFaculty;
    @FXML private TableColumn<FacultyReport, Integer> colEstablishmentReportFaculty;
    @FXML private TableColumn<FacultyReport, String> colStatusReportFaculty;
    @FXML private TextField searchFieldFaculties;

    private ObservableList<FacultyReport> facultyList;
    private FilteredList<FacultyReport> filteredListReportFaculty;
    //Majors
    @FXML private TableView<MajorReport> tableViewReportMajors;
    @FXML private TableColumn<MajorReport, String> colNameReportMajors;
    @FXML private TableColumn<MajorReport, String> colIdReportMajors;
    @FXML private TableColumn<MajorReport, String> colFacultyReportMajors;
    @FXML private TableColumn<MajorReport, String> colDepartmentReportMajors;
    @FXML private TableColumn<MajorReport, Integer> colEstablishmentYearReportMajors;
    @FXML private TableColumn<MajorReport, String> colStatusReportMajors;
    @FXML private TextField searchFieldReportMajors;

    private ObservableList<MajorReport> majorList;
    private FilteredList<MajorReport> filteredListReportMajor;
    // People
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
    @FXML private TableColumn<People, String> colDateOfDeactivationReportPeople;
    @FXML private TextField searchFieldPeople;

    private ObservableList<People> peopleList;
    private FilteredList<People> filteredListReportPeople;

    // PeopleByDate
    @FXML private AnchorPane peopleByDateReportAnchorPane;
    @FXML private TableView<People> tableViewReportPeopleByDate;

    @FXML private TableColumn<People, String> colNameReportPeopleByDate;
    @FXML private TableColumn<People, Integer> colAgeReportPeopleByDate;
    @FXML private TableColumn<People, String> colGenderReportPeopleByDate;
    @FXML private TableColumn<People, String> colPhoneReportPeopleByDate;
    @FXML private TableColumn<People, String> colNationalIDReportPeopleByDate;
    @FXML private TableColumn<People, String> colRoleReportPeopleByDate;
    @FXML private TableColumn<People, String> colIDReportPeopleByDate;
    @FXML private TableColumn<People, String> colDateOfRegisterReportPeopleByDate;
    @FXML private TableColumn<People, String> colFacultyReportPeopleByDate;
    @FXML private TableColumn<People, String> colDepartmentReportPeopleByDate;
    @FXML private TableColumn<People, String> colMajorReportPeopleByDate;
    @FXML private TableColumn<People, String> colDegreeReportPeopleByDate;
    @FXML private TableColumn<People, String> colStatusReportPeopleByDate;
    @FXML private TableColumn<People, String> colDateOfDeactivationReportPeopleByDate;
    @FXML private ComboBox<String> fieldOfDateChooserPeopleByDate;
    @FXML private DatePicker primaryDatePeopleByDate;
    @FXML private DatePicker secondaryDatePeopleByDate;
    @FXML private Label errorLabelReportPeopleByDate;


    private ObservableList<People> peopleByDateList;
    private FilteredList<People> filteredListReportPeopleByDate;

    // Courses
    @FXML private TextField searchFieldCourses;
    @FXML private TableView<CourseReports> tableViewReportCourses;
    @FXML private  TableColumn<CourseReports, String> colNameReportCourses;
    @FXML private  TableColumn<CourseReports, String> colIdReportCourses;
    @FXML private  TableColumn<CourseReports, Integer> colCreditReportCourses;
    @FXML private  TableColumn<CourseReports, String> colMajorReportCourses;
    @FXML private  TableColumn<CourseReports, String> colDegreeReportCourses;
    @FXML private  TableColumn<CourseReports, String> colStatusReportCourses;

    private ObservableList<CourseReports> coursesList;
    private FilteredList<CourseReports> filteredListReportCourses;

    //Course Group
    @FXML private TableView<CourseGroupReports> tableViewReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, String> colCourseNameReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, Integer> colCourseCreditReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, String> colSemesterCodeReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, String> colProfessorNameReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, String> colIdReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, String> colMajorReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, String> colDegreeReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, String> colStatusReportCourseGroups;
    @FXML private TableColumn<CourseGroupReports, Integer> colCapacityReportCourseGroups;
    @FXML private TextField searchFieldCourseGroups;

    private ObservableList<CourseGroupReports> courseGroupsList;
    private FilteredList<CourseGroupReports> filteredListReportCourseGroups;


//    Reports Done

    @FXML
    private VBox reportsVbox;

    @FXML
    private TextField semesterCodeAddSemester;

    @FXML
    private Label successLabelAddDepartment;

    @FXML
    private Label successLabelAddEmployee;

    @FXML
    private Label successLabelAddFaculty;

    @FXML
    private Label successLabelAddMajor;

    @FXML
    private Label successLabelAddSemester;

    @FXML
    private Label successLabelDeactiveDepartment;

    @FXML
    private Label successLabelDeactiveEmployee;

    @FXML
    private Label successLabelDeactiveFaculty;

    @FXML
    private Label successLabelDeactiveMajor;

    @FXML
    private Label successLabelEditDepartment;

    @FXML
    private Label successLabelEditEmployee;

    @FXML
    private Label successLabelEditFaculty;

    @FXML
    private Label successLabelEditMajor;

    @FXML
    private AnchorPane updateDepartmentAnchorPane;

    @FXML
    private Button updateDepartmentScrollPane;

    @FXML
    private AnchorPane updateEmployeeAnchorPane;

    @FXML
    private Button updateEmployeeScrollPane;

    @FXML
    private AnchorPane updateFacultyAnchorPane;

    @FXML
    private Button updateFacultyScrollPane;

    @FXML
    private AnchorPane updateMajorAnchorPane;

    @FXML
    private Button updateMajorScrollPane;

    @FXML
    private Button enrollment;

    @FXML
    private Button activeButton;

    @FXML
    private Button deactiveButton;

    @FXML
    public AnchorPane deactiveSemesterAnchorPane;

    @FXML
    public ComboBox<String> semesterChooserDeactiveSemester;

    @FXML
    private Label errorLabelSemesterDeactiveSemester;

    @FXML
    private Label successLabelDeactiveSemester;

    @FXML
    private Label enrollmentStatusLabel;

    @FXML
    private Label errorLabelEnrollment;

    @FXML
    private Label successLabelEnrollment;

    @FXML
    private Label emergencyDropStatusLabel;

    @FXML
    private Label errorLabelEmergencyDrop;

    @FXML
    private Label successLabelEmergencyDrop;

    private void deactiveAllInFaculty(String faculty) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department : faculty1.departments) {
                    if (department.getStatus().equals(Status.Active)) {
                        deactiveAllInDepartment(faculty, department.getName());
                    }
                }
                faculty1.setStatus(Status.Inactive);
                break;
            }
        }
    }

    private void deactiveAllInDepartment(String faculty, String department) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major :department1.majors) {
                            if (major.getStatus().equals(Status.Active)) {
                                deactiveAllInMajor(faculty, department, major.getName());
                            }
                        }
                        for (Employee employee : department1.employees) {
                            if (employee.getStatus().equals(Status.Active)) {
                                deactiveAllInEmployee(faculty, department, employee.getId());
                            }
                        }
                        department1.setStatus(Status.Inactive);
                        break;
                    }
                }
                break;
            }
        }
    }

    private void deactiveAllInMajor(String faculty, String department, String major) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Student student : major1.students) {
                                    if (student.getStatus().equals(Status.Inactive)) {
                                        deactiveAllInStudent(faculty, department, major, student.getId());
                                    }
                                }
                                for (Professor professor : major1.professors) {
                                    if (professor.getStatus().equals(Status.Active)) {
                                        deactiveAllInProfessor(faculty, department, major, professor.getId());
                                    }
                                }
                                for (Degree degree : major1.degrees) {
                                    if (degree.getStatus().equals(Status.Active)) {
                                        deactiveAllInDegree(faculty, department, major, degree.getClass().getSimpleName());
                                    }
                                }
                                major1.setStatus(Status.Inactive);
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

    public static void deactiveAllInEmployee(String faculty, String department, String employeeId) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Employee employee : department1.employees) {
                            if (employee.getId().equals(employeeId)) {
                                employee.setStatus(Status.Inactive);
                                employee.setDateOfDeactivation(LocalDate.now());
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

    public static void deactiveAllInStudent(String faculty, String department, String major, String studentId) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Student student : major1.students) {
                                    if (student.getId().equals(studentId)) {
                                        for (Semester semester : student.getSemesters()) {
                                            if (semester.getStatus().equals(Status.Active)) {
                                                deactiveAllInSemester(faculty, department, major, studentId, semester.getName(), student.getDegree());
                                            }
                                        }
                                        student.setStatus(Status.Inactive);
                                        student.setDateOfDeactivation(LocalDate.now());
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

    public static void deactiveAllInSemester(String faculty, String department, String major, String studentId, String semester, String degree) {
        University.loadFaculties();

        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Student student : major1.students) {
                                    if (student.getId().equals(studentId)) {
                                        for (Semester semester1 : student.getSemesters()) {
                                            if (semester1.getName().equals(semester)) {
                                                for (CourseGroup courseGroup : semester1.getCourseGroups()) {
                                                    if (courseGroup.getStatus().equals(Status.Active)) {
                                                        deactiveAllInCourseGroup(faculty, department, major, degree, courseGroup.getCourseName(), courseGroup.getId());
                                                    }
                                                }
                                                semester1.setStatus(Status.Inactive);
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
                break;
            }
        }
    }

    public static void deactiveAllInProfessor(String faculty, String department, String major, String professorId) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Professor professor : major1.professors) {
                                    if (professor.getId().equals(professorId)) {
                                        professor.setStatus(Status.Inactive);
                                        professor.setDateOfDeactivation(LocalDate.now());
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

    public static void deactiveAllInDegree(String faculty, String department, String major, String degree) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Degree degree1 : major1.degrees) {
                                    if (degree1.getClass().getSimpleName().equals(degree)) {
                                        for (Course course : degree1.courses) {
                                            if (course.getStatus().equals(Status.Active)) {
                                                deactiveAllInCourse(faculty, department, major, degree, course.getName());
                                            }
                                        }
                                        degree1.setStatus(Status.Inactive);
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

    public static void deactiveAllInCourse(String faculty, String department, String major, String degree, String course) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Degree degree1 : major1.degrees) {
                                    if (degree1.getClass().getSimpleName().equals(degree)) {
                                        for (Course course1 : degree1.courses) {
                                            if (course1.getName().equals(course)) {
                                                for (CourseGroup courseGroup : course1.courseGroups) {
                                                    if (courseGroup.getStatus().equals(Status.Active)) {
                                                        deactiveAllInCourseGroup(faculty, department, major, degree, course, courseGroup.getId());
                                                    }
                                                }
                                                course1.setStatus(Status.Inactive);
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
                break;
            }
        }
    }

    public static void deactiveAllInCourseGroup(String faculty, String department, String major, String degree
            , String course, String courseGroup) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Degree degree1 : major1.degrees) {
                                    if (degree1.getClass().getSimpleName().equals(degree)) {
                                        for (Course course1 : degree1.courses) {
                                            if (course1.getName().equals(course)) {
                                                for (CourseGroup courseGroup1 : course1.courseGroups) {
                                                    if (courseGroup1.getId().equals(courseGroup)) {
                                                        for (Student enrolledStudent : courseGroup1.getRegisteredStudents()) {
                                                            if (enrolledStudent.getStatus().equals(Status.Active)) {
                                                                deactiveAllInEnrolledStudent(faculty, department, major, degree, course, courseGroup, enrolledStudent.getId());
                                                                break;
                                                            }
                                                        }
                                                        courseGroup1.setStatus(Status.Inactive);
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
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void deactiveAllInEnrolledStudent(String faculty, String department, String major, String degree
            , String course, String courseGroup, String enrolledStudent) {
        University.loadFaculties();
        for (Faculty faculty1 : University.allFaculties) {
            if (faculty1.getFacultyName().equals(faculty)) {
                for (Department department1 : faculty1.departments) {
                    if (department1.getName().equals(department)) {
                        for (Major major1 :department1.majors) {
                            if (major1.getName().equals(major)) {
                                for (Degree degree1 : major1.degrees) {
                                    if (degree1.getClass().getSimpleName().equals(degree)) {
                                        for (Course course1 : degree1.courses) {
                                            if (course1.getName().equals(course)) {
                                                for (CourseGroup courseGroup1 : course1.courseGroups) {
                                                    if (courseGroup1.getId().equals(courseGroup)) {
                                                        for (Student enrolledStudent1 : courseGroup1.getRegisteredStudents()) {
                                                            if (enrolledStudent1.getId().equals(enrolledStudent)) {
                                                                enrolledStudent1.setStatus(Status.Inactive);
                                                                enrolledStudent1.setDateOfDeactivation(LocalDate.now());
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
    void activeEmergencyDrop(ActionEvent event) {
        File file = new File("EmergencyDrop.txt");
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    errorLabelEmergencyDrop.setText("Error deleting file!");
                    successLabelEmergencyDrop.setText(null);
                    emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
                    return;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Active");
                successLabelEmergencyDrop.setText("Emergency Drop successfully activated!");
                errorLabelEmergencyDrop.setText(null);
                emergencyDropStatusLabel.setText("Emergency Drop Status: Active");
            }

        } catch (IOException e) {
            errorLabelEmergencyDrop.setText("Error activating Emergency Drop: " + e.getMessage());
            successLabelEmergencyDrop.setText(null);
            emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
        }
    }

    @FXML
    void activeEnrollment(ActionEvent event) {
        File file = new File("Enrollment.txt");
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    errorLabelEnrollment.setText("Error deleting file!");
                    successLabelEnrollment.setText(null);
                    return;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Active");
                successLabelEnrollment.setText("Enrollment successfully activated!");
                errorLabelEnrollment.setText(null);
                enrollmentStatusLabel.setText("Enrollment Status: Active");
            }

        } catch (IOException e) {
            errorLabelEnrollment.setText("Error activating enrollment: " + e.getMessage());
            successLabelEnrollment.setText(null);
            enrollmentStatusLabel.setText("Enrollment Status: Unknown");
        }
    }

    public String getDepartmentId() throws FileNotFoundException {
        University.loadFaculties();
        String id = "";
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserAddDepartment.getValue())) {
                id = String.format("%s%02d",
                        faculty.getId(),
                        faculty.departments.size() + 1
                );

                break;
            }
        }
        return id;
    }

    @FXML
    void addDepartment(ActionEvent event) throws FileNotFoundException {
        successLabelAddDepartment.setText(null);
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyChooserAddDepartment.getValue().isEmpty() || facultyChooserAddDepartment.getValue().equals("Faculty")) {
            errorLabelFacultyChooserAddDepartment.setText("Choose Faculty");
            confirmation = false;
        } else {
            errorLabelFacultyChooserAddDepartment.setText(null);
        }
        if (departmentNameAddDepartment.getText().isEmpty()) {
            errorLabelNameAddDepartment.setText("Enter Department Name");
            confirmation = false;
        } else {
            errorLabelNameAddDepartment.setText(null);
        }
        if (establishmentYearAddDepartment.getText().isEmpty()) {
            errorLabelEstYearAddDepartment.setText("Enter Establishment Year");
            confirmation = false;
        } else {
            errorLabelEstYearAddDepartment.setText(null);
            try {
                int establishmentYear = Integer.parseInt(establishmentYearAddDepartment.getText());
                if (establishmentYear > LocalDate.now().getYear() || establishmentYear < 0){
                    errorLabelEstYearAddDepartment.setText("Is Not In Range (0 - " + LocalDate.now().getYear()+")");
                    confirmation = false;
                }
            } catch (NumberFormatException e){
                errorLabelEstYearAddDepartment.setText("Enter Just Number");
                confirmation = false;
            }
        }
        if (confirmation) {
            Department department = new Department(departmentNameAddDepartment.getText().trim(), Integer.parseInt(establishmentYearAddDepartment.getText().trim()), getDepartmentId(), Status.Active);
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyChooserAddDepartment.getValue()) && faculty.getStatus().equals(Status.Active)) {
                    if (!faculty.departments.contains(department)) {
                        if (faculty.departments.stream().noneMatch(department1 -> department1.getName().equals(departmentNameAddDepartment.getText()))) {
                            faculty.departments.add(department);
                            University.saveFaculties();
                            errorLabelAddDepartment.setText(null);
                            successLabelAddDepartment.setText("The Department Added Successfully\n Department Name : " + department.getName() +
                                    "\nDepartment ID : " + department.getId());

                            facultyChooserAddDepartment.getSelectionModel().selectFirst();

                            departmentNameAddDepartment.clear();
                            establishmentYearAddDepartment.clear();
                        } else {
                            errorLabelNameAddDepartment.setText("Enter another Name");
                            errorLabelAddDepartment.setText("The Selected Name Has Been Already Chosen");
                        }
                    } else {
                        errorLabelAddDepartment.setText("The Department Has Been Added Earlier");
                    }
                    break;
                }
            }
        } else {
            System.out.println("please Fill All Fields!!");
        }
    }

    @FXML
    void addDepartmentDashboard(ActionEvent event) {
        University.loadFaculties();
//        name the header
        headerTitle.setText(" --> Add New Department");
//        activate the add department anchorpane
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addDepartmentAnchorPane.setVisible(true);
        addDepartmentScrollPane.getStyleClass().add("pressed");

//        faculty chooser combo box
        facultyChooserAddDepartment.getItems().clear();
        facultyChooserAddDepartment.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)) {
                facultyChooserAddDepartment.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserAddDepartment.setVisibleRowCount(4);
        facultyChooserAddDepartment.getSelectionModel().selectFirst();
//        clear the textfield for department name and establishment year
        departmentNameAddDepartment.clear();
        establishmentYearAddDepartment.clear();

        errorLabelFacultyChooserAddDepartment.setText(null);
        errorLabelNameAddDepartment.setText(null);
        errorLabelEstYearAddDepartment.setText(null);
        errorLabelAddDepartment.setText(null);
        successLabelAddDepartment.setText(null);
    }

    @FXML
    void addDepartmentScrollPane(ActionEvent event) {
        University.loadFaculties();
//        name the header
        headerTitle.setText(" --> Add New Department");
//        activate the add department anchorpane
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }

        if (!addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(true);
            addDepartmentScrollPane.getStyleClass().add("pressed");
//        faculty chooser combo box
            facultyChooserAddDepartment.getItems().clear();
            facultyChooserAddDepartment.getItems().add("Faculty");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active)) {
                    facultyChooserAddDepartment.getItems().add(faculty.getFacultyName());
                }
            }
            facultyChooserAddDepartment.setVisibleRowCount(4);
            facultyChooserAddDepartment.getSelectionModel().selectFirst();
//        clear the textfield for department name and establishment year
            departmentNameAddDepartment.clear();
            establishmentYearAddDepartment.clear();

            errorLabelFacultyChooserAddDepartment.setText(null);
            errorLabelNameAddDepartment.setText(null);
            errorLabelEstYearAddDepartment.setText(null);
            errorLabelAddDepartment.setText(null);
            successLabelAddDepartment.setText(null);
        }

    }

    public String getEmployeeId(){
        return "EMP"+(University.allEmployees.size()+1);
    }

    @FXML
    void addEmployee(ActionEvent event) throws IOException {
        successLabelAddEmployee.setText(null);
        Employee.loadAllEmployee();
        University.loadFaculties();
        boolean confirmation = true;
        if (firstNameAddEmployee.getText().isEmpty()) {
            errorLabelFirstNameAddEmployee.setText("Enter First Name");
            confirmation = false;
        } else {
            errorLabelFirstNameAddEmployee.setText(null);
        }
        if (lastNameAddEmployee.getText().isEmpty()) {
            errorLabelLastNameAddEmployee.setText("Enter Last Name");
            confirmation = false;
        } else {
            errorLabelLastNameAddEmployee.setText(null);
        }
        if (nationalIdAddEmployee.getText().isEmpty()) {
            errorLabelNationalIdAddEmployee.setText("Enter National ID");
            confirmation = false;
        } else {
            errorLabelNationalIdAddEmployee.setText(null);
            try {
                Long nationalId = Long.parseLong(nationalIdAddEmployee.getText());
                if (nationalIdAddEmployee.getText().length() != 10) {
                    errorLabelNationalIdAddEmployee.setText("Enter 10 Digit");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelNationalIdAddEmployee.setText("Enter Just Number");
                confirmation = false;
            }
        }
        if (phoneNumberAddEmployee.getText().isEmpty()) {
            errorLabelPhoneNumberAddEmployee.setText("Enter Phone Number");
            confirmation = false;
        } else {
            errorLabelPhoneNumberAddEmployee.setText(null);
            try {
                Long phoneNumber = Long.parseLong(phoneNumberAddEmployee.getText());
                if (phoneNumberAddEmployee.getText().length() != 11 ) {
                    errorLabelPhoneNumberAddEmployee.setText("Enter 11 Digit");
                    confirmation = false;
                } else if (!phoneNumberAddEmployee.getText().startsWith("09")) {
                    errorLabelPhoneNumberAddEmployee.setText("Wrong Format (09...)");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelPhoneNumberAddEmployee.setText("Enter Just Number");
                confirmation = false;
            }
        }
        if (genderChooserAddEmployee.getValue().isEmpty() || genderChooserAddEmployee.getValue().equals("Gender")) {
            errorLabelGenderChooserAddEmployee.setText("Choose Gender");
            confirmation = false;
        } else {
            errorLabelGenderChooserAddEmployee.setText(null);
        }
        if (facultyChooserAddEmployee.getValue().isEmpty() || facultyChooserAddEmployee.getValue().equals("Faculty")) {
            errorLabelFacultyChooserAddEmployee.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserAddEmployee.getValue().isEmpty() || departmentChooserAddEmployee.getValue().equals("Department")){
            errorLabelFacultyChooserAddEmployee.setText(null);
            errorLabelDepartmentChooserAddEmployee.setText("Choose Department");
            confirmation = false;
        } else {
            errorLabelDepartmentChooserAddEmployee.setText(null);
        }
        if (dateOfBirthAddEmployee.getValue() == null) {
            errorLabelDateOfBirthAddEmployee.setText("Enter Date Of Birth");
            confirmation = false;
        } else {
            errorLabelDateOfBirthAddEmployee.setText(null);
        }

        if (confirmation) {

            LocalDate dateOfBirth = dateOfBirthAddEmployee.getValue();
            String firstName = firstNameAddEmployee.getText().trim();
            String lastName = lastNameAddEmployee.getText().trim();
            String phoneNumber = phoneNumberAddEmployee.getText().trim();
            String nationalId = nationalIdAddEmployee.getText().trim();
            Gender gender = Gender.valueOf(genderChooserAddEmployee.getValue());
            String facultyName = facultyChooserAddEmployee.getValue();
            String departmentName = departmentChooserAddEmployee.getValue();
            LocalDate dateOfHire = LocalDate.now();
            String id = getEmployeeId();

            Employee employee = new Employee(firstName, lastName, dateOfBirth, nationalId, gender, phoneNumber, id, departmentName, facultyName, dateOfHire, Status.Active, null);
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyName) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(departmentName) && department.getStatus().equals(Status.Active)) {
                            if (!department.employees.contains(employee)) {
                                department.employees.add(employee);
                                University.allEmployees.add(employee);
                                Employee.saveAllEmployee();
                                University.saveFaculties();

                                errorLabelAddEmployee.setText(null);
                                successLabelAddEmployee.setText("The Employee Registered Successfully\n Employee ID : " + id + " | Password : National ID (" + nationalId + ")");

                                firstNameAddEmployee.clear();
                                lastNameAddEmployee.clear();
                                phoneNumberAddEmployee.clear();
                                nationalIdAddEmployee.clear();
                                dateOfBirthAddEmployee.setValue(null);

                                facultyChooserAddEmployee.getSelectionModel().selectFirst();
                                facultyChooserAddEmployee.setOnAction(event1 -> {
                                    departmentChooserAddEmployee.getItems().clear();
                                    departmentChooserAddEmployee.getItems().add("Department");
                                    for (Faculty faculty1 : University.allFaculties) {
                                        if (faculty1.getFacultyName().equals(facultyChooserAddEmployee.getValue()) && faculty1.getStatus().equals(Status.Active)) {
                                            for (Department department1 : faculty1.departments) {
                                                if (department1.getStatus().equals(Status.Active)) {
                                                    departmentChooserAddEmployee.getItems().add(department1.getName());
                                                }
                                            }
                                            //break;
                                        }
                                    }
                                    departmentChooserAddEmployee.setVisibleRowCount(5);
                                    departmentChooserAddEmployee.getSelectionModel().selectFirst();
                                });
                                genderChooserAddEmployee.getSelectionModel().selectFirst();
                            } else {
                                errorLabelAddEmployee.setText("The Employee Has Been Registered Earlier");
                            }
                           // break;
                        }
                    }
                    //break;
                }
            }
        } else {
            errorLabelAddEmployee.setText("Fill In All Fields");
        }
    }

    @FXML
    void addEmployeeDashboard(ActionEvent event) {
        University.loadFaculties();
//        name the header
        headerTitle.setText(" --> Add New Employee");
//        activate the add employee anchorpane
        dashboardAnchorPane.setVisible(false);
        addEmployeeAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(true);
        addEmployeeScrollPane.getStyleClass().add("pressed");
//        clear the textfields and date picker and
        firstNameAddEmployee.clear();
        lastNameAddEmployee.clear();
        nationalIdAddEmployee.clear();
        phoneNumberAddEmployee.clear();
        genderChooserAddEmployee.getSelectionModel().selectFirst();
        dateOfBirthAddEmployee.setValue(null);
        dateOfBirthAddEmployee.setPromptText("Date of Birth");
//        faculty chooser combo box
        facultyChooserAddEmployee.getItems().clear();
        facultyChooserAddEmployee.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)) {
                facultyChooserAddEmployee.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserAddEmployee.setVisibleRowCount(4);
        facultyChooserAddEmployee.getSelectionModel().selectFirst();
//        department chooser combo box
        facultyChooserAddEmployee.setOnAction(event1 -> {
            departmentChooserAddEmployee.getItems().clear();
            departmentChooserAddEmployee.getItems().add("Department");
            for (Faculty faculty : University.allFaculties) {
                if (facultyChooserAddEmployee.getValue().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active)) {
                            departmentChooserAddEmployee.getItems().add(department.getName());
                        }
                    }
                }
            }
            departmentChooserAddEmployee.setVisibleRowCount(4);
            departmentChooserAddEmployee.getSelectionModel().selectFirst();

        });
        genderChooserAddEmployee.getItems().clear();
        genderChooserAddEmployee.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
        genderChooserAddEmployee.setVisibleRowCount(3);
        genderChooserAddEmployee.getSelectionModel().selectFirst();

        errorLabelFirstNameAddEmployee.setText(null);
        errorLabelLastNameAddEmployee.setText(null);
        errorLabelNationalIdAddEmployee.setText(null);
        errorLabelGenderChooserAddEmployee.setText(null);
        errorLabelPhoneNumberAddEmployee.setText(null);
        errorLabelDateOfBirthAddEmployee.setText(null);
        errorLabelFacultyChooserAddEmployee.setText(null);
        errorLabelDepartmentChooserAddEmployee.setText(null);
        errorLabelAddEmployee.setText(null);
        successLabelAddEmployee.setText(null);
    }

    @FXML
    void addEmployeeScrollPane(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Add New Employee");
//        activate the add employee anchorpane
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }
        if (!addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(true);
            addEmployeeScrollPane.getStyleClass().add("pressed");
//        clear the textfields and date picker and
            firstNameAddEmployee.clear();
            lastNameAddEmployee.clear();
            nationalIdAddEmployee.clear();
            phoneNumberAddEmployee.clear();
            genderChooserAddEmployee.getSelectionModel().selectFirst();
            dateOfBirthAddEmployee.setValue(null);
            dateOfBirthAddEmployee.setPromptText("Date of Birth");
//        faculty chooser combo box
            facultyChooserAddEmployee.getItems().clear();
            facultyChooserAddEmployee.getItems().add("Faculty");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active)) {
                    facultyChooserAddEmployee.getItems().add(faculty.getFacultyName());
                }
            }
            facultyChooserAddEmployee.setVisibleRowCount(4);
            facultyChooserAddEmployee.getSelectionModel().selectFirst();
//        department chooser combo box
            facultyChooserAddEmployee.setOnAction(event1 -> {
                departmentChooserAddEmployee.getItems().clear();
                departmentChooserAddEmployee.getItems().add("Department");
                for (Faculty faculty : University.allFaculties) {
                    if (facultyChooserAddEmployee.getValue().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)){
                        for (Department department : faculty.departments) {
                            if (department.getStatus().equals(Status.Active)) {
                                departmentChooserAddEmployee.getItems().add(department.getName());
                            }
                        }
                    }
                }
                departmentChooserAddEmployee.setVisibleRowCount(4);
                departmentChooserAddEmployee.getSelectionModel().selectFirst();

            });

            genderChooserAddEmployee.getItems().clear();
            genderChooserAddEmployee.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
            genderChooserAddEmployee.setVisibleRowCount(3);
            genderChooserAddEmployee.getSelectionModel().selectFirst();

            errorLabelFirstNameAddEmployee.setText(null);
            errorLabelLastNameAddEmployee.setText(null);
            errorLabelNationalIdAddEmployee.setText(null);
            errorLabelGenderChooserAddEmployee.setText(null);
            errorLabelPhoneNumberAddEmployee.setText(null);
            errorLabelDateOfBirthAddEmployee.setText(null);
            errorLabelFacultyChooserAddEmployee.setText(null);
            errorLabelDepartmentChooserAddEmployee.setText(null);
            errorLabelAddEmployee.setText(null);
            successLabelAddEmployee.setText(null);
        }
    }

    public String getFacultyId(){
        return String.format("%02d", University.allFaculties.size()+1);
    }

    @FXML
    void addFaculty(ActionEvent event) {
        successLabelAddFaculty.setText(null);
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyNameAddFaculty.getText().isEmpty()) {
            errorLabelFacultyNameAddFaculty.setText("Enter Faculty Name");
            confirmation = false;
        } else {
            errorLabelFacultyNameAddFaculty.setText(null);
        }
        if (establishmentYearAddFaculty.getText().isEmpty()) {
            errorLabelEstablishmentYearAddFaculty.setText("Enter Establishment Year");
            confirmation = false;
        } else {
            errorLabelEstablishmentYearAddFaculty.setText(null);
            try {
                int establishmentYear = Integer.parseInt(establishmentYearAddFaculty.getText());
                if (establishmentYear > LocalDate.now().getYear() || establishmentYear < 0){
                    errorLabelEstablishmentYearAddFaculty.setText("Is Not In Range (0 - " + LocalDate.now().getYear()+")");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelEstablishmentYearAddFaculty.setText("Enter Number");
                confirmation = false;
            }
        }

        if (confirmation) {
            String facultyID = getFacultyId();
            Faculty faculty = new Faculty(facultyNameAddFaculty.getText(), facultyID, Integer.parseInt(establishmentYearAddFaculty.getText()), Status.Active);
            if (!University.allFaculties.contains(faculty)){
                if (University.allFaculties.stream().anyMatch(faculty1 -> faculty1.getFacultyName().equals(facultyNameAddFaculty.getText()))) {
                    errorLabelFacultyNameAddFaculty.setText("Enter another Name");
                    errorLabelAddFaculty.setText("The Selected Name Has Been Already Chosen");
                } else {
                    University.allFaculties.add(faculty);
                    University.saveFaculties();
                    errorLabelAddFaculty.setText(null);
                    successLabelAddFaculty.setText("The Faculty Added Successfully\nFaculty Name : " + facultyNameAddFaculty.getText() +
                             "\nFaculty ID : " + facultyID);


                    facultyNameAddFaculty.clear();
                    establishmentYearAddFaculty.clear();
                }

            } else {
                errorLabelAddFaculty.setText("The Faculty Has Been Added Earlier");
            }
        } else {
            errorLabelAddFaculty.setText("Fill In All Fields");
        }
    }

    @FXML
    void addFacultyDashboard(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Add New Faculty");
//        activate the add faculty anchorpane
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addFacultyAnchorPane.setVisible(true);
        addFacultyScrollPane.getStyleClass().add("pressed");
//        clear the textfields
        facultyNameAddFaculty.clear();
        establishmentYearAddFaculty.clear();

        errorLabelAddFaculty.setText(null);
        errorLabelFacultyNameAddFaculty.setText(null);
        errorLabelEstablishmentYearAddFaculty.setText(null);
        successLabelAddFaculty.setText(null);
    }

    @FXML
    void addFacultyScrollPane(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Add New Faculty");
//        activate the add faculty anchorpane
        if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }
        if (!addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(true);
            addFacultyScrollPane.getStyleClass().add("pressed");
//        clear the textfields
            facultyNameAddFaculty.clear();
            establishmentYearAddFaculty.clear();

            errorLabelAddFaculty.setText(null);
            errorLabelFacultyNameAddFaculty.setText(null);
            errorLabelEstablishmentYearAddFaculty.setText(null);
            successLabelAddFaculty.setText(null);
        }
    }

    public String getMajorId() throws FileNotFoundException {
        University.loadFaculties();
        String id = "";
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserAddMajor.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserAddMajor.getValue())) {
                        id = String.format("%s%02d", department.getId(),department.majors.size() + 1);
                        break;
                    }
                }
                break;
            }
        }
        return id;
    }

    @FXML
    void addMajor(ActionEvent event) throws FileNotFoundException {
        successLabelAddMajor.setText(null);
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyChooserAddMajor.getValue().isEmpty() || facultyChooserAddMajor.getValue().equals("Faculty")) {
            errorLabelFacultyChooserAddMajor.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserAddMajor.getValue().isEmpty() || departmentChooserAddMajor.getValue().equals("Department")) {
            errorLabelFacultyChooserAddMajor.setText(null);
            errorLabelDepartmentChooserAddMajor.setText("Choose Department");
            confirmation = false;
        } else {
            errorLabelDepartmentChooserAddMajor.setText(null);
        }
        if (majorNameAddMajor.getText().isEmpty()) {
            errorLabelMajorNameAddMajor.setText("Enter Major Name");
            confirmation = false;
        } else {
            errorLabelMajorNameAddMajor.setText(null);
        }
        if (establishmentYearAddMajor.getText().isEmpty()) {
            errorLabelEstYearAddMajor.setText("Enter Establishment Year");
            confirmation = false;
        } else {
            errorLabelEstYearAddMajor.setText(null);
            try {
                int establishmentYear = Integer.parseInt(establishmentYearAddMajor.getText());
                if (establishmentYear > LocalDate.now().getYear() || establishmentYear < 0){
                    errorLabelEstYearAddMajor.setText("Is Not In Range (0 - " + LocalDate.now().getYear()+")");
                    confirmation = false;
                }
            } catch (NumberFormatException e) {
                errorLabelEstYearAddMajor.setText("Enter Just Number");
                confirmation = false;
            }
        }

        if (confirmation) {
            String majorID = getMajorId();
            Major newMajor = new Major(majorNameAddMajor.getText().trim(),majorID, Integer.parseInt(establishmentYearAddMajor.getText().trim()), Status.Active);

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyChooserAddMajor.getValue()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(departmentChooserAddMajor.getValue()) && department.getStatus().equals(Status.Active)) {
                            if (department.majors.stream().noneMatch(major -> major.getName().equals(majorNameAddMajor.getText()))) {
                                if (!department.majors.contains(newMajor)) {
                                    department.majors.add(newMajor);
                                    University.saveFaculties();
                                    errorLabelAddMajor.setText(null);
                                    successLabelAddMajor.setText("The Major Added Successfully\nMajor Name : " + newMajor.getName() + "\nEstablishment Year : " +
                                            newMajor.getEstablishmentYear() + "\nMajor ID : " + newMajor.getId() + "Faculty : " + faculty.getFacultyName() +
                                            "\nDepartment : " + department.getName());


                                    facultyChooserAddMajor.getSelectionModel().selectFirst();
                                    facultyChooserAddMajor.setOnAction(event1 -> {
                                        departmentChooserAddMajor.getItems().clear();
                                        departmentChooserAddMajor.getItems().add("Department");
                                        for (Faculty faculty1 : University.allFaculties) {
                                            if (faculty1.getFacultyName().equals(facultyChooserAddMajor.getValue()) && faculty1.getStatus().equals(Status.Active)) {
                                                for (Department department1 : faculty1.departments) {
                                                    if (department1.getStatus().equals(Status.Active)) {
                                                        departmentChooserAddMajor.getItems().add(department1.getName());
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        departmentChooserAddMajor.setVisibleRowCount(5);
                                        departmentChooserAddMajor.getSelectionModel().selectFirst();
                                    });
                                    majorNameAddMajor.clear();
                                    majorNameAddMajor.setPromptText("Name Of Major");
                                    establishmentYearAddMajor.clear();
                                    establishmentYearAddMajor.setPromptText("Establishment Year");

                                } else {
                                    System.out.println("This Major Has Been Added Earlier");
                                }
                            } else {
                                errorLabelMajorNameAddMajor.setText("Choose another Name");
                                errorLabelAddMajor.setText("The Selected Name Has Been Already Chosen");
                            }
                            break;
                        }
                    }
                }
            }

        } else {
            errorLabelAddMajor.setText("Fill In All Fields");
        }
    }

    @FXML
    void addMajorDashboard(ActionEvent event) {
        University.loadFaculties();
//        name the header
        headerTitle.setText(" --> Add New Major");
//        activate the add major anchorpane
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addMajorAnchorPane.setVisible(true);
        addMajorScrollPane.getStyleClass().add("pressed");
//        clear the textfields
        majorNameAddMajor.clear();
        establishmentYearAddMajor.clear();
//        faculty chooser combo box
        facultyChooserAddMajor.getItems().clear();
        facultyChooserAddMajor.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserAddMajor.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserAddMajor.setVisibleRowCount(4);
        facultyChooserAddMajor.getSelectionModel().selectFirst();
//        department chooser combo box
        facultyChooserAddMajor.setOnAction(event1 -> {
            departmentChooserAddMajor.getItems().clear();
            departmentChooserAddMajor.getItems().add("Department");
            for (Faculty faculty : University.allFaculties) {
                if (facultyChooserAddMajor.getValue().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getStatus().equals(Status.Active)) {
                            departmentChooserAddMajor.getItems().add(department.getName());
                        }
                    }
                    break;
                }
            }
            departmentChooserAddMajor.setVisibleRowCount(4);
            departmentChooserAddMajor.getSelectionModel().selectFirst();
        });

        errorLabelFacultyChooserAddMajor.setText(null);
        errorLabelDepartmentChooserAddMajor.setText(null);
        errorLabelMajorNameAddMajor.setText(null);
        errorLabelEstYearAddMajor.setText(null);
        errorLabelAddMajor.setText(null);
        successLabelAddMajor.setText(null);
    }

    @FXML
    void addMajorScrollPane(ActionEvent event) {
        University.loadFaculties();
//        name the header
        headerTitle.setText(" --> Add New Major");
//        activate the add major anchorpane
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }
        if (!addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(true);
            addMajorScrollPane.getStyleClass().add("pressed");
//        clear the textfields
            majorNameAddMajor.clear();
            establishmentYearAddMajor.clear();
//        faculty chooser combo box
            facultyChooserAddMajor.getItems().clear();
            facultyChooserAddMajor.getItems().add("Faculty");
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getStatus().equals(Status.Active)){
                    facultyChooserAddMajor.getItems().add(faculty.getFacultyName());
                }
            }
            facultyChooserAddMajor.setVisibleRowCount(4);
            facultyChooserAddMajor.getSelectionModel().selectFirst();
//        department chooser combo box
            facultyChooserAddMajor.setOnAction(event1 -> {
                departmentChooserAddMajor.getItems().clear();
                departmentChooserAddMajor.getItems().add("Department");
                for (Faculty faculty : University.allFaculties) {
                    if (facultyChooserAddMajor.getValue().equals(faculty.getFacultyName()) && faculty.getStatus().equals(Status.Active)) {
                        for (Department department : faculty.departments) {
                            if (department.getStatus().equals(Status.Active)) {
                                departmentChooserAddMajor.getItems().add(department.getName());
                            }
                        }
                    }
                }
                departmentChooserAddMajor.setVisibleRowCount(4);
                departmentChooserAddMajor.getSelectionModel().selectFirst();
            });

            errorLabelFacultyChooserAddMajor.setText(null);
            errorLabelDepartmentChooserAddMajor.setText(null);
            errorLabelMajorNameAddMajor.setText(null);
            errorLabelEstYearAddMajor.setText(null);
            errorLabelAddMajor.setText(null);
            successLabelAddMajor.setText(null);
        }
    }

    @FXML
    void addSemester(ActionEvent event) {
        successLabelAddSemester.setText(null);
        University.loadAllSemester();

        if (!semesterCodeAddSemester.getText().isEmpty()) {
            University.allSemesters.add(new Semester(semesterCodeAddSemester.getText().trim(),Status.Active));
            University.saveAllSemester();
            errorLabelSemesterCodeAddSemester.setText(null);
            errorLabelAddSemester.setText(null);
            successLabelAddSemester.setText("The Selected Semester Added Successfully\nSemester Code : " + semesterCodeAddSemester.getText());
        } else {
            errorLabelSemesterCodeAddSemester.setText("Enter Semester Code");
            errorLabelAddSemester.setText("Fill In All Fields");
        }
    }

    @FXML
    void addSemesterDashboard(ActionEvent event) {
        headerTitle.setText(" --> Add Semester");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addSemesterAnchorPane.setVisible(true);
        addSemesterScrollPane.getStyleClass().add("pressed");

        semesterCodeAddSemester.clear();
        errorLabelAddSemester.setText(null);
        errorLabelSemesterCodeAddSemester.setText(null);
        successLabelAddSemester.setText(null);
    }

    @FXML
    void addSemesterScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add Semester");
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }

        if (!addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(true);
            addSemesterScrollPane.getStyleClass().add("pressed");

            semesterCodeAddSemester.clear();
            errorLabelSemesterCodeAddSemester.setText(null);
            errorLabelAddSemester.setText(null);
            successLabelAddSemester.setText(null);
        }
    }

    @FXML
    void courseGroupsReports(ActionEvent event) {
        headerTitle.setText(" --> Reports --> Course Groups");
        courseGroupsReportsAnchorPane.setVisible(true);

        searchFieldCourseGroups.clear();
        searchFieldCourseGroups.setPromptText("Search ...");

        //Courses
        colCourseNameReportCourseGroups.setCellValueFactory(data -> data.getValue().courseNameProperty());
        colIdReportCourseGroups.setCellValueFactory(data -> data.getValue().idProperty());
        colStatusReportCourseGroups.setCellValueFactory(data -> data.getValue().statusProperty());
        colMajorReportCourseGroups.setCellValueFactory(data -> data.getValue().majorProperty());
        colDegreeReportCourseGroups.setCellValueFactory(data -> data.getValue().degreeProperty());
        colSemesterCodeReportCourseGroups.setCellValueFactory(data -> data.getValue().semesterCodeProperty());
        colProfessorNameReportCourseGroups.setCellValueFactory(data -> data.getValue().professorNameProperty());
        colCourseCreditReportCourseGroups.setCellValueFactory(data -> data.getValue().courseCreditProperty().asObject());
        colCapacityReportCourseGroups.setCellValueFactory(data -> data.getValue().capacityProperty().asObject());

        University.loadFaculties();

        courseGroupsList = FXCollections.observableArrayList();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup courseGroup : course.courseGroups) {
                                courseGroupsList.add(new CourseGroupReports(courseGroup.getCourseName(), courseGroup.getCourse().getCredit(), courseGroup.getSemesterCode(), courseGroup.getProfessor(), courseGroup.getId(), major.getName(), degree.getClass().getSimpleName(), courseGroup.getStatus(), courseGroup.getCapacity()));
                            }
                        }
                    }
                }
            }
        }

        filteredListReportCourseGroups = new FilteredList<>(courseGroupsList, courseGroupReports -> true);
        tableViewReportCourseGroups.setItems(filteredListReportCourseGroups);

        setupStatusContextMenuReportCourseGroups();
        setupMajorContextMenuReportCourseGroups();
        setupDegreeContextMenuReportCourseGroups();
        setupIdContextMenuCourseGroups();
        setupCourseNameContextMenuCourseGroups();
        setupProfessorNameContextMenuCourseGroups();

    }

    @FXML
    void coursesReports(ActionEvent event) {
        headerTitle.setText(" --> Reports --> Courses");
        coursesReportsAnchorPane.setVisible(true);

        searchFieldCourses.clear();
        searchFieldCourses.setPromptText("Search ...");

        //Courses
        colNameReportCourses.setCellValueFactory(data -> data.getValue().nameProperty());
        colIdReportCourses.setCellValueFactory(data -> data.getValue().idProperty());
        colStatusReportCourses.setCellValueFactory(data -> data.getValue().statusProperty());
        colMajorReportCourses.setCellValueFactory(data -> data.getValue().majorProperty());
        colDegreeReportCourses.setCellValueFactory(data -> data.getValue().degreeProperty());
        colCreditReportCourses.setCellValueFactory(data -> data.getValue().creditProperty().asObject());

        University.loadFaculties();

        coursesList = FXCollections.observableArrayList();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            coursesList.add(new CourseReports(course.getName(), course.getCredit(), course.getId(), major.getName(), degree.getClass().getSimpleName(), course.getStatus()));
                        }
                    }
                }
            }
        }

        filteredListReportCourses = new FilteredList<>(coursesList, courseReports -> true);
        tableViewReportCourses.setItems(filteredListReportCourses);

        setupStatusContextMenuReportCourses();
        setupMajorContextMenuReportCourses();
        setupDegreeContextMenuReportCourses();
        setupIdContextMenuCourses();
    }

    @FXML
    void dashboardScrollPane(ActionEvent event) {
        headerTitle.setText("");

        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }

        buttonsScrollPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);

    }

    @FXML
    void deactiveDepartment(ActionEvent event) throws Exception {
        successLabelDeactiveDepartment.setText(null);
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyChooserDeactiveDepartment.getValue().isEmpty() || facultyChooserDeactiveDepartment.getValue().equals("Faculty")) {
            errorLabelFacultyChooserDeactiveDepartment.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserDeactiveDepartment.getValue().isEmpty() || departmentChooserDeactiveDepartment.getValue().equals("Department")) {
            errorLabelFacultyChooserDeactiveDepartment.setText(null);
            errorLabelDepartmentChooserDeactiveDepartment.setText("Choose Department");
            confirmation = false;
        } else {
            errorLabelDepartmentChooserDeactiveDepartment.setText(null);
        }
        if (confirmation) {
            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveDepartment.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactiveDepartment.getValue())){
                            deactiveAllInDepartment(faculty.getFacultyName(), department.getName());
                            University.saveFaculties();
                            Professor.loadAllProfessor();
                            for (Professor professor : University.allProfessors) {
                                if (professor.getFaculty().equals(faculty.getFacultyName()) && professor.getDepartment().equals(department.getName()) && professor.getStatus().equals(Status.Active)) {
                                    professor.setStatus(Status.Inactive);
                                    professor.setDateOfDeactivation(LocalDate.now());
                                    break;
                                }
                            }
                            Professor.saveAllProfessor();
                            Employee.loadAllEmployee();
                            for (Employee employee : University.allEmployees) {
                                if (employee.getFaculty().equals(faculty.getFacultyName()) && employee.getDepartment().equals(department.getName())
                                        && employee.getStatus().equals(Status.Active)) {
                                    employee.setStatus(Status.Inactive);
                                    employee.setDateOfDeactivation(LocalDate.now());
                                    break;
                                }
                            }
                            Employee.saveAllEmployee();
                            Student.loadAllStudents();
                            for (Student student : University.allStudents) {
                                if (student.getFaculty().equals(faculty.getFacultyName()) && student.getDepartment().equals(department.getName())
                                        && student.getStatus().equals(Status.Active)) {
                                    student.setStatus(Status.Inactive);
                                    student.setDateOfDeactivation(LocalDate.now());
                                    break;
                                }
                            }
                            Student.saveAllStudent();

                            errorLabelDeactiveDepartment.setText(null);
                            successLabelDeactiveDepartment.setText("The Selected Department Deactivated Successfully");

                            facultyChooserDeactiveDepartment.getSelectionModel().selectFirst();

                            facultyChooserDeactiveDepartment.setOnAction(event1 -> {
                                departmentChooserDeactiveDepartment.getItems().clear();
                                departmentChooserDeactiveDepartment.getItems().add("Department");
                                for (Faculty faculty1 : University.allFaculties) {
                                    if (faculty1.getStatus().equals(Status.Active) && faculty1.getFacultyName().equals(facultyChooserDeactiveDepartment.getValue())) {
                                        for (Department department1 : faculty1.departments) {
                                            if (department1.getStatus().equals(Status.Active)) {
                                                departmentChooserDeactiveDepartment.getItems().add(department1.getName());
                                            }
                                        }
                                    }
                                }
                                departmentChooserDeactiveDepartment.setVisibleRowCount(4);
                                departmentChooserDeactiveDepartment.getSelectionModel().selectFirst();
                            });

                            break;
                        }
                    }
                    break;
                }
            }
        } else {
            errorLabelDeactiveDepartment.setText("Fill In All Fields");
        }

    }

    @FXML
    void deactiveEmergencyDrop(ActionEvent event) {
        File file = new File("EmergencyDrop.txt");
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    errorLabelEmergencyDrop.setText("Error deleting file!");
                    successLabelEmergencyDrop.setText(null);
                    emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
                    return;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Deactive");
                successLabelEmergencyDrop.setText("Emergency Drop successfully deactivated!");
                errorLabelEmergencyDrop.setText(null);
                emergencyDropStatusLabel.setText("Emergency Drop Status: Deactive");
            }

        } catch (IOException e) {
            errorLabelEmergencyDrop.setText("Error deactivating Emergency Drop: " + e.getMessage());
            successLabelEmergencyDrop.setText(null);
            emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
        }
    }

    @FXML
    void deactiveEnrollment(ActionEvent event) {
        File file = new File("Enrollment.txt");
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    errorLabelEnrollment.setText("Error deleting file!");
                    successLabelEnrollment.setText(null);
                    return;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Deactive");
                successLabelEnrollment.setText("Enrollment successfully deactivated!");
                errorLabelEnrollment.setText(null);
                enrollmentStatusLabel.setText("Enrollment Status: Deactive");
            }

        } catch (IOException e) {
            errorLabelEnrollment.setText("Error deactivating enrollment: " + e.getMessage());
            successLabelEnrollment.setText(null);
            enrollmentStatusLabel.setText("Enrollment Status: Unknown");
        }
    }

    @FXML
    void deactiveEmployee(ActionEvent event) throws IOException {
        successLabelDeactiveEmployee.setText(null);
        Employee.loadAllEmployee();
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyChooserDeactiveEmployee.getValue().isEmpty() || facultyChooserDeactiveEmployee.getValue().equals("Faculty")) {
            errorLabelFacultyChooserDeactiveEmployee.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserDeactiveEmployee.getValue().isEmpty() || departmentChooserDeactiveEmployee.getValue().equals("Department")) {
            errorLabelFacultyChooserDeactiveEmployee.setText(null);
            errorLabelDepartmentChooserDeactiveEmployee.setText("Choose Department");
            confirmation = false;
        } else if (employeeChooserDeactiveEmployee.getValue().isEmpty() || employeeChooserDeactiveEmployee.getValue().equals("Employee")) {
            errorLabelDepartmentChooserDeactiveEmployee.setText(null);
            errorLabelEmployeeChooserDeactiveEmployee.setText("Choose Employee");
            confirmation = false;
        } else {
            errorLabelEmployeeChooserDeactiveEmployee.setText(null);
        }
        if (confirmation) {
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyChooserDeactiveEmployee.getValue())) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(departmentChooserDeactiveEmployee.getValue())) {
                            for (Employee employee : department.employees){
                                if (employee.getFullName().equals(employeeChooserDeactiveEmployee.getValue())){
                                    deactiveAllInEmployee(faculty.getFacultyName(), department.getName(), employee.getId());
                                    University.saveFaculties();
                                    Employee.loadAllEmployee();
                                    for (Employee employee1 : University.allEmployees){
                                        if (employee1.getId().equals(employeeChooserDeactiveEmployee.getValue())){
                                            employee1.setStatus(Status.Inactive);
                                            employee1.setDateOfDeactivation(LocalDate.now());
                                            break;
                                        }
                                    }
                                    Employee.saveAllEmployee();

                                    errorLabelDeactiveEmployee.setText(null);
                                    successLabelDeactiveEmployee.setText("The Selected Employee Deactivated Successfully");


                                    facultyChooserDeactiveEmployee.getSelectionModel().selectFirst();
                                    facultyChooserDeactiveEmployee.setOnAction(event1 -> {
                                        departmentChooserDeactiveEmployee.getItems().clear();
                                        departmentChooserDeactiveEmployee.getItems().add("Department");
                                        for (Faculty faculty1 : University.allFaculties) {
                                            if (faculty1.getFacultyName().equals(facultyChooserDeactiveEmployee.getValue()) && faculty1.getStatus().equals(Status.Active)) {
                                                for (Department department1 : faculty1.departments) {
                                                    if (department1.getStatus().equals(Status.Active)) {
                                                        departmentChooserDeactiveEmployee.getItems().add(department1.getName());
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        departmentChooserDeactiveEmployee.setVisibleRowCount(5);
                                        departmentChooserDeactiveEmployee.getSelectionModel().selectFirst();
                                    });
                                    departmentChooserDeactiveEmployee.setOnAction(event1 -> {
                                        Employee.loadAllEmployee();
                                        employeeChooserDeactiveEmployee.getItems().clear();
                                        employeeChooserDeactiveEmployee.getItems().add("Employee");
                                        for (Employee employee1 : University.allEmployees) {
                                            if (employee1.getStatus().equals(Status.Active) && employee1.getDepartment().equals(departmentChooserDeactiveEmployee.getValue())) {
                                                employeeChooserDeactiveEmployee.getItems().add(employee1.getFullName());
                                            }
                                        }
                                        employeeChooserDeactiveEmployee.setVisibleRowCount(4);
                                        employeeChooserDeactiveEmployee.getSelectionModel().selectFirst();
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
        } else {
            errorLabelDeactiveEmployee.setText("Fill In All Fields");
        }
    }

    @FXML
    void deactiveFaculty(ActionEvent event) throws Exception {
        successLabelDeactiveFaculty.setText(null);
        University.loadFaculties();
        boolean confirmation = true;

        if (facultyChooserDeactiveFaculty.getValue().isEmpty()
                || facultyChooserDeactiveFaculty.getValue().equals("Faculty")) {
            errorLabelFacultyChooserDeactiveFaculty.setText("Choose Faculty");
            confirmation = false;
        } else {
            errorLabelFacultyChooserDeactiveFaculty.setText(null);
        }

        if (confirmation) {
            Faculty target = null;
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyChooserDeactiveFaculty.getValue())) {
                    target = faculty;
                    break;
                }
            }

            if (target != null) {
                deactiveAllInFaculty(target.getFacultyName());
                University.saveFaculties();
                Professor.loadAllProfessor();
                for (Professor professor : University.allProfessors) {
                    if (professor.getFaculty().equals(target.getFacultyName())
                            && professor.getStatus().equals(Status.Active)) {
                        professor.setStatus(Status.Inactive);
                        professor.setDateOfDeactivation(LocalDate.now());
                    }
                }
                Professor.saveAllProfessor();
                Employee.loadAllEmployee();
                for (Employee employee : University.allEmployees) {
                    if (employee.getFaculty().equals(target.getFacultyName())
                            && employee.getStatus().equals(Status.Active)) {
                        employee.setStatus(Status.Inactive);
                        employee.setDateOfDeactivation(LocalDate.now());
                    }
                }
                Employee.saveAllEmployee();
                Student.loadAllStudents();
                for (Student student : University.allStudents) {
                    if (student.getFaculty().equals(target.getFacultyName())
                            && student.getStatus().equals(Status.Active)) {
                        student.setStatus(Status.Inactive);
                        student.setDateOfDeactivation(LocalDate.now());
                    }
                }
                Student.saveAllStudent();
                errorLabelDeactiveFaculty.setText(null);
                successLabelDeactiveFaculty.setText("The Selected Faculty Deactivated successfully");
                facultyChooserDeactiveFaculty.getItems().clear();
                facultyChooserDeactiveFaculty.getItems().add("Faculty");
                for (Faculty faculty1 : University.allFaculties) {
                    if (faculty1.getStatus().equals(Status.Active)) {
                        facultyChooserDeactiveFaculty.getItems().add(faculty1.getFacultyName());
                    }
                }
                facultyChooserDeactiveFaculty.setVisibleRowCount(4);
                facultyChooserDeactiveFaculty.getSelectionModel().selectFirst();
            }

        } else {
            errorLabelDeactiveFaculty.setText("Fill In All Fields");
        }
    }

    @FXML
    void deactiveMajor(ActionEvent event) throws Exception {
        successLabelDeactiveMajor.setText(null);
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyChooserDeactiveMajor.getValue().isEmpty() || facultyChooserDeactiveMajor.getValue().equals("Faculty")) {
            errorLabelFacultyChooserDeactiveMajor.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserDeactiveMajor.getValue().isEmpty() || departmentChooserDeactiveMajor.getValue().equals("Department")) {
            errorLabelFacultyChooserDeactiveMajor.setText(null);
            errorLabelDepartmentChooserDeactiveMajor.setText("Choose Department");
            confirmation = false;
        } else if (majorChooserDeactiveMajor.getValue().isEmpty() || majorChooserDeactiveMajor.getValue().equals("Major")) {
            errorLabelDepartmentChooserDeactiveMajor.setText(null);
            errorLabelMajorChooserDeactiveMajor.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorChooserDeactiveMajor.setText(null);
        }
        if (confirmation) {
            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactiveMajor.getValue())){
                            for (Major major : department.majors){
                                if (major.getName().equals(majorChooserDeactiveMajor.getValue())){
                                    deactiveAllInMajor(faculty.getFacultyName(), department.getName(), major.getName());
                                    University.saveFaculties();
                                    Professor.loadAllProfessor();
                                    for (Professor professor : University.allProfessors) {
                                        if (professor.getFaculty().equals(faculty.getFacultyName()) && professor.getDepartment().equals(department.getName())
                                                && professor.getStatus().equals(Status.Active) && professor.getMajor().equals(major.getName())) {
                                            professor.setStatus(Status.Inactive);
                                            professor.setDateOfDeactivation(LocalDate.now());
                                            break;
                                        }
                                    }
                                    Professor.saveAllProfessor();
                                    Student.loadAllStudents();
                                    for (Student student : University.allStudents) {
                                        if (student.getFaculty().equals(faculty.getFacultyName()) && student.getDepartment().equals(department.getName())
                                                && student.getStatus().equals(Status.Active) && student.getMajor().equals(major.getName())) {
                                            student.setStatus(Status.Inactive);
                                            student.setDateOfDeactivation(LocalDate.now());
                                            break;
                                        }
                                    }
                                    Student.saveAllStudent();

                                    errorLabelDeactiveMajor.setText(null);
                                    successLabelDeactiveMajor.setText("The Major Deactivated Successfully");

                                    facultyChooserDeactiveMajor.getSelectionModel().selectFirst();
                                    departmentChooserDeactiveMajor.getSelectionModel().selectFirst();
//                                    facultyChooserDeactiveMajor.setOnAction(event1 -> {
//                                        departmentChooserDeactiveMajor.getItems().clear();
//                                        departmentChooserDeactiveMajor.getItems().add("Department");
//                                        for (Faculty faculty1 : University.allFaculties) {
//                                            if (faculty1.getFacultyName().equals(facultyChooserDeactiveMajor.getValue()) && faculty1.getStatus().equals(Status.Active)) {
//                                                for (Department department1 : faculty1.departments) {
//                                                    if (department1.getStatus().equals(Status.Active)) {
//                                                        departmentChooserDeactiveMajor.getItems().add(department1.getName());
//                                                    }
//                                                }
//                                                break;
//                                            }
//                                        }
//                                        departmentChooserDeactiveMajor.setVisibleRowCount(5);
//                                        departmentChooserDeactiveMajor.getSelectionModel().selectFirst();
//                                    });
                                    departmentChooserDeactiveMajor.setOnAction(event1 -> {
                                        majorChooserDeactiveMajor.getItems().clear();
                                        majorChooserDeactiveMajor.getItems().add("Major");
                                        for (Faculty faculty1 : University.allFaculties) {
                                            if (faculty1.getStatus().equals(Status.Active) && faculty1.getFacultyName().equals(facultyChooserDeactiveMajor.getValue())) {
                                                for (Department department1 : faculty1.departments) {
                                                    if (department1.getStatus().equals(Status.Active) && department1.getName().equals(departmentChooserDeactiveMajor.getValue())) {
                                                        for (Major major1 : department1.majors) {
                                                            if (major1.getStatus().equals(Status.Active)) {
                                                                majorChooserDeactiveMajor.getItems().add(major1.getName());
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        majorChooserDeactiveMajor.setVisibleRowCount(4);
                                        majorChooserDeactiveMajor.getSelectionModel().selectFirst();
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
        } else {
            errorLabelDeactiveMajor.setText("Fill In All Fields");
        }
    }

    @FXML
    void departmentsReports(ActionEvent event) {
        headerTitle.setText(" --> Reports --> Departments");
        departmentsReportsAnchorPane.setVisible(true);

        searchFieldReportDepartment.clear();
        searchFieldReportDepartment.setPromptText("Search ...");
        colDepartmentNameReportDepartment.setCellValueFactory(data -> data.getValue().departmentNameProperty());
        colDepartmentIDReportDepartment.setCellValueFactory(data -> data.getValue().departmentIDProperty());
        colFacultyReportDepartment.setCellValueFactory(data -> data.getValue().facultyProperty());
        colEstYearReportDepartment.setCellValueFactory(data -> data.getValue().estYearProperty());
        colStatusReportDepartment.setCellValueFactory(data -> data.getValue().statusProperty());

        University.loadFaculties();
        departmentList = FXCollections.observableArrayList();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                departmentList.add(new DepartmentReport(department.getName(), department.getId(), faculty.getFacultyName(), String.valueOf(department.getEstablishmentYear()), String.valueOf(department.getStatus())));
            }
        }

        filteredListReportDepartment = new FilteredList<>(departmentList, p -> true);
        tableViewReportDepartment.setItems(filteredListReportDepartment);

        setupStatusContextMenuReportDepartment();
        setupFacultyContextMenuReportDepartment();

    }

    @FXML
    void editDepartment(ActionEvent event) throws Exception {
        successLabelEditDepartment.setText(null);
        University.loadFaculties();
        Professor.loadAllProfessor();
        Employee.loadAllEmployee();
        Student.loadAllStudents();
        boolean confirmation = true;
        if (facultyChooserEditDepartment.getValue().isEmpty() || facultyChooserEditDepartment.getValue().equals("Faculty")) {
            errorLabelFacultyChooserEditDepartment.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserEditDepartment.getValue().isEmpty() || departmentChooserEditDepartment.getValue().equals("Department")) {
            errorLabelFacultyChooserEditDepartment.setText(null);
            errorLabelDepartmentChooserEditDepartment.setText("Choose Department");
            confirmation = false;
        } else {
            errorLabelDepartmentChooserEditDepartment.setText(null);
        }

        if (confirmation) {
            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditDepartment.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEditDepartment.getValue())){
                            boolean edited = false;
                            if (!newDepartmentNameEditDepartment.getText().isBlank()){
                                if (!newDepartmentNameEditDepartment.getText().equals(department.getName())) {
                                    if (faculty.departments.stream().noneMatch(department1 -> department1.getName().equals(newDepartmentNameEditDepartment.getText()))) {
                                        edited = true;

                                        department.setName(newDepartmentNameEditDepartment.getText());
                                        for (Employee employee : University.allEmployees) {
                                            if (employee.getDepartment().equals(departmentChooserEditDepartment.getValue())) {
                                                employee.setDepartment(newDepartmentNameEditDepartment.getText());
                                                Employee.saveAllEmployee();
                                            }
                                        }
                                        for (Professor professor : University.allProfessors) {
                                            if (professor.getDepartment().equals(departmentChooserEditDepartment.getValue())) {
                                                professor.setDepartment(newDepartmentNameEditDepartment.getText());
                                                Professor.saveAllProfessor();
                                            }
                                        }
                                        for (Student student : University.allStudents) {
                                            if (student.getDepartment().equals(departmentChooserEditDepartment.getValue())) {
                                                student.setDepartment(newDepartmentNameEditDepartment.getText());
                                                Student.saveAllStudent();
                                            }
                                        }

                                    } else {
                                        errorLabelDepartmentNameEditDepartment.setText("Choose another Name");
                                        errorLabelEditDepartment.setText("The Selected Name Has Been Already Chosen");
                                        return;
                                    }
                                } else {
                                    errorLabelDepartmentNameEditDepartment.setText("Choose another Name");
                                    errorLabelEditDepartment.setText("The Selected Name is The Current Department Name");
                                    return;
                                }
                            }
                            if (!newEstablishmentYearEditDepartment.getText().isBlank()){
                                try {
                                    int establishmentYear = Integer.parseInt(newEstablishmentYearEditDepartment.getText());
                                    if (establishmentYear > LocalDate.now().getYear() || establishmentYear < 0){
                                        errorLabelEstYearEditDepartment.setText("Is Not In Range (0 - " + LocalDate.now().getYear()+")");
                                        return;
                                    } else {
                                        errorLabelEstYearEditDepartment.setText(null);
                                        department.setEstablishmentYear(establishmentYear);
                                        edited = true;
                                    }
                                } catch(NumberFormatException e) {
                                    errorLabelEstYearEditDepartment.setText("Enter Just Number");
                                    return;
                                }
                            }
                            if (edited) {
                                University.saveFaculties();
                                errorLabelEstYearEditDepartment.setText(null);
                                errorLabelDepartmentNameEditDepartment.setText(null);
                                errorLabelEditDepartment.setText(null);
                                successLabelEditDepartment.setText("The Department Edited Successfully\n" +
                                        "Department Name : " + department.getName() + "\nEstablishment Year : " + department.getEstablishmentYear());


                                facultyChooserEditDepartment.getSelectionModel().selectFirst();
                                facultyChooserEditDepartment.setOnAction(event1 -> {
                                    departmentChooserEditDepartment.getItems().clear();
                                    departmentChooserEditDepartment.getItems().add("Department");
                                    for (Faculty faculty1 : University.allFaculties) {
                                        if (faculty1.getStatus().equals(Status.Active) && facultyChooserEditDepartment.getValue().equals(faculty1.getFacultyName())) {
                                            for (Department department1 : faculty1.departments) {
                                                if (department1.getStatus().equals(Status.Active)) {
                                                    departmentChooserEditDepartment.getItems().add(department1.getName());
                                                }
                                            }
                                        }
                                    }
                                    departmentChooserEditDepartment.setVisibleRowCount(4);
                                    departmentChooserEditDepartment.getSelectionModel().selectFirst();
                                });

                                newDepartmentNameEditDepartment.clear();
                                newDepartmentNameEditDepartment.setPromptText("Faculty Name");
                                newEstablishmentYearEditDepartment.clear();
                                newEstablishmentYearEditDepartment.setPromptText("Establishment Year");

                            } else {
                                successLabelEditDepartment.setText(null);
                                errorLabelDepartmentNameEditDepartment.setText("*");
                                errorLabelEstYearEditDepartment.setText("*");
                                errorLabelEditDepartment.setText("Fill In At Least One Field.");
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    @FXML
    void editEmployee(ActionEvent event) throws IOException {
        successLabelEditEmployee.setText(null);
        Employee.loadAllEmployee();
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyChooserEditEmployee.getValue().isEmpty() || facultyChooserEditEmployee.getValue().equals("Faculty")) {
            errorLabelFacultyChooserEditEmployee.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserEditEmployee.getValue().isEmpty() || departmentChooserEditEmployee.getValue().equals("Department")) {
            errorLabelFacultyChooserEditEmployee.setText(null);
            errorLabelDepartmentChooserEditEmployee.setText("Choose Department");
            confirmation = false;
        } else if (employeeChooserEditEmployee.getValue().isEmpty() || employeeChooserEditEmployee.getValue().equals("Employee")) {
            errorLabelDepartmentChooserEditEmployee.setText(null);
            errorLabelEmployeeChooserEditEmployee.setText("Choose Employee");
            confirmation = false;
        } else {
            errorLabelEmployeeChooserEditEmployee.setText(null);
        }
        if (confirmation) {
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyChooserEditEmployee.getValue())) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(departmentChooserEditEmployee.getValue())) {
                            for (Employee employee : department.employees) {
                                if (employee.getFullName().equals(employeeChooserEditEmployee.getValue())) {
                                    if (!newFirstNameEditEmployee.getText().isEmpty() || !newLastNameEditEmployee.getText().isEmpty() || genderChooserEditEmployee.getValue() != null || dateOfBirthEditEmployee.getValue() != null || !nationalIdEditEmployee.getText().isEmpty() || !phoneNumberEditEmployee.getText().isEmpty()) {
                                        if (!newFirstNameEditEmployee.getText().isBlank()) {
                                            employee.setFirst_name(newFirstNameEditEmployee.getText());
                                        }
                                        if (!newLastNameEditEmployee.getText().isBlank()) {
                                            employee.setLast_name(newLastNameEditEmployee.getText());
                                        }
                                        if (genderChooserEditEmployee.getValue() != null) {
                                            employee.setGender(Gender.valueOf(genderChooserEditEmployee.getValue()));
                                        }
                                        if (dateOfBirthEditEmployee.getValue() != null) {
                                            LocalDate date = dateOfBirthEditEmployee.getValue();
                                            employee.setDateOfBirth(date);
                                        }
                                        if (!nationalIdEditEmployee.getText().isBlank()) {
                                            try {
                                                Long nationalID = Long.parseLong(nationalIdEditEmployee.getText());
                                                if (nationalIdEditEmployee.getText().length() != 10) {
                                                    errorLabelNationalIdEditEmployee.setText("Enter 10 Digit");
                                                    return;
                                                } else {
                                                    errorLabelNationalIdEditEmployee.setText(null);
                                                    employee.setNationalId(nationalIdEditEmployee.getText());
                                                }
                                            } catch (NumberFormatException e) {
                                                errorLabelNationalIdEditEmployee.setText("Enter Just Number");
                                                return;
                                            }
                                        }
                                        if (!phoneNumberEditEmployee.getText().isBlank()) {
                                            try {
                                                Long phoneNumber = Long.parseLong(phoneNumberEditEmployee.getText());
                                                if (phoneNumberEditEmployee.getText().length() != 11) {
                                                    errorLabelPhoneNumberEditEmployee.setText("Enter 11 Digit");
                                                    return;
                                                } else if (phoneNumberEditEmployee.getText().startsWith("09")) {
                                                    errorLabelPhoneNumberEditEmployee.setText("Wrong Format(09...)");
                                                    return;
                                                } else {
                                                    errorLabelPhoneNumberEditEmployee.setText(null);
                                                    employee.setPhoneNumber(phoneNumberEditEmployee.getText());
                                                }
                                            } catch (NumberFormatException e) {
                                                errorLabelNationalIdEditEmployee.setText("Enter Just Number");
                                                return;
                                            }
                                        }
                                        University.saveFaculties();

                                        for (Employee employee1 : University.allEmployees) {
                                            if (employee1.getFullName().equals(employeeChooserEditEmployee.getValue())) {
                                                if (!newFirstNameEditEmployee.getText().isBlank()) {
                                                    employee1.setFirst_name(newFirstNameEditEmployee.getText());
                                                }
                                                if (!newLastNameEditEmployee.getText().isBlank()) {
                                                    employee1.setLast_name(newLastNameEditEmployee.getText());
                                                }
                                                if (genderChooserEditEmployee.getValue() != null) {
                                                    employee1.setGender(Gender.valueOf(genderChooserEditEmployee.getValue()));
                                                }
                                                if (dateOfBirthEditEmployee.getValue() != null) {
                                                    LocalDate date = dateOfBirthEditEmployee.getValue();
                                                    employee1.setDateOfBirth(date);
                                                }
                                                if (!nationalIdEditEmployee.getText().isBlank()) {
                                                    employee1.setNationalId(nationalIdEditEmployee.getText());
                                                }
                                                if (!phoneNumberEditEmployee.getText().isBlank()) {
                                                    employee1.setPhoneNumber(phoneNumberEditEmployee.getText());
                                                }
                                                Employee.saveAllEmployee();
                                            }
                                        }

                                        errorLabelEditEmployee.setText(null);
                                        successLabelEditEmployee.setText("The Employee Edited Successfully");

                                        facultyChooserEditEmployee.getSelectionModel().selectFirst();
                                        facultyChooserEditEmployee.setOnAction(event1 -> {
                                            departmentChooserEditEmployee.getItems().clear();
                                            departmentChooserEditEmployee.getItems().add("Department");
                                            for (Faculty faculty1 : University.allFaculties) {
                                                if (faculty1.getFacultyName().equals(facultyChooserEditEmployee.getValue()) && faculty1.getStatus().equals(Status.Active)) {
                                                    for (Department department1 : faculty1.departments) {
                                                        if (department1.getStatus().equals(Status.Active)) {
                                                            departmentChooserEditEmployee.getItems().add(department1.getName());
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            departmentChooserEditEmployee.setVisibleRowCount(5);
                                            departmentChooserEditEmployee.getSelectionModel().selectFirst();
                                        });
                                        departmentChooserEditEmployee.setOnAction(event1 -> {
                                            Employee.loadAllEmployee();
                                            employeeChooserEditEmployee.getItems().clear();
                                            employeeChooserEditEmployee.getItems().add("Employee");
                                            for (Employee employee1 : University.allEmployees) {
                                                if (employee1.getStatus().equals(Status.Active) && employee1.getDepartment().equals(departmentChooserEditEmployee.getValue())) {
                                                    employeeChooserEditEmployee.getItems().add(employee1.getFullName());
                                                }
                                            }
                                            employeeChooserEditEmployee.setVisibleRowCount(4);
                                            employeeChooserEditEmployee.getSelectionModel().selectFirst();
                                        });
                                        genderChooserEditEmployee.getSelectionModel().selectFirst();

                                        newFirstNameEditEmployee.clear();
                                        newFirstNameEditEmployee.setPromptText("First Name");
                                        newLastNameEditEmployee.clear();
                                        newLastNameEditEmployee.setPromptText("Last Name");
                                        phoneNumberEditEmployee.clear();
                                        phoneNumberEditEmployee.setPromptText("Phone Number");
                                        nationalIdEditEmployee.clear();
                                        nationalIdEditEmployee.setPromptText("National ID");
                                        dateOfBirthEditEmployee.setValue(null);
                                        dateOfBirthEditEmployee.setPromptText("Date Of Birth");

                                    } else {
                                        errorLabelEditEmployee.setText("Fill In At Least One Field");
                                        errorLabelFirstNameEditEmployee.setText("*");
                                        errorLabelLastNameEditEmployee.setText("*");
                                        errorLabelGenderChooserEditEmployee.setText("*");
                                        errorLabelDateOfBirthEditEmployee.setText("*");
                                        errorLabelPhoneNumberEditEmployee.setText("*");
                                        errorLabelNationalIdEditEmployee.setText("*");
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
    }


    @FXML
    void editFaculty(ActionEvent event) throws Exception {
        successLabelEditFaculty.setText(null);
        University.loadFaculties();
        Employee.loadAllEmployee();
        Professor.loadAllProfessor();
        Student.loadAllStudents();
        boolean confirmation = true;
        if (facultyChooserEditFaculty.getValue().equals("Faculty") || facultyChooserEditFaculty.getValue().isEmpty()) {
            errorLabelFacultyChooserEditFaculty.setText("Choose Faculty");
            confirmation = false;
        } else {
            errorLabelFacultyChooserEditFaculty.setText(null);
        }
        if (confirmation) {
            for(Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditFaculty.getValue())){
                    boolean edited = false;
                    if (!newFacultyNameEditFaculty.getText().isBlank()){
                        if (!newFacultyNameEditFaculty.getText().equals(faculty.getFacultyName())) {
                            if (University.allFaculties.stream().noneMatch(faculty1 -> faculty1.getFacultyName().equals(newFacultyNameEditFaculty.getText()))) {
                                edited = true;

                                faculty.setFacultyName(newFacultyNameEditFaculty.getText());
                                for (Employee employee : University.allEmployees) {
                                    if (employee.getFaculty().equals(facultyChooserEditFaculty.getValue())) {
                                        employee.setFaculty(newFacultyNameEditFaculty.getText());
                                        Employee.saveAllEmployee();
                                    }
                                }
                                for (Professor professor : University.allProfessors) {
                                    if (professor.getFaculty().equals(facultyChooserEditFaculty.getValue())) {
                                        professor.setFaculty(newFacultyNameEditFaculty.getText());
                                        Professor.saveAllProfessor();
                                    }
                                }
                                for (Student student : University.allStudents) {
                                    if (student.getFaculty().equals(facultyChooserEditFaculty.getValue())) {
                                        student.setFaculty(newFacultyNameEditFaculty.getText());
                                        Student.saveAllStudent();
                                    }
                                }
                            } else {
                                errorLabelFacultyNameEditFaculty.setText("Choose another Name");
                                errorLabelEditFaculty.setText("The Selected Name Has Been Already Chosen");
                                return;
                            }
                        } else {
                            errorLabelFacultyNameEditFaculty.setText("Choose another Name");
                            errorLabelEditFaculty.setText("The Selected Name is The Current Faculty Name");
                            return;
                        }
                    }
                    if (!newEstablishmentYearEditFaculty.getText().isBlank()){
                        try {
                            int establishmentYear = Integer.parseInt(newEstablishmentYearEditFaculty.getText());
                            if (establishmentYear > LocalDate.now().getYear() || establishmentYear < 0){
                                errorLabelEstablishmentEditFaculty.setText("Is Not In Range (0 - " + LocalDate.now().getYear()+")");
                                return;
                            } else {
                                errorLabelEstablishmentEditFaculty.setText(null);
                                faculty.setEstablishmentYear(establishmentYear);
                                edited = true;
                            }
                        } catch(NumberFormatException e) {
                            errorLabelEstablishmentEditFaculty.setText("Enter Just Number");
                            return;
                        }
                    }
                    if (edited) {
                        University.saveFaculties();
                        errorLabelEstablishmentEditFaculty.setText(null);
                        errorLabelFacultyNameEditFaculty.setText(null);
                        errorLabelEditFaculty.setText(null);
                        successLabelEditFaculty.setText("The Faculty Edited Successfully\n" +
                                "Faculty Name : " + faculty.getFacultyName() + "\nEstablishment Year : " + faculty.getEstablishmentYear());

                        facultyChooserEditFaculty.getItems().clear();
                        facultyChooserEditFaculty.getItems().add("Faculty");
                        for (Faculty faculty1 : University.allFaculties) {
                            if (faculty1.getStatus().equals(Status.Active)) {
                                facultyChooserEditFaculty.getItems().add(faculty1.getFacultyName());
                            }
                        }
                        facultyChooserEditFaculty.setVisibleRowCount(4);
                        facultyChooserEditFaculty.getSelectionModel().selectFirst();

                        newFacultyNameEditFaculty.clear();
                        newFacultyNameEditFaculty.setPromptText("Faculty Name");
                        newEstablishmentYearEditFaculty.clear();
                        newEstablishmentYearEditFaculty.setPromptText("Establishment Year");

                    } else {
                        successLabelEditFaculty.setText(null);
                        errorLabelFacultyNameEditFaculty.setText("*");
                        errorLabelEstablishmentEditFaculty.setText("*");
                        errorLabelEditFaculty.setText("Fill In At Least One Field.");
                    }

                    break;
                }
            }
        }


    }

    @FXML
    void editMajor(ActionEvent event) throws Exception {
        successLabelEditMajor.setText(null);
        University.loadFaculties();
        Professor.loadAllProfessor();
        Student.loadAllStudents();
        boolean confirmation = true;
        if(facultyChooserEditMajor.getValue().isEmpty() || facultyChooserEditMajor.getValue().equals("Faculty")) {
            errorLabelFacultyChooserEditMajor.setText("Choose Faculty");
            confirmation = false;
        } else if (departmentChooserEditMajor.getValue().isEmpty() || departmentChooserEditMajor.getValue().equals("Department")) {
            errorLabelFacultyChooserEditMajor.setText(null);
            errorLabelDepartmentChooserEditMajor.setText("Choose Department");
            confirmation = false;
        } else if (majorChooserEditMajor.getValue().isEmpty() || majorChooserEditMajor.getValue().equals("Major")) {
            errorLabelDepartmentChooserEditMajor.setText(null);
            errorLabelMajorChooserEditMajor.setText("Choose Major");
            confirmation = false;
        } else {
            errorLabelMajorChooserEditMajor.setText(null);
        }

        if (confirmation) {
            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue())){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEditMajor.getValue())){
                            for (Major major : department.majors){
                                if (major.getName().equals(majorChooserEditMajor.getValue())){
                                    boolean edited = false;
                                    if (!newMajorNameEditMajor.getText().equals(major.getName())){
                                        if (University.allFaculties.stream().noneMatch(faculty1 -> faculty1.getFacultyName().equals(newFacultyNameEditFaculty.getText()))) {
                                            if (!newMajorNameEditMajor.getText().isBlank()){
                                                edited = true;
                                                major.setName(newMajorNameEditMajor.getText());
                                                for (Professor professor : University.allProfessors) {
                                                    if (professor.getMajor().equals(majorChooserEditMajor.getValue())) {
                                                        professor.setMajor(newMajorNameEditMajor.getText());
                                                        Professor.saveAllProfessor();
                                                    }
                                                }
                                                for (Student student : University.allStudents) {
                                                    if (student.getMajor().equals(majorChooserEditMajor.getValue())) {
                                                        student.setMajor(newMajorNameEditMajor.getText());
                                                        Student.saveAllStudent();
                                                    }
                                                }
                                            }
                                        } else {
                                            errorLabelMajorNameEditMajor.setText("Choose another Name");
                                            errorLabelEditMajor.setText("The Selected Name Has Been Already Chosen");
                                            return;
                                        }
                                    } else {
                                        errorLabelMajorNameEditMajor.setText("Choose another Name");
                                        errorLabelEditMajor.setText("The Selected Name is The Current Major Name");
                                        return;
                                    }
                                    if (!newEstablishmentYearEditMajor.getText().isBlank()){
                                        try {
                                            int establishmentYear = Integer.parseInt(newEstablishmentYearEditMajor.getText());
                                            if (establishmentYear > LocalDate.now().getYear() || establishmentYear < 0){
                                                errorLabelEstYearEditMajor.setText("Is Not In Range (0 - " + LocalDate.now().getYear()+")");
                                                return;
                                            } else {
                                                errorLabelEstYearEditMajor.setText(null);
                                                major.setEstablishmentYear(establishmentYear);
                                                edited = true;
                                            }
                                        } catch (NumberFormatException e) {
                                            errorLabelEstYearEditMajor.setText("Enter Just Number");
                                        }
                                    }
                                    if (edited) {
                                        University.saveFaculties();

                                        errorLabelEditMajor.setText(null);
                                        successLabelDeactiveMajor.setText("The Major Edited Successfully");

                                        facultyChooserEditMajor.getSelectionModel().selectFirst();
                                        facultyChooserEditMajor.setOnAction(event1 -> {
                                            departmentChooserEditMajor.getItems().clear();
                                            departmentChooserEditMajor.getItems().add("Department");
                                            for (Faculty faculty1 : University.allFaculties) {
                                                if (faculty1.getFacultyName().equals(facultyChooserEditMajor.getValue()) && faculty1.getStatus().equals(Status.Active)) {
                                                    for (Department department1 : faculty1.departments) {
                                                        if (department1.getStatus().equals(Status.Active)) {
                                                            departmentChooserEditMajor.getItems().add(department1.getName());
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            departmentChooserEditMajor.setVisibleRowCount(5);
                                            departmentChooserEditMajor.getSelectionModel().selectFirst();
                                        });
                                        departmentChooserEditMajor.setOnAction(event1 -> {
                                            majorChooserEditMajor.getItems().clear();
                                            majorChooserEditMajor.getItems().add("Major");
                                            for (Faculty faculty1 : University.allFaculties) {
                                                if (faculty1.getStatus().equals(Status.Active) && faculty1.getFacultyName().equals(facultyChooserEditMajor.getValue())) {
                                                    for (Department department1 : faculty1.departments) {
                                                        if (department1.getStatus().equals(Status.Active) && department1.getName().equals(departmentChooserEditMajor.getValue())) {
                                                            for (Major major1 : department1.majors) {
                                                                if (major1.getStatus().equals(Status.Active)) {
                                                                    majorChooserEditMajor.getItems().add(major1.getName());
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            majorChooserEditMajor.setVisibleRowCount(5);
                                            majorChooserEditMajor.getSelectionModel().selectFirst();
                                        });
                                        newMajorNameEditMajor.clear();
                                        newMajorNameEditMajor.setPromptText("Major Name");
                                        newEstablishmentYearEditMajor.clear();
                                        newEstablishmentYearEditMajor.setPromptText("Establishment Year");
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
            errorLabelEditMajor.setText("Fill In All Fields");
        }
    }

    @FXML
    void emergencyDropDashboard(ActionEvent event) {
        // Set the header title
        headerTitle.setText(" --> Emergency Drop");

        // Hide all anchor panes
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        emergencyDropAnchorPane.setVisible(true);
        emergencyDropScrollPane.getStyleClass().add("pressed");

        errorLabelEmergencyDrop.setText(null);
        successLabelEmergencyDrop.setText(null);

        // Check current emergency drop status
        File file = new File("EmergencyDrop.txt");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String status = reader.readLine();
                emergencyDropStatusLabel.setText("Emergency Drop Status: " + (status.equals("Active") ? "Active" : "Inactive"));
            } catch (IOException e) {
                emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
            }
        } else {
            emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
        }
    }

    @FXML
    void emergencyDropScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Emergency Drop");

        if (addFacultyAnchorPane.isVisible()) {
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        }

        if (!emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(true);
            emergencyDropScrollPane.getStyleClass().add("pressed");

            errorLabelEmergencyDrop.setText(null);
            successLabelEmergencyDrop.setText(null);

            // Check current emergency drop status
            File file = new File("EmergencyDrop.txt");
            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String status = reader.readLine();
                    emergencyDropStatusLabel.setText("Emergency Drop Status: " + (status.equals("Active") ? "Active" : "Inactive"));
                } catch (IOException e) {
                    emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
                }
            } else {
                emergencyDropStatusLabel.setText("Emergency Drop Status: Unknown");
            }
        }
    }

    @FXML
    void enrollmentDashboard(ActionEvent event) {
        // Set the header title
        headerTitle.setText(" --> Enrollment");

        // Hide all anchor panes
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        enrollmentAnchorPane.setVisible(true);
        enrollmentScrollPane.getStyleClass().add("pressed");

        errorLabelEnrollment.setText(null);
        successLabelEnrollment.setText(null);

        // Check current enrollment status
        File file = new File("Enrollment.txt");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String status = reader.readLine();
                enrollmentStatusLabel.setText("Enrollment Status: " + (status.equals("Active") ? "Active" : "Inactive"));
            } catch (IOException e) {
                enrollmentStatusLabel.setText("Enrollment Status: Unknown");
            }
        } else {
            enrollmentStatusLabel.setText("Enrollment Status: Unknown");
        }
    }

    @FXML
    void enrollmentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Enrollment");

        if (addFacultyAnchorPane.isVisible()) {
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }

        if (!enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(true);
            enrollmentScrollPane.getStyleClass().add("pressed");

            errorLabelEnrollment.setText(null);
            successLabelEnrollment.setText(null);

            File file = new File("Enrollment.txt");
            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String status = reader.readLine();
                    enrollmentStatusLabel.setText("Enrollment Status: " + (status.equals("Active") ? "Active" : "Inactive"));
                } catch (IOException e) {
                    enrollmentStatusLabel.setText("Enrollment Status: Unknown");
                }
            } else {
                enrollmentStatusLabel.setText("Enrollment Status: Unknown");
            }
        }
    }

    @FXML
    void facultiesReports(ActionEvent event) {
        headerTitle.setText(" --> Reports --> Faculties");
        facultiesReportsAnchorPane.setVisible(true);


        searchFieldFaculties.clear();
        searchFieldFaculties.setPromptText("Search ...");
        colNameReportFaculty.setCellValueFactory(data -> data.getValue().facultyNameProperty());
        colIDReportFaculty.setCellValueFactory(data -> data.getValue().facultyIdProperty());
        colEstablishmentReportFaculty.setCellValueFactory(data -> data.getValue().establishmentYearProperty().asObject());
        colStatusReportFaculty.setCellValueFactory(data -> data.getValue().statusProperty());

        University.loadFaculties();
        facultyList = FXCollections.observableArrayList();
        for (Faculty faculty : University.allFaculties) {
            facultyList.add(new FacultyReport(faculty.getFacultyName(), faculty.getId(), faculty.getEstablishmentYear(), String.valueOf(faculty.getStatus())));
        }

        filteredListReportFaculty = new FilteredList<>(facultyList, facultyReport -> true);
        tableViewReportFaculty.setItems(filteredListReportFaculty);

        setupStatusContextMenuFaculty();
    }

    @FXML
    void majorsReports(ActionEvent event) {
        headerTitle.setText(" --> Reports --> Majors");
        majorsReportsAnchorPane.setVisible(true);


        searchFieldReportMajors.clear();
        searchFieldReportMajors.setPromptText("Search ...");

        colNameReportMajors.setCellValueFactory(cellData -> cellData.getValue().majorNameProperty());
        colIdReportMajors.setCellValueFactory(cellData -> cellData.getValue().majorIdProperty());
        colFacultyReportMajors.setCellValueFactory(cellData -> cellData.getValue().facultyProperty());
        colDepartmentReportMajors.setCellValueFactory(cellData -> cellData.getValue().departmentProperty());
        colEstablishmentYearReportMajors.setCellValueFactory(cellData -> cellData.getValue().establishmentYearProperty().asObject());
        colStatusReportMajors.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

        University.loadFaculties();
        majorList = FXCollections.observableArrayList();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    majorList.add(new MajorReport(major.getName(), major.getId(), faculty.getFacultyName(), department.getName(), major.getEstablishmentYear(), major.getStatus().toString()));
                }
            }
        }

        filteredListReportMajor = new FilteredList<>(majorList, majorReport -> true);
        tableViewReportMajors.setItems(filteredListReportMajor);

        setupStatusContextMenuReportMajor();
        setupFacultyContextMenuReportMajor();
        setupDepartmentContextMenuReportMajor();

    }

    @FXML
    void peopleReports(ActionEvent event) {
        headerTitle.setText(" --> Reports --> People");
        peopleReportsAnchorPane.setVisible(true);


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
        colDateOfDeactivationReportPeople.setCellValueFactory(data -> data.getValue().dateOfDeactivationProperty());

        University.loadFaculties();
        peopleList = FXCollections.observableArrayList();

        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Employee employee : department.employees) {
                    peopleList.add(new People(employee.getFirst_name(), employee.getLast_name(), employee.getDateOfBirth(), employee.getNationalId(),
                            employee.getGender(), employee.getPhoneNumber(), employee.getDateOfJoin(),"Employee", employee.getId(),
                            employee.getFaculty(), employee.getDepartment(), "----", "----", employee.getStatus(), employee.getDateOfDeactivation()));
                }
                for (Major major : department.majors) {
                    for (Student student : major.students) {
                        peopleList.add(new People(student.getFirst_name(), student.getLast_name(), student.getDateOfBirth(), student.getNationalId(),
                                student.getGender(), student.getPhoneNumber(), student.getDateOfJoin(), "Student", student.getId(),
                                student.getFaculty(), student.getDepartment(), student.getMajor(), student.getDegree(), student.getStatus(), student.getDateOfDeactivation()));
                    }
                    for (Professor professor : major.professors) {
                        peopleList.add(new People(professor.getFirst_name(), professor.getLast_name(), professor.getDateOfBirth(), professor.getNationalId(),
                                professor.getGender(), professor.getPhoneNumber(), professor.getDateOfJoin(), "Professor", professor.getId(),
                                professor.getFaculty(), professor.getDepartment(), professor.getMajor(), "----", professor.getStatus(), professor.getDateOfDeactivation()));
                    }
                }
            }
        }


        filteredListReportPeople = new FilteredList<>(peopleList, people -> true);
        tableViewReportPeople.setItems(filteredListReportPeople);

        setupGenderContextMenuPeople();
        setupStatusContextMenuPeople();
        setupRoleContextMenuPeople();
        setupFacultyContextMenuPeople();
        setupDepartmentContextMenuPeople();
        setupMajorContextMenuPeople();
        setupDegreeContextMenuPeople();
        setupIdContextMenuPeople();
    }

    @FXML
    void peopleByDateReports(ActionEvent event) {
        headerTitle.setText(" --> Reports --> People By Dates");
        peopleByDateReportAnchorPane.setVisible(true);

        fieldOfDateChooserPeopleByDate.getItems().clear();
        fieldOfDateChooserPeopleByDate.getItems().addAll("Field", "Registration Date", "Deactivation Date");
        fieldOfDateChooserPeopleByDate.getSelectionModel().selectFirst();
        primaryDatePeopleByDate.setValue(null);
        secondaryDatePeopleByDate.setValue(null);


        // People
        colNameReportPeopleByDate.setCellValueFactory(data -> data.getValue().fullNameProperty());
        colAgeReportPeopleByDate.setCellValueFactory(data -> data.getValue().ageProperty().asObject());
        colGenderReportPeopleByDate.setCellValueFactory(data -> data.getValue().genderProperty());
        colPhoneReportPeopleByDate.setCellValueFactory(data -> data.getValue().phoneNumberProperty());
        colNationalIDReportPeopleByDate.setCellValueFactory(data -> data.getValue().nationalIdProperty());
        colRoleReportPeopleByDate.setCellValueFactory(data -> data.getValue().roleProperty());
        colIDReportPeopleByDate.setCellValueFactory(data -> data.getValue().idProperty());
        colDateOfRegisterReportPeopleByDate.setCellValueFactory(data -> data.getValue().dateOfRegistrationProperty());
        colFacultyReportPeopleByDate.setCellValueFactory(data -> data.getValue().facultyProperty());
        colDepartmentReportPeopleByDate.setCellValueFactory(data -> data.getValue().departmentProperty());
        colMajorReportPeopleByDate.setCellValueFactory(data -> data.getValue().majorProperty());
        colDegreeReportPeopleByDate.setCellValueFactory(data -> data.getValue().degreeProperty());
        colStatusReportPeopleByDate.setCellValueFactory(data -> data.getValue().statusProperty());
        colDateOfDeactivationReportPeopleByDate.setCellValueFactory(data -> data.getValue().dateOfDeactivationProperty());

        University.loadFaculties();
        peopleByDateList = FXCollections.observableArrayList();

        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Employee employee : department.employees) {
                    peopleByDateList.add(new People(employee.getFirst_name(), employee.getLast_name(), employee.getDateOfBirth(), employee.getNationalId(),
                            employee.getGender(), employee.getPhoneNumber(), employee.getDateOfJoin(), "Employee", employee.getId(),
                            employee.getFaculty(), employee.getDepartment(), "----", "----", employee.getStatus(), employee.getDateOfDeactivation()));
                }
                for (Major major : department.majors) {
                    for (Student student : major.students) {
                        peopleByDateList.add(new People(student.getFirst_name(), student.getLast_name(), student.getDateOfBirth(), student.getNationalId(),
                                student.getGender(), student.getPhoneNumber(), student.getDateOfJoin(), "Student", student.getId(),
                                student.getFaculty(), student.getDepartment(), student.getMajor(), student.getDegree(), student.getStatus(), student.getDateOfDeactivation()));
                    }
                    for (Professor professor : major.professors) {
                        peopleByDateList.add(new People(professor.getFirst_name(), professor.getLast_name(), professor.getDateOfBirth(), professor.getNationalId(),
                                professor.getGender(), professor.getPhoneNumber(), professor.getDateOfJoin(), "Professor", professor.getId(),
                                professor.getFaculty(), professor.getDepartment(), professor.getMajor(), "----", professor.getStatus(), professor.getDateOfDeactivation()));

                    }
                }
            }
        }



        filteredListReportPeopleByDate = new FilteredList<>(peopleByDateList, people -> true);
        tableViewReportPeopleByDate.setItems(filteredListReportPeopleByDate);

        setupGenderContextMenuPeopleByDate();
        setupStatusContextMenuPeopleByDate();
        setupRoleContextMenuPeopleByDate();
        setupFacultyContextMenuPeopleByDate();
        setupDepartmentContextMenuPeopleByDate();
        setupMajorContextMenuPeopleByDate();
        setupDegreeContextMenuPeopleByDate();
        setupIdContextMenuPeopleByDate();
    }

    @FXML
    void reportsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Reports");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        reportsAnchorPane.setVisible(true);
        reportsScrollPane.getStyleClass().add("pressed");

        facultiesReportsAnchorPane.setVisible(false);
        departmentsReportsAnchorPane.setVisible(false);
        majorsReportsAnchorPane.setVisible(false);
        peopleReportsAnchorPane.setVisible(false);
        coursesReportsAnchorPane.setVisible(false);
        courseGroupsReportsAnchorPane.setVisible(false);
    }

    @FXML
    void reportsScrollPane(ActionEvent event) {

        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }

        if (!reportsAnchorPane.isVisible()) {
            headerTitle.setText(" --> Reports");
            reportsAnchorPane.setVisible(true);
            reportsScrollPane.getStyleClass().add("pressed");

            facultiesReportsAnchorPane.setVisible(false);
            departmentsReportsAnchorPane.setVisible(false);
            majorsReportsAnchorPane.setVisible(false);
            peopleReportsAnchorPane.setVisible(false);
            coursesReportsAnchorPane.setVisible(false);
            courseGroupsReportsAnchorPane.setVisible(false);
        }
    }
    //    Reports ------>>> Departments
    private void setupStatusContextMenuReportDepartment() {
        ContextMenu statusMenu = new ContextMenu();

        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> filterByStatusDepartment("Active"));

        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterByStatusDepartment("Inactive"));

        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportDepartment.setItems(departmentList));

        statusMenu.getItems().addAll(active, inactive, allItem);
        colStatusReportDepartment.setContextMenu(statusMenu);
    }

    private void filterByStatusDepartment(String status) {
        ObservableList<DepartmentReport> filtered = FXCollections.observableArrayList();
        for (DepartmentReport department : departmentList) {
            if (department.getStatus().equals(status)) {
                filtered.add(department);
            }
        }
        tableViewReportDepartment.setItems(filtered);
    }

    private void setupFacultyContextMenuReportDepartment() {
        ContextMenu facultyMenu = new ContextMenu();

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
           MenuItem facultyContext = new MenuItem(faculty.getFacultyName());
           facultyContext.setOnAction(e -> filterByFacultyDepartment(faculty.getFacultyName()));
           facultyMenu.getItems().add(facultyContext);
        }
        MenuItem allItems = new MenuItem("All");
        allItems.setOnAction(event -> tableViewReportDepartment.setItems(departmentList));
        facultyMenu.getItems().add(allItems);
        colFacultyReportDepartment.setContextMenu(facultyMenu);
    }

    private void filterByFacultyDepartment(String facultyName) {
        ObservableList<DepartmentReport> filtered = FXCollections.observableArrayList();
        for (DepartmentReport department : departmentList) {
            if (department.getFaculty().equals(facultyName)) {
                filtered.add(department);
            }
        }
        tableViewReportDepartment.setItems(filtered);
    }

    @FXML
    private void onSearchReportDepartment() {
        String keyword = searchFieldReportDepartment.getText().toLowerCase().trim();
        if (keyword.isEmpty()) {
            filteredListReportDepartment.setPredicate(p -> true);
            return;
        }
        filteredListReportDepartment.setPredicate(dept ->
                dept.getDepartmentName().toLowerCase().contains(keyword) ||
                        dept.getDepartmentID().toLowerCase().contains(keyword) ||
                        dept.getFaculty().toLowerCase().contains(keyword) ||
                        dept.getEstYear().toLowerCase().contains(keyword) ||
                        dept.getStatus().toLowerCase().contains(keyword)
        );
    }

    public void onBackReportDepartment(ActionEvent event) {
        headerTitle.setText(" --> Reports");
        departmentsReportsAnchorPane.setVisible(false);
    }
    //    Reports ------>>> Faculties
    private void setupStatusContextMenuFaculty() {
        ContextMenu statusMenu = new ContextMenu();

        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> filterByStatusFaculty("Active"));
        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterByStatusFaculty("Inactive"));

        MenuItem allStatus = new MenuItem("All");
        allStatus.setOnAction(e -> {
            filteredListReportFaculty.setPredicate(p -> true);
            tableViewReportFaculty.setItems(filteredListReportFaculty);
        });

        statusMenu.getItems().addAll(active, inactive, allStatus);
        colStatusReportFaculty.setContextMenu(statusMenu);
    }
    private void filterByStatusFaculty(String status) {
        ObservableList<FacultyReport> filtered = FXCollections.observableArrayList();
        for (FacultyReport faculty : facultyList) {
            if (faculty.getStatus().equalsIgnoreCase(status)) {
                filtered.add(faculty);
            }
        }
        tableViewReportFaculty.setItems(filtered);
    }

    @FXML
    private void onBackFaculties() {
        headerTitle.setText(" --> Reports");
        facultiesReportsAnchorPane.setVisible(false);
    }

    @FXML
    private void onSearchFaculties() {
        String keyword = searchFieldFaculties.getText().toLowerCase().trim();
        if (keyword.isEmpty()) {
            filteredListReportFaculty.setPredicate(p -> true);
            return;
        }
        filteredListReportFaculty.setPredicate(facultyReport ->
                facultyReport.getFacultyName().toLowerCase().contains(keyword) ||
                        String.valueOf(facultyReport.getEstablishmentYear()).contains(keyword) ||
                        facultyReport.getFacultyId().contains(keyword) ||
                        facultyReport.getStatus().toLowerCase().contains(keyword)
        );
    }
    //    Reports ------>>> Major
    private void setupStatusContextMenuReportMajor() {
        ContextMenu statusMenu = new ContextMenu();
        MenuItem activeItem = new MenuItem("Active");
        activeItem.setOnAction(e -> filterByStatusMajor("Active"));
        MenuItem inactiveItem = new MenuItem("Inactive");
        inactiveItem.setOnAction(e -> filterByStatusMajor("Inactive"));
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportMajors.setItems(majorList));

        statusMenu.getItems().addAll(activeItem, inactiveItem, allItem);
        colStatusReportMajors.setContextMenu(statusMenu);

    }

    @FXML
    private void filterByStatusMajor(String status) {
        ObservableList<MajorReport> filtered = FXCollections.observableArrayList();
        for (MajorReport major : majorList) {
            if (major.getStatus().equalsIgnoreCase(status)) {
                filtered.add(major);
            }
        }
        tableViewReportMajors.setItems(filtered);
    }

    private void setupFacultyContextMenuReportMajor() {
        ContextMenu facultyMenu = new ContextMenu();

        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            MenuItem facultyContext = new MenuItem(faculty.getFacultyName());
            facultyContext.setOnAction(event -> filterByFacultyMajor(faculty.getFacultyName()));
            facultyMenu.getItems().add(facultyContext);
        }
        MenuItem allItem = new MenuItem("All");
        facultyMenu.getItems().add(allItem);
        allItem.setOnAction(e -> tableViewReportMajors.setItems(majorList));
        colFacultyReportMajors.setContextMenu(facultyMenu);

    }

    @FXML
    private void filterByFacultyMajor(String facultyName) {
        ObservableList<MajorReport> filtered = FXCollections.observableArrayList();
        for (MajorReport major : majorList) {
            if (major.getFaculty().equalsIgnoreCase(facultyName)) {
                filtered.add(major);
            }
        }
        tableViewReportMajors.setItems(filtered);
    }

    private void setupDepartmentContextMenuReportMajor() {
        ContextMenu departmentMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                MenuItem departmentContext = new MenuItem(department.getName());
                if (!departmentMenu.getItems().contains(departmentContext)) {
                    departmentContext.setOnAction(e -> filterByDepartmentMajor(department.getName()));
                    departmentMenu.getItems().add(departmentContext);
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportMajors.setItems(majorList));
        departmentMenu.getItems().add(allItem);
        colDepartmentReportMajors.setContextMenu(departmentMenu);
    }

    @FXML
    private void filterByDepartmentMajor(String status) {
        ObservableList<MajorReport> filtered = FXCollections.observableArrayList();
        for (MajorReport major : majorList) {
            if (major.getStatus().equalsIgnoreCase(status)) {
                filtered.add(major);
            }
        }
        tableViewReportMajors.setItems(filtered);
    }

    @FXML
    private void onSearchReportMajor() {
        String keyword = searchFieldReportMajors.getText().toLowerCase().trim();
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
        majorsReportsAnchorPane.setVisible(false);
    }
    //    Reports ------>>> People
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
        active.setOnAction(e -> filterByStatusPeople("Active"));
        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterByStatusPeople("Inactive"));

        MenuItem allStatus = new MenuItem("All");
        allStatus.setOnAction(e -> tableViewReportPeople.setItems(peopleList));

        statusMenu.getItems().addAll(active, inactive, allStatus);
        colStatusReportPeople.setContextMenu(statusMenu);
    }

    private void filterByStatusPeople(String status) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleList) {
            if (people.getStatus().equals(status)) {
                filtered.add(people);
            }
        }
        tableViewReportPeople.setItems(filtered);
    }

    private void setupFacultyContextMenuPeople() {
        ContextMenu facultyMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            MenuItem facultyContext = new MenuItem(faculty.getFacultyName());
            facultyContext.setOnAction(e -> filterByFacultyPeople(faculty.getFacultyName()));
            facultyMenu.getItems().add(facultyContext);
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportPeople.setItems(peopleList));
        facultyMenu.getItems().add(allItem);
        colFacultyReportPeople.setContextMenu(facultyMenu);
    }

    private void filterByFacultyPeople(String facultyName) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleList) {
            if (people.getFaculty().equals(facultyName)) {
                filtered.add(people);
            }
        }
        tableViewReportPeople.setItems(filtered);
    }

    private void setupDepartmentContextMenuPeople() {
        ContextMenu departmentMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                MenuItem departmentContext = new MenuItem(department.getName());
                if (!departmentMenu.getItems().contains(departmentContext)) {
                    departmentContext.setOnAction(e -> filterByDepartmentPeople(department.getName()));
                    departmentMenu.getItems().add(departmentContext);
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportPeople.setItems(peopleList));
        departmentMenu.getItems().add(allItem);
        colDepartmentReportPeople.setContextMenu(departmentMenu);
    }

    private void filterByDepartmentPeople(String departmentName) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleList) {
            if (people.getDepartment().equals(departmentName)) {
                filtered.add(people);
            }
        }
        tableViewReportPeople.setItems(filtered);
    }

    private void setupMajorContextMenuPeople() {
        ContextMenu majorMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    MenuItem majorContext = new MenuItem(major.getName());
                    if (!majorMenu.getItems().contains(majorContext)) {
                        majorContext.setOnAction(event -> filterByMajorPeople(major.getName()));
                        majorMenu.getItems().add(majorContext);
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(event -> tableViewReportPeople.setItems(peopleList));
        majorMenu.getItems().add(allItem);

        colMajorReportPeople.setContextMenu(majorMenu);
    }

    private void filterByMajorPeople(String major) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleList) {
            if (people.getMajor().equals(major)) {
                filtered.add(people);
            }
        }
        tableViewReportPeople.setItems(filtered);
    }

    private void setupDegreeContextMenuPeople() {
        ContextMenu degreeMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        MenuItem degreeContext = new MenuItem(degree.getClass().getSimpleName());
                        if (!degreeMenu.getItems().contains(degreeContext)) {
                            degreeContext.setOnAction(event -> filterByDegreePeople(degree.getClass().getSimpleName()));
                            degreeMenu.getItems().add(degreeContext);
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(event -> tableViewReportPeople.setItems(peopleList));
        degreeMenu.getItems().add(allItem);

        colDegreeReportPeople.setContextMenu(degreeMenu);
    }

    private void filterByDegreePeople(String degree) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleList) {
            if (people.getDegree().equals(degree)) {
                filtered.add(people);
            }
        }
        tableViewReportPeople.setItems(filtered);
    }

    private void setupIdContextMenuPeople() {
        ContextMenu idMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Employee employee : department.employees) {
                    MenuItem employeeContext = new MenuItem(employee.getId());
                    employeeContext.setOnAction(e -> filterByIdPeople(employee.getId()));
                    idMenu.getItems().add(employeeContext);
                }
                for (Major major : department.majors) {
                    for (Professor professor : major.professors) {
                        MenuItem professorContext = new MenuItem(professor.getId());
                        professorContext.setOnAction(event -> filterByIdPeople(professor.getId()));
                        idMenu.getItems().add(professorContext);
                    }
                    for (Student student : major.students) {
                        MenuItem studentContext = new MenuItem(student.getId());
                        studentContext.setOnAction(event -> filterByIdPeople(student.getId()));
                        idMenu.getItems().add(studentContext);
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportPeople.setItems(peopleList));
        idMenu.getItems().add(allItem);
        colIDReportPeople.setContextMenu(idMenu);
    }

    private void filterByIdPeople(String id) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleList) {
            if (people.getId().equals(id)) {
                filtered.add(people);
            }
        }
        tableViewReportPeople.setItems(filtered);
    }

    private void setupRoleContextMenuPeople() {
        ContextMenu roleMenu = new ContextMenu();

        MenuItem employee = new MenuItem("Employee");
        employee.setOnAction(e -> filterByRolePeople("Employee"));
        MenuItem professor = new MenuItem("Professor");
        professor.setOnAction(e -> filterByRolePeople("Professor"));
        MenuItem student = new MenuItem("Student");
        student.setOnAction(e -> filterByRolePeople("Student"));
        MenuItem allRole = new MenuItem("All");
        allRole.setOnAction(e -> tableViewReportPeople.setItems(peopleList));

        roleMenu.getItems().addAll(employee, professor, student, allRole);
        colRoleReportPeople.setContextMenu(roleMenu);
    }

    private void filterByRolePeople(String role) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleList) {
            if (people.getRole().equals(role)) {
                filtered.add(people);
            }
        }
        tableViewReportPeople.setItems(filtered);
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
        peopleReportsAnchorPane.setVisible(false);
    }
    //    Reports ------>>> PeopleByDate
    private void setupGenderContextMenuPeopleByDate() {
        ContextMenu genderMenu = new ContextMenu();

        MenuItem male = new MenuItem("Male");
        male.setOnAction(e -> filterByGenderPeopleByDate("Male"));

        MenuItem female = new MenuItem("Female");
        female.setOnAction(e -> filterByGenderPeopleByDate("Female"));

        MenuItem allGender = new MenuItem("All");
        allGender.setOnAction(e -> {
            filteredListReportPeopleByDate.setPredicate(p -> true);
            tableViewReportPeopleByDate.setItems(filteredListReportPeopleByDate);
        });

        genderMenu.getItems().addAll(male, female, allGender);
        colGenderReportPeopleByDate.setContextMenu(genderMenu);
    }
    private void filterByGenderPeopleByDate(String gender) {
        filteredListReportPeopleByDate.setPredicate(people -> people.getGender().equalsIgnoreCase(gender));
    }

    private void setupStatusContextMenuPeopleByDate() {
        ContextMenu statusMenu = new ContextMenu();

        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> filterByStatusPeopleByDate("Active"));
        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterByStatusPeopleByDate("Inactive"));

        MenuItem allStatus = new MenuItem("All");
        allStatus.setOnAction(e -> tableViewReportPeopleByDate.setItems(peopleByDateList));

        statusMenu.getItems().addAll(active, inactive, allStatus);
        colStatusReportPeopleByDate.setContextMenu(statusMenu);
    }

    private void filterByStatusPeopleByDate(String status) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleByDateList) {
            if (people.getStatus().equals(status)) {
                filtered.add(people);
            }
        }
        tableViewReportPeopleByDate.setItems(filtered);
    }

    private void setupFacultyContextMenuPeopleByDate() {
        ContextMenu facultyMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            MenuItem facultyContext = new MenuItem(faculty.getFacultyName());
            facultyContext.setOnAction(e -> filterByFacultyPeopleByDate(faculty.getFacultyName()));
            facultyMenu.getItems().add(facultyContext);
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportPeopleByDate.setItems(peopleByDateList));
        facultyMenu.getItems().add(allItem);
        colFacultyReportPeopleByDate.setContextMenu(facultyMenu);
    }

    private void filterByFacultyPeopleByDate(String facultyName) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleByDateList) {
            if (people.getFaculty().equals(facultyName)) {
                filtered.add(people);
            }
        }
        tableViewReportPeopleByDate.setItems(filtered);
    }

    private void setupDepartmentContextMenuPeopleByDate() {
        ContextMenu departmentMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                MenuItem departmentContext = new MenuItem(department.getName());
                if (!departmentMenu.getItems().contains(departmentContext)) {
                    departmentContext.setOnAction(e -> filterByDepartmentPeopleByDate(department.getName()));
                    departmentMenu.getItems().add(departmentContext);
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportPeopleByDate.setItems(peopleByDateList));
        departmentMenu.getItems().add(allItem);
        colDepartmentReportPeopleByDate.setContextMenu(departmentMenu);
    }

    private void filterByDepartmentPeopleByDate(String departmentName) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleByDateList) {
            if (people.getDepartment().equals(departmentName)) {
                filtered.add(people);
            }
        }
        tableViewReportPeopleByDate.setItems(filtered);
    }

    private void setupMajorContextMenuPeopleByDate() {
        ContextMenu majorMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    MenuItem majorContext = new MenuItem(major.getName());
                    if (!majorMenu.getItems().contains(majorContext)) {
                        majorContext.setOnAction(event -> filterByMajorPeopleByDate(major.getName()));
                        majorMenu.getItems().add(majorContext);
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(event -> tableViewReportPeopleByDate.setItems(peopleByDateList));
        majorMenu.getItems().add(allItem);

        colMajorReportPeopleByDate.setContextMenu(majorMenu);
    }

    private void filterByMajorPeopleByDate(String major) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleByDateList) {
            if (people.getMajor().equals(major)) {
                filtered.add(people);
            }
        }
        tableViewReportPeopleByDate.setItems(filtered);
    }

    private void setupDegreeContextMenuPeopleByDate() {
        ContextMenu degreeMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        MenuItem degreeContext = new MenuItem(degree.getClass().getSimpleName());
                        if (!degreeMenu.getItems().contains(degreeContext)) {
                            degreeContext.setOnAction(event -> filterByDegreePeopleByDate(degree.getClass().getSimpleName()));
                            degreeMenu.getItems().add(degreeContext);
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(event -> tableViewReportPeopleByDate.setItems(peopleByDateList));
        degreeMenu.getItems().add(allItem);

        colDegreeReportPeopleByDate.setContextMenu(degreeMenu);
    }

    private void filterByDegreePeopleByDate(String degree) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleByDateList) {
            if (people.getDegree().equals(degree)) {
                filtered.add(people);
            }
        }
        tableViewReportPeopleByDate.setItems(filtered);
    }

    private void setupIdContextMenuPeopleByDate() {
        ContextMenu idMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Employee employee : department.employees) {
                    MenuItem employeeContext = new MenuItem(employee.getId());
                    employeeContext.setOnAction(e -> filterByIdPeopleByDate(employee.getId()));
                    idMenu.getItems().add(employeeContext);
                }
                for (Major major : department.majors) {
                    for (Professor professor : major.professors) {
                        MenuItem professorContext = new MenuItem(professor.getId());
                        professorContext.setOnAction(event -> filterByIdPeopleByDate(professor.getId()));
                        idMenu.getItems().add(professorContext);
                    }
                    for (Student student : major.students) {
                        MenuItem studentContext = new MenuItem(student.getId());
                        studentContext.setOnAction(event -> filterByIdPeopleByDate(student.getId()));
                        idMenu.getItems().add(studentContext);
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportPeopleByDate.setItems(peopleByDateList));
        idMenu.getItems().add(allItem);
        colIDReportPeopleByDate.setContextMenu(idMenu);
    }

    private void filterByIdPeopleByDate(String id) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleByDateList) {
            if (people.getId().equals(id)) {
                filtered.add(people);
            }
        }
        tableViewReportPeopleByDate.setItems(filtered);
    }

    private void setupRoleContextMenuPeopleByDate() {
        ContextMenu roleMenu = new ContextMenu();

        MenuItem employee = new MenuItem("Employee");
        employee.setOnAction(e -> filterByRolePeopleByDate("Employee"));
        MenuItem professor = new MenuItem("Professor");
        professor.setOnAction(e -> filterByRolePeopleByDate("Professor"));
        MenuItem student = new MenuItem("Student");
        student.setOnAction(e -> filterByRolePeopleByDate("Student"));
        MenuItem allRole = new MenuItem("All");
        allRole.setOnAction(e -> tableViewReportPeopleByDate.setItems(peopleByDateList));

        roleMenu.getItems().addAll(employee, professor, student, allRole);
        colRoleReportPeopleByDate.setContextMenu(roleMenu);
    }

    private void filterByRolePeopleByDate(String role) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peopleByDateList) {
            if (people.getRole().equals(role)) {
                filtered.add(people);
            }
        }
        tableViewReportPeopleByDate.setItems(filtered);
    }

    public boolean isDateInRange(LocalDate date, LocalDate dateStart, LocalDate dateEnd) {
        return (date.isAfter(dateStart) || date.isEqual(dateStart)) && (date.isBefore(dateEnd) || date.isEqual(dateEnd));
    }

    @FXML
    private void onSearchPeopleByDate() {
        boolean confirmation = true;
        if (fieldOfDateChooserPeopleByDate.getValue() == null || fieldOfDateChooserPeopleByDate.getValue().equals("Field")) {
            errorLabelReportPeopleByDate.setText("Choose Field Of Date");
            confirmation = false;
        } else if (primaryDatePeopleByDate.getValue() == null) {
            errorLabelReportPeopleByDate.setText("Enter The Beginning Of Time Period");
            confirmation = false;
        } else if (secondaryDatePeopleByDate.getValue() == null) {
            errorLabelReportPeopleByDate.setText("Enter The End Of Time Period");
            confirmation = false;
        } else if (primaryDatePeopleByDate.getValue().isAfter(secondaryDatePeopleByDate.getValue())) {
            errorLabelReportPeopleByDate.setText("Enter Dates Correctly");
            confirmation = false;
        } else {
            errorLabelReportPeopleByDate.setText(null);
        }
        if (confirmation) {
            LocalDate primaryDate = primaryDatePeopleByDate.getValue();
            LocalDate secondaryDate = secondaryDatePeopleByDate.getValue();
            if (fieldOfDateChooserPeopleByDate.getValue().equals("Registration Date")) {
                filteredListReportPeopleByDate.setPredicate(people -> isDateInRange(people.getDateOfRegistrationLocalDate(), primaryDate, secondaryDate));
            } else if (fieldOfDateChooserPeopleByDate.getValue().equals("Deactivation Date")) {
                filteredListReportPeopleByDate.setPredicate(people -> isDateInRange(people.getDateOfDeactivationLocalDate(), primaryDate, secondaryDate));
            }
        }
    }

    @FXML
    private void onBackPeopleByDate() {
        headerTitle.setText(" --> Reports");
        peopleByDateReportAnchorPane.setVisible(false);
    }
    //    Reports ------>>> Courses
    private void setupStatusContextMenuReportCourses() {
        ContextMenu statusMenu = new ContextMenu();

        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> filterByStatusCourses("Active"));

        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterByStatusCourses("Inactive"));

        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourses.setItems(coursesList));

        statusMenu.getItems().addAll(active, inactive, allItem);
        colStatusReportCourses.setContextMenu(statusMenu);
    }

    private void filterByStatusCourses(String status) {
        ObservableList<CourseReports> filtered = FXCollections.observableArrayList();
        for (CourseReports courseReports : coursesList) {
            if (courseReports.getStatus().equals(status)) {
                filtered.add(courseReports);
            }
        }
        tableViewReportCourses.setItems(filtered);
    }

    private void setupMajorContextMenuReportCourses() {
        University.loadFaculties();

        ContextMenu majorMenu = new ContextMenu();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            MenuItem majorContext = new MenuItem(major.getName());
                            if (!majorMenu.getItems().contains(majorContext)) {
                                majorContext.setOnAction(event -> filterByMajorCourses(major.getName()));
                                majorMenu.getItems().add(majorContext);
                            }
                        }
                        }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourses.setItems(coursesList));
        majorMenu.getItems().add(allItem);

        colMajorReportCourses.setContextMenu(majorMenu);
    }

    private void filterByMajorCourses(String major) {
        ObservableList<CourseReports> filtered = FXCollections.observableArrayList();
        for (CourseReports courseReports : coursesList) {
            if (courseReports.getMajor().equals(major)) {
                filtered.add(courseReports);
            }
        }
        tableViewReportCourses.setItems(filtered);
    }

    private void setupDegreeContextMenuReportCourses() {
        University.loadFaculties();

        ContextMenu degreeMenu = new ContextMenu();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            MenuItem degreeContext = new MenuItem(degree.getClass().getSimpleName());
                            if (!degreeMenu.getItems().contains(degreeContext)) {
                                degreeContext.setOnAction(event -> filterByDegreeCourses(degree.getClass().getSimpleName()));
                                degreeMenu.getItems().add(degreeContext);
                            }
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourses.setItems(coursesList));
        degreeMenu.getItems().add(allItem);

        colDegreeReportCourses.setContextMenu(degreeMenu);
    }

    private void filterByDegreeCourses(String degree) {
        ObservableList<CourseReports> filtered = FXCollections.observableArrayList();
        for (CourseReports courseReports : coursesList) {
            if (courseReports.getDegree().equals(degree)) {
                filtered.add(courseReports);
            }
        }
        tableViewReportCourses.setItems(filtered);
    }

    private void setupIdContextMenuCourses() {
        ContextMenu idMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            MenuItem courseContext = new MenuItem(course.getId());
                            if (!idMenu.getItems().contains(courseContext)) {
                                courseContext.setOnAction(event -> filterByIdCourses(course.getId()));
                                idMenu.getItems().add(courseContext);
                            }
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourses.setItems(coursesList));
        idMenu.getItems().add(allItem);
        colIdReportCourses.setContextMenu(idMenu);
    }

    private void filterByIdCourses(String id) {
        ObservableList<CourseReports> filtered = FXCollections.observableArrayList();
        for (CourseReports course : coursesList) {
            if (course.getId().equals(id)) {
                filtered.add(course);
            }
        }
        tableViewReportCourses.setItems(filtered);
    }

    @FXML
    private void onSearchCourses() {
        String keyword = searchFieldCourses.getText().toLowerCase().trim();
        if (keyword.isEmpty()) {
            filteredListReportCourses.setPredicate(courseReports -> true);
            return;
        }
        filteredListReportCourses.setPredicate(courseReports ->
                courseReports.getName().toLowerCase().contains(keyword) ||
                        courseReports.getId().toLowerCase().contains(keyword) ||
                        courseReports.getDegree().toLowerCase().contains(keyword) ||
                        courseReports.getMajor().toLowerCase().contains(keyword) ||
                        String.valueOf(courseReports.getCredit()).contains(keyword) ||
                        courseReports.getStatus().contains(keyword)
        );
    }

    public void onBackCourses(ActionEvent event) {
        headerTitle.setText(" --> Reports");
        coursesReportsAnchorPane.setVisible(false);
    }
    //    Reports ------>>> CourseGroup
    private void setupStatusContextMenuReportCourseGroups() {
        ContextMenu statusMenu = new ContextMenu();

        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> filterByStatusCourseGroups("Active"));

        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> filterByStatusCourseGroups("Inactive"));

        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourseGroups.setItems(courseGroupsList));

        statusMenu.getItems().addAll(active, inactive, allItem);
        colStatusReportCourseGroups.setContextMenu(statusMenu);
    }

    private void filterByStatusCourseGroups(String status) {
        ObservableList<CourseGroupReports> filtered = FXCollections.observableArrayList();
        for (CourseGroupReports courseGroupReports : courseGroupsList) {
            if (courseGroupReports.getStatus().equals(status)) {
                filtered.add(courseGroupReports);
            }
        }
        tableViewReportCourseGroups.setItems(filtered);
    }

    private void setupMajorContextMenuReportCourseGroups() {
        University.loadFaculties();

        ContextMenu majorMenu = new ContextMenu();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup courseGroup : course.courseGroups) {
                                MenuItem majorContext = new MenuItem(major.getName());
                                if (!majorMenu.getItems().contains(majorContext)) {
                                    majorContext.setOnAction(event -> filterByMajorCourseGroups(major.getName()));
                                    majorMenu.getItems().add(majorContext);
                                }
                            }
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourseGroups.setItems(courseGroupsList));
        majorMenu.getItems().add(allItem);

        colMajorReportCourseGroups.setContextMenu(majorMenu);
    }

    private void filterByMajorCourseGroups(String major) {
        ObservableList<CourseGroupReports> filtered = FXCollections.observableArrayList();
        for (CourseGroupReports courseGroupReports : courseGroupsList) {
            if (courseGroupReports.getMajor().equals(major)) {
                filtered.add(courseGroupReports);
            }
        }
        tableViewReportCourseGroups.setItems(filtered);
    }

    private void setupDegreeContextMenuReportCourseGroups() {
        University.loadFaculties();

        ContextMenu degreeMenu = new ContextMenu();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup courseGroup : course.courseGroups) {
                                MenuItem degreeContext = new MenuItem(degree.getClass().getSimpleName());
                                if (!degreeMenu.getItems().contains(degreeContext)) {
                                    degreeContext.setOnAction(event -> filterByDegreeCourseGroups(degree.getClass().getSimpleName()));
                                    degreeMenu.getItems().add(degreeContext);
                                }
                            }
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourseGroups.setItems(courseGroupsList));
        degreeMenu.getItems().add(allItem);

        colDegreeReportCourseGroups.setContextMenu(degreeMenu);
    }

    private void filterByDegreeCourseGroups(String degree) {
        ObservableList<CourseGroupReports> filtered = FXCollections.observableArrayList();
        for (CourseGroupReports courseGroupReports : courseGroupsList) {
            if (courseGroupReports.getDegree().equals(degree)) {
                filtered.add(courseGroupReports);
            }
        }
        tableViewReportCourseGroups.setItems(filtered);
    }

    private void setupIdContextMenuCourseGroups () {
        ContextMenu idMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup courseGroup : course.courseGroups) {
                                MenuItem courseGroupContext = new MenuItem(courseGroup.getId());
                                if (!idMenu.getItems().contains(courseGroupContext)) {
                                    courseGroupContext.setOnAction(event -> filterByIdCourseGroups(courseGroup.getId()));
                                    idMenu.getItems().add(courseGroupContext);
                                }
                            }
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourseGroups.setItems(courseGroupsList));
        idMenu.getItems().add(allItem);
        colIdReportCourseGroups.setContextMenu(idMenu);
    }

    private void filterByIdCourseGroups(String id) {
        ObservableList<CourseGroupReports> filtered = FXCollections.observableArrayList();
        for (CourseGroupReports courseGroupReports : courseGroupsList) {
            if (courseGroupReports.getId().equals(id)) {
                filtered.add(courseGroupReports);
            }
        }
        tableViewReportCourseGroups.setItems(filtered);
    }

    private void setupCourseNameContextMenuCourseGroups () {
        ContextMenu courseNameMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup courseGroup : course.courseGroups) {
                                MenuItem courseGroupContext = new MenuItem(courseGroup.getCourseName());
                                if (!courseNameMenu.getItems().contains(courseGroupContext)){
                                    courseGroupContext.setOnAction(event -> filterByCourseNameCourseGroups(courseGroup.getCourseName()));
                                    courseNameMenu.getItems().add(courseGroupContext);
                                }
                            }
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourseGroups.setItems(courseGroupsList));
        courseNameMenu.getItems().add(allItem);
        colCourseNameReportCourseGroups.setContextMenu(courseNameMenu);
    }

    private void filterByCourseNameCourseGroups(String courseName) {
        ObservableList<CourseGroupReports> filtered = FXCollections.observableArrayList();
        for (CourseGroupReports courseGroupReports : courseGroupsList) {
            if (courseGroupReports.getCourseName().equals(courseName)) {
                filtered.add(courseGroupReports);
            }
        }
        tableViewReportCourseGroups.setItems(filtered);
    }

    private void setupProfessorNameContextMenuCourseGroups () {
        ContextMenu professorMenu = new ContextMenu();
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            for (Department department : faculty.departments) {
                for (Major major : department.majors) {
                    for (Degree degree : major.degrees) {
                        for (Course course : degree.courses) {
                            for (CourseGroup courseGroup : course.courseGroups) {
                                MenuItem courseGroupContext = new MenuItem(courseGroup.getCourseName());
                                if (!professorMenu.getItems().contains(courseGroupContext)) {
                                    courseGroupContext.setOnAction(event -> filterByProfessorCourseGroups(courseGroup.getCourseName()));
                                    professorMenu.getItems().add(courseGroupContext);
                                }
                            }
                        }
                    }
                }
            }
        }
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportCourseGroups.setItems(courseGroupsList));
        professorMenu.getItems().add(allItem);
        colProfessorNameReportCourseGroups.setContextMenu(professorMenu);
    }

    private void filterByProfessorCourseGroups(String professorName) {
        ObservableList<CourseGroupReports> filtered = FXCollections.observableArrayList();
        for (CourseGroupReports courseGroupReports : courseGroupsList) {
            if (courseGroupReports.getProfessorName().equals(professorName)) {
                filtered.add(courseGroupReports);
            }
        }
        tableViewReportCourseGroups.setItems(filtered);
    }

    @FXML
    private void onSearchCourseGroups() {
        String keyword = searchFieldCourseGroups.getText().toLowerCase().trim();
        if (keyword.isEmpty()) {
            filteredListReportCourseGroups.setPredicate(courseGroupReports -> true);
            return;
        }
        filteredListReportCourseGroups.setPredicate(courseGroupReports ->
                courseGroupReports.getCourseName().toLowerCase().contains(keyword) ||
                        courseGroupReports.getId().toLowerCase().contains(keyword) ||
                        courseGroupReports.getProfessorName().toLowerCase().contains(keyword) ||
                        courseGroupReports.getSemesterCode().toLowerCase().contains(keyword) ||
                        courseGroupReports.getMajor().toLowerCase().contains(keyword) ||
                        courseGroupReports.getDegree().toLowerCase().contains(keyword) ||
                        String.valueOf(courseGroupReports.getCourseCredit()).toLowerCase().contains(keyword) ||
                        String.valueOf(courseGroupReports.getCapacity()).toLowerCase().contains(keyword) ||
                        courseGroupReports.getStatus().toLowerCase().contains(keyword)
        );
    }

    public void onBackCourseGroups(ActionEvent event) {
        headerTitle.setText(" --> Reports");
        courseGroupsReportsAnchorPane.setVisible(false);
    }


//    Reports ----->>> Done

    @FXML
    void setDepartmentChooserEditDepartment(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserEditDepartment.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserEditDepartment.getValue())) {
                        newDepartmentNameEditDepartment.setPromptText(department.getName());
                        newEstablishmentYearEditDepartment.setPromptText(String.valueOf(department.getEstablishmentYear()));
                        break;
                    }
                }
                break;
            }
        }
    }

    @FXML
    void setEmployeeChooserEditEmployee(ActionEvent event) {
        Employee.loadAllEmployee();
        for (Employee employee : University.allEmployees) {
            if (employee.getFullName().equals(employeeChooserEditEmployee.getValue())) {
                newFirstNameEditEmployee.setPromptText(employee.getFirst_name());
                newLastNameEditEmployee.setPromptText(employee.getLast_name());
                genderChooserEditEmployee.getSelectionModel().select(String.valueOf(employee.getGender()));
                phoneNumberEditEmployee.setPromptText(employee.getPhoneNumber());
                nationalIdEditEmployee.setPromptText(employee.getNationalId());
                dateOfBirthEditEmployee.setPromptText(employee.getDateOfBirth().getDayOfMonth() + " " + Month.of(employee.getDateOfBirth().getMonthValue()) + " " + employee.getDateOfBirth().getYear());
            }
        }
    }

    @FXML
    void setFacultyChooserEditFaculty(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserEditFaculty.getValue())) {
                newFacultyNameEditFaculty.setPromptText(faculty.getFacultyName());
                newEstablishmentYearEditFaculty.setPromptText(String.valueOf(faculty.getEstablishmentYear()));
                break;
            }
        }
    }

    @FXML
    void setMajorChooserEditMajor(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserEditMajor.getValue())) {
                        for (Major major : department.majors) {
                            if (major.getName().equals(majorChooserEditMajor.getValue())) {
                                newMajorNameEditMajor.setPromptText(major.getName());
                                newEstablishmentYearEditMajor.setPromptText(String.valueOf(major.getEstablishmentYear()));
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
    void setOperationChooserUpdateDepartment(ActionEvent event) {
        if (operationChooserUpdateDepartment.getValue() != null) {
            University.loadFaculties();
            if (operationChooserUpdateDepartment.getValue().equals("Edit")){
//            activate the edit screen and deactivate the deactive screen
                editDepartmentVbox.setVisible(true);
                deactiveDepartmentVbox.setVisible(false);
//            initialize the faculty chooser combo box
                facultyChooserEditDepartment.getItems().clear();
                facultyChooserEditDepartment.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserEditDepartment.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserEditDepartment.setVisibleRowCount(4);
                facultyChooserEditDepartment.getSelectionModel().selectFirst();
//            initialize the department chooser combo box
                facultyChooserEditDepartment.setOnAction(event1 -> {
                    departmentChooserEditDepartment.getItems().clear();
                    departmentChooserEditDepartment.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && facultyChooserEditDepartment.getValue().equals(faculty.getFacultyName())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserEditDepartment.getItems().add(department.getName());
                                }
                            }
                        }
                    }
                    departmentChooserEditDepartment.setVisibleRowCount(4);
                    departmentChooserEditDepartment.getSelectionModel().selectFirst();
                });
//        clear the textfields
                newDepartmentNameEditDepartment.clear();
                newDepartmentNameEditDepartment.setPromptText("Department Name");
                newEstablishmentYearEditDepartment.clear();
                newEstablishmentYearEditDepartment.setPromptText("Establishment Year");

                errorLabelFacultyChooserEditDepartment.setText(null);
                errorLabelDepartmentChooserEditDepartment.setText(null);
                errorLabelDepartmentNameEditDepartment.setText(null);
                errorLabelEstYearEditDepartment.setText(null);
                errorLabelEditDepartment.setText(null);
                successLabelEditDepartment.setText(null);

            } else if (operationChooserUpdateDepartment.getValue().equals("Deactive")){
//            activate the deactive screen and deactivate the edit screen
                editDepartmentVbox.setVisible(false);
                deactiveDepartmentVbox.setVisible(true);
//            initialize the faculty chooser combo box
                facultyChooserDeactiveDepartment.getItems().clear();
                facultyChooserDeactiveDepartment.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserDeactiveDepartment.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserDeactiveDepartment.setVisibleRowCount(4);
                facultyChooserDeactiveDepartment.getSelectionModel().selectFirst();
//            initialize the department chooser combo box
                facultyChooserDeactiveDepartment.setOnAction(event1 -> {
                    departmentChooserDeactiveDepartment.getItems().clear();
                    departmentChooserDeactiveDepartment.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && facultyChooserDeactiveDepartment.getValue().equals(faculty.getFacultyName())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserDeactiveDepartment.getItems().add(department.getName());
                                }
                            }
                        }
                    }
                    departmentChooserDeactiveDepartment.setVisibleRowCount(4);
                    departmentChooserDeactiveDepartment.getSelectionModel().selectFirst();
                });

                errorLabelFacultyChooserDeactiveDepartment.setText(null);
                errorLabelDepartmentChooserDeactiveDepartment.setText(null);
                errorLabelDeactiveDepartment.setText(null);
                successLabelDeactiveDepartment.setText(null);
            }
        }
    }

    @FXML
    void setOperationChooserUpdateEmployee(ActionEvent event) {
        if (operationChooserUpdateEmployee.getValue() != null) {
            University.loadFaculties();
            if (operationChooserUpdateEmployee.getValue().equals("Edit")){
//            activate the edit screen and deactivate the deactive screen
                editEmployeeVbox.setVisible(true);
                deactiveEmployeeVbox.setVisible(false);
//            initialize the faculty chooser combo box
                facultyChooserEditEmployee.getItems().clear();
                facultyChooserEditEmployee.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserEditEmployee.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserEditEmployee.setVisibleRowCount(4);
                facultyChooserEditEmployee.getSelectionModel().selectFirst();
//            initialize the department chooser combo box
                facultyChooserEditEmployee.setOnAction(event1 -> {
                    departmentChooserEditEmployee.getItems().clear();
                    departmentChooserEditEmployee.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && facultyChooserEditEmployee.getValue().equals(faculty.getFacultyName())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserEditEmployee.getItems().add(department.getName());
                                }
                            }
                        }
                    }
                    departmentChooserEditEmployee.setVisibleRowCount(4);
                    departmentChooserEditEmployee.getSelectionModel().selectFirst();
                });
//            initialize the employee chooser combo box
                departmentChooserEditEmployee.setOnAction(event1 -> {
                    Employee.loadAllEmployee();
                    employeeChooserEditEmployee.getItems().clear();
                    employeeChooserEditEmployee.getItems().add("Employee");
                    for (Employee employee : University.allEmployees) {
                        if (employee.getStatus().equals(Status.Active) && employee.getDepartment().equals(departmentChooserEditEmployee.getValue())) {
                            employeeChooserEditEmployee.getItems().add(employee.getFullName());
                        }
                    }
                    employeeChooserEditEmployee.setVisibleRowCount(4);
                    employeeChooserEditEmployee.getSelectionModel().selectFirst();

                });
//            initialize the Gender chooser combo box
                genderChooserEditEmployee.getItems().clear();
                genderChooserEditEmployee.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
                genderChooserEditEmployee.setVisibleRowCount(3);
                genderChooserEditEmployee.getSelectionModel().selectFirst();
//        clear the textfields and datepicker
                newFirstNameEditEmployee.clear();
                newFirstNameEditEmployee.setPromptText("First Name");
                newLastNameEditEmployee.clear();
                newLastNameEditEmployee.setPromptText("Last Name");
                phoneNumberEditEmployee.clear();
                phoneNumberEditEmployee.setPromptText("Phone Number");
                nationalIdEditEmployee.clear();
                nationalIdEditEmployee.setPromptText("National ID");
                dateOfBirthEditEmployee.setValue(null);
                dateOfBirthEditEmployee.setPromptText("Date of Birth");

                errorLabelFacultyChooserEditEmployee.setText(null);
                errorLabelDepartmentChooserEditEmployee.setText(null);
                errorLabelEmployeeChooserEditEmployee.setText(null);
                errorLabelFirstNameEditEmployee.setText(null);
                errorLabelLastNameEditEmployee.setText(null);
                errorLabelGenderChooserEditEmployee.setText(null);
                errorLabelDateOfBirthEditEmployee.setText(null);
                errorLabelPhoneNumberEditEmployee.setText(null);
                errorLabelNationalIdEditEmployee.setText(null);
                errorLabelEditEmployee.setText(null);
                successLabelEditEmployee.setText(null);

            } else if (operationChooserUpdateEmployee.getValue().equals("Deactive")){
//            activate the deactive screen and deactivate the edit screen
                editEmployeeVbox.setVisible(false);
                deactiveEmployeeVbox.setVisible(true);
//            initialize the faculty chooser combo box
                facultyChooserDeactiveEmployee.getItems().clear();
                facultyChooserDeactiveEmployee.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserDeactiveEmployee.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserDeactiveEmployee.setVisibleRowCount(4);
                facultyChooserDeactiveEmployee.getSelectionModel().selectFirst();
//            initialize the department chooser combo box
                facultyChooserDeactiveEmployee.setOnAction(event1 -> {
                    departmentChooserDeactiveEmployee.getItems().clear();
                    departmentChooserDeactiveEmployee.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && facultyChooserDeactiveEmployee.getValue().equals(faculty.getFacultyName())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserDeactiveEmployee.getItems().add(department.getName());
                                }
                            }
                        }
                    }
                    departmentChooserDeactiveEmployee.setVisibleRowCount(4);
                    departmentChooserDeactiveEmployee.getSelectionModel().selectFirst();
                });
//            initialize the employee chooser combo box
                departmentChooserDeactiveEmployee.setOnAction(event1 -> {
                    Employee.loadAllEmployee();
                    employeeChooserDeactiveEmployee.getItems().clear();
                    employeeChooserDeactiveEmployee.getItems().add("Employee");
                    for (Employee employee : University.allEmployees) {
                        if (employee.getStatus().equals(Status.Active) && employee.getDepartment().equals(departmentChooserDeactiveEmployee.getValue())) {
                            employeeChooserDeactiveEmployee.getItems().add(employee.getFullName());
                        }
                    }
                    employeeChooserDeactiveEmployee.setVisibleRowCount(4);
                    employeeChooserDeactiveEmployee.getSelectionModel().selectFirst();

                });

                errorLabelFacultyChooserDeactiveEmployee.setText(null);
                errorLabelDepartmentChooserDeactiveEmployee.setText(null);
                errorLabelEmployeeChooserDeactiveEmployee.setText(null);
                errorLabelDeactiveEmployee.setText(null);
                successLabelDeactiveEmployee.setText(null);
            }
        }
    }

    @FXML
    void setOperationChooserUpdateFaculty(ActionEvent event) {
        if(operationChooserUpdateFaculty.getValue() != null) {
            University.loadFaculties();
            if (operationChooserUpdateFaculty.getValue().equals("Edit")) {
                //                activate the edit screen and deactivate the deactive screen
                editFacultyVbox.setVisible(true);
                deactiveFacultyVbox.setVisible(false);
                //                initialize the faculty chooser combo box
                facultyChooserEditFaculty.getItems().clear();
                facultyChooserEditFaculty.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserEditFaculty.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserEditFaculty.setVisibleRowCount(4);
                facultyChooserEditFaculty.getSelectionModel().selectFirst();
                //                clear the textfields
                newFacultyNameEditFaculty.clear();
                newFacultyNameEditFaculty.setPromptText("Faculty Name");
                newEstablishmentYearEditFaculty.clear();
                newEstablishmentYearEditFaculty.setPromptText("Establishment Year");

                errorLabelFacultyChooserEditFaculty.setText(null);
                errorLabelFacultyNameEditFaculty.setText(null);
                errorLabelEstablishmentEditFaculty.setText(null);
                errorLabelEditFaculty.setText(null);
                successLabelEditFaculty.setText(null);

            } else if (operationChooserUpdateFaculty.getValue().equals("Deactive")) {
                //                activate the deactive screen and deactivate the edit screen
                editFacultyVbox.setVisible(false);
                deactiveFacultyVbox.setVisible(true);
                //                initialize the faculty chooser combo box
                facultyChooserDeactiveFaculty.getItems().clear();
                facultyChooserDeactiveFaculty.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserDeactiveFaculty.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserDeactiveFaculty.setVisibleRowCount(4);
                facultyChooserDeactiveFaculty.getSelectionModel().selectFirst();

                errorLabelFacultyChooserDeactiveFaculty.setText(null);
                errorLabelDeactiveFaculty.setText(null);
                successLabelDeactiveFaculty.setText(null);
            }
        }
    }

    @FXML
    void setOperationChooserUpdateMajor(ActionEvent event) {
        if (operationChooserUpdateMajor.getValue() != null) {
            University.loadFaculties();
            if (operationChooserUpdateMajor.getValue().equals("Edit")){
//            activate the edit screen and deactivate the deactive screen
                editMajorVbox.setVisible(true);
                deactiveMajorVbox.setVisible(false);
//            initialize the faculty chooser combo box
                facultyChooserEditMajor.getItems().clear();
                facultyChooserEditMajor.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserEditMajor.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserEditMajor.setVisibleRowCount(4);
                facultyChooserEditMajor.getSelectionModel().selectFirst();
//            initialize the department chooser combo box
                facultyChooserEditMajor.setOnAction(event1 -> {
                    departmentChooserEditMajor.getItems().clear();
                    departmentChooserEditMajor.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserEditMajor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserEditMajor.getItems().add(department.getName());
                                }
                            }
                            break;
                        }
                    }
                    departmentChooserEditMajor.setVisibleRowCount(4);
                    departmentChooserEditMajor.getSelectionModel().selectFirst();
                });
//            initialize the major chooser combo box
                departmentChooserEditMajor.setOnAction(event1 -> {
                    majorChooserEditMajor.getItems().clear();
                    majorChooserEditMajor.getItems().add("Major");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserEditMajor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserEditMajor.getValue())) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserEditMajor.getItems().add(major.getName());
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    majorChooserEditMajor.setVisibleRowCount(4);
                    majorChooserEditMajor.getSelectionModel().selectFirst();
                });
//        clear the textfields
                newMajorNameEditMajor.clear();
                newMajorNameEditMajor.setPromptText("Major Name");
                newEstablishmentYearEditMajor.clear();
                newEstablishmentYearEditMajor.setPromptText("Establishment Year");

                errorLabelFacultyChooserEditMajor.setText(null);
                errorLabelDepartmentChooserEditMajor.setText(null);
                errorLabelMajorChooserEditMajor.setText(null);
                errorLabelMajorNameEditMajor.setText(null);
                errorLabelEstYearEditMajor.setText(null);
                errorLabelEditMajor.setText(null);
                successLabelEditMajor.setText(null);

            } else if (operationChooserUpdateMajor.getValue().equals("Deactive")){
//            activate the deactive screen and deactivate the edit screen
                editMajorVbox.setVisible(false);
                deactiveMajorVbox.setVisible(true);
//            initialize the faculty chooser combo box
                facultyChooserDeactiveMajor.getItems().clear();
                facultyChooserDeactiveMajor.getItems().add("Faculty");
                for (Faculty faculty : University.allFaculties) {
                    if (faculty.getStatus().equals(Status.Active)) {
                        facultyChooserDeactiveMajor.getItems().add(faculty.getFacultyName());
                    }
                }
                facultyChooserDeactiveMajor.setVisibleRowCount(4);
                facultyChooserDeactiveMajor.getSelectionModel().selectFirst();
//            initialize the department chooser combo box
                facultyChooserDeactiveMajor.setOnAction(event1 -> {
                    departmentChooserDeactiveMajor.getItems().clear();
                    departmentChooserDeactiveMajor.getItems().add("Department");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active)) {
                                    departmentChooserDeactiveMajor.getItems().add(department.getName());
                                }
                            }
                            break;
                        }
                    }
                    departmentChooserDeactiveMajor.setVisibleRowCount(4);
                    departmentChooserDeactiveMajor.getSelectionModel().selectFirst();
                });
//            initialize the major chooser combo box
                departmentChooserDeactiveMajor.setOnAction(event1 -> {
                    majorChooserDeactiveMajor.getItems().clear();
                    majorChooserDeactiveMajor.getItems().add("Major");
                    for (Faculty faculty : University.allFaculties) {
                        if (faculty.getStatus().equals(Status.Active) && faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue())) {
                            for (Department department : faculty.departments) {
                                if (department.getStatus().equals(Status.Active) && department.getName().equals(departmentChooserDeactiveMajor.getValue())) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserDeactiveMajor.getItems().add(major.getName());
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    majorChooserDeactiveMajor.setVisibleRowCount(4);
                    majorChooserDeactiveMajor.getSelectionModel().selectFirst();
                });

                errorLabelFacultyChooserDeactiveMajor.setText(null);
                errorLabelDepartmentChooserDeactiveMajor.setText(null);
                errorLabelMajorChooserDeactiveMajor.setText(null);
                errorLabelDeactiveMajor.setText(null);
                successLabelDeactiveMajor.setText(null);
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
    void updateDepartmentDashboard(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Department");
//        activate the update department anchorpane
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateDepartmentAnchorPane.setVisible(true);
        updateDepartmentScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
        operationChooserUpdateDepartment.getItems().clear();
        operationChooserUpdateDepartment.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateDepartment.setVisibleRowCount(3);
        operationChooserUpdateDepartment.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
        editDepartmentVbox.setVisible(false);
        deactiveDepartmentVbox.setVisible(false);
    }

    @FXML
    void updateDepartmentScrollPane(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Department");
//        activate the update department anchorpane
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }
        if (!updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(true);
            updateDepartmentScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
            operationChooserUpdateDepartment.getItems().clear();
            operationChooserUpdateDepartment.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
            operationChooserUpdateDepartment.setVisibleRowCount(3);
            operationChooserUpdateDepartment.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
            editDepartmentVbox.setVisible(false);
            deactiveDepartmentVbox.setVisible(false);
        }
    }

    @FXML
    void updateEmployeeDashboard(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Employee");
//        activate the update employee anchorpane
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateEmployeeAnchorPane.setVisible(true);
        updateEmployeeScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
        operationChooserUpdateEmployee.getItems().clear();
        operationChooserUpdateEmployee.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateEmployee.setVisibleRowCount(3);
        operationChooserUpdateEmployee.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
        editEmployeeVbox.setVisible(false);
        deactiveEmployeeVbox.setVisible(false);
    }

    @FXML
    void updateEmployeeScrollPane(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Employee");
//        activate the update employee anchorpane
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }

        if (!updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(true);
            updateEmployeeScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
            operationChooserUpdateEmployee.getItems().clear();
            operationChooserUpdateEmployee.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
            operationChooserUpdateEmployee.setVisibleRowCount(3);
            operationChooserUpdateEmployee.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
            editEmployeeVbox.setVisible(false);
            deactiveEmployeeVbox.setVisible(false);
        }

    }

    @FXML
    void updateFacultyDashboard(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Faculty");
//        activate the update faculty anchorpane
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateFacultyAnchorPane.setVisible(true);
        updateFacultyScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
        operationChooserUpdateFaculty.getItems().clear();
        operationChooserUpdateFaculty.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateFaculty.setVisibleRowCount(3);
        operationChooserUpdateFaculty.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
        editFacultyVbox.setVisible(false);
        deactiveFacultyVbox.setVisible(false);
    }

    @FXML
    void updateFacultyScrollPane(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Faculty");
//        activate the update faculty anchorpane
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }
        if (!updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(true);
            updateFacultyScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
            operationChooserUpdateFaculty.getItems().clear();
            operationChooserUpdateFaculty.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
            operationChooserUpdateFaculty.setVisibleRowCount(3);
            operationChooserUpdateFaculty.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
            editFacultyVbox.setVisible(false);
            deactiveFacultyVbox.setVisible(false);
        }
    }

    @FXML
    void updateMajorDashboard(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Major");
//        activate the update major anchorpane
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateMajorAnchorPane.setVisible(true);
        updateMajorScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
        operationChooserUpdateMajor.getItems().clear();
        operationChooserUpdateMajor.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateMajor.setVisibleRowCount(3);
        operationChooserUpdateMajor.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
        editMajorVbox.setVisible(false);
        deactiveMajorVbox.setVisible(false);
    }

    @FXML
    void updateMajorScrollPane(ActionEvent event) {
//        name the header
        headerTitle.setText(" --> Update Major");
//        activate the update major anchorpane
        if (addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }
        if (!updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(true);
            updateMajorScrollPane.getStyleClass().add("pressed");
//        initialize the operation chooser combo box
            operationChooserUpdateMajor.getItems().clear();
            operationChooserUpdateMajor.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
            operationChooserUpdateMajor.setVisibleRowCount(3);
            operationChooserUpdateMajor.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
            editMajorVbox.setVisible(false);
            deactiveMajorVbox.setVisible(false);
        }
    }

    @FXML
    void deactiveSemesterScrollPane(ActionEvent event) {
        // Set the header
        headerTitle.setText(" --> Deactive Semester");

        // Hide other anchor panes and remove "pressed" style
        if (addFacultyAnchorPane.isVisible()) {
            addFacultyAnchorPane.setVisible(false);
            addFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (updateFacultyAnchorPane.isVisible()) {
            updateFacultyAnchorPane.setVisible(false);
            updateFacultyScrollPane.getStyleClass().remove("pressed");
        } else if (addDepartmentAnchorPane.isVisible()) {
            addDepartmentAnchorPane.setVisible(false);
            addDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (updateDepartmentAnchorPane.isVisible()) {
            updateDepartmentAnchorPane.setVisible(false);
            updateDepartmentScrollPane.getStyleClass().remove("pressed");
        } else if (addMajorAnchorPane.isVisible()) {
            addMajorAnchorPane.setVisible(false);
            addMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(false);
            addSemesterScrollPane.getStyleClass().remove("pressed");
        } else if (enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(false);
            enrollmentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }else if (emergencyDropAnchorPane.isVisible()) {
            emergencyDropAnchorPane.setVisible(false);
            emergencyDropScrollPane.getStyleClass().remove("pressed");
        }

        // Show deactive semester pane and populate ComboBox
        if (!deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(true);
            deactiveSemesterScrollPane.getStyleClass().add("pressed"); // Fixed: Use correct ScrollPane reference

            semesterChooserDeactiveSemester.getItems().clear();
            errorLabelDeactiveSemester.setText(null); // Clear error label
            errorLabelSemesterDeactiveSemester.setText(null);
            successLabelDeactiveSemester.setText(null);

            University.loadAllSemester();
            semesterChooserDeactiveSemester.getItems().clear();
            semesterChooserDeactiveSemester.getItems().add("Semester");
            for (Semester semester : University.allSemesters) {
                if (semester.getStatus().equals(Status.Active)) {
                    semesterChooserDeactiveSemester.getItems().add(semester.getName());
                }
            }
            semesterChooserDeactiveSemester.setVisibleRowCount(4);
            semesterChooserDeactiveSemester.getSelectionModel().selectFirst();
        }
    }

    @FXML
    public void deactiveSemesterDashboard(ActionEvent event) {
        headerTitle.setText(" --> Deactive Semester");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        deactiveSemesterAnchorPane.setVisible(true);
        deactiveSemesterScrollPane.getStyleClass().add("pressed");

        semesterChooserDeactiveSemester.getItems().clear();
        errorLabelDeactiveSemester.setText(null); // Clear error label
        errorLabelSemesterDeactiveSemester.setText(null);
        successLabelDeactiveSemester.setText(null);

        University.loadAllSemester();
        semesterChooserDeactiveSemester.getItems().clear();
        semesterChooserDeactiveSemester.getItems().add("Semester");
        for (Semester semester : University.allSemesters) {
            if (semester.getStatus().equals(Status.Active)) {
                semesterChooserDeactiveSemester.getItems().add(semester.getName());
            }
        }
        semesterChooserDeactiveSemester.setVisibleRowCount(4);
        semesterChooserDeactiveSemester.getSelectionModel().selectFirst();
    }

    @FXML
    public void deactiveSemester(ActionEvent event) {
        successLabelDeactiveSemester.setText(null);
        boolean confirmation = true;
        // Check if a semester is selected
        if (semesterChooserDeactiveSemester.getValue().isEmpty() || semesterChooserDeactiveSemester.getValue().equals("Semester")) {
            errorLabelSemesterDeactiveSemester.setText("Choose Semester");
            confirmation = false;
        } else {
            errorLabelSemesterDeactiveSemester.setText(null);
        }
        if (confirmation) {
            boolean semesterFound = false;
            University.loadAllSemester();
            for (Semester semester : University.allSemesters) {
                if (semesterChooserDeactiveSemester.getValue().equals(semester.getName())) {
                    semester.setStatus(Status.Inactive);
                    semesterFound = true;
                    break; // Exit loop once semester is found and updated
                }
            }

            if (semesterFound) {
                try {
                    University.saveAllSemester();
                    successLabelDeactiveSemester.setText("The Selected Semester Deactivated Successfully");
                    semesterChooserDeactiveSemester.getItems().remove(semesterChooserDeactiveSemester.getValue()); // Remove deactivated semester
                    semesterChooserDeactiveSemester.setValue(null); // Clear selection
                } catch (Exception e) {
                    errorLabelDeactiveSemester.setText("Error saving semester: " + e.getMessage());
                }
            } else {
                errorLabelDeactiveSemester.setText("The Selected Semester Has Not Found");
            }

        } else {
            errorLabelDeactiveSemester.setText("Fill In All Fields");
        }

    }

}
package com.example.final_project_404;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class AdminPortal1 implements Initializable {

    @FXML
    private VBox DashboardVbox;

    @FXML
    private AnchorPane addDepartmentAnchorPane;

    @FXML
    private Button addDepartmentScrollPane;

    @FXML
    private VBox addDepartmentVbox;

    @FXML
    private AnchorPane addEmployeeAnchorPane;

    @FXML
    private Button addEmployeeScrollPane;

    @FXML
    private VBox addEmployeeVbox;

    @FXML
    private AnchorPane addFacultyAnchorPane;

    @FXML
    private Button addFacultyScrollPane;

    @FXML
    private VBox addFacultyVbox;

    @FXML
    private AnchorPane addMajorAnchorPane;

    @FXML
    private Button addMajorScrollPane;

    @FXML
    private VBox addMajorVbox;

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
    private Button dashboardScrollPane;

    @FXML
    private Label dashboardText;

    @FXML
    private DatePicker dateOfBirthAddEmployee;

    @FXML
    private DatePicker dateOfBirthEditEmployee;

    @FXML
    private Button deactiveDepartmentButton;

    @FXML
    private VBox deactiveDepartmentVbox;

    @FXML
    private Button deactiveEmployeeButton;

    @FXML
    private VBox deactiveEmployeeVbox;

    @FXML
    private Button deactiveFacultyButton;

    @FXML
    private VBox deactiveFacultyVbox;

    @FXML
    private Button deactiveMajorButton;

    @FXML
    private VBox deactiveMajorVbox;

    @FXML
    private AnchorPane degreesReportsAnchorPane;

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
    private Button editDepartmentButton;

    @FXML
    private VBox editDepartmentVbox;

    @FXML
    private Button editEmployeeButton;

    @FXML
    private VBox editEmployeeVbox;

    @FXML
    private Button editFacultyButton;

    @FXML
    private VBox editFacultyVbox;

    @FXML
    private Button editMajorButton;

    @FXML
    private VBox editMajorVbox;

    @FXML
    private AnchorPane enrollmentAnchorPane;

    @FXML
    private Button enrollmentScrollPane;

    @FXML
    private ComboBox<String> employeeChooserDeactiveEmployee;

    @FXML
    private ComboBox<String> employeeChooserEditEmployee;

    @FXML
    private Label errorLabelAddFaculty;

    @FXML
    private Label errorLabelFacultyNameAddFaculty;

    @FXML
    private Label errorLabelFacultyNameEditFaculty;

    @FXML
    private Label errorLabelEditFaculty;

    @FXML
    private Label errorLabelEstablishmentYearAddFaculty;

    @FXML
    private Label errorLabelEstablishmentEditFaculty;

    @FXML
    private Label errorLabelFacultyChooserEditFaculty;

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
    private AnchorPane profileAnchorPane;

    @FXML
    private Button profileScrollPane;

    @FXML
    private VBox profileVbox;

    @FXML
    private AnchorPane reportsAnchorPane;

    @FXML
    private Button reportsScrollPane;

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
    @FXML private TextField searchFieldPeople;

    private ObservableList<People> peoplelist;
    private FilteredList<People> filteredListReportPeople;


//    Reports Done

    @FXML
    private VBox reportsVbox;

    @FXML
    private TextField semesterCodeAddSemester;

    @FXML
    private AnchorPane semestersReportsAnchorPane;

    @FXML
    private Label successLabelEditFaculty;

    @FXML
    private Label successLabelAddFaculty;

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
    void activeEnrollment(ActionEvent event){
        File file = new File("Enrollment.txt");
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    System.out.println("Error in delete file!!");
                    return;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Active");
                System.out.println("Enrollment is active now!");
            }

        } catch (IOException e) {
            System.out.println("Error in Active Enrollment!! " + e.getMessage());
        }
    }

//      public int getEstablishmentYear(){
//        return LocalDate.now().getYear();
//    }

    public String getDepartmentId() throws FileNotFoundException {
        University.loadFaculties();
        String id = "";
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserAddDepartment.getValue())) {
                id = String.format("%02d", faculty.departments.size() + 1);
                break;
            }
        }
        return id;
    }

    @FXML
    void addDepartment(ActionEvent event) throws FileNotFoundException {
        University.loadFaculties();

        //int establishmentYear = getEstablishmentYear();

        if (!departmentNameAddDepartment.getText().isBlank() && !establishmentYearAddDepartment.getText().isBlank()) {
            Department department = new Department(departmentNameAddDepartment.getText().trim(), Integer.parseInt(establishmentYearAddDepartment.getText().trim()), getDepartmentId(), Status.Active);
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyChooserAddDepartment.getValue()) && faculty.getStatus().equals(Status.Active)) {
                    if (!faculty.departments.contains(department)) {
                        faculty.departments.add(department);
                    } else {
                        System.out.println("This Department has registered earlier!");
                    }
                    break;
                }
            }
            University.saveFaculties();

            System.out.println("faculty: " + facultyChooserAddDepartment.getValue());
            System.out.println("name: " + departmentNameAddDepartment.getText().trim());
            System.out.println("year: " + establishmentYearAddDepartment.getText().trim());
            System.out.println("id: " + getDepartmentId());

            facultyChooserAddDepartment.getSelectionModel().selectFirst();
            departmentNameAddDepartment.clear();
            establishmentYearAddDepartment.clear();

        } else {
            System.out.println("please Fill All Fields!!");
        }
    }

    @FXML
    void addDepartmentDashboard(ActionEvent event) {
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
    }

    @FXML
    void addDepartmentScrollPane(ActionEvent event) {
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
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
        }

    }

    public String getEmployeeId(){
        return "EMP"+(University.allEmployees.size()+1);
    }

    @FXML
    void addEmployee(ActionEvent event) throws IOException {
        Employee.loadAllEmployee();
        University.loadFaculties();

        LocalDate dateOfBirth = dateOfBirthAddEmployee.getValue();
        String firstName = firstNameAddEmployee.getText().trim();
        String lastName = lastNameAddEmployee.getText().trim();
        String phoneNumber = phoneNumberAddEmployee.getText().trim();
        String nationalId = nationalIdAddEmployee.getText().trim();
        Gender gender = Gender.valueOf(genderChooserAddEmployee.getValue());
        String faculty = facultyChooserAddEmployee.getValue();
        String department = departmentChooserAddEmployee.getValue();
        LocalDate dateOfHire = LocalDate.now();
        String id = getEmployeeId();

        if (!firstName.isBlank() && !lastName.isBlank() && !phoneNumber.isBlank() && !nationalId.isBlank() && gender!=null && faculty!=null && department!=null) {
            Employee employee = new Employee(firstName, lastName, dateOfBirth, nationalId, gender, phoneNumber, id, department, faculty, dateOfHire, Status.Active);
            for (Faculty faculty1 : University.allFaculties) {
                if (faculty1.getFacultyName().equals(faculty) && faculty1.getStatus().equals(Status.Active)) {
                    for (Department department1 : faculty1.departments) {
                        if (department1.getName().equals(department) && department1.getStatus().equals(Status.Active)) {
                            if (!department1.employees.contains(employee)) {
                                department1.employees.add(employee);

                            } else {
                                System.out.println("This Employee has Registered earlier!!");
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            University.saveFaculties();

            University.allEmployees.add(employee);
            Employee.saveAllEmployee();
            System.out.println("Successful\nid : " + id);
            System.out.println("Password : National ID");
            System.out.println();
            System.out.println(firstName+" "+lastName);
            System.out.println(dateOfBirth);
            System.out.println(phoneNumber);
            System.out.println(nationalId);
            System.out.println(gender);
            System.out.println(faculty);
            System.out.println(department);
            System.out.println(dateOfHire);


            firstNameAddEmployee.clear();
            lastNameAddEmployee.clear();
            phoneNumberAddEmployee.clear();
            nationalIdAddEmployee.clear();
            genderChooserAddEmployee.getSelectionModel().selectFirst();
            facultyChooserAddEmployee.getSelectionModel().selectFirst();
            departmentChooserAddEmployee.getSelectionModel().selectFirst();
            dateOfBirthAddEmployee.setValue(null);
            dateOfBirthAddEmployee.setPromptText("Date of Birth");
        } else {
            System.out.println("Please Fill All Fields!");
        }
    }

    @FXML
    void addEmployeeDashboard(ActionEvent event) {
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
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
        }
    }

    public String getFacultyId(){
        return String.format("%02d", University.allFaculties.size()+1);
    }

    @FXML
    void addFaculty(ActionEvent event) {
        University.loadFaculties();

        //        int establishmentYear = getEstablishmentYear();

        if (!facultyNameAddFaculty.getText().isBlank() && !establishmentYearAddFaculty.getText().isBlank()){
            Faculty faculty = new Faculty(facultyNameAddFaculty.getText(), getFacultyId(), Integer.parseInt(establishmentYearAddFaculty.getText()), Status.Active);
            if (!University.allFaculties.contains(faculty)){
                University.allFaculties.add(faculty);
            } else {
                System.out.println("This Faculty has Registered earlier!!");
            }
            University.saveFaculties();

            System.out.println("name: " + facultyNameAddFaculty.getText());
            System.out.println("Year: " + establishmentYearAddFaculty.getText());
            System.out.println("ID: " + getFacultyId());

            facultyNameAddFaculty.clear();
            establishmentYearAddFaculty.clear();
        } else {
            System.out.println("Please Fill All Field!!");
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!addFacultyAnchorPane.isVisible()){
            addFacultyAnchorPane.setVisible(true);
            addFacultyScrollPane.getStyleClass().add("pressed");
//        clear the textfields
            facultyNameAddFaculty.clear();
            establishmentYearAddFaculty.clear();
        }
    }

    public String getMajorId() throws FileNotFoundException {
        University.loadFaculties();
        String id = "";
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserAddMajor.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserAddMajor.getValue())) {
                        id = String.format("%02d", department.majors.size() + 1);
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
        University.loadFaculties();


        if (!majorNameAddMajor.getText().isBlank() && !establishmentYearAddMajor.getText().isBlank()){
            Major newMajor = new Major(majorNameAddMajor.getText().trim(),getMajorId(), Integer.parseInt(establishmentYearAddMajor.getText().trim()), Status.Active);

            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyChooserAddMajor.getValue()) && faculty.getStatus().equals(Status.Active)) {
                    for (Department department : faculty.departments) {
                        if (department.getName().equals(departmentChooserAddMajor.getValue()) && department.getStatus().equals(Status.Active)) {
                            if (!department.majors.contains(newMajor)) {
                                department.majors.add(newMajor);
                            } else {
                                System.out.println("This Major has Registered earlier!");
                            }
                            break;
                        }
                    }
                }
            }
            University.saveFaculties();

            System.out.println("faculty: " + facultyChooserAddMajor.getValue());
            System.out.println("department: " + departmentChooserAddMajor.getValue());
            System.out.println("majorName: " + majorNameAddMajor.getText().trim());
            System.out.println("publish year: " + establishmentYearAddMajor.getText().trim());
            System.out.println("major id: " + getMajorId());

            facultyChooserAddMajor.getSelectionModel().selectFirst();
            departmentChooserAddMajor.getSelectionModel().selectFirst();
            majorNameAddMajor.clear();
            establishmentYearAddMajor.clear();

        } else {
            System.out.println("Please Fill All Fields!!");
        }
    }

    @FXML
    void addMajorDashboard(ActionEvent event) {
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
                }
            }
            departmentChooserAddMajor.setVisibleRowCount(4);
            departmentChooserAddMajor.getSelectionModel().selectFirst();
        });
    }

    @FXML
    void addMajorScrollPane(ActionEvent event) {
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
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
        }
    }

    @FXML
    void addSemester(ActionEvent event) {
        University.loadAllSemester();
        University.allSemesters.add(new Semester(semesterCodeAddSemester.getText().trim()));
        University.saveAllSemester();
        System.out.println("Semester with code:"+ semesterCodeAddSemester.getText().trim()+"add successfull.");
    }

    @FXML
    void addSemesterDashboard(ActionEvent event) {
        headerTitle.setText(" --> Add Semester");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addSemesterAnchorPane.setVisible(true);
        addSemesterScrollPane.getStyleClass().add("pressed");

        semesterCodeAddSemester.clear();
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }

        if (!addSemesterAnchorPane.isVisible()) {
            addSemesterAnchorPane.setVisible(true);
            addSemesterScrollPane.getStyleClass().add("pressed");

            semesterCodeAddSemester.clear();
        }
    }

    @FXML
    void courseGroupsReports(ActionEvent event) {
        courseGroupsReportsAnchorPane.setVisible(true);
    }

    @FXML
    void coursesReports(ActionEvent event) {
        coursesReportsAnchorPane.setVisible(true);
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }

        buttonsScrollPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);

    }

    @FXML
    void deactiveDepartment(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserDeactiveDepartment.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserDeactiveDepartment.getValue())){
                        department.setStatus(Status.Inactive);
                        break;
                    }
                }
                break;
            }
        }
        University.saveFaculties();
        System.out.println("successful");

        facultyChooserDeactiveDepartment.getSelectionModel().selectFirst();
        departmentChooserDeactiveDepartment.getSelectionModel().selectFirst();

    }

    @FXML
    void deactiveEnrollment(ActionEvent event){
        File file = new File("Enrollment.txt");
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    System.out.println("Error in delete file!!");
                    return;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Deactive");
                System.out.println("Enrollment is Deactive now!");
            }

        } catch (IOException e) {
            System.out.println("Error in Deactive Enrollment!! " + e.getMessage());
        }
    }

    @FXML
    void deactiveEmployee(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getFacultyName().equals(facultyChooserDeactiveEmployee.getValue())) {
                for (Department department : faculty.departments) {
                    if (department.getName().equals(departmentChooserDeactiveEmployee.getValue())) {
                        for (Employee employee : department.employees){
                            if (employee.getId().equals(employeeChooserDeactiveEmployee.getValue())){
                                employee.setStatus(Status.Inactive);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        University.saveFaculties();

        Employee.loadAllEmployee();
        for (Employee employee : University.allEmployees){
            if (employee.getId().equals(employeeChooserDeactiveEmployee.getValue())){
                employee.setStatus(Status.Inactive);
                break;
            }
        }
        Employee.saveAllEmployee();
        System.out.println("successful");

        facultyChooserDeactiveEmployee.getSelectionModel().selectFirst();
        departmentChooserDeactiveEmployee.getSelectionModel().selectFirst();
        employeeChooserDeactiveEmployee.getSelectionModel().selectFirst();
    }

    @FXML
    void deactiveFaculty(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserDeactiveFaculty.getValue())){
                faculty.setStatus(Status.Inactive);
            }
        }
        University.saveFaculties();
        System.out.println("successful");


        facultyChooserDeactiveFaculty.getItems().clear();
        facultyChooserDeactiveFaculty.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            facultyChooserDeactiveFaculty.getItems().add(faculty.getFacultyName());
        }
        facultyChooserDeactiveFaculty.setVisibleRowCount(4);
        facultyChooserDeactiveFaculty.getSelectionModel().selectFirst();
    }

    @FXML
    void deactiveMajor(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserDeactiveMajor.getValue())){
                        for (Major major : department.majors){
                            if (major.getName().equals(majorChooserDeactiveMajor.getValue())){
                                major.setStatus(Status.Inactive);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        University.saveFaculties();
        System.out.println("successful");

        facultyChooserDeactiveMajor.getSelectionModel().selectFirst();
        departmentChooserDeactiveMajor.getSelectionModel().selectFirst();
        majorChooserDeactiveMajor.getSelectionModel().selectFirst();
    }

    @FXML
    void degreesReports(ActionEvent event) {

    }

    @FXML
    void departmentsReports(ActionEvent event) {
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

    }

    @FXML
    void editDepartment(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();
        Employee.loadAllEmployee();
        Student.loadAllStudents();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditDepartment.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditDepartment.getValue())){
                        if (!newDepartmentNameEditDepartment.getText().isBlank()){
                            department.setName(newDepartmentNameEditDepartment.getText());
                            for (Employee employee : University.allEmployees) {
                                if (employee.getDepartment().equals(departmentChooserEditDepartment.getValue())) {
                                    employee.setDepartment(newDepartmentNameEditDepartment.getText());
                                }
                            }
                            for (Professor professor : University.allProfessors) {
                                if (professor.getDepartment().equals(departmentChooserEditDepartment.getValue())) {
                                    professor.setDepartment(newDepartmentNameEditDepartment.getText());
                                }
                            }
                            for (Student student : University.allStudents) {
                                if (student.getDepartment().equals(departmentChooserEditDepartment.getValue())) {
                                    student.setDepartment(newDepartmentNameEditDepartment.getText());
                                }
                            }
                        }
                        if (!newEstablishmentYearEditDepartment.getText().isBlank()){
                            department.setEstablishmentYear(Integer.parseInt(newEstablishmentYearEditDepartment.getText()));
                        }
                        University.saveFaculties();
                        Professor.saveAllProfessor();
                        Employee.saveAllEmployee();
                        Student.saveAllStudent();

                        System.out.println("Successful");
                        System.out.println(department.getName());
                        System.out.println(department.getEstablishmentYear());
                        System.out.println(department.getId());

                        break;
                    }
                }
                break;
            }
        }

        System.out.println("successful");

        facultyChooserEditDepartment.getSelectionModel().selectFirst();
        departmentChooserEditDepartment.getSelectionModel().selectFirst();
        newDepartmentNameEditDepartment.clear();
        newDepartmentNameEditDepartment.setPromptText("Department Name");
        newEstablishmentYearEditDepartment.clear();
        newEstablishmentYearEditDepartment.setPromptText("Establishment Year");
    }

    @FXML
    void editEmployee(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditEmployee.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditEmployee.getValue())){
                        for (Employee employee : department.employees){
                            if (employee.getFullName().equals(employeeChooserEditEmployee.getValue())){
                                if (!newFirstNameEditEmployee.getText().isBlank()){
                                    employee.setFirst_name(newFirstNameEditEmployee.getText());
                                }
                                if (!newLastNameEditEmployee.getText().isBlank()){
                                    employee.setLast_name(newLastNameEditEmployee.getText());
                                }
                                if (genderChooserEditEmployee.getValue() != null){
                                    employee.setGender(Gender.valueOf(genderChooserEditEmployee.getValue()));
                                }
                                if (dateOfBirthEditEmployee.getValue() != null){
                                    LocalDate date = dateOfBirthEditEmployee.getValue();
                                    employee.setDateOfBirth(date);
                                }
                                if (!nationalIdEditEmployee.getText().isBlank()){
                                    employee.setNationalId(nationalIdEditEmployee.getText());
                                }
                                if (!phoneNumberEditEmployee.getText().isBlank()){
                                    employee.setPhoneNumber(phoneNumberEditEmployee.getText());
                                }
                                University.saveFaculties();

                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }

        Employee.loadAllEmployee();
        for (Employee employee : University.allEmployees){
            if (employee.getFullName().equals(employeeChooserEditEmployee.getValue())){
                if (!newFirstNameEditEmployee.getText().isBlank()){
                    employee.setFirst_name(newFirstNameEditEmployee.getText());
                }
                if (!newLastNameEditEmployee.getText().isBlank()){
                    employee.setLast_name(newLastNameEditEmployee.getText());
                }
                if (genderChooserEditEmployee.getValue() != null){
                    employee.setGender(Gender.valueOf(genderChooserEditEmployee.getValue()));
                }
                if (dateOfBirthEditEmployee.getValue() != null){
                    LocalDate date = dateOfBirthEditEmployee.getValue();
                    employee.setDateOfBirth(date);
                }
                if (!nationalIdEditEmployee.getText().isBlank()){
                    employee.setNationalId(nationalIdEditEmployee.getText());
                }
                if (!phoneNumberEditEmployee.getText().isBlank()){
                    employee.setPhoneNumber(phoneNumberEditEmployee.getText());
                }
                Employee.saveAllEmployee();

                System.out.println("successful");
                System.out.println(employee.getFullName());
                System.out.println(employee.getDateOfBirth());
                System.out.println(employee.getPhoneNumber());
                System.out.println(employee.getNationalId());
                System.out.println(employee.getGender());
                System.out.println(employee.getFaculty());
                System.out.println(employee.getDepartment());

                facultyChooserEditEmployee.getSelectionModel().selectFirst();
                departmentChooserEditEmployee.getSelectionModel().selectFirst();
                employeeChooserEditEmployee.getSelectionModel().selectFirst();
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

                break;
            }
        }
    }

    @FXML
    void editFaculty(ActionEvent event) throws Exception {
        University.loadFaculties();
        Employee.loadAllEmployee();
        Professor.loadAllProfessor();
        Student.loadAllStudents();
        for(Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditFaculty.getValue())){
                if (!newFacultyNameEditFaculty.getText().isBlank()){
                    faculty.setFacultyName(newFacultyNameEditFaculty.getText());
                    for (Employee employee : University.allEmployees) {
                        if (employee.getFaculty().equals(facultyChooserEditFaculty.getValue())) {
                            employee.setFaculty(newFacultyNameEditFaculty.getText());
                        }
                    }
                    for (Professor professor : University.allProfessors) {
                        if (professor.getFaculty().equals(facultyChooserEditFaculty.getValue())) {
                            professor.setFaculty(newFacultyNameEditFaculty.getText());
                        }
                    }
                    for (Student student : University.allStudents) {
                        if (student.getFaculty().equals(facultyChooserEditFaculty.getValue())) {
                            student.setFaculty(newFacultyNameEditFaculty.getText());
                        }
                    }
                }
                if (!newEstablishmentYearEditFaculty.getText().isBlank()){
                    faculty.setEstablishmentYear(Integer.parseInt(newEstablishmentYearEditFaculty.getText()));
                }
                University.saveFaculties();
                Employee.saveAllEmployee();
                Professor.saveAllProfessor();
                Student.saveAllStudent();

                System.out.println("successful");
                System.out.println(faculty.getFacultyName());
                System.out.println(faculty.getEstablishmentYear());

                facultyChooserEditFaculty.getSelectionModel().selectFirst();
                newFacultyNameEditFaculty.clear();
                newFacultyNameEditFaculty.setPromptText("Faculty Name");
                newEstablishmentYearEditFaculty.clear();
                newEstablishmentYearEditFaculty.setPromptText("Establishment Year");
                break;
            }
        }

        facultyChooserEditFaculty.getItems().clear();
        facultyChooserEditFaculty.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            facultyChooserEditFaculty.getItems().add(faculty.getFacultyName());
        }
        facultyChooserEditFaculty.setVisibleRowCount(4);
        facultyChooserEditFaculty.getSelectionModel().selectFirst();
    }

    @FXML
    void editMajor(ActionEvent event) throws Exception {
        University.loadFaculties();
        Professor.loadAllProfessor();
        Student.loadAllStudents();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditMajor.getValue())){
                        for (Major major : department.majors){
                            if (major.getName().equals(majorChooserEditMajor.getValue())){
                                if (!newMajorNameEditMajor.getText().isBlank()){
                                    major.setName(newMajorNameEditMajor.getText());
                                    for (Professor professor : University.allProfessors) {
                                        if (professor.getMajor().equals(majorChooserEditMajor.getValue())) {
                                            professor.setMajor(newMajorNameEditMajor.getText());
                                        }
                                    }
                                    for (Student student : University.allStudents) {
                                        if (student.getMajor().equals(majorChooserEditMajor.getValue())) {
                                            student.setMajor(newMajorNameEditMajor.getText());
                                        }
                                    }
                                }
                                if (!newEstablishmentYearEditMajor.getText().isBlank()){
                                    major.setEstablishmentYear(Integer.parseInt(newEstablishmentYearEditMajor.getText()));
                                }
                                University.saveFaculties();
                                Professor.saveAllProfessor();
                                Student.saveAllStudent();

                                System.out.println("successful");
                                System.out.println(major.getName());
                                System.out.println(major.getEstablishmentYear());

                                facultyChooserEditMajor.getSelectionModel().selectFirst();
                                departmentChooserEditMajor.getSelectionModel().selectFirst();
                                majorChooserEditMajor.getSelectionModel().selectFirst();
                                newMajorNameEditMajor.clear();
                                newMajorNameEditMajor.setPromptText("Major Name");
                                newEstablishmentYearEditMajor.clear();
                                newEstablishmentYearEditMajor.setPromptText("Establishment Year");
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
    void enrollmentDashboard(ActionEvent event) {
        // Set the header title
        headerTitle.setText(" --> Enrollment");

        // Hide all anchor panes
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        enrollmentAnchorPane.setVisible(true);
        enrollmentScrollPane.getStyleClass().add("pressed");

    }

    @FXML
    void enrollmentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Enrollment");

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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        }else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }

        if (!enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(true);
            enrollmentScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void facultiesReports(ActionEvent event) {
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

    }

    @FXML
    void peopleReports(ActionEvent event) {
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


        Employee.loadAllEmployee();
        try {
            Professor.loadAllProfessor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Student.loadAllStudents();


        peoplelist = FXCollections.observableArrayList();
        for (Employee employee : University.allEmployees) {
            peoplelist.add(new People(employee.getFirst_name(), employee.getLast_name(), employee.getDateOfBirth(), employee.getNationalId(),
                    employee.getGender(), employee.getPhoneNumber(), employee.getDateOfJoin(),"Employee", employee.getId(),
                    employee.getFaculty(), employee.getDepartment(), "----", "----", employee.getStatus()));
        }

        for (Professor professor : University.allProfessors) {
            peoplelist.add(new People(professor.getFirst_name(), professor.getLast_name(), professor.getDateOfBirth(), professor.getNationalId(),
                    professor.getGender(), professor.getPhoneNumber(), professor.getDateOfJoin(), "Professor", professor.getId(),
                    professor.getFaculty(), professor.getDepartment(), professor.getMajor(), "----", professor.getStatus()));
        }

        for (Student student : University.allStudents) {
            peoplelist.add(new People(student.getFirst_name(), student.getLast_name(), student.getDateOfBirth(), student.getNationalId(),
                    student.getGender(), student.getPhoneNumber(), student.getDateOfJoin(), "Student", student.getId(),
                    student.getFaculty(), student.getDepartment(), student.getMajor(), "----", student.getStatus()));
        }



        filteredListReportPeople = new FilteredList<>(peoplelist, people -> true);
        tableViewReportPeople.setItems(filteredListReportPeople);

        setupGenderContextMenuPeople();
        setupStatusContextMenuPeople();
        setupRoleContextMenuPeople();
    }

    @FXML
    void profileDashboard(ActionEvent event) {
        headerTitle.setText(" --> Profile");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        profileAnchorPane.setVisible(true);
        profileScrollPane.getStyleClass().add("pressed");
    }

    @FXML
    void profileScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Profile");

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
        }

        if (!profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(true);
            profileScrollPane.getStyleClass().add("pressed");
        }


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
        degreesReportsAnchorPane.setVisible(false);
        semestersReportsAnchorPane.setVisible(false);
    }

    @FXML
    void reportsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Reports");

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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        }

        if (!reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(true);
            reportsScrollPane.getStyleClass().add("pressed");

            facultiesReportsAnchorPane.setVisible(false);
            departmentsReportsAnchorPane.setVisible(false);
            majorsReportsAnchorPane.setVisible(false);
            peopleReportsAnchorPane.setVisible(false);
            coursesReportsAnchorPane.setVisible(false);
            courseGroupsReportsAnchorPane.setVisible(false);
            degreesReportsAnchorPane.setVisible(false);
            semestersReportsAnchorPane.setVisible(false);
        }
    }
//    Reports ------>>> Departments
    private void setupStatusContextMenuReportDepartment() {
        ContextMenu statusMenu = new ContextMenu();

        MenuItem active = new MenuItem("Active");
        active.setOnAction(e -> {
            DepartmentReport selected = tableViewReportDepartment.getSelectionModel().getSelectedItem();
            if (selected != null) {
                selected.setStatus("Active");
                tableViewReportDepartment.refresh();
            }
        });

        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> {
            DepartmentReport selected = tableViewReportDepartment.getSelectionModel().getSelectedItem();
            if (selected != null) {
                selected.setStatus("Inactive");
                tableViewReportDepartment.refresh();
            }
        });

        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> {
            filteredListReportDepartment.setPredicate(p -> true);
            tableViewReportDepartment.setItems(filteredListReportDepartment);
        });

        statusMenu.getItems().addAll(active, inactive, allItem);
        colStatusReportDepartment.setContextMenu(statusMenu);
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
        activeItem.setOnAction(e -> filterStatus("Active"));
        MenuItem inactiveItem = new MenuItem("Inactive");
        inactiveItem.setOnAction(e -> filterStatus("Inactive"));
        MenuItem allItem = new MenuItem("All");
        allItem.setOnAction(e -> tableViewReportMajors.setItems(majorList));

        statusMenu.getItems().addAll(activeItem, inactiveItem, allItem);
        colStatusReportMajors.setContextMenu(statusMenu);

    }

    @FXML
    private void filterStatus(String status) {
        for (MajorReport major : majorList) {
            if (major.getStatus().equalsIgnoreCase(status)) {
                filteredListReportMajor.add(major);
            }
        }
        tableViewReportMajors.setItems(filteredListReportMajor);
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
        active.setOnAction(e -> updateSelectedStatus("Active"));
        MenuItem inactive = new MenuItem("Inactive");
        inactive.setOnAction(e -> updateSelectedStatus("Inactive"));

        MenuItem allStatus = new MenuItem("All");
        allStatus.setOnAction(e -> {
            filteredListReportPeople.setPredicate(p -> true);
            tableViewReportPeople.setItems(filteredListReportPeople);
        });

        statusMenu.getItems().addAll(active, inactive, allStatus);
        colStatusReportPeople.setContextMenu(statusMenu);
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
        allRole.setOnAction(e -> {
            filteredListReportPeople.setPredicate(p -> true);
            tableViewReportPeople.setItems(filteredListReportPeople);
        });

        roleMenu.getItems().addAll(employee, professor, student, allRole);
        colRoleReportPeople.setContextMenu(roleMenu);
    }

    private void filterByRolePeople(String role) {
        filteredListReportPeople.setPredicate(people -> people.getRole().equalsIgnoreCase(role));
    }

    private void updateSelectedStatus(String status) {
        People selected = tableViewReportPeople.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus(Status.valueOf(status));
            tableViewReportPeople.refresh();
        }
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
        peopleReportsAnchorPane.setVisible(false);
    }

//    Reports ----->>> Done

    @FXML
    void semestersReports(ActionEvent event) {

    }

    @FXML
    void setDepartmentChooserDeactiveDepartment(ActionEvent event) {

    }

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
    void setEmployeeChooserDeactive(ActionEvent event) {

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
    void setFacultyChooserDeactiveFaculty(ActionEvent event) {

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
    void setMajorChooserDeactiveMajor(ActionEvent event) {

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
                employeeChooserDeactiveEmployee.getSelectionModel().selectFirst();
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
                                if (department.getStatus().equals(Status.Active)) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserEditMajor.getItems().add(department.getName());
                                        }
                                    }
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
                                if (department.getStatus().equals(Status.Active)) {
                                    for (Major major : department.majors) {
                                        if (major.getStatus().equals(Status.Active)) {
                                            majorChooserDeactiveMajor.getItems().add(department.getName());
                                        }
                                    }                            }
                            }
                            break;
                        }
                    }
                    majorChooserDeactiveMajor.setVisibleRowCount(4);
                    majorChooserDeactiveMajor.getSelectionModel().selectFirst();
                });
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
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
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
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
import java.time.Period;
import java.util.ResourceBundle;

public class AdminPortal1 implements Initializable {

    public Label errorLabelDeactiveSemester;
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
    public VBox deactiveSemesterVbox;

    @FXML
    public AnchorPane deactiveSemesterAnchorPane;

    @FXML
    public ComboBox semesterChooserDeactiveSemester;

    @FXML
    public Button deactiveSemesterButton;



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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
            errorLabelDepartmentChooserAddEmployee.setText("Enter Department");
            confirmation = false;
        } else {
            errorLabelDepartmentChooserAddEmployee.setText(null);
        }
        if (dateOfBirthAddEmployee.getValue() == null) {
            errorLabelDateOfBirthAddEmployee.setText("Choose Date Of Birth");
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

            Employee employee = new Employee(firstName, lastName, dateOfBirth, nationalId, gender, phoneNumber, id, departmentName, facultyName, dateOfHire, Status.Active);
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
                                            break;
                                        }
                                    }
                                    departmentChooserAddEmployee.setVisibleRowCount(5);
                                    departmentChooserAddEmployee.getSelectionModel().selectFirst();
                                });
                                genderChooserAddEmployee.getSelectionModel().selectFirst();
                            } else {
                                errorLabelAddEmployee.setText("The Employee Has Been Registered Earlier");
                            }
                            break;
                        }
                    }
                    break;
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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
            errorLabelFacultyNameAddFaculty.setText("Enter The Name");
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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
        }

        buttonsScrollPane.setVisible(false);
        dashboardAnchorPane.setVisible(true);

    }

    @FXML
    void deactiveDepartment(ActionEvent event) {
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
                            department.setStatus(Status.Inactive);
                            University.saveFaculties();
                            errorLabelDeactiveDepartment.setText(null);
                            successLabelDeactiveDepartment.setText("The Selected Department Deactivated Successfully");

                            facultyChooserDeactiveDepartment.getSelectionModel().selectFirst();

                            facultyChooserDeactiveDepartment.setOnAction(event1 -> {
                                departmentChooserDeactiveDepartment.getItems().clear();
                                departmentChooserDeactiveDepartment.getItems().add("Department");
                                for (Faculty faculty1 : University.allFaculties) {
                                    if (faculty1.getStatus().equals(Status.Active) && facultyChooserDeactiveDepartment.getValue().equals(faculty1.getFacultyName())) {
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
                                    employee.setStatus(Status.Inactive);
                                    Employee.loadAllEmployee();
                                    for (Employee employee1 : University.allEmployees){
                                        if (employee1.getId().equals(employeeChooserDeactiveEmployee.getValue())){
                                            employee1.setStatus(Status.Inactive);
                                            break;
                                        }
                                    }
                                    University.saveFaculties();
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
    void deactiveFaculty(ActionEvent event) {
        successLabelDeactiveFaculty.setText(null);
        University.loadFaculties();
        boolean confirmation = true;
        if (facultyChooserDeactiveFaculty.getValue().isEmpty() || facultyChooserDeactiveFaculty.getValue().equals("Faculty")) {
            errorLabelFacultyChooserDeactiveFaculty.setText("Choose Faculty");
            confirmation = false;
        } else {
            errorLabelFacultyChooserDeactiveFaculty.setText(null);
        }
        if (confirmation) {
            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveFaculty.getValue())){
                    faculty.setStatus(Status.Inactive);
                    University.saveFaculties();
                    errorLabelDeactiveFaculty.setText(null);
                    successLabelDeactiveFaculty.setText("The Selected Faculty Deactivated successfully");

                    facultyChooserDeactiveFaculty.getItems().clear();
                    facultyChooserDeactiveFaculty.getItems().add("Faculty");
                    for (Faculty faculty1 : University.allFaculties) {
                        facultyChooserDeactiveFaculty.getItems().add(faculty1.getFacultyName());
                    }
                    facultyChooserDeactiveFaculty.setVisibleRowCount(4);
                    facultyChooserDeactiveFaculty.getSelectionModel().selectFirst();
                }
            }
        } else {
            errorLabelDeactiveFaculty.setText("Fill In All Fields");
        }
    }

    @FXML
    void deactiveMajor(ActionEvent event) {
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
                                    major.setStatus(Status.Inactive);
                                    University.saveFaculties();

                                    errorLabelDeactiveMajor.setText(null);
                                    successLabelDeactiveMajor.setText("The Major Deactivated Successfully");

                                    facultyChooserDeactiveMajor.getSelectionModel().selectFirst();
                                    facultyChooserDeactiveMajor.setOnAction(event1 -> {
                                        departmentChooserDeactiveMajor.getItems().clear();
                                        departmentChooserDeactiveMajor.getItems().add("Department");
                                        for (Faculty faculty1 : University.allFaculties) {
                                            if (faculty1.getFacultyName().equals(facultyChooserDeactiveMajor.getValue()) && faculty1.getStatus().equals(Status.Active)) {
                                                for (Department department1 : faculty1.departments) {
                                                    if (department1.getStatus().equals(Status.Active)) {
                                                        departmentChooserDeactiveMajor.getItems().add(department1.getName());
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        departmentChooserDeactiveMajor.setVisibleRowCount(5);
                                        departmentChooserDeactiveMajor.getSelectionModel().selectFirst();
                                    });
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
    void degreesReports(ActionEvent event) {

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
                                    if (newMajorNameEditMajor.getText().equals(major.getName())){
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
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
        }

        if (!enrollmentAnchorPane.isVisible()) {
            enrollmentAnchorPane.setVisible(true);
            enrollmentScrollPane.getStyleClass().add("pressed");
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
        } else if (deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(false);
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
        allStatus.setOnAction(e -> tableViewReportPeople.setItems(peoplelist));

        statusMenu.getItems().addAll(active, inactive, allStatus);
        colStatusReportPeople.setContextMenu(statusMenu);
    }

    private void filterByStatusPeople(String status) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peoplelist) {
            if (people.getStatus().equals(status)) {
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
        allRole.setOnAction(e -> tableViewReportPeople.setItems(peoplelist));

        roleMenu.getItems().addAll(employee, professor, student, allRole);
        colRoleReportPeople.setContextMenu(roleMenu);
    }

    private void filterByRolePeople(String role) {
        ObservableList<People> filtered = FXCollections.observableArrayList();
        for (People people : peoplelist) {
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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
            deactiveSemesterAnchorPane.getStyleClass().remove("pressed");
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
        }

        // Show deactive semester pane and populate ComboBox
        if (!deactiveSemesterAnchorPane.isVisible()) {
            deactiveSemesterAnchorPane.setVisible(true);
            deactiveSemesterScrollPane.getStyleClass().add("pressed"); // Fixed: Use correct ScrollPane reference
            semesterChooserDeactiveSemester.getItems().clear();
            errorLabelDeactiveSemester.setText(""); // Clear error label
            University.loadAllSemester();
            for (Semester semester : University.allSemesters) {
                if (semester.getStatus().equals(Status.Active)) {
                    semesterChooserDeactiveSemester.getItems().add(semester.getName());
                }
            }
        }
    }

    @FXML
    public void deactiveSemesterDashboard(ActionEvent event) {
        semesterChooserDeactiveSemester.getItems().clear();
        errorLabelDeactiveSemester.setText(""); // Clear error label
        headerTitle.setText(" --> Deactive Semester");
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        deactiveSemesterAnchorPane.setVisible(true);
        University.loadAllSemester();
        for (Semester semester : University.allSemesters) {
            if (semester.getStatus().equals(Status.Active)) {
                semesterChooserDeactiveSemester.getItems().add(semester.getName());
            }
        }
    }

    @FXML
    public void deactiveSemester(ActionEvent event) {
        // Clear previous error message
        errorLabelDeactiveSemester.setText("");

        // Check if a semester is selected
        if (semesterChooserDeactiveSemester.getValue() == null) {
            errorLabelDeactiveSemester.setText("Please select a semester to deactivate.");
            return;
        }

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
                errorLabelDeactiveSemester.setText("Semester deactivated successfully.");
                semesterChooserDeactiveSemester.getItems().remove(semesterChooserDeactiveSemester.getValue()); // Remove deactivated semester
                semesterChooserDeactiveSemester.setValue(null); // Clear selection
            } catch (Exception e) {
                errorLabelDeactiveSemester.setText("Error saving semester: " + e.getMessage());
            }
        } else {
            errorLabelDeactiveSemester.setText("Selected semester not found.");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
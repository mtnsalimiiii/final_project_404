package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
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
    private AnchorPane enrollmentAnchorPane;

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
    private ScrollPane buttonsScrollPane;

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
    private ComboBox<String> employeeChooserDeactiveEmployee;

    @FXML
    private ComboBox<String> employeeChooserEditEmployee;

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

    @FXML
    private VBox reportsVbox;

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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }
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

    public Date getDateOfBirthAddEmployee(ActionEvent event) {
        Date date = new Date();
        date.setYear(dateOfBirthAddEmployee.getValue().getYear());
        date.setMonth(dateOfBirthAddEmployee.getValue().getMonthValue());
        date.setDay(dateOfBirthAddEmployee.getValue().getDayOfMonth());
        date.setDate(dateOfBirthAddEmployee.getValue());
        return date;
    }

    public Date getDateOfHireAddEmployee() {
        Date date = new Date();
        date.setYear(LocalDate.now().getYear());
        date.setMonth(LocalDate.now().getMonthValue());
        date.setDay(LocalDate.now().getDayOfMonth());
        date.setDate(LocalDate.now());
        return date;
    }

    public String getEmployeeId(){
        return "EMP"+(University.allEmployees.size()+1);
    }

    @FXML
    void addEmployee(ActionEvent event) throws IOException {
        Employee.loadAllEmployee();
        University.loadFaculties();

        Date dateOfBirth = getDateOfBirthAddEmployee(event);
        String firstName = firstNameAddEmployee.getText().trim();
        String lastName = lastNameAddEmployee.getText().trim();
        String phoneNumber = phoneNumberAddEmployee.getText().trim();
        String nationalId = nationalIdAddEmployee.getText().trim();
        Gender gender = Gender.valueOf(genderChooserAddEmployee.getValue());
        String faculty = facultyChooserAddEmployee.getValue();
        String department = departmentChooserAddEmployee.getValue();
        Date dateOfHire = getDateOfHireAddEmployee();
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }
//        clear the textfields
        facultyNameAddFaculty.clear();
        establishmentYearAddFaculty.clear();
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
                        if (department.getName().equals(departmentChooserAddMajor) && department.getStatus().equals(Status.Active)) {
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
    void editDepartment(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditDepartment.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditDepartment.getValue())){
                        if (!newDepartmentNameEditDepartment.getText().isBlank()){
                            department.setName(newDepartmentNameEditDepartment.getText());
                        }
                        if (!newEstablishmentYearEditDepartment.getText().isBlank()){
                            department.setEstablishmentYear(Integer.parseInt(newEstablishmentYearEditDepartment.getText()));
                        }
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
        University.saveFaculties();
        System.out.println("successful");

        facultyChooserEditDepartment.getSelectionModel().selectFirst();
        departmentChooserEditDepartment.getSelectionModel().selectFirst();
        newDepartmentNameEditDepartment.clear();
        newEstablishmentYearEditDepartment.clear();
    }

    @FXML
    void editEmployee(ActionEvent event) throws IOException {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditEmployee.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditEmployee.getValue())){
                        for (Employee employee : department.employees){
                            if (employee.getId().equals(employeeChooserEditEmployee.getValue())){
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
                                    Date date = new Date();
                                    date.setYear(dateOfBirthEditEmployee.getValue().getYear());
                                    date.setMonth(dateOfBirthEditEmployee.getValue().getMonthValue());
                                    date.setDay(dateOfBirthEditEmployee.getValue().getDayOfMonth());
                                    employee.setDateOfBirth(date);
                                }
                                if (!nationalIdEditEmployee.getText().isBlank()){
                                    employee.setNationalId(nationalIdEditEmployee.getText());
                                }
                                if (!phoneNumberEditEmployee.getText().isBlank()){
                                    employee.setPhoneNumber(phoneNumberEditEmployee.getText());
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
        University.saveFaculties();

        Employee.loadAllEmployee();
        for (Employee employee : University.allEmployees){
            if (employee.getId().equals(employeeChooserEditEmployee.getValue())){
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
                    Date date = new Date();
                    date.setYear(dateOfBirthEditEmployee.getValue().getYear());
                    date.setMonth(dateOfBirthEditEmployee.getValue().getMonthValue());
                    date.setDay(dateOfBirthEditEmployee.getValue().getDayOfMonth());
                    employee.setDateOfBirth(date);
                }
                if (!nationalIdEditEmployee.getText().isBlank()){
                    employee.setNationalId(nationalIdEditEmployee.getText());
                }
                if (!phoneNumberEditEmployee.getText().isBlank()){
                    employee.setPhoneNumber(phoneNumberEditEmployee.getText());
                }
                System.out.println("successful");
                System.out.println(employee.getFirst_name()+" "+employee.getLast_name());
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
                newLastNameEditEmployee.clear();
                phoneNumberEditEmployee.clear();
                nationalIdEditEmployee.clear();
                dateOfBirthEditEmployee.setValue(null);
                dateOfBirthEditEmployee.setPromptText("Date of Birth");

                break;
            }
        }
        Employee.saveAllEmployee();
    }

    @FXML
    void editFaculty(ActionEvent event) {
        University.loadFaculties();
        for(Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditFaculty.getValue())){
                if (!newFacultyNameEditFaculty.getText().isBlank()){
                    faculty.setFacultyName(newFacultyNameEditFaculty.getText());
                }
                if (!newEstablishmentYearEditFaculty.getText().isBlank()){
                    faculty.setEstablishmentYear(Integer.parseInt(newEstablishmentYearEditFaculty.getText()));
                }
                System.out.println("successful");
                System.out.println(faculty.getFacultyName());
                System.out.println(faculty.getEstablishmentYear());

                facultyChooserEditFaculty.getSelectionModel().selectFirst();
                newFacultyNameEditFaculty.clear();
                newEstablishmentYearEditFaculty.clear();
                break;
            }
        }
        University.saveFaculties();

        facultyChooserEditFaculty.getItems().clear();
        facultyChooserEditFaculty.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            facultyChooserEditFaculty.getItems().add(faculty.getFacultyName());
        }
        facultyChooserEditFaculty.setVisibleRowCount(4);
        facultyChooserEditFaculty.getSelectionModel().selectFirst();
    }

    @FXML
    void editMajor(ActionEvent event) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties){
            if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue())){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentChooserEditMajor.getValue())){
                        for (Major major : department.majors){
                            if (major.getName().equals(majorChooserEditMajor.getValue())){
                                if (!newMajorNameEditMajor.getText().isBlank()){
                                    major.setName(newMajorNameEditMajor.getText());
                                }
                                if (!newEstablishmentYearEditMajor.getText().isBlank()){
                                    major.setEstablishmentYear(Integer.parseInt(newEstablishmentYearEditMajor.getText()));
                                }
                                System.out.println("successful");
                                System.out.println(major.getName());
                                System.out.println(major.getEstablishmentYear());

                                facultyChooserEditMajor.getSelectionModel().selectFirst();
                                departmentChooserEditMajor.getSelectionModel().selectFirst();
                                majorChooserEditMajor.getSelectionModel().selectFirst();
                                newMajorNameEditMajor.clear();
                                newEstablishmentYearEditMajor.clear();
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
    void setDepartmentChooserDeactiveDepartment(ActionEvent event) {
//        if (departmentChooserDeactiveDepartment.getValue().equals("Department")) {
//            deactiveDepartmentButton.setDisable(true);
//        } else {
//            deactiveDepartmentButton.setDisable(false);
//        }
    }

    @FXML
    void setDepartmentChooserEditDepartment(ActionEvent event) {

//        if (departmentChooserEditDepartment.getValue().equals("Department")) {
//            editDepartmentButton.setDisable(true);
//        } else {
//            editDepartmentButton.setDisable(false);
//        }
    }

    @FXML
    void setEmployeeChooserDeactive(ActionEvent event) {
//        if (employeeChooserDeactiveEmployee.getValue().equals("Employee ID")) {
//            deactiveEmployeeButton.setDisable(true);
//        } else {
//            deactiveEmployeeButton.setDisable(false);
//        }
    }

    @FXML
    void setEmployeeChooserEditEmployee(ActionEvent event) {
//        if (employeeChooserEditEmployee.getValue().equals("Employee ID")) {
//            editEmployeeButton.setDisable(true);
//        } else {
//            editEmployeeButton.setDisable(false);
//        }
    }

    @FXML
    void setFacultyChooserDeactiveFaculty(ActionEvent event) {
//        if (facultyChooserDeactiveFaculty.getValue().equals("Faculty")) {
//            deactiveFacultyButton.setDisable(true);
//        } else {
//            deactiveFacultyButton.setDisable(false);
//        }
    }

    @FXML
    void setFacultyChooserEditFaculty(ActionEvent event) {
//        if (facultyChooserEditFaculty.getValue().equals("Faculty")) {
//            editFacultyButton.setDisable(true);
//        } else {
//            editFacultyButton.setDisable(false);
//        }
    }

    @FXML
    void setMajorChooserDeactiveMajor(ActionEvent event) {
//        if (majorChooserDeactiveMajor.getValue().equals("Major")) {
//            deactiveMajorButton.setDisable(true);
//        } else {
//            deactiveMajorButton.setDisable(false);
//        }
    }

    @FXML
    void setMajorChooserEditMajor(ActionEvent event) {
//        if (majorChooserEditMajor.getValue().equals("Major")) {
//            editMajorButton.setDisable(true);
//        } else {
//            editMajorButton.setDisable(false);
//        }
    }

    @FXML
    void setOperationChooserUpdateDepartment(ActionEvent event) {
        if (operationChooserUpdateDepartment.getValue() != null) {
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
                newEstablishmentYearEditDepartment.clear();
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
                    employeeChooserEditEmployee.getItems().add("Employee ID");
                    for (Employee employee : University.allEmployees) {
                        if (employee.getStatus().equals(Status.Active) && employee.getDepartment().equals(departmentChooserEditEmployee.getValue())) {
                            employeeChooserEditEmployee.getItems().add(employee.getId());
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
                newLastNameEditEmployee.clear();
                phoneNumberEditEmployee.clear();
                nationalIdEditEmployee.clear();
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
                    employeeChooserDeactiveEmployee.getItems().add("Employee ID");
                    for (Employee employee : University.allEmployees) {
                        if (employee.getStatus().equals(Status.Active) && employee.getDepartment().equals(departmentChooserDeactiveEmployee.getValue())) {
                            employeeChooserDeactiveEmployee.getItems().add(employee.getId());
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
            if (operationChooserUpdateFaculty.getValue().equals("Edit")) {
                University.loadFaculties();
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
                newEstablishmentYearEditFaculty.clear();
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
            if (operationChooserUpdateMajor.getValue().equals("Edit")){
                University.loadFaculties();
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
                newEstablishmentYearEditMajor.clear();
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }
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
    void enrollmentDashboard(ActionEvent event) {
        // Set the header title
        headerTitle.setText(" --> Update Employee");

        // Hide all anchor panes
        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        enrollmentAnchorPane.setVisible(true);
    }

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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }

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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }
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
        } else if (updateMajorAnchorPane.isVisible()) {
            updateMajorAnchorPane.setVisible(false);
            updateMajorScrollPane.getStyleClass().remove("pressed");
        } else if (addEmployeeAnchorPane.isVisible()) {
            addEmployeeAnchorPane.setVisible(false);
            addEmployeeScrollPane.getStyleClass().remove("pressed");
        } else if (updateEmployeeAnchorPane.isVisible()) {
            updateEmployeeAnchorPane.setVisible(false);
            updateEmployeeScrollPane.getStyleClass().remove("pressed");
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
        }
//        initialize the operation chooser combo box
        operationChooserUpdateMajor.getItems().clear();
        operationChooserUpdateMajor.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateMajor.setVisibleRowCount(3);
        operationChooserUpdateMajor.getSelectionModel().selectFirst();
//        deactivate the edit and deactive vboxs
        editMajorVbox.setVisible(false);
        deactiveMajorVbox.setVisible(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        University.loadFaculties();
//
//        //        ------------------------Operation Chooser-----------------------------
//
//        operationChooserUpdateFaculty.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
//        operationChooserUpdateFaculty.setVisibleRowCount(3);
//
//        operationChooserUpdateDepartment.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
//        operationChooserUpdateDepartment.setVisibleRowCount(3);
//
//        operationChooserUpdateMajor.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
//        operationChooserUpdateMajor.setVisibleRowCount(3);
//
//        operationChooserUpdateEmployee.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
//        operationChooserUpdateEmployee.setVisibleRowCount(3);
//
////        ------------------------Faculty Chooser-----------------------------
//        facultyChooserEditFaculty.getItems().clear();
//        facultyChooserEditFaculty.getItems().add("Faculty");
//        facultyChooserDeactiveFaculty.getItems().clear();
//        facultyChooserDeactiveFaculty.getItems().add("Faculty");
//        facultyChooserAddDepartment.getItems().clear();
//        facultyChooserAddDepartment.getItems().add("Faculty");
//        facultyChooserEditDepartment.getItems().clear();
//        facultyChooserEditDepartment.getItems().add("Faculty");
//        facultyChooserDeactiveDepartment.getItems().clear();
//        facultyChooserDeactiveDepartment.getItems().add("Faculty");
//        facultyChooserAddMajor.getItems().clear();
//        facultyChooserAddMajor.getItems().add("Faculty");
//        facultyChooserEditMajor.getItems().clear();
//        facultyChooserEditMajor.getItems().add("Faculty");
//        facultyChooserDeactiveMajor.getItems().clear();
//        facultyChooserDeactiveMajor.getItems().add("Faculty");
//        facultyChooserAddEmployee.getItems().clear();
//        facultyChooserAddEmployee.getItems().add("Faculty");
//        facultyChooserEditEmployee.getItems().clear();
//        facultyChooserEditEmployee.getItems().add("Faculty");
//        facultyChooserDeactiveEmployee.getItems().clear();
//        facultyChooserDeactiveEmployee.getItems().add("Faculty");
//        for (Faculty faculty : University.allFaculties) {
//            if (faculty.getStatus().equals(Status.Active)){
//                facultyChooserEditFaculty.getItems().add(faculty.getFacultyName());
//                facultyChooserDeactiveFaculty.getItems().add(faculty.getFacultyName());
//                facultyChooserAddDepartment.getItems().add(faculty.getFacultyName());
//                facultyChooserEditDepartment.getItems().add(faculty.getFacultyName());
//                facultyChooserDeactiveDepartment.getItems().add(faculty.getFacultyName());
//                facultyChooserAddMajor.getItems().add(faculty.getFacultyName());
//                facultyChooserEditMajor.getItems().add(faculty.getFacultyName());
//                facultyChooserDeactiveMajor.getItems().add(faculty.getFacultyName());
//                facultyChooserAddEmployee.getItems().add(faculty.getFacultyName());
//                facultyChooserEditEmployee.getItems().add(faculty.getFacultyName());
//                facultyChooserDeactiveEmployee.getItems().add(faculty.getFacultyName());
//            }
//        }
//        facultyChooserEditFaculty.setVisibleRowCount(4);
//        facultyChooserDeactiveFaculty.setVisibleRowCount(4);
//        facultyChooserAddDepartment.setVisibleRowCount(4);
//        facultyChooserEditDepartment.setVisibleRowCount(4);
//        facultyChooserDeactiveDepartment.setVisibleRowCount(4);
//        facultyChooserAddMajor.setVisibleRowCount(4);
//        facultyChooserEditMajor.setVisibleRowCount(4);
//        facultyChooserDeactiveMajor.setVisibleRowCount(4);
//        facultyChooserAddEmployee.setVisibleRowCount(4);
//        facultyChooserEditEmployee.setVisibleRowCount(4);
//        facultyChooserDeactiveEmployee.setVisibleRowCount(4);
//
//        facultyChooserEditFaculty.getSelectionModel().selectFirst();
//        facultyChooserDeactiveFaculty.getSelectionModel().selectFirst();
//        facultyChooserEditDepartment.getSelectionModel().selectFirst();
//        facultyChooserDeactiveDepartment.getSelectionModel().selectFirst();
//        facultyChooserAddMajor.getSelectionModel().selectFirst();
//        facultyChooserEditMajor.getSelectionModel().selectFirst();
//        facultyChooserDeactiveMajor.getSelectionModel().selectFirst();
//        facultyChooserAddEmployee.getSelectionModel().selectFirst();
//        facultyChooserEditEmployee.getSelectionModel().selectFirst();
//        facultyChooserDeactiveEmployee.getSelectionModel().selectFirst();
//
////        ------------------------Department Chooser-----------------------------
//
//        facultyChooserAddMajor.setOnAction(e -> {
//            departmentChooserAddMajor.getItems().clear();
//            departmentChooserAddMajor.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserAddMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserAddMajor.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserAddMajor.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserAddMajor.getSelectionModel().selectFirst();
//        });
//
//        facultyChooserAddEmployee.setOnAction(e -> {
//            departmentChooserAddEmployee.getItems().clear();
//            departmentChooserAddEmployee.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserAddEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserAddEmployee.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserAddEmployee.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserAddEmployee.getSelectionModel().selectFirst();
//        });
//
//        facultyChooserEditDepartment.setOnAction(e -> {
//            departmentChooserEditDepartment.getItems().clear();
//            departmentChooserEditDepartment.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserEditDepartment.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserEditDepartment.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserEditDepartment.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserEditDepartment.getSelectionModel().selectFirst();
//        });
//
//        facultyChooserEditMajor.setOnAction(e -> {
//            departmentChooserEditMajor.getItems().clear();
//            departmentChooserEditMajor.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserEditMajor.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserEditMajor.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserEditMajor.getSelectionModel().selectFirst();
//        });
//
//        facultyChooserEditEmployee.setOnAction(e -> {
//            departmentChooserEditEmployee.getItems().clear();
//            departmentChooserEditEmployee.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserEditEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserEditEmployee.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserEditEmployee.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserEditEmployee.getSelectionModel().selectFirst();
//        });
//
//        facultyChooserDeactiveDepartment.setOnAction(e -> {
//            departmentChooserDeactiveDepartment.getItems().clear();
//            departmentChooserDeactiveDepartment.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserDeactiveDepartment.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserDeactiveDepartment.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserDeactiveDepartment.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserDeactiveDepartment.getSelectionModel().selectFirst();
//        });
//
//        facultyChooserDeactiveMajor.setOnAction(e -> {
//            departmentChooserDeactiveMajor.getItems().clear();
//            departmentChooserDeactiveMajor.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserDeactiveMajor.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserDeactiveMajor.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserDeactiveMajor.getSelectionModel().selectFirst();
//        });
//
//        facultyChooserDeactiveEmployee.setOnAction(e -> {
//            departmentChooserDeactiveEmployee.getItems().clear();
//            departmentChooserDeactiveEmployee.getItems().add("Department");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserDeactiveEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getStatus().equals(Status.Active)){
//                            departmentChooserDeactiveEmployee.getItems().add(department.getName());
//                        }
//                    }
//                    departmentChooserDeactiveEmployee.setVisibleRowCount(4);
//                }
//            }
//        });
//        //        ------------------------Major Chooser-----------------------------
//
//        departmentChooserEditMajor.setOnAction(e -> {
//            majorChooserEditMajor.getItems().clear();
//            majorChooserEditMajor.getItems().add("Major");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getName().equals(departmentChooserEditMajor.getValue()) && department.getStatus().equals(Status.Active)){
//                            for (Major major : department.majors) {
//                                majorChooserEditMajor.getItems().add(major.getName());
//                            }
//                        }
//                    }
//                    majorChooserEditMajor.setVisibleRowCount(4);
//                }
//            }
//        });
//
//        departmentChooserDeactiveMajor.setOnAction(e -> {
//            majorChooserDeactiveMajor.getItems().clear();
//            majorChooserDeactiveMajor.getItems().add("Major");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getName().equals(departmentChooserDeactiveMajor.getValue()) && department.getStatus().equals(Status.Active)){
//                            for (Major major : department.majors) {
//                                majorChooserDeactiveMajor.getItems().add(major.getName());
//                            }
//                        }
//                    }
//                    majorChooserDeactiveMajor.setVisibleRowCount(4);
//                }
//            }
//            departmentChooserDeactiveEmployee.getSelectionModel().selectFirst();
//        });
//
//        //        ------------------------Employee Chooser-----------------------------
//
//        departmentChooserEditEmployee.setOnAction(e -> {
//            employeeChooserEditEmployee.getItems().clear();
//            employeeChooserEditEmployee.getItems().add("Employee ID");
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserEditEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getName().equals(departmentChooserEditEmployee.getValue()) && department.getStatus().equals(Status.Active)){
//                            for (Major major : department.majors) {
//                                employeeChooserEditEmployee.getItems().add(major.getName());
//                            }
//                        }
//                    }
//                    employeeChooserEditEmployee.setVisibleRowCount(4);
//                }
//            }
//            employeeChooserEditEmployee.getSelectionModel().selectFirst();
//        });
//
//        departmentChooserDeactiveEmployee.setOnAction(e -> {
//            employeeChooserDeactiveEmployee.getItems().clear();
//            employeeChooserDeactiveEmployee.getItems().add("Employee ID");
//
//            for (Faculty faculty : University.allFaculties){
//                if (faculty.getFacultyName().equals(facultyChooserDeactiveEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
//                    for (Department department : faculty.departments){
//                        if (department.getName().equals(departmentChooserDeactiveEmployee.getValue()) && department.getStatus().equals(Status.Active)){
//                            for (Major major : department.majors) {
//                                employeeChooserDeactiveEmployee.getItems().add(major.getName());
//                            }
//                        }
//                    }
//                    employeeChooserDeactiveEmployee.setVisibleRowCount(4);
//                }
//            }
//            employeeChooserDeactiveEmployee.getSelectionModel().selectFirst();
//        });
//
//        //        ------------------------Gender Chooser-----------------------------
//
//        genderChooserAddEmployee.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
//        genderChooserAddEmployee.setVisibleRowCount(3);
//
//        genderChooserEditEmployee.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
//        genderChooserEditEmployee.setVisibleRowCount(3);


    }
}
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

import java.io.FileNotFoundException;
import java.io.IOException;
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
        headerTitle.setText(" --> Add New Department");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addDepartmentAnchorPane.setVisible(true);
        addDepartmentScrollPane.getStyleClass().add("pressed");

        facultyChooserAddDepartment.getSelectionModel().selectFirst();
        departmentNameAddDepartment.clear();
        establishmentYearAddDepartment.clear();


    }

    @FXML
    void addDepartmentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add New Department");

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

        facultyChooserAddDepartment.getSelectionModel().selectFirst();
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
        headerTitle.setText(" --> Add New Employee");

        dashboardAnchorPane.setVisible(false);
        addEmployeeAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(true);
        addEmployeeScrollPane.getStyleClass().add("pressed");

        firstNameAddEmployee.clear();
        lastNameAddEmployee.clear();
        nationalIdAddEmployee.clear();
        phoneNumberAddEmployee.clear();
        genderChooserAddEmployee.getSelectionModel().selectFirst();
        facultyChooserAddEmployee.getSelectionModel().selectFirst();
        departmentChooserAddEmployee.getSelectionModel().selectFirst();
        dateOfBirthAddEmployee.setValue(null);
        dateOfBirthAddEmployee.setPromptText("Date of Birth");

    }

    @FXML
    void addEmployeeScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add New Employee");

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

        firstNameAddEmployee.clear();
        lastNameAddEmployee.clear();
        nationalIdAddEmployee.clear();
        phoneNumberAddEmployee.clear();
        genderChooserAddEmployee.getSelectionModel().selectFirst();
        facultyChooserAddEmployee.getSelectionModel().selectFirst();
        departmentChooserAddEmployee.getSelectionModel().selectFirst();
        dateOfBirthAddEmployee.setValue(null);
        dateOfBirthAddEmployee.setPromptText("Date of Birth");
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
        headerTitle.setText(" --> Add New Faculty");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addFacultyAnchorPane.setVisible(true);
        addFacultyScrollPane.getStyleClass().add("pressed");

        facultyNameAddFaculty.clear();
        establishmentYearAddFaculty.clear();

    }

    @FXML
    void addFacultyScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add New Faculty");

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
        headerTitle.setText(" --> Add New Major");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        addMajorAnchorPane.setVisible(true);
        addMajorScrollPane.getStyleClass().add("pressed");

        facultyChooserAddMajor.getSelectionModel().selectFirst();
        departmentChooserAddMajor.getSelectionModel().selectFirst();
        majorNameAddMajor.clear();
        establishmentYearAddMajor.clear();
    }

    @FXML
    void addMajorScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add New Major");

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

        facultyChooserAddMajor.getSelectionModel().selectFirst();
        departmentChooserAddMajor.getSelectionModel().selectFirst();
        majorNameAddMajor.clear();
        establishmentYearAddMajor.clear();

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
                break;
            }
        }
        University.saveFaculties();
        System.out.println("successful");

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

    }

    @FXML
    void setDepartmentChooserEditDepartment(ActionEvent event) {

    }

    @FXML
    void setEmployeeChooserDeactive(ActionEvent event) {

    }

    @FXML
    void setEmployeeChooserEditEmployee(ActionEvent event) {

    }

    @FXML
    void setFacultyChooserDeactiveFaculty(ActionEvent event) {

    }

    @FXML
    void setFacultyChooserEditFaculty(ActionEvent event) {

    }

    @FXML
    void setMajorChooserDeactiveMajor(ActionEvent event) {

    }

    @FXML
    void setMajorChooserEditMajor(ActionEvent event) {

    }

    @FXML
    void setOperationChooserUpdateDepartment(ActionEvent event) {
        if (operationChooserUpdateDepartment.getValue().equals("Edit")){
            editDepartmentVbox.setVisible(true);
            deactiveDepartmentVbox.setVisible(false);
            facultyChooserEditDepartment.getSelectionModel().selectFirst();
            departmentChooserEditDepartment.getSelectionModel().selectFirst();
            newDepartmentNameEditDepartment.clear();
            newEstablishmentYearEditDepartment.clear();
        } else if (operationChooserUpdateDepartment.getValue().equals("Deactive")){
            editDepartmentVbox.setVisible(false);
            deactiveDepartmentVbox.setVisible(true);
            facultyChooserDeactiveDepartment.getSelectionModel().selectFirst();
            departmentChooserDeactiveDepartment.getSelectionModel().selectFirst();
        }
    }

    @FXML
    void setOperationChooserUpdateEmployee(ActionEvent event) {
        if (operationChooserUpdateEmployee.getValue().equals("Edit")){
            editEmployeeVbox.setVisible(true);
            deactiveEmployeeVbox.setVisible(false);
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
        } else if (operationChooserUpdateEmployee.getValue().equals("Deactive")){
            editEmployeeVbox.setVisible(false);
            deactiveEmployeeVbox.setVisible(true);
            facultyChooserDeactiveEmployee.getSelectionModel().selectFirst();
            departmentChooserDeactiveEmployee.getSelectionModel().selectFirst();
            employeeChooserDeactiveEmployee.getSelectionModel().selectFirst();
        }
    }

    @FXML
    void setOperationChooserUpdateFaculty(ActionEvent event) {
        if (operationChooserUpdateFaculty.getValue().equals("Edit")){
            editFacultyVbox.setVisible(true);
            deactiveFacultyVbox.setVisible(false);
            facultyChooserEditFaculty.getSelectionModel().selectFirst();
            newFacultyNameEditFaculty.clear();
            newEstablishmentYearEditFaculty.clear();
        } else if (operationChooserUpdateFaculty.getValue().equals("Deactive")){
            editFacultyVbox.setVisible(false);
            deactiveFacultyVbox.setVisible(true);
            facultyChooserDeactiveFaculty.getSelectionModel().selectFirst();
        }
    }

    @FXML
    void setOperationChooserUpdateMajor(ActionEvent event) {
        if (operationChooserUpdateMajor.getValue().equals("Edit")){
            editMajorVbox.setVisible(true);
            deactiveMajorVbox.setVisible(false);
            facultyChooserEditMajor.getSelectionModel().selectFirst();
            departmentChooserEditMajor.getSelectionModel().selectFirst();
            majorChooserEditMajor.getSelectionModel().selectFirst();
            newMajorNameEditMajor.clear();
            newEstablishmentYearEditMajor.clear();
        } else if (operationChooserUpdateMajor.getValue().equals("Deactive")){
            editMajorVbox.setVisible(false);
            deactiveMajorVbox.setVisible(true);
            facultyChooserDeactiveMajor.getSelectionModel().selectFirst();
            departmentChooserDeactiveMajor.getSelectionModel().selectFirst();
            majorChooserDeactiveMajor.getSelectionModel().selectFirst();
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
        headerTitle.setText(" --> Update Department");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateDepartmentAnchorPane.setVisible(true);
        updateDepartmentScrollPane.getStyleClass().add("pressed");

        operationChooserUpdateDepartment.getSelectionModel().selectFirst();
        editDepartmentVbox.setVisible(false);
        deactiveDepartmentVbox.setVisible(false);
    }

    @FXML
    void updateDepartmentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Department");

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

        operationChooserUpdateDepartment.getSelectionModel().selectFirst();
        editDepartmentVbox.setVisible(false);
        deactiveDepartmentVbox.setVisible(false);
    }

    @FXML
    void updateEmployeeDashboard(ActionEvent event) {
        headerTitle.setText(" --> Update Employee");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateEmployeeAnchorPane.setVisible(true);
        updateEmployeeScrollPane.getStyleClass().add("pressed");

        operationChooserUpdateEmployee.getSelectionModel().selectFirst();
        editEmployeeVbox.setVisible(false);
        deactiveEmployeeVbox.setVisible(false);
    }

    @FXML
    void updateEmployeeScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Employee");

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

        operationChooserUpdateEmployee.getSelectionModel().selectFirst();
        editEmployeeVbox.setVisible(false);
        deactiveEmployeeVbox.setVisible(false);
    }

    @FXML
    void updateFacultyDashboard(ActionEvent event) {
        headerTitle.setText(" --> Update Faculty");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateFacultyAnchorPane.setVisible(true);
        updateFacultyScrollPane.getStyleClass().add("pressed");

        operationChooserUpdateFaculty.getSelectionModel().selectFirst();
        editFacultyVbox.setVisible(false);
        deactiveFacultyVbox.setVisible(false);
    }

    @FXML
    void updateFacultyScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Faculty");

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

        operationChooserUpdateFaculty.getSelectionModel().selectFirst();
        editFacultyVbox.setVisible(false);
        deactiveFacultyVbox.setVisible(false);
    }

    @FXML
    void updateMajorDashboard(ActionEvent event) {
        headerTitle.setText(" --> Update Major");

        dashboardAnchorPane.setVisible(false);
        buttonsScrollPane.setVisible(true);
        updateMajorAnchorPane.setVisible(true);
        updateMajorScrollPane.getStyleClass().add("pressed");

        operationChooserUpdateMajor.getSelectionModel().selectFirst();
        editMajorVbox.setVisible(false);
        deactiveMajorVbox.setVisible(false);
    }

    @FXML
    void updateMajorScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Major");

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

        operationChooserUpdateMajor.getSelectionModel().selectFirst();
        editMajorVbox.setVisible(false);
        deactiveMajorVbox.setVisible(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();


//        ------------------------Faculty Chooser-----------------------------
        facultyChooserEditFaculty.getItems().clear();
        facultyChooserEditFaculty.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserEditFaculty.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserEditFaculty.setVisibleRowCount(4);

        facultyChooserDeactiveFaculty.getItems().clear();
        facultyChooserDeactiveFaculty.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserDeactiveFaculty.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserDeactiveFaculty.setVisibleRowCount(4);

        facultyChooserAddDepartment.getItems().clear();
        facultyChooserAddDepartment.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserAddDepartment.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserAddDepartment.setVisibleRowCount(4);

        facultyChooserEditDepartment.getItems().clear();
        facultyChooserEditDepartment.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserEditDepartment.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserEditDepartment.setVisibleRowCount(4);

        facultyChooserDeactiveDepartment.getItems().clear();
        facultyChooserDeactiveDepartment.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserDeactiveDepartment.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserDeactiveDepartment.setVisibleRowCount(4);

        facultyChooserAddMajor.getItems().clear();
        facultyChooserAddMajor.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserAddMajor.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserAddMajor.setVisibleRowCount(4);

        facultyChooserEditMajor.getItems().clear();
        facultyChooserEditMajor.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserEditMajor.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserEditMajor.setVisibleRowCount(4);


        facultyChooserDeactiveMajor.getItems().clear();
        facultyChooserDeactiveMajor.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserDeactiveMajor.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserDeactiveMajor.setVisibleRowCount(4);

        facultyChooserAddEmployee.getItems().clear();
        facultyChooserAddEmployee.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserAddEmployee.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserAddEmployee.setVisibleRowCount(4);

        facultyChooserEditEmployee.getItems().clear();
        facultyChooserEditEmployee.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserEditEmployee.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserEditEmployee.setVisibleRowCount(4);

        facultyChooserDeactiveEmployee.getItems().clear();
        facultyChooserDeactiveEmployee.getItems().add("Faculty");
        for (Faculty faculty : University.allFaculties) {
            if (faculty.getStatus().equals(Status.Active)){
                facultyChooserDeactiveEmployee.getItems().add(faculty.getFacultyName());
            }
        }
        facultyChooserDeactiveEmployee.setVisibleRowCount(4);

//        ------------------------Department Chooser-----------------------------

        facultyChooserAddMajor.setOnAction(e -> {
            departmentChooserAddMajor.getItems().clear();
            departmentChooserAddMajor.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserAddMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserAddMajor.getItems().add(department.getName());
                        }
                    }
                    departmentChooserAddMajor.setVisibleRowCount(4);
                }
            }
        });

        facultyChooserAddEmployee.setOnAction(e -> {
            departmentChooserAddEmployee.getItems().clear();
            departmentChooserAddEmployee.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserAddEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserAddEmployee.getItems().add(department.getName());
                        }
                    }
                    departmentChooserAddEmployee.setVisibleRowCount(4);
                }
            }
        });

        facultyChooserEditDepartment.setOnAction(e -> {
            departmentChooserEditDepartment.getItems().clear();
            departmentChooserEditDepartment.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditDepartment.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserEditDepartment.getItems().add(department.getName());
                        }
                    }
                    departmentChooserEditDepartment.setVisibleRowCount(4);
                }
            }
        });

        facultyChooserEditMajor.setOnAction(e -> {
            departmentChooserEditMajor.getItems().clear();
            departmentChooserEditMajor.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserEditMajor.getItems().add(department.getName());
                        }
                    }
                    departmentChooserEditMajor.setVisibleRowCount(4);
                }
            }
        });

        facultyChooserEditEmployee.setOnAction(e -> {
            departmentChooserEditEmployee.getItems().clear();
            departmentChooserEditEmployee.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserEditEmployee.getItems().add(department.getName());
                        }
                    }
                    departmentChooserEditEmployee.setVisibleRowCount(4);
                }
            }
        });

        facultyChooserDeactiveDepartment.setOnAction(e -> {
            departmentChooserDeactiveDepartment.getItems().clear();
            departmentChooserDeactiveDepartment.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveDepartment.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserDeactiveDepartment.getItems().add(department.getName());
                        }
                    }
                    departmentChooserDeactiveDepartment.setVisibleRowCount(4);
                }
            }
        });

        facultyChooserDeactiveMajor.setOnAction(e -> {
            departmentChooserDeactiveMajor.getItems().clear();
            departmentChooserDeactiveMajor.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserDeactiveMajor.getItems().add(department.getName());
                        }
                    }
                    departmentChooserDeactiveMajor.setVisibleRowCount(4);
                }
            }
        });

        facultyChooserDeactiveEmployee.setOnAction(e -> {
            departmentChooserDeactiveEmployee.getItems().clear();
            departmentChooserDeactiveEmployee.getItems().add("Department");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getStatus().equals(Status.Active)){
                            departmentChooserDeactiveEmployee.getItems().add(department.getName());
                        }
                    }
                    departmentChooserDeactiveEmployee.setVisibleRowCount(4);
                }
            }
        });
        //        ------------------------Major Chooser-----------------------------

        departmentChooserEditMajor.setOnAction(e -> {
            majorChooserEditMajor.getItems().clear();
            majorChooserEditMajor.getItems().add("Major");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEditMajor.getValue()) && department.getStatus().equals(Status.Active)){
                            for (Major major : department.majors) {
                                majorChooserEditMajor.getItems().add(major.getName());
                            }
                        }
                    }
                    majorChooserEditMajor.setVisibleRowCount(4);
                }
            }
        });

        departmentChooserDeactiveMajor.setOnAction(e -> {
            majorChooserDeactiveMajor.getItems().clear();
            majorChooserDeactiveMajor.getItems().add("Major");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveMajor.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactiveMajor.getValue()) && department.getStatus().equals(Status.Active)){
                            for (Major major : department.majors) {
                                majorChooserDeactiveMajor.getItems().add(major.getName());
                            }
                        }
                    }
                    majorChooserDeactiveMajor.setVisibleRowCount(4);
                }
            }
        });

        //        ------------------------Employee Chooser-----------------------------

        departmentChooserEditEmployee.setOnAction(e -> {
            employeeChooserEditEmployee.getItems().clear();
            employeeChooserEditEmployee.getItems().add("Employee");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserEditEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserEditEmployee.getValue()) && department.getStatus().equals(Status.Active)){
                            for (Major major : department.majors) {
                                employeeChooserEditEmployee.getItems().add(major.getName());
                            }
                        }
                    }
                    employeeChooserEditEmployee.setVisibleRowCount(4);
                }
            }
        });

        departmentChooserDeactiveEmployee.setOnAction(e -> {
            employeeChooserDeactiveEmployee.getItems().clear();
            employeeChooserDeactiveEmployee.getItems().add("Employee");

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(facultyChooserDeactiveEmployee.getValue()) && faculty.getStatus().equals(Status.Active)){
                    for (Department department : faculty.departments){
                        if (department.getName().equals(departmentChooserDeactiveEmployee.getValue()) && department.getStatus().equals(Status.Active)){
                            for (Major major : department.majors) {
                                employeeChooserDeactiveEmployee.getItems().add(major.getName());
                            }
                        }
                    }
                    employeeChooserDeactiveEmployee.setVisibleRowCount(4);
                }
            }
        });

        //        ------------------------Gender Chooser-----------------------------

        genderChooserAddEmployee.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
        genderChooserAddEmployee.setVisibleRowCount(3);

        genderChooserEditEmployee.getItems().addAll("Gender", Gender.Male.toString(), Gender.Female.toString());
        genderChooserEditEmployee.setVisibleRowCount(3);

        //        ------------------------Operation Chooser-----------------------------

        operationChooserUpdateFaculty.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateFaculty.setVisibleRowCount(3);

        operationChooserUpdateDepartment.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateDepartment.setVisibleRowCount(3);

        operationChooserUpdateMajor.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateMajor.setVisibleRowCount(3);

        operationChooserUpdateEmployee.getItems().addAll("Choose Your Operation: ", "Edit", "Deactive");
        operationChooserUpdateEmployee.setVisibleRowCount(3);

    }
}
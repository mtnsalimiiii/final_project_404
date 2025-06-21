package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AddMajorAdminPortalController implements Initializable {


    @FXML
    private VBox containerBarVBox;

    @FXML
    private ComboBox<String> departmentChooserAddMajorAdmin;

    @FXML
    private ComboBox<String> facultyChooserAddMajorAdmin;

    @FXML
    private HBox headerHBox;

    @FXML
    private TextField establishmentYearAddMajorAdmin;

    @FXML
    private TextField majorNameAddMajorAdmin;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    void addDepartmentAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportsAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root, 350, 480);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateDepartmentAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 530);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateMajorAdminPortal.fxml"));
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public int getMajorId(String facultyName, String departmentName) throws FileNotFoundException {

        int id = 0;
        for (Faculty faculty : University.allFaculties){
            if(faculty.getFacultyName().equals(facultyName)){
                for (Department department : faculty.departments){
                    if (department.getName().equals(departmentName)){
                        id = department.majors.size()+1;
                    }
                }
                break;
            }
        }
        return id;


//        Faculty faculty = Faculty.loadFromFile(facultyName);
//        if (faculty == null) {
//            System.err.println("Faculty not found: " + facultyName);
//            return -1;
//        }
//
//        if (!faculty.getDepartmentNames().contains(departmentName)) {
//            System.err.println("Department not found in faculty: " + departmentName);
//            return -1;
//        }
//
//        Department department = Department.loadFromFile(departmentName);
//        if (department == null) {
//            System.err.println("Department file not found: " + departmentName);
//            return -1;
//        }
//
//        return department.majors.size() + 1;

    }

//    public int getPublishYear(){
//        return LocalDate.now().getYear();
//    }

    public void addNewMajor(ActionEvent event) throws FileNotFoundException {
        University.loadFaculties();

        String facultyName = facultyChooserAddMajorAdmin.getValue().trim();
        String departmentName = departmentChooserAddMajorAdmin.getValue().trim();
        String nameMajor = majorNameAddMajorAdmin.getText();
        int establishmentYear = Integer.parseInt(establishmentYearAddMajorAdmin.getText());
        int majorId = getMajorId(facultyName, departmentName);

        if (facultyName == null || departmentName == null || nameMajor.isEmpty()) {
            System.out.println("Please enter all fields.");
            return;
        }

        Major newMajor = new Major(nameMajor, majorId, establishmentYear);


        if (newMajor != null){
            for (Faculty faculty1 : University.allFaculties){
                if (faculty1.getFacultyName().equals(facultyName)){
                    for (Department department1 : faculty1.departments){
                        if (department1.getName().equals(departmentName)){
                            if (!department1.majors.contains(newMajor)){
                                department1.majors.add(newMajor);
                            }
                        }
                    }
                }
            }
            University.saveFaculties();
        }


//        Faculty fac = Faculty.loadFromFile(facultyName);
//        if (fac == null) {
//            System.out.println("دانشکده یافت نشد: " + facultyName);
//            return;
//        }
//
//        Department dep = Department.loadFromFile(departmentName);
//        if (dep == null) {
//            System.out.println("دپارتمان یافت نشد: " + departmentName);
//            return;
//        }
//
//        Major newMajor = new Major(nameMajor, majorId, establishmentYear);
//        dep.majors.add(newMajor);
//        dep.saveToFile();
//        fac.saveToFile();
        System.out.println("faculty: " + facultyName);
        System.out.println("department: " + departmentName);
        System.out.println("majorName: " + nameMajor);
        System.out.println("publish year: " + establishmentYear);
        System.out.println("major id: " + majorId);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            facultyChooserAddMajorAdmin.getItems().add(faculty.getFacultyName());
        }
        facultyChooserAddMajorAdmin.setVisibleRowCount(4);

        facultyChooserAddMajorAdmin.setOnAction(e -> {
            String selectedFaculty = facultyChooserAddMajorAdmin.getValue();
            departmentChooserAddMajorAdmin.getItems().clear(); // پاک کردن آیتم‌های قبلی
            departmentChooserAddMajorAdmin.setPromptText("Department");

//            Faculty faculty = null;
//            try {
//                faculty = Faculty.loadFromFile(selectedFaculty);
//            } catch (FileNotFoundException ex) {
//                throw new RuntimeException(ex);
//            }

            for (Faculty faculty : University.allFaculties){
                if (faculty.getFacultyName().equals(selectedFaculty)){
                    for (Department department : faculty.departments){
                        departmentChooserAddMajorAdmin.getItems().add(department.getName());
                    }
                    departmentChooserAddMajorAdmin.setVisibleRowCount(4);
                }
            }

        });
    }
}

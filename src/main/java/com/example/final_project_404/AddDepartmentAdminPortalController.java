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

public class AddDepartmentAdminPortalController implements Initializable {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private TextField departmentNameAddDepartmentAdmin;

    @FXML
    private ComboBox<String> facultyChooserAddDepartmentAdmin;

    @FXML
    private HBox headerHBox;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private TextField establishmentYearAddDepartmentAdmin;


    @FXML
    void addEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void addMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddMajorAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Add New Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void dashboardAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void reportsAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportsAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateDepartmentAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateDepartmentAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Department");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateEmployeeAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateEmployeeAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Employee");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateFacultyAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateFacultyAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Faculty");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void updateMajorAdminPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UpdateMajorAdminPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Update Major");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

//    public int getEstablishmentYear(){
//        return LocalDate.now().getYear();
//    }

    public String getDepartmentId(String facultyName) throws FileNotFoundException {
        String id = "";
        for (Faculty faculty : University.allFaculties){
            if(faculty.getFacultyName().equals(facultyName)){
                if(faculty.departments.size()<9)
                    id= faculty.getId()+0+(faculty.departments.size()+1);
                else
                    id = faculty.getId()+(faculty.departments.size()+1);
                break;
            }
        }
        return id;
    }

    public void addNewDepartment(ActionEvent event) throws IOException {
        University.loadFaculties();

        String facultyName = facultyChooserAddDepartmentAdmin.getValue().trim();
        String departmentName = departmentNameAddDepartmentAdmin.getText().trim();
        //int establishmentYear = getEstablishmentYear();
        int establishmentYear = Integer.parseInt(establishmentYearAddDepartmentAdmin.getText());
        String departmentId = getDepartmentId(facultyName);

        if (!departmentName.isBlank() && !establishmentYearAddDepartmentAdmin.getText().isBlank()) {
            Department department = new Department(departmentName, establishmentYear, departmentId);
            for (Faculty faculty : University.allFaculties) {
                if (faculty.getFacultyName().equals(facultyName)) {
                    if (!faculty.departments.contains(department)) {
                        faculty.departments.add(department);
                    } else {
                        System.out.println("This Department has registered earlier!");
                    }
                    break;
                }
            }
            University.saveFaculties();

            System.out.println("faculty: " + facultyName);
            System.out.println("name: " + departmentName);
            System.out.println("year: " + establishmentYear);
            System.out.println("id: " + departmentId);

            Parent root = FXMLLoader.load(getClass().getResource("AddDepartmentAdminPortal.fxml"));
            Scene scene = new Scene(root, 800, 500);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Add New Department");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else {
            System.out.println("please Fill All Fields!!");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        University.loadFaculties();
        for (Faculty faculty : University.allFaculties) {
            facultyChooserAddDepartmentAdmin.getItems().add(faculty.getFacultyName());
        }
        facultyChooserAddDepartmentAdmin.setVisibleRowCount(4);
    }
}

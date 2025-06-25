package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPanelController implements Initializable{


    @FXML
    private TextField usernameLoginPanel;

    @FXML
    private PasswordField passwordLoginPanel;

    @FXML
    private ComboBox<String> roleChooserLoginPanel;


    @Override
    public void initialize(URL location, ResourceBundle resources){
        roleChooserLoginPanel.getItems().addAll("ADMIN", "PROFESSOR", "STUDENT", "EMPLOYEE");
        roleChooserLoginPanel.setVisibleRowCount(4);
    }

    public static Employee employeePerson;
    public static Professor professorPerson;
    public static Student studentPerson;

    @FXML
    public void signInLoginPanel(ActionEvent actionEvent) throws Exception {
        String username = usernameLoginPanel.getText().trim();
        String password = passwordLoginPanel.getText().trim();
        String role = roleChooserLoginPanel.getValue();

        System.out.println("role: " + role);
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        if (role == null) {
            System.out.println("The role has not been determined.");
            return;
        }

        switch (role.toLowerCase()) {
            case "student":
                Student.loadAllStudents();
                for (Student student : University.allStudents) {
                    if (student.getId().equals(username) && student.getNationalId().equals(password)) {
                        studentPerson = student;
                        System.out.println("Successfull login"  + student.getFirst_name());
                        Parent root = FXMLLoader.load(getClass().getResource("StudentPortal.fxml"));
                        Scene scene = new Scene(root, 800, 500);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Student Portal");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.show();
                    } else {
                        System.out.println("The username or password is incorrect!!");
                    }
                }
                System.out.println("The username not found!!");
                break;
            case "professor":
                Professor.loadAllProfessor();
                for (Professor professor : University.allProfessors) {
                    if (professor.getId().equals(username) && professor.getNationalId().equals(password)) {
                        professorPerson = professor;
                        System.out.println("Successfull login " + professor.getFirst_name());
                        Parent root = FXMLLoader.load(getClass().getResource("ProfessorPortal.fxml"));
                        Scene scene = new Scene(root, 800, 500);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Professor Portal");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.show();
                    } else {
                        System.out.println("The username or password is incorrect!!");
                    }
                }
                System.out.println("The username not found!!");

                break;
            case "admin":
                if ("admin".equals(username) && "admin404".equals(password)){
                    Parent root = FXMLLoader.load(getClass().getResource("AdminPortal.fxml"));
                    Scene scene = new Scene(root, 800, 500);
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    stage.setTitle("Admin Portal");
                    stage.setScene(scene);
                    stage.setResizable(false);
                    stage.show();
                } else{
                    System.out.println("The username or password is incorrect.");
                }
                break;
            case "employee":
                Employee.loadAllEmployee();
                for (Employee employee : University.allEmployees) {
                    if (employee.getId().equals(username) && employee.getNationalId().equals(password)) {
                        employeePerson = employee;
                        System.out.println("Successfull login " + employee.getFirst_name());
                        Parent root = FXMLLoader.load(getClass().getResource("EmployeePortal.fxml"));
                        Scene scene = new Scene(root, 800, 500);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Employee Portal");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.show();

                    } else {
                        System.out.println("The username or password is incorrect.");
                    }
                }
                System.out.println("The username not found!!");
                break;
        }
    }
}
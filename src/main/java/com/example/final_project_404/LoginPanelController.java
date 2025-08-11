package com.example.final_project_404;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPanelController{


    @FXML
    private TextField usernameLoginPanel;

    @FXML
    private ImageView userIcon;

    @FXML
    private ImageView passwordIcon;

    @FXML
    private Label titleLabel;

    @FXML
    private PasswordField passwordLoginPanel;

    @FXML
    private ComboBox<String> roleChooserLoginPanel;

    private RotateTransition rotateInTransition;
    private RotateTransition rotateOutTransition;
    private boolean isRotating = false;

    private ScaleTransition scaleUpTransition;
    private ScaleTransition scaleDownTransition;

    @FXML
    public void initialize(/*URL location, ResourceBundle resources*/){
        roleChooserLoginPanel.getItems().addAll("ADMIN", "PROFESSOR", "STUDENT", "EMPLOYEE");
        roleChooserLoginPanel.setVisibleRowCount(4);
        rotateInTransition = new RotateTransition(Duration.millis(500), null);
        rotateInTransition.setByAngle(360);
        rotateInTransition.setOnFinished(event -> isRotating = false);

        rotateOutTransition = new RotateTransition(Duration.millis(500), null);
        rotateOutTransition.setByAngle(-360);
        rotateOutTransition.setOnFinished(event -> isRotating = false);

        // ایجاد انیمیشن‌های بزرگ شدن و کوچک شدن
        scaleUpTransition = new ScaleTransition(Duration.millis(200), titleLabel);
        scaleUpTransition.setToX(1.2);
        scaleUpTransition.setToY(1.2);

        scaleDownTransition = new ScaleTransition(Duration.millis(200), titleLabel);
        scaleDownTransition.setToX(1);
        scaleDownTransition.setToY(1);

        // اضافه کردن EventHandler برای رویداد‌های MouseEntered و MouseExited
        userIcon.setOnMouseEntered(event -> handleMouseEntered(userIcon));
        userIcon.setOnMouseExited(event -> handleMouseExited(userIcon));
        passwordIcon.setOnMouseEntered(event -> handleMouseEntered(passwordIcon));
        passwordIcon.setOnMouseExited(event -> handleMouseExited(passwordIcon));

    }

    private void handleMouseEntered(ImageView icon) {
        if (!isRotating) {
            isRotating = true;
            rotateInTransition.setNode(icon);
            rotateInTransition.playFromStart();
        }
    }

    private void handleMouseExited(ImageView icon) {
        if (!isRotating) {
            isRotating = true;
            rotateOutTransition.setNode(icon);
            rotateOutTransition.playFromStart();
        }
    }

    @FXML
    private void handleTitleEntered() {
        scaleUpTransition.playFromStart();
    }

    @FXML
    private void handleTitleExited() {
        scaleDownTransition.playFromStart();
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
                    if (student.getId().equals(username) && student.getNationalId().equals(password) && student.getStatus().equals(Status.Active)) {
                        studentPerson = student;
                        System.out.println("Successfull login "  + student.getFirst_name());
                        Parent root = FXMLLoader.load(getClass().getResource("StudentPortal.fxml"));
                        Scene scene = new Scene(root);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Student Portal");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.show();
                    } else {
                        System.out.println("The username or password is incorrect!!");
                    }
                }
//                System.out.println("The username not found!!");
                break;
            case "professor":
                Professor.loadAllProfessor();
                for (Professor professor : University.allProfessors) {
                    if (professor.getId().equals(username) && professor.getNationalId().equals(password) && professor.getStatus().equals(Status.Active)) {
                        professorPerson = professor;
                        System.out.println("Successfull login " + professor.getFirst_name());
                        Parent root = FXMLLoader.load(getClass().getResource("ProfessorPortal.fxml"));
                        Scene scene = new Scene(root);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Professor Portal");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.show();
                    } else {
                        System.out.println("The username or password is incorrect!!");
                    }
                }
//                System.out.println("The username not found!!");
                break;
            case "admin":
                if ("admin".equals(username) && "admin404".equals(password)){
                    Parent root = FXMLLoader.load(getClass().getResource("AdminPortal1.fxml"));
                    Scene scene = new Scene(root);
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
                    if (employee.getId().equals(username) && employee.getNationalId().equals(password) && employee.getStatus().equals(Status.Active)) {
                        employeePerson = employee;
                        System.out.println("Successfull login " + employee.getFirst_name());
                        Parent root = FXMLLoader.load(getClass().getResource("EmployeePortal1.fxml"));
                        Scene scene = new Scene(root);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Employee Portal");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.show();

                    } else {
                        System.out.println("The username or password is incorrect.");
                    }
                }
//                System.out.println("The username not found!!");
                break;
        }
    }
}
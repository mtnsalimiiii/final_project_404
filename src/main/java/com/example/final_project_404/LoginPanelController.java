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

    private String role;  // نقشی که از صفحه قبلی گرفته میشه


    @Override
    public void initialize(URL location, ResourceBundle resources){
        roleChooserLoginPanel.getItems().addAll("admin", "professor", "student", "employee");
        roleChooserLoginPanel.setVisibleRowCount(5);

        roleChooserLoginPanel.setOnAction(event -> {
            this.role = roleChooserLoginPanel.getSelectionModel().getSelectedItem().toString();
        });

    }
    @FXML
    public void signInLoginPanel(ActionEvent actionEvent) throws Exception {
        String username = usernameLoginPanel.getText().trim();
        String password = passwordLoginPanel.getText().trim();

        System.out.println("role: " + role);
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        if (role == null) {
            System.out.println("The role has not been determined.");
            return;
        }

        switch (role.toLowerCase()) {
            case "student":
                         Student.loadStudents();

                boolean found = false;
                for (Student student : University.allStudents) {
                    if (student.getId().equals(username) && student.getNationalId().equals(password)) {
                        System.out.println("Successfull login"  + student.getFirst_name());
                        found = true;
                        //student panel
                        break;
                    }
                }

                if (!found) {
                    System.out.println("The username or password is incorrect.");
                }
                break;
            case "teacher":
                Teacher.loadTeacher();
                boolean found2 = false;
                for (Teacher teacher : University.allTeachers) {
                    if (teacher.getId().equals(username) && teacher.getNationalId().equals(password)) {
                        System.out.println("Successfull login " + teacher.getFirst_name());
                        found2 = true;
                        //Teacherpanel
                        break;
                    }
                }

                if (!found2) {
                    System.out.println("The username or password is incorrect.");
                }
                break;
            case "admin":
                if ("admin".equals(username) && "admin404".equals(password)){
                    System.out.println("Successfull login for admin ");
                    //admin panel.
                    break;
                }
                else{
                    System.out.println("The username or password is incorrect.");
                }
            case "employee":
                Employee.loadAllEmployee();
                boolean found3 = false;
                for (Employee employee : University.allEmployees) {
                    if (employee.getId().equals(username) && employee.getNationalId().equals(password)) {
                        System.out.println("Successfull login " + employee.getFirst_name());
                        found3 = true;
                        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMainPagePortal.fxml"));
                        Scene scene = new Scene(root, 400, 555);
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setTitle("Employee Portal");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.show();

                        break;
                    }
                }

                if (!found3) {
                    System.out.println("The username or password is incorrect.");
                }
                break;

        }
    }
}
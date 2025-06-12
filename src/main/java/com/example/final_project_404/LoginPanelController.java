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
    @FXML

    private String role;  // نقشی که از صفحه قبلی گرفته میشه


    @Override
    public void initialize(URL location, ResourceBundle resources){
        String[] items = {"admin", "professor", "student", "employee"};
        roleChooserLoginPanel.getItems().addAll(items);

        roleChooserLoginPanel.setOnAction(event -> {
            this.role = roleChooserLoginPanel.getSelectionModel().getSelectedItem().toString();
        });

    }
    @FXML
    public void signInLoginPanel(ActionEvent actionEvent) {
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
                Student.loadStudents(); // بارگذاری از فایل

                boolean found = false;
                for (Student student : Student.allStudents) {
                    if (student.getId().equals(username) && student.getNationalId().equals(password)) {
                        System.out.println("ورود موفق برای دانشجو: " + student.getFirst_name());
                        found = true;
                        // اینجا می‌تونی بروی به پنل دانشجویی
                        break;
                    }
                }

                if (!found) {
                    System.out.println("نام‌کاربری یا رمز اشتباه است.");
                }
                break;

            default:
                System.out.println("ورود برای نقش " + role + " هنوز پیاده‌سازی نشده.");
        }
    }
}

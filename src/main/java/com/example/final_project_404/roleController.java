package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class roleController {

    @FXML
    private Button studentButton;

    @FXML
    private Button teacherButton;

    @FXML
    private Button adminButton;

    @FXML
    private Button employeeButton;

    private void goToLogin(ActionEvent event, String role) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPanel.fxml"));
            Parent root = loader.load();

            // گرفتن کنترلر و ارسال نقش
            LoginPanel loginController = loader.getController();
            loginController.setRole(role);

            // باز کردن صحنه جدید
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleStudent(ActionEvent event) {
        goToLogin(event, "student");
    }

    @FXML
    private void handleTeacher(ActionEvent event) {
        goToLogin(event, "teacher");
    }

    @FXML
    private void handleAdmin(ActionEvent event) {
        goToLogin(event, "admin");
    }

    @FXML
    private void handleEmployee(ActionEvent event) {
        goToLogin(event, "employee");
    }
}

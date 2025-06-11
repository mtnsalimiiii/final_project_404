package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;




public class LoginPanel {
    @FXML
    public TextField usernameLoginPanel;
    @FXML
    public PasswordField passwordLoginPanel;

    @FXML
    public void signInLoginButton(ActionEvent actionEvent) {
        System.out.println(usernameLoginPanel.getText());
        System.out.println(passwordLoginPanel.getText());
    }
}

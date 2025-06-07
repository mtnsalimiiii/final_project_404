package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class test {


    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private PasswordField passwordFieldLogin;

    @FXML
    private TextField usernameFieldLogin;

    @FXML
    private void initialize(){
        System.out.println("fuck you abdol");

    }

    @FXML
    void checkLogin(ActionEvent event) {
        label.setText(usernameFieldLogin.getText());
    }

}

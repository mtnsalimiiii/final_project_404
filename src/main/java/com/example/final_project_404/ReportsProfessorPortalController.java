package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportsProfessorPortalController {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private HBox headerHBox;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    void dashboardProfessorPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfessorPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Professor Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void profileProfessorPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileProfessorPortal.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutProfessorPortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}

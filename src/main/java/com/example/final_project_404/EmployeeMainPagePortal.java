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

public class EmployeeMainPagePortal {

    @FXML
    private VBox containerBarVBox;

    @FXML
    private HBox headerHBox;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    void RegisterNewProfessorEmployeePortal(ActionEvent event) {

    }

    @FXML
    void RegisterNewStudentEmployeePortal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterStudent.fxml"));
        Scene scene = new Scene(root, 400, 555);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Employee Portal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void dashboardEmployeePortal(ActionEvent event) {

    }

    @FXML
    void professorEmployeePortal(ActionEvent event) {

    }

    @FXML
    void profileEmployeePortal(ActionEvent event) {

    }

    @FXML
    void reportsEmployeePortal(ActionEvent event) {

    }

    @FXML
    void settingsEmployeePortal(ActionEvent event) {

    }

    @FXML
    void studentsEmpoyeePortal(ActionEvent event) {

    }

}

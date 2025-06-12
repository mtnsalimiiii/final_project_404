package com.example.final_project_404;
import java.io.Serializable;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ResourceBundle;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    /*public static void mainPageTeacher(Stage primaryStage){
        AnchorPane mainPane = new AnchorPane();
        mainPane.setId("mainPane"); // For CSS targeting

        // Header
        HBox header = new HBox();
        header.getStyleClass().add("header");
        Label title = new Label("Dashboard");
        title.getStyleClass().add("header-title");
        header.getChildren().add(title);

        // Navigation
        HBox navBar = new HBox(10);
        Button homeBtn = new Button("Home");
        homeBtn.getStyleClass().addAll("nav-button", "active"); // Active button
        Button profileBtn = new Button("Profile");
        profileBtn.getStyleClass().add("nav-button");
        Button settingsBtn = new Button("Settings");
        settingsBtn.getStyleClass().add("nav-button");
        navBar.getChildren().addAll(homeBtn, profileBtn, settingsBtn);

        // Content
        VBox content = new VBox(20);
        content.getStyleClass().add("content-box");
        content.getChildren().addAll(
                new Label("Welcome back, User!"),
                new ProgressBar(0.7),
                new Button("View Reports")
        );

        // Footer
        Label footer = new Label("© 2023 MyApp v1.0");
        footer.getStyleClass().add("footer");

        // Layout (AnchorPane constraints)
        AnchorPane.setTopAnchor(header, 0.0);
        AnchorPane.setLeftAnchor(header, 0.0);
        AnchorPane.setRightAnchor(header, 0.0);

        AnchorPane.setTopAnchor(navBar, 60.0);
        AnchorPane.setLeftAnchor(navBar, 15.0);

        AnchorPane.setTopAnchor(content, 120.0);
        AnchorPane.setLeftAnchor(content, 15.0);
        AnchorPane.setRightAnchor(content, 15.0);
        AnchorPane.setBottomAnchor(content, 40.0);

        AnchorPane.setBottomAnchor(footer, 0.0);
        AnchorPane.setLeftAnchor(footer, 0.0);
        AnchorPane.setRightAnchor(footer, 0.0);

        mainPane.getChildren().addAll(header, navBar, content, footer);

        // Scene setup
        Scene scene = new Scene(mainPane, 800, 600);
        scene.getStylesheets().add(Main.class.getResource("mainPageTeacherStyle.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Teacher Panel");
        primaryStage.show();
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image ikiuIcon = new Image("ikiu.png");
        primaryStage.getIcons().add(ikiuIcon);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("role.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 555);
        scene.getStylesheets().add(getClass().getResource("roleStyle.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Panel");
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}
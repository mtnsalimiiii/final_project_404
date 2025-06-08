package com.example.final_project_404;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    public static boolean loginPanel(Stage primaryStage){
        AnchorPane loginPane = new AnchorPane();// make an anchorpane for login page
        loginPane.setId("loginPane"); // Assign ID for CSS

        Label titleLabel = new Label("Login"); // make a label for login title
        titleLabel.getStyleClass().add("login-title"); // set the css style

        TextField usernameField = new TextField(); //make a textfield for username
        usernameField.getStyleClass().add("login-field"); // set the css style
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField(); // make a passwordfield for password
        passwordField.getStyleClass().add("login-field"); // set the css style
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Sign In"); //make a button for sign in button
        loginButton.getStyleClass().add("login-button"); // set the css style

        Label errorLabel = new Label();
        errorLabel.getStyleClass().add("error-message"); // set the css style

        // Layout (using AnchorPane constraints)
        AnchorPane.setTopAnchor(titleLabel, 30.0);
        AnchorPane.setLeftAnchor(titleLabel, 20.0);
        // Layout usernameField
        AnchorPane.setTopAnchor(usernameField, 100.0);
        AnchorPane.setLeftAnchor(usernameField, 20.0);
        AnchorPane.setRightAnchor(usernameField, 20.0);
        // Layout passwordField
        AnchorPane.setTopAnchor(passwordField, 150.0);
        AnchorPane.setLeftAnchor(passwordField, 20.0);
        AnchorPane.setRightAnchor(passwordField, 20.0);
        // Layout loginButton
        AnchorPane.setTopAnchor(loginButton, 220.0);
        AnchorPane.setLeftAnchor(loginButton, 20.0);
        // Layout errorLabel
        AnchorPane.setTopAnchor(errorLabel, 260.0);
        AnchorPane.setLeftAnchor(errorLabel, 20.0);
        // add scene graph to the scene
        loginPane.getChildren().addAll(titleLabel, usernameField, passwordField, loginButton, errorLabel);

        // Scene setup
        Scene scene = new Scene(loginPane, 350, 350);
        scene.getStylesheets().add(Main.class.getResource("loginPanel.css").toExternalForm()); // Load CSS

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Panel"); // panel title
        primaryStage.show();

        return true;

    }

    public static void mainPageTeacher(Stage primaryStage){
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
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Image ikiuIcon = new Image("ikiu.png");
        primaryStage.getIcons().add(ikiuIcon);
        //boolean checkLogin = loginPanel(primaryStage);
        mainPageTeacher(primaryStage);
    }
}
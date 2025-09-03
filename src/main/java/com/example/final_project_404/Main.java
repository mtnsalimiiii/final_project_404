package com.example.final_project_404;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Image ikiuIcon = new Image("ikiu.png");
        primaryStage.getIcons().add(ikiuIcon);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginPanel.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login panel");
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}

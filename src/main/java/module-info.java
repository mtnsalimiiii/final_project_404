module com.example.final_project_404 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.nio.mapmode;


    opens com.example.final_project_404 to javafx.fxml;
    exports com.example.final_project_404;
}
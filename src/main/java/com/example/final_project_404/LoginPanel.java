package com.example.final_project_404;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPanel{

    @FXML
    private TextField usernameLoginPanel;

    @FXML
    private PasswordField passwordLoginPanel;

    private String role;  // نقشی که از صفحه قبلی گرفته میشه

    public void setRole(String role) {
        this.role = role;
        System.out.println("نقش دریافت‌شده: " + role);
    }

    @FXML
    private void signInLoginButton() {
        String username = usernameLoginPanel.getText().trim();
        String password = passwordLoginPanel.getText().trim();

        System.out.println("ورود برای نقش: " + role);
        System.out.println("نام‌کاربری: " + username);
        System.out.println("رمز: " + password);

        if (role == null) {
            System.out.println("نقش تعیین نشده است.");
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

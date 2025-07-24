package com.example.final_project_404;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class EnrollStudentController {
    @FXML
    private ComboBox<String> semesterComboBox;

    @FXML
    private TableView<Course> coursesTableView; // جدول نمایش دروس

    @FXML
    private TableColumn<Course, Boolean> selectCol; // ستون انتخاب درس

    @FXML
    private TableColumn<Course, String> courseCodeCol; // ستون کد درس

    @FXML
    private TableColumn<Course, String> courseNameCol; // ستون نام درس

    @FXML
    private TableColumn<Course, Integer> creditsCol; // ستون تعداد واحد

    @FXML
    private TableColumn<Course, String> scheduleCol; // ستون زمان برگزاری

    @FXML
    private Label totalCreditsLabel; // نمایش مجموع واحدهای انتخاب شده

    @FXML
    private Label messageLabel; // نمایش پیام‌های سیستم

    // لیست دروس قابل نمایش
    private ObservableList<CourseGroup> availableCourses = FXCollections.observableArrayList();


    @FXML
    public void initialize() {
        University.loadAllSemester();
        for(Semester semester:University.allSemesters){
            if(semester.getStatus()==Status.Active){
                semesterComboBox.getItems().add(semester.getName());
            }
        }
        semesterComboBox.setVisibleRowCount(4);
    }
    private void setupCoursesTable() {
        // تنظیم ستون‌ها
        selectCol.setCellValueFactory(new PropertyValueFactory<>("selected"));
        selectCol.setCellFactory(CheckBoxTableCell.forTableColumn(selectCol));

        courseCodeCol.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        courseNameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        creditsCol.setCellValueFactory(new PropertyValueFactory<>("credits"));
        scheduleCol.setCellValueFactory(new PropertyValueFactory<>("schedule"));

        // اضافه کردن listener برای تغییرات انتخاب دروس
        coursesTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            updateTotalCredits();
        });
    }

    @FXML
    private void searchCourses() {
        University.loadFaculties();
        availableCourses.clear();
        for(Faculty faculty:University.allFaculties){
            if(faculty.getFacultyName()==LoginPanelController.studentPerson.getFaculty()){
                for (Department department:faculty.departments){
                    if (department.getName()==LoginPanelController.studentPerson.getDepartment()){
                        for (Major major:department.majors){
                            if (major.getName()==LoginPanelController.studentPerson.getMajor()){
                                for(Degree degree: major.degrees){
                                    if(degree.getClass().getName()==LoginPanelController.studentPerson.getDegree()){
                                        for (Course course:degree.courses){
                                            for (CourseGroup courseGroup:course.courseGroups){
                                                if(courseGroup.getStatus()==Status.Active){
                                                    availableCourses.add(courseGroup);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }



}

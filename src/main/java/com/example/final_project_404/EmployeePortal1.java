package com.example.final_project_404;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EmployeePortal1 implements Initializable {

    @FXML
    private Button AddCourseGroupButton;

    @FXML
    private AnchorPane StudentsAnchorPane;

    @FXML
    private AnchorPane addCourseAnchorPane;

    @FXML
    private Button addCourseButton;

    @FXML
    private AnchorPane addCourseGroupAnchorPane;

    @FXML
    private Button addCourseGroupScrollPane;

    @FXML
    private Button addCourseScrollPane;

    @FXML
    private VBox addDegree;

    @FXML
    private AnchorPane addDegreeAnchorPane;

    @FXML
    private Button addDegreeButton;

    @FXML
    private Button addDegreeScrollPane;

    @FXML
    private Button addProfessorButton;

    @FXML
    private Button addStudentButton;

    @FXML
    private TableColumn<?, ?> ageTableviewProfessors;

    @FXML
    private TableColumn<?, ?> ageTableviewStudents;

    @FXML
    private ScrollPane buttonsScrollPane;

    @FXML
    private TextField capacityAddCourseGroup;

    @FXML
    private ComboBox<?> courseChooserAddCourseGroup;

    @FXML
    private TextField courseCreditAddCourse;

    @FXML
    private TextField courseNameAddCourse;

    @FXML
    private AnchorPane dashboardAnchorPane;

    @FXML
    private Button dashboardScrollPane;

    @FXML
    private Label dashboardText;

    @FXML
    private DatePicker dateOfBirthEditProfessor;

    @FXML
    private DatePicker dateOfBirthEditStudents;

    @FXML
    private DatePicker dateOfBirthRegisterProfessor;

    @FXML
    private DatePicker dateOfBirthRegisterStudent;

    @FXML
    private TableColumn<?, ?> dateOfJoinTableviewProfessors;

    @FXML
    private TableColumn<?, ?> dateOfJoinTableviewStudents;

    @FXML
    private Button deactiveProfessorButton;

    @FXML
    private VBox deactiveProfessorVbox;

    @FXML
    private Button deactiveStudentsButton;

    @FXML
    private VBox deactiveStudentsVbox;

    @FXML
    private ComboBox<?> degreeChooserAddCourse;

    @FXML
    private ComboBox<?> degreeChooserAddCourseGroup;

    @FXML
    private ComboBox<?> degreeChooserAddDegree;

    @FXML
    private ComboBox<?> degreeChooserRegisterStudent;

    @FXML
    private ComboBox<?> departmentChooserDeactiveProfessor;

    @FXML
    private ComboBox<?> departmentChooserDeactiveStudents;

    @FXML
    private ComboBox<?> departmentChooserEditProfessor;

    @FXML
    private ComboBox<?> departmentChooserEditStudents;

    @FXML
    private ComboBox<?> departmentChooserRegisterProfessor;

    @FXML
    private ComboBox<?> departmentChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> departmentTableviewProfessors;

    @FXML
    private TableColumn<?, ?> departmentTableviewStudents;

    @FXML
    private Button editProfessorButton;

    @FXML
    private VBox editProfessorVbox;

    @FXML
    private VBox editStudentVbox;

    @FXML
    private Button editStudentsButton;

    @FXML
    private ComboBox<?> facultyChooserDeactiveProfessor;

    @FXML
    private ComboBox<?> facultyChooserDeactiveStudents;

    @FXML
    private ComboBox<?> facultyChooserEditProfessor;

    @FXML
    private ComboBox<?> facultyChooserEditStudents;

    @FXML
    private ComboBox<?> facultyChooserRegisterProfessor;

    @FXML
    private ComboBox<?> facultyChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> facultyTableviewProfessors;

    @FXML
    private TableColumn<?, ?> facultyTableviewStudents;

    @FXML
    private TextField firstNameEditProfessor;

    @FXML
    private TextField firstNameEditStudents;

    @FXML
    private TextField firstNameRegisterProfessor;

    @FXML
    private TextField firstNameRegisterStudent;

    @FXML
    private TableColumn<?, ?> firstNameTableviewProfessors;

    @FXML
    private TableColumn<?, ?> firstNameTableviewStudents;

    @FXML
    private ComboBox<?> genderChooserEditProfessor;

    @FXML
    private ComboBox<?> genderChooserEditStudents;

    @FXML
    private ComboBox<?> genderChooserRegisterProfessor;

    @FXML
    private ComboBox<?> genderChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> genderTableviewProfessors;

    @FXML
    private TableColumn<?, ?> genderTableviewStudents;

    @FXML
    private HBox headerHBox;

    @FXML
    private Label headerTitle;

    @FXML
    private ComboBox<?> itemChooserProfessors;

    @FXML
    private ComboBox<?> itemChooserStudents;

    @FXML
    private TextField lastNameEditProfessor;

    @FXML
    private TextField lastNameEditStudents;

    @FXML
    private TextField lastNameRegisterProfessor;

    @FXML
    private TextField lastNameRegisterStudent;

    @FXML
    private TableColumn<?, ?> lastNameTableviewProfessors;

    @FXML
    private TableColumn<?, ?> lastNameTableviewStudents;

    @FXML
    private ComboBox<?> majorChooserAddCourse;

    @FXML
    private ComboBox<?> majorChooserAddCourseGroup;

    @FXML
    private ComboBox<?> majorChooserAddDegree;

    @FXML
    private ComboBox<?> majorChooserDeactiveProfessor;

    @FXML
    private ComboBox<?> majorChooserDeactiveStudents;

    @FXML
    private ComboBox<?> majorChooserEditProfessor;

    @FXML
    private ComboBox<?> majorChooserEditStudents;

    @FXML
    private ComboBox<?> majorChooserRegisterProfessor;

    @FXML
    private ComboBox<?> majorChooserRegisterStudent;

    @FXML
    private TableColumn<?, ?> majorTableviewProfessors;

    @FXML
    private TableColumn<?, ?> majorTableviewStudents;

    @FXML
    private TableColumn<?, ?> nameTableviewProfessors;

    @FXML
    private TableColumn<?, ?> nameTableviewStudents;

    @FXML
    private TextField nationalIdEditProfessor;

    @FXML
    private TextField nationalIdEditStudents;

    @FXML
    private TextField nationalIdRegisterProfessor;

    @FXML
    private TextField nationalIdRegisterStudent;

    @FXML
    private TableColumn<?, ?> nationalIdTableviewProfessors;

    @FXML
    private TableColumn<?, ?> nationalIdTableviewStudents;

    @FXML
    private VBox navigationBarVBox;

    @FXML
    private DatePicker newDateOfBirthProfile;

    @FXML
    private TextField newFirstNameProfile;

    @FXML
    private ComboBox<?> newGenderProfile;

    @FXML
    private TextField newLastNameProfile;

    @FXML
    private TextField newNationalIdProfile;

    @FXML
    private TextField newPhoneNumberProfile;

    @FXML
    private ComboBox<?> operationChooserUpdateProfessor;

    @FXML
    private ComboBox<?> operationChooserUpdateStudent;

    @FXML
    private TextField phoneNumberEditProfessor;

    @FXML
    private TextField phoneNumberEditStudents;

    @FXML
    private TextField phoneNumberRegisterProfessor;

    @FXML
    private TextField phoneNumberRegisterStudent;

    @FXML
    private TableColumn<?, ?> phoneTableviewProfessors;

    @FXML
    private TableColumn<?, ?> phoneTableviewStudents;

    @FXML
    private DatePicker primaryDateProfessors;

    @FXML
    private DatePicker primaryDateStudents;

    @FXML
    private ComboBox<?> professorChooserAddCourseGroup;

    @FXML
    private ComboBox<?> professorChooserDeactiveProfessor;

    @FXML
    private ComboBox<?> professorChooserEditProfessor;

    @FXML
    private TableColumn<?, ?> professorIdTableviewProfessors;

    @FXML
    private AnchorPane professorsAnchorPane;

    @FXML
    private Button professorsScrollPane;

    @FXML
    private TableView<?> professorsTableview;

    @FXML
    private AnchorPane profileAnchorPane;

    @FXML
    private Button profileScrollPane;

    @FXML
    private AnchorPane registerProfessorAnchorPane;

    @FXML
    private Button registerProfessorScrollPane;

    @FXML
    private AnchorPane registerStudentAnchorPane;

    @FXML
    private Button registerStudentScrollPane;

    @FXML
    private AnchorPane reportsAnchorPane;

    @FXML
    private Button reportsScrollPane;

    @FXML
    private TableColumn<?, ?> rowNumberTableviewProfessors;

    @FXML
    private TableColumn<?, ?> rowNumberTableviewStudents;

    @FXML
    private TextField searchBoxProfessors;

    @FXML
    private TextField searchBoxStudents;

    @FXML
    private DatePicker secondaryDateProfessors;

    @FXML
    private DatePicker secondaryDateStudents;

    @FXML
    private ComboBox<?> semasterChooserAddCourseGroup;

    @FXML
    private ComboBox<?> studentChooserDeactiveStudents;

    @FXML
    private ComboBox<?> studentChooserEditStudents;

    @FXML
    private TableColumn<?, ?> studentIdTableviewStudents;

    @FXML
    private AnchorPane studentsAnchorPane;

    @FXML
    private Button studentsScrollPane;

    @FXML
    private TableView<?> studetnsTableview;

    @FXML
    private ComboBox<?> topicChooserProfessors;

    @FXML
    private ComboBox<?> topicChooserStudents;

    @FXML
    private AnchorPane updateProfessorAnchorPane;

    @FXML
    private Button updateProfessorScrollPane;

    @FXML
    private AnchorPane updateStudentAnchorPane;

    @FXML
    private Button updateStudentScrollPane;

    @FXML
    void addCourse(ActionEvent event) {

    }

    @FXML
    void addCourseDashboard(ActionEvent event) {
        headerTitle.setText(" --> Add New Course");

        addCourseAnchorPane.setVisible(true);
        addCourseScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

    }

    @FXML
    void addCourseScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add New Course");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(true);
            addCourseScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void addCourseGroup(ActionEvent event) {

    }

    @FXML
    void addCourseGroupDashboard(ActionEvent event) {
        headerTitle.setText(" --> Add New Course Group");

        addCourseGroupAnchorPane.setVisible(true);
        addCourseGroupScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void addCourseGroupScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add New Course Group");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(true);
            addCourseGroupScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void addDegree(ActionEvent event) {

    }

    @FXML
    void addDegreeDashboard(ActionEvent event) {
        headerTitle.setText(" --> Add New Degree");

        addDegreeAnchorPane.setVisible(true);
        addDegreeScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void addDegreeScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Add New Degree");

        if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(true);
            addDegreeScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void addProfessor(ActionEvent event) {

    }

    @FXML
    void addStudent(ActionEvent event) {

    }

    @FXML
    void changeProfile(ActionEvent event) {

    }

    @FXML
    void dashboardScrollPane(ActionEvent event) {
        dashboardAnchorPane.setVisible(true);
        buttonsScrollPane.setVisible(false);
        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
    }

    @FXML
    void deactiveProfessor(ActionEvent event) {

    }

    @FXML
    void deactiveStudent(ActionEvent event) {

    }

    @FXML
    void editProfessor(ActionEvent event) {

    }

    @FXML
    void editStudent(ActionEvent event) {

    }

    @FXML
    void getDateOfBirth(ActionEvent event) {

    }

    @FXML
    void professorsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Professors");

        professorsAnchorPane.setVisible(true);
        professorsScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void professorsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Professors");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(true);
            professorsScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void profileDashboard(ActionEvent event) {
        headerTitle.setText(" --> Profile");

        profileAnchorPane.setVisible(true);
        profileScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void profileScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Profile");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(true);
            profileScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void registerProfessorDashboard(ActionEvent event) {
        headerTitle.setText(" --> Register New Professor");

        registerProfessorAnchorPane.setVisible(true);
        registerProfessorScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void registerProfessorScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Register New Professor");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(true);
            registerProfessorScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void registerStudentDashboard(ActionEvent event) {
        headerTitle.setText(" --> Register New Student");

        registerStudentAnchorPane.setVisible(true);
        registerStudentScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void registerStudentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Register New Student");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(true);
            registerStudentScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void reportsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Reports");

        reportsAnchorPane.setVisible(true);
        reportsScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
    }

    @FXML
    void reportsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Reports");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        }
        if (!reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(true);
            reportsScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void setOperationChooserUpdateProfessor(ActionEvent event) {

    }

    @FXML
    void setOperationChooserUpdateStudent(ActionEvent event) {

    }

    @FXML
    void setProfessorChooserDeactive(ActionEvent event) {

    }

    @FXML
    void setProfessorEdit(ActionEvent event) {

    }

    @FXML
    void setStudentChooserDeactive(ActionEvent event) {

    }

    @FXML
    void setStudentEdit(ActionEvent event) {

    }

    @FXML
    void setTopicChooserProfessors(ActionEvent event) {

    }

    @FXML
    void setTopicChooserStudents(ActionEvent event) {

    }

    @FXML
    void setItemChooserProfessors(ActionEvent event) {

    }

    @FXML
    void setItemChooserStudents(ActionEvent event) {

    }

    @FXML
    void setSearchBoxProfessors(ActionEvent event) {

    }

    @FXML
    void setSearchBoxStudents(ActionEvent event) {

    }

    @FXML
    void setPrimaryDateProfessors(ActionEvent event) {

    }

    @FXML
    void setPrimaryDateStudents(ActionEvent event) {

    }

    @FXML
    void setSecondaryDateProfessors(ActionEvent event) {

    }

    @FXML
    void setSecondaryDateStudents(ActionEvent event) {

    }

    @FXML
    void signOutDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void signOutScrollPane(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPanel.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void studentsDashboard(ActionEvent event) {
        headerTitle.setText(" --> Students");

        studentsAnchorPane.setVisible(true);
        studentsAnchorPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);
        
    }

    @FXML
    void studentsScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Students");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(true);
            studentsScrollPane.getStyleClass().add("pressed");
        }
    }

    @FXML
    void updateProfessorDashboard(ActionEvent event) {
        headerTitle.setText(" --> Update Professor");

        updateProfessorAnchorPane.setVisible(true);
        updateProfessorAnchorPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

        operationChooserUpdateProfessor.getSelectionModel().selectFirst();
        editProfessorVbox.setVisible(false);
        deactiveProfessorVbox.setVisible(false);
    }

    @FXML
    void updateProfessorScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Professor");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(false);
            updateStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(true);
            updateProfessorScrollPane.getStyleClass().add("pressed");
        }

        operationChooserUpdateProfessor.getSelectionModel().selectFirst();
        editProfessorVbox.setVisible(false);
        deactiveProfessorVbox.setVisible(false);
    }

    @FXML
    void updateStudentDashboard(ActionEvent event) {
        headerTitle.setText(" --> Update Student");

        updateStudentAnchorPane.setVisible(true);
        updateStudentScrollPane.getStyleClass().add("pressed");
        buttonsScrollPane.setVisible(true);
        dashboardAnchorPane.setVisible(false);

        operationChooserUpdateStudent.getSelectionModel().selectFirst();
        editStudentVbox.setVisible(false);
        deactiveStudentsVbox.setVisible(false);
    }

    @FXML
    void updateStudentScrollPane(ActionEvent event) {
        headerTitle.setText(" --> Update Student");

        if (addDegreeAnchorPane.isVisible()) {
            addDegreeAnchorPane.setVisible(false);
            addDegreeScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseAnchorPane.isVisible()) {
            addCourseAnchorPane.setVisible(false);
            addCourseScrollPane.getStyleClass().remove("pressed");
        } else if (addCourseGroupAnchorPane.isVisible()) {
            addCourseGroupAnchorPane.setVisible(false);
            addCourseGroupScrollPane.getStyleClass().remove("pressed");
        } else if (professorsAnchorPane.isVisible()) {
            professorsAnchorPane.setVisible(false);
            professorsScrollPane.getStyleClass().remove("pressed");
        } else if (registerProfessorAnchorPane.isVisible()) {
            registerProfessorAnchorPane.setVisible(false);
            registerProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (updateProfessorAnchorPane.isVisible()) {
            updateProfessorAnchorPane.setVisible(false);
            updateProfessorScrollPane.getStyleClass().remove("pressed");
        } else if (studentsAnchorPane.isVisible()) {
            studentsAnchorPane.setVisible(false);
            studentsScrollPane.getStyleClass().remove("pressed");
        } else if (registerStudentAnchorPane.isVisible()) {
            registerStudentAnchorPane.setVisible(false);
            registerStudentScrollPane.getStyleClass().remove("pressed");
        } else if (profileAnchorPane.isVisible()) {
            profileAnchorPane.setVisible(false);
            profileScrollPane.getStyleClass().remove("pressed");
        } else if (reportsAnchorPane.isVisible()) {
            reportsAnchorPane.setVisible(false);
            reportsScrollPane.getStyleClass().remove("pressed");
        }
        if (!updateStudentAnchorPane.isVisible()) {
            updateStudentAnchorPane.setVisible(true);
            updateStudentScrollPane.getStyleClass().add("pressed");
        }

        operationChooserUpdateStudent.getSelectionModel().selectFirst();
        editStudentVbox.setVisible(false);
        deactiveStudentsVbox.setVisible(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

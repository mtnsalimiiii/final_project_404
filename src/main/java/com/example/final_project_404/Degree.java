package com.example.final_project_404;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Degree implements  Serializable,IsPass,SemesterStatusCheckable {
    @Serial
    private static final long serialVersionUID = 1L;

    public  List<Course> courses = new ArrayList<>();
    //private List<Student> students=new ArrayList<>();
    @Override
    public abstract CourseStatus getPassStatus(double score);

    @Override
    public abstract SemesterStatus getProbationStatus(double gpa);
}

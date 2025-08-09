package com.example.final_project_404;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bachelor extends Degree implements Serializable,IsPass,SemesterStatusCheckable {
    public double passingScore = 10;
    public double conditionalScore = 12;
    public List<Course> courses=new ArrayList<>();
    @Override
    public CourseStatus getPassStatus(double score) {
        return score >= 10 ? CourseStatus.Pass : CourseStatus.Fail;
    }

    @Override
    public SemesterStatus getProbationStatus(double gpa){
        return gpa >= 12 ? SemesterStatus.Completed : SemesterStatus.Probation;
    }
}


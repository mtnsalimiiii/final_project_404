package com.example.final_project_404;

import java.io.Serializable;

public class Phd extends Degree implements Serializable,IsPass,SemesterStatusCheckable {
    public double conditionalScore = 16;
    @Override
    public CourseStatus getPassStatus(double score) {
        return score >= 14 ? CourseStatus.Pass : CourseStatus.Fail;
    }

    @Override
    public SemesterStatus getProbationStatus(double gpa){
        return gpa >= 16 ? SemesterStatus.Completed : SemesterStatus.Probation;
    }
}

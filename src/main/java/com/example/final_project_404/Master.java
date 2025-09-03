package com.example.final_project_404;

import java.io.Serial;
import java.io.Serializable;

public class Master extends Degree implements Serializable,IsPass,SemesterStatusCheckable {
    @Serial
    private static final long serialVersionUID = 1L;

    public double conditionalScore = 14;

    public Master(Status status) {
        super(status);
    }

    @Override
    public CourseStatus getPassStatus(double score) {
        return score >= 12 ? CourseStatus.Pass : CourseStatus.Fail;
    }

    @Override
    public SemesterStatus getProbationStatus(double gpa){
        return gpa >= 14 ? SemesterStatus.Completed : SemesterStatus.Probation;
    }
}

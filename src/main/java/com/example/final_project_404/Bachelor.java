package com.example.final_project_404;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bachelor extends Degree implements Serializable,IsPass,SemesterStatusCheckable {
    @Serial
    private static final long serialVersionUID = 1L;

    public double passingScore = 10;
    public double conditionalScore = 12;
    public List<Course> courses=new ArrayList<>();

    public Bachelor(Status status) {
        super(status);
    }

    @Override
    public CourseStatus getPassStatus(double score) {
        return score >= 10 ? CourseStatus.Pass : CourseStatus.Fail;
    }

    @Override
    public SemesterStatus getProbationStatus(double gpa){
        return gpa >= 12 ? SemesterStatus.Completed : SemesterStatus.Probation;
    }
}


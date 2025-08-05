package com.example.final_project_404;

import java.io.Serializable;

public class Master extends Degree implements Serializable,IsPass {
    public double conditionalScore = 14;
    @Override
    public CourseStatus getPassStatus(double score) {
        return score >= 12 ? CourseStatus.Pass : CourseStatus.Fail;
    }
}

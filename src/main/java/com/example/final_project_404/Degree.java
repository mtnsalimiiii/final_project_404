package com.example.final_project_404;

import java.util.ArrayList;
import java.util.List;

public abstract class Degree implements CheckCondition,CheckPass {
    public List<Course> courses=new ArrayList<>();
    @Override
    public boolean isPass(double passingScore,double grade) {
        return grade >= passingScore;
    }
    @Override
    public boolean isOnprobation(double conditionalScore, double gpa){
        return gpa<conditionalScore;
    }
}

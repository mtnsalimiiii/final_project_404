package com.example.final_project_404;

public abstract class Degree implements CheckCondition,CheckPass {
    @Override
    public boolean isPass(double passingScore,double grade) {
        return grade >= passingScore;
    }
    @Override
    public boolean isOnprobation(double conditionalScore, double gpa){
        return gpa<conditionalScore;
    }
}

package com.example.final_project_404;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Degree implements  Serializable,IsPass {
    public List<Course> courses = new ArrayList<>();
    @Override
    public abstract CourseStatus getPassStatus(double score);
}

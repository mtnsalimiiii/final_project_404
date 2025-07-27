package com.example.final_project_404;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class CourseGroupRow {
    private final CourseGroup courseGroup;
    private final BooleanProperty selected = new SimpleBooleanProperty(false);

    public CourseGroupRow(CourseGroup group) {
        this.courseGroup = group;
    }

    public CourseGroup getCourseGroup() {
        return courseGroup;
    }

    public boolean isSelected() {
        return selected.get();
    }

    public void setSelected(boolean value) {
        selected.set(value);
    }

    public BooleanProperty selectedProperty() {
        return selected;
    }

    public String getCourseCode() {
        return courseGroup.getCourse().getId();
    }

    public String getCourseName() {
        return courseGroup.getCourse().getName();
    }

    public int getCredits() {
        return courseGroup.getCourse().getCredit();
    }

    public String getSchedule() {
        return "Shanbeh"; // فرض بر این است که این متد وجود دارد
    }
}

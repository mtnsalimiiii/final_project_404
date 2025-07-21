package com.example.final_project_404;

import javafx.fxml.LoadException;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Date implements Serializable {

    private int year;
    private int month;
    private int day;
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAge() {
        Period period = Period.between(date, LocalDate.now());
        return period.getYears();
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

}

package com.example.final_project_404;

import static java.lang.String.format;
import java.time.LocalDate;

public class Date {
//    private String DateOfJoin;
    private int year;
    private int month;
    private int day;

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

//    public static String DateOfJoin(){
//        return LocalDate.now().toString();
//    }
}

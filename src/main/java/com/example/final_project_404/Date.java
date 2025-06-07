package com.example.final_project_404;

import static java.lang.String.format;
import java.time.LocalDate;

public class Date {
    private String DateOfJoin;
    private int year;
    private int month;
    private int day;

    public static String returnDate(int year, int month, int day){
        return String.format("%d/%d/%d",year ,month ,day);
    }
    public String DateOfJoin(){
        return LocalDate.now().toString();
    }
}

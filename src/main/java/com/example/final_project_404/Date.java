//package com.example.final_project_404;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.Period;
//
//public class Date implements Serializable {
//
//    private int year;
//    private int month;
//    private int day;
//    private LocalDate date;
//
//    public Date(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//        this.date = LocalDate.of(year, month, day);
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//    public void setDate(LocalDate date) {
//        this.date = date;
//        this.year = date.getYear();
//        this.month = date.getMonthValue();
//        this.day = date.getDayOfMonth();
//    }
//
//    public int getAge() {
//        if (date == null) {
//            throw new IllegalStateException("Date is not set");
//        }
//        return Period.between(date, LocalDate.now()).getYears();
//    }
//
//    public int getYear() {
//        return year;
//    }
//    public void setYear(int year) {
//        this.year = year;
//        updateLocalDate();
//    }
//
//    public int getMonth() {
//        return month;
//    }
//    public void setMonth(int month) {
//        this.month = month;
//        updateLocalDate();
//    }
//
//    public int getDay() {
//        return day;
//    }
//    public void setDay(int day) {
//        this.day = day;
//        updateLocalDate();
//    }
//
//    private void updateLocalDate() {
//        // فقط وقتی معتبره که همه فیلدها پر باشن
//        if (year > 0 && month > 0 && day > 0) {
//            this.date = LocalDate.of(year, month, day);
//        }
//    }
//}
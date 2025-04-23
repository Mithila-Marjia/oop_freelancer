package com.example.freelancerproject.freelancerfinal;

import java.time.LocalDate;

public class Hremployeattendance {

    private int id;
    private String name,attendance;
    private LocalDate date;


    public Hremployeattendance() {
    }

    public Hremployeattendance(int id, String name, String attendance, LocalDate date) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Hremployeattendance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attendance='" + attendance + '\'' +
                ", date=" + date +
                '}';
    }
}

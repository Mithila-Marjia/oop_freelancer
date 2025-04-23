package com.example.freelancerproject.freelancerfinal;

import java.time.LocalDate;

public class M_campaign {

    private String name,shift,location;
    private LocalDate date;

    public M_campaign() {
    }

    public M_campaign(String name, String shift, String location, LocalDate date) {
        this.name = name;
        this.shift = shift;
        this.location = location;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "M_campaign{" +
                "name='" + name + '\'' +
                ", shift='" + shift + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }
}

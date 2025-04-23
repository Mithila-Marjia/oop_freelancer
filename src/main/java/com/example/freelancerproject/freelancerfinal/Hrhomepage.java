package com.example.freelancerproject.freelancerfinal;

import java.time.LocalDate;

public class Hrhomepage {
    private String name,type,position,degree;
    private Integer salary;
    private LocalDate date;

    public Hrhomepage() {
    }

    public Hrhomepage(String name, String type, String position, String degree, Integer salary, LocalDate date) {
        this.name = name;
        this.type = type;
        this.position = position;
        this.degree = degree;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Hrhomepage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", position='" + position + '\'' +
                ", degree='" + degree + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}

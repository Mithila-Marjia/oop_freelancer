package com.example.freelancerproject.freelancerfinal;

import java.time.LocalDate;

public class HrStakeholderManagement {

    private String name;
    private int id,amount;
    private LocalDate date;


    public HrStakeholderManagement() {
    }

    public HrStakeholderManagement(String name, int id, int salary, LocalDate date) {
        this.name = name;
        this.id = id;
        this.amount = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return amount;
    }

    public void setSalary(int salary) {
        this.amount = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "HrStakeholderManagement{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + amount +
                ", date=" + date +
                '}';
    }
}

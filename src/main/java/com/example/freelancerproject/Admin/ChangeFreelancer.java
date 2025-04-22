package com.example.freelancerproject.Admin;

import java.time.LocalDate;

public class ChangeFreelancer {

    String name,email,country,skills,status,rate;
    LocalDate date;

    public ChangeFreelancer(String name, String email, String country, String skills, String status, String rate, LocalDate date) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.skills = skills;
        this.status = status;
        this.rate = rate;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ChangeFreelancer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", skills='" + skills + '\'' +
                ", status='" + status + '\'' +
                ", rate='" + rate + '\'' +
                ", date=" + date +
                '}';
    }
}

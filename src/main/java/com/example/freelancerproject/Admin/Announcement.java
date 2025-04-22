package com.example.freelancerproject.Admin;

import java.time.LocalDate;

public class Announcement {

    String tital,body,formete,whocansee;
    LocalDate date;

    public Announcement(String tital, String body, String formete, String whocansee, LocalDate date) {
        this.tital = tital;
        this.body = body;
        this.formete = formete;
        this.whocansee = whocansee;
        this.date = date;
    }

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFormete() {
        return formete;
    }

    public void setFormete(String formete) {
        this.formete = formete;
    }

    public String getWhocansee() {
        return whocansee;
    }

    public void setWhocansee(String whocansee) {
        this.whocansee = whocansee;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "tital='" + tital + '\'' +
                ", body='" + body + '\'' +
                ", formete='" + formete + '\'' +
                ", whocansee='" + whocansee + '\'' +
                ", date=" + date +
                '}';
    }
}

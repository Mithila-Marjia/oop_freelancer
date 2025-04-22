package com.example.freelancerproject.CustomerSupport;

import java.time.LocalDate;

public class Usercomplain {
    int userid;
    String subject,description,status;
    LocalDate Date;

    public Usercomplain(int userid, String subject, String description, String status, LocalDate date) {
        this.userid = userid;
        this.subject = subject;
        this.description = description;
        this.status = status;
        Date = date;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Usercomplain{" +
                "userid=" + userid +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", Date=" + Date +
                '}';
    }
}

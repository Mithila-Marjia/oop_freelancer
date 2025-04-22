package com.example.freelancerproject.Admin;

import java.time.LocalDate;

public class Application {

    int applicationid,senderid;
    String subject,description,ststus;
    LocalDate date;

    public Application(int applicationid, int senderid, String subject, String description, String ststus, LocalDate date) {
        this.applicationid = applicationid;
        this.senderid = senderid;
        this.subject = subject;
        this.description = description;
        this.ststus = ststus;
        this.date = date;
    }

    public int getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(int applicationid) {
        this.applicationid = applicationid;
    }

    public int getSenderid() {
        return senderid;
    }

    public void setSenderid(int senderid) {
        this.senderid = senderid;
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

    public String getStstus() {
        return ststus;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationid=" + applicationid +
                ", senderid=" + senderid +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", ststus='" + ststus + '\'' +
                ", date=" + date +
                '}';
    }
}

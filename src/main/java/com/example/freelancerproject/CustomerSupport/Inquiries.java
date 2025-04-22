package com.example.freelancerproject.CustomerSupport;

public class Inquiries {

    int inquiriesid;
    String subject,description;

    public Inquiries(int inquiriesid, String subject, String description) {
        this.inquiriesid = inquiriesid;
        this.subject = subject;
        this.description = description;
    }

    public int getInquiriesid() {
        return inquiriesid;
    }

    public void setInquiriesid(int inquiriesid) {
        this.inquiriesid = inquiriesid;
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

    @Override
    public String toString() {
        return "Inquiries{" +
                "inquiriesid=" + inquiriesid +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

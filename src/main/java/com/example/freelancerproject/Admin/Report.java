package com.example.freelancerproject.Admin;

public class Report {

    int reportid;
    String subject,description;

    public Report(int reportid, String subject, String description) {
        this.reportid = reportid;
        this.subject = subject;
        this.description = description;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
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
        return "Report{" +
                "reportid=" + reportid +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

package com.example.freelancerproject.Admin;

import java.io.Serializable;

public class Report  implements Serializable {

    int reportid;
    String description;

    public Report(int reportid, String description) {
        this.reportid = reportid;
        this.description = description;
    }


    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
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
                ", description='" + description + '\'' +
                '}';
    }
}

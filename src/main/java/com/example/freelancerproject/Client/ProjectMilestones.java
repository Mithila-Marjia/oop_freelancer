package com.example.freelancerproject.Client;

import java.time.LocalDate;

public class ProjectMilestones {
    private String pstatus ;
    private LocalDate date;

    public ProjectMilestones(String pstatus, LocalDate date) {
        this.pstatus = pstatus;
        this.date = date;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProjectMilestones{" +
                "pstatus='" + pstatus + '\'' +
                ", date=" + date +
                '}';
    }
}

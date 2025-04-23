package com.example.freelancerproject.DevelopmentManager;

import java.time.LocalDate;

public class MonitorProgressOfProject {
    private String ptitle,pstatus;
    private int percentage;
    private LocalDate startdate,endDate;

    public MonitorProgressOfProject(String ptitle, String pstatus, int percentage, LocalDate startdate, LocalDate endDate) {
        this.ptitle = ptitle;
        this.pstatus = pstatus;
        this.percentage = percentage;
        this.startdate = startdate;
        this.endDate = endDate;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "MonitorProgressOfProject{" +
                "ptitle='" + ptitle + '\'' +
                ", pstatus='" + pstatus + '\'' +
                ", percentage=" + percentage +
                ", startdate=" + startdate +
                ", endDate=" + endDate +
                '}';
    }
}

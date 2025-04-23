package com.example.freelancerproject.DevelopmentManager;

import java.time.LocalDate;

public class GeneratePerformanceReports {
    private String reporttype;
    private LocalDate startdate,enddate;

    public GeneratePerformanceReports(String reporttype, LocalDate startdate, LocalDate enddate) {
        this.reporttype = reporttype;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "GeneratePerformanceReports{" +
                "reporttype='" + reporttype + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}

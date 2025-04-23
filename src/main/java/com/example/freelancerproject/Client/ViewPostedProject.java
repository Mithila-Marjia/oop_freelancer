package com.example.freelancerproject.Client;

import java.time.LocalDate;

public class ViewPostedProject {
    private String ptitle , bidstatus ;
    private int bidcount ;
    private LocalDate dueDate ;

    public ViewPostedProject(String ptitle, String bidstatus, int bidcount, LocalDate dueDate) {
        this.ptitle = ptitle;
        this.bidstatus = bidstatus;
        this.bidcount = bidcount;
        this.dueDate = dueDate;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getBidstatus() {
        return bidstatus;
    }

    public void setBidstatus(String bidstatus) {
        this.bidstatus = bidstatus;
    }

    public int getBidcount() {
        return bidcount;
    }

    public void setBidcount(int bidcount) {
        this.bidcount = bidcount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "ViewPostedProject{" +
                "ptitle='" + ptitle + '\'' +
                ", bidstatus='" + bidstatus + '\'' +
                ", bidcount=" + bidcount +
                ", dueDate=" + dueDate +
                '}';
    }
}

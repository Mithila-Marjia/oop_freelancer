package com.example.freelancerproject.DevelopmentManager;

import java.time.LocalDate;

public class ApproveOrRejectMilestone {
    private String pname,milestones,marketdemand;
    private int budget;
    private LocalDate timeline;

    public ApproveOrRejectMilestone(String pname, String milestones, String marketdemand, int budget, LocalDate timeline) {
        this.pname = pname;
        this.milestones = milestones;
        this.marketdemand = marketdemand;
        this.budget = budget;
        this.timeline = timeline;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMilestones() {
        return milestones;
    }

    public void setMilestones(String milestones) {
        this.milestones = milestones;
    }

    public String getMarketdemand() {
        return marketdemand;
    }

    public void setMarketdemand(String marketdemand) {
        this.marketdemand = marketdemand;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public LocalDate getTimeline() {
        return timeline;
    }

    public void setTimeline(LocalDate timeline) {
        this.timeline = timeline;
    }

    @Override
    public String toString() {
        return "ApproveOrRejectMilestone{" +
                "pname='" + pname + '\'' +
                ", milestones='" + milestones + '\'' +
                ", marketdemand='" + marketdemand + '\'' +
                ", budget=" + budget +
                ", timeline=" + timeline +
                '}';
    }
}

package com.example.freelancerproject.Client;

public class PostProject {
    private String ptitle, description, skills;
    private int budget,dateline;

    public PostProject(String ptitle, int dateline, int budget, String skills, String description) {
        this.ptitle = ptitle;
        this.dateline = dateline;
        this.budget = budget;
        this.skills = skills;
        this.description = description;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getDateline() {
        return dateline;
    }

    public void setDateline(int dateline) {
        this.dateline = dateline;
    }

    @Override
    public String toString() {
        return "PostProject{" +
                "ptitle='" + ptitle + '\'' +
                ", description='" + description + '\'' +
                ", skills='" + skills + '\'' +
                ", budget=" + budget +
                ", dateline=" + dateline +
                '}';
    }
}

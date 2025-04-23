package com.example.freelancerproject.Client;

public class ViewFreelancerProfiles {
    private String fname,skills,experience ;
    private int rating ;

    public ViewFreelancerProfiles(String fname, String skills, String experience, int rating) {
        this.fname = fname;
        this.skills = skills;
        this.experience = experience;
        this.rating = rating;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ViewFreelancerProfiles{" +
                "fname='" + fname + '\'' +
                ", skills='" + skills + '\'' +
                ", experience='" + experience + '\'' +
                ", rating=" + rating +
                '}';
    }
}

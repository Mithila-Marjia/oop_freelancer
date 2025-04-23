package com.example.freelancerproject.Client;

public class FeedbackAndRatings {
    private String project, fname, coments;
    private int rating;

    public FeedbackAndRatings(String project, String fname, String coments, int rating) {
        this.project = project;
        this.fname = fname;
        this.coments = coments;
        this.rating = rating;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "FeedbackAndRatings{" +
                "project='" + project + '\'' +
                ", fname='" + fname + '\'' +
                ", coments='" + coments + '\'' +
                ", rating=" + rating +
                '}';
    }
}

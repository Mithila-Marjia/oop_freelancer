package com.example.freelancerproject.CustomerSupport;

public class Identity {

    int freelancerid;
    String name,pricing,details;

    public Identity(int freelancerid, String name, String pricing, String details) {
        this.freelancerid = freelancerid;
        this.name = name;
        this.pricing = pricing;
        this.details = details;
    }

    public int getFreelancerid() {
        return freelancerid;
    }

    public void setFreelancerid(int freelancerid) {
        this.freelancerid = freelancerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "freelancerid=" + freelancerid +
                ", name='" + name + '\'' +
                ", pricing='" + pricing + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}

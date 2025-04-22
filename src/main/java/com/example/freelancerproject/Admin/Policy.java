package com.example.freelancerproject.Admin;

import java.time.LocalDate;

public class Policy {

    int policyid;
    String tital,description;
    LocalDate date;


    public Policy(int policyid, String tital, String description, LocalDate date) {
        this.policyid = policyid;
        this.tital = tital;
        this.description = description;
        this.date = date;
    }

    public int getPolicyid() {
        return policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyid=" + policyid +
                ", tital='" + tital + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}

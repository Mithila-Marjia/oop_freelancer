package com.example.freelancerproject.Admin;

import java.io.Serializable;

public class Complain implements Serializable {

    int complainid,senderid;
    String description;


    public Complain(int complainid, int senderid, String description) {
        this.complainid = complainid;
        this.senderid = senderid;
        this.description = description;
    }

    public int getComplainid() {
        return complainid;
    }

    public void setComplainid(int complainid) {
        this.complainid = complainid;
    }

    public int getSenderid() {
        return senderid;
    }

    public void setSenderid(int senderid) {
        this.senderid = senderid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Complain{" +
                "complainid=" + complainid +
                ", senderid=" + senderid +
                ", description='" + description + '\'' +
                '}';
    }
}

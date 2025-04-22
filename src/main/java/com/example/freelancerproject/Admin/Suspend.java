package com.example.freelancerproject.Admin;

public class Suspend {
    int suspendid,suspendedid;
    String reason;


    public Suspend(int suspendid, int suspendedid, String reason) {
        this.suspendid = suspendid;
        this.suspendedid = suspendedid;
        this.reason = reason;
    }


    public int getSuspendid() {
        return suspendid;
    }

    public void setSuspendid(int suspendid) {
        this.suspendid = suspendid;
    }

    public int getSuspendedid() {
        return suspendedid;
    }

    public void setSuspendedid(int suspendedid) {
        this.suspendedid = suspendedid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    @Override
    public String toString() {
        return "Suspend{" +
                "suspendid=" + suspendid +
                ", suspendedid=" + suspendedid +
                ", reason='" + reason + '\'' +
                '}';
    }
}


package com.example.freelancerproject.CustomerSupport;

import java.io.Serializable;
import java.time.LocalDate;

public class Paymentissue  implements Serializable {
    int paymentid,senderid;
    String issuedetail;
    LocalDate date;

    public Paymentissue(int paymentid, int senderid, String issuedetail) {
        this.paymentid = paymentid;
        this.senderid = senderid;
        this.issuedetail = issuedetail;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public int getSenderid() {
        return senderid;
    }

    public void setSenderid(int senderid) {
        this.senderid = senderid;
    }

    public String getIssuedetail() {
        return issuedetail;
    }

    public void setIssuedetail(String issuedetail) {
        this.issuedetail = issuedetail;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Paymentissue{" +
                "paymentid=" + paymentid +
                ", senderid=" + senderid +
                ", issuedetail='" + issuedetail + '\'' +
                ", date=" + date +
                '}';
    }
}

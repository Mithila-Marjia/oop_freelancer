package com.example.freelancerproject.Admin;

import java.time.LocalDate;

public class Transaction {
    int transactionid,senderid,recieverid;
    String status;
    LocalDate date;


    public Transaction(int transactionid, int senderid, int recieverid, String status, LocalDate date) {
        this.transactionid = transactionid;
        this.senderid = senderid;
        this.recieverid = recieverid;
        this.status = status;
        this.date = date;
    }

    public int getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }

    public int getSenderid() {
        return senderid;
    }

    public void setSenderid(int senderid) {
        this.senderid = senderid;
    }

    public int getRecieverid() {
        return recieverid;
    }

    public void setRecieverid(int recieverid) {
        this.recieverid = recieverid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionid=" + transactionid +
                ", senderid=" + senderid +
                ", recieverid=" + recieverid +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}

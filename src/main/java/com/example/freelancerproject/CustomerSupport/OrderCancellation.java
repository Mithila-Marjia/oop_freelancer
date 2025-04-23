package com.example.freelancerproject.CustomerSupport;

import java.io.Serializable;
import java.time.LocalDate;

public class OrderCancellation  implements Serializable {
    int orderid,senderid,receiverid;
    LocalDate date;

    public OrderCancellation(int orderid, int senderid, int receiverid) {
        this.orderid = orderid;
        this.senderid = senderid;
        this.receiverid = receiverid;

    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getSenderid() {
        return senderid;
    }

    public void setSenderid(int senderid) {
        this.senderid = senderid;
    }

    public int getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(int receiverid) {
        this.receiverid = receiverid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderCancellation{" +
                "orderid=" + orderid +
                ", senderid=" + senderid +
                ", receiverid=" + receiverid +
                ", date=" + date +
                '}';
    }
}

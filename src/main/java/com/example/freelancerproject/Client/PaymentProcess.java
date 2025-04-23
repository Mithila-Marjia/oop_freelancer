package com.example.freelancerproject.Client;

public class PaymentProcess {
    private String pname, method;
    private int id,amount;

    public PaymentProcess(String pname, String method, int id, int amount) {
        this.pname = pname;
        this.method = method;
        this.id = id;
        this.amount = amount;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentProcess{" +
                "pname='" + pname + '\'' +
                ", method='" + method + '\'' +
                ", id=" + id +
                ", amount=" + amount +
                '}';
    }
}

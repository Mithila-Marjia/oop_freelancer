package com.example.freelancerproject.CustomerSupport;

public class Livechat {
    int messageid,senderid;
    String message,reply;

    public Livechat(int messageid, int senderid, String message, String reply) {
        this.messageid = messageid;
        this.senderid = senderid;
        this.message = message;
        this.reply = reply;
    }

    public int getMessageid() {
        return messageid;
    }

    public void setMessageid(int messageid) {
        this.messageid = messageid;
    }

    public int getSenderid() {
        return senderid;
    }

    public void setSenderid(int senderid) {
        this.senderid = senderid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "Livechat{" +
                "messageid=" + messageid +
                ", senderid=" + senderid +
                ", message='" + message + '\'' +
                ", reply='" + reply + '\'' +
                '}';
    }
}

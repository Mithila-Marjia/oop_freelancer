package com.example.freelancerproject.CustomerSupport;

public class Monitor {

    int contentid;
    String name,status;

    public Monitor(int contentid, String name, String status) {
        this.contentid = contentid;
        this.name = name;
        this.status = status;
    }

    public int getContentid() {
        return contentid;
    }

    public void setContentid(int contentid) {
        this.contentid = contentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "contentid=" + contentid +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

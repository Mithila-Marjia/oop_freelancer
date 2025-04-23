package com.example.freelancerproject.DevelopmentManager;

public class AssignFreelancersToProject {
    private String pname,fname ;

    public AssignFreelancersToProject(String pname, String fname) {
        this.pname = pname;
        this.fname = fname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "AssignFreelancersToProject{" +
                "pname='" + pname + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }
}

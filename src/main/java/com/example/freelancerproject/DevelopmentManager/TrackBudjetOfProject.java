package com.example.freelancerproject.DevelopmentManager;

public class TrackBudjetOfProject {
    private String fname;
    private int budget,expenses,remainingbudget;

    public TrackBudjetOfProject(String fname, int budget, int expenses, int remainingbudget) {
        this.fname = fname;
        this.budget = budget;
        this.expenses = expenses;
        this.remainingbudget = remainingbudget;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public int getRemainingbudget() {
        return remainingbudget;
    }

    public void setRemainingbudget(int remainingbudget) {
        this.remainingbudget = remainingbudget;
    }

    @Override
    public String toString() {
        return "TrackBudjetOfProject{" +
                "fname='" + fname + '\'' +
                ", budget=" + budget +
                ", expenses=" + expenses +
                ", remainingbudget=" + remainingbudget +
                '}';
    }
}

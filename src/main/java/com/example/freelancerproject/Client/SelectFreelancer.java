package com.example.freelancerproject.Client;

import java.time.LocalDate;

public class SelectFreelancer {
    private String amount ;
    private int rating ;
    private LocalDate time ;

    public SelectFreelancer(String amount, int rating, LocalDate time) {
        this.amount = amount;
        this.rating = rating;
        this.time = time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SelectFreelancer{" +
                "amount='" + amount + '\'' +
                ", rating=" + rating +
                ", time=" + time +
                '}';
    }
}

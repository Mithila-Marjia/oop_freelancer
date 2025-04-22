package com.example.freelancerproject.Admin;

import com.example.freelancerproject.User;

public class Admin extends User {

    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void approveApplication() {}
    public void transition() {}
    public void complain() {}
    public void policy() {}
    public void report() {}
    public void suspend() {}
    public void announcement() {}
    public void changeFreelancer() {}


}

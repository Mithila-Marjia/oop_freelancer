package com.example.freelancerproject.Client;

public class AssignedFreelancer {
    private String name ;


    public AssignedFreelancer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AssignedFreelancer{" +
                "name='" + name + '\'' +
                '}';
    }
}

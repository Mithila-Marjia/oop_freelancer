package com.example.freelancerproject.freelancerfinal;

public class HrPerformance {
    private String name,gender;
    private Integer id,rating,salary;

    public HrPerformance() {

    }

    public HrPerformance(String name, String gender, Integer id, Integer rating, Integer salary) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.rating = rating;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "HrPerformance{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", rating=" + rating +
                ", salary=" + salary +
                '}';
    }
}

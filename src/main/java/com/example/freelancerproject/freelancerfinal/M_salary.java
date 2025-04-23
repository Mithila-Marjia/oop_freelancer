package com.example.freelancerproject.freelancerfinal;

public class M_salary {
    private String name,position,oldnew;
    private int salary;

    public M_salary() {
    }

    public M_salary(String name, String position, String oldnew, int salary) {
        this.name = name;
        this.position = position;
        this.oldnew = oldnew;
        this.salary = salary;
    }

    public M_salary(String text, String value, String text1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOldnew() {
        return oldnew;
    }

    public void setOldnew(String oldnew) {
        this.oldnew = oldnew;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "M_salary{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", oldnew='" + oldnew + '\'' +
                ", salary=" + salary +
                '}';
    }
}
